import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class SmartHome(
    val smartTvDevice: SmartTvDevice, val smartLightDevice: SmartLightDevice
) {

    var deviceTurnOnCount = 0
        protected set

    fun turnOnTv() {
        deviceTurnOnCount++
        smartTvDevice.turnOn()


    }

    fun turnOffTv() {
        deviceTurnOnCount--
        smartTvDevice.turnOff()


    }

    fun increaseTvVolume() {
        smartTvDevice.increaseSpeakerVolume()
    }

    fun decreasedTvVolume() {
        smartTvDevice.decreaseSpeakerVolume()
    }

    fun changeTvChannelToNext() {
        smartTvDevice.nextChannel()
    }

    fun changeTvChannelToPrev() {
        smartTvDevice.previousChannel()
    }

    fun printSmartTvInfo() {
        smartTvDevice.printDeviceinfo()
    }

    fun printSmartLightInfo() {
        smartLightDevice.printDeviceinfo()
    }


    fun turnOnLight() {
        deviceTurnOnCount++
        smartLightDevice.turnOn()
    }

    fun turnOffLight() {
        deviceTurnOnCount--
        smartLightDevice.turnOff()
    }

    fun increaseLightBrightness() {
        smartLightDevice.increaseBrightness()
    }

    fun decreaseLightBrightness() {
        smartLightDevice.decreaseBrightness()
    }

    fun turnOffAllDevices() {
        deviceTurnOnCount = 0
        turnOffTv()
        turnOffLight()
    }
}

class Rangeregulator(
    initialValue: Int, private val minValue: Int, private val maxValue: Int
) : ReadWriteProperty<Any?, Int> {

    var fieldData = initialValue


    override fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        return fieldData
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        if (value in minValue..maxValue) fieldData = value
    }

}


fun main() {
    val smartDevice1: SmartTvDevice = SmartTvDevice("Android Tv", "Entertainmnent")
    smartDevice1.turnOn()
    smartDevice1.printDeviceinfo()
    (smartDevice1 as SmartTvDevice).increaseSpeakerVolume()

    val smartDevice2: SmartLightDevice = SmartLightDevice("Philipps Hue", "Lightning")
    smartDevice2.turnOn()
    smartDevice2.printDeviceinfo()
    smartDevice2.increaseBrightness()
    smartDevice2.decreaseBrightness()


    val smarthome: SmartHome = SmartHome(smartDevice1,smartDevice2)
    smarthome.decreaseLightBrightness()
    smarthome.changeTvChannelToNext()
    smarthome.turnOffAllDevices()



}

