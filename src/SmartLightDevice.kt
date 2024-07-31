import org.w3c.dom.ranges.Range

class SmartLightDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {


    override val deviceType = "Smart Light"
    private var brightnesslvl by Rangeregulator(0, 0, 100)


    fun increaseBrightness() {
        brightnesslvl++
        println("Brightness increased to $brightnesslvl")
    }

    fun decreaseBrightness() {
        brightnesslvl--
        println("Brightness decreased to $brightnesslvl")
    }

    override fun turnOn() {

            deviceStatus = "on"
            brightnesslvl = 2
            println("$name turned on. The brightness level is $brightnesslvl")
        }


    override fun turnOff() {
        deviceStatus = "off"
        brightnesslvl = 0
        println("Smart Light turned off")
    }
}