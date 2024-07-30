open class SmartDevice protected constructor(val name: String, val category: String) {

    var deviceStatus = "online"
        protected set

   open val deviceType = "unknown"
    open val devicename = "unknown"

    open fun turnOn() {
        deviceStatus = "on"
    }

    open fun turnOff() {
        deviceStatus = "off"
    }
    open fun printDeviceinfo(){
        println("Devicename: $devicename    " +
                "Category: $category    " +
                "Type: $deviceType  ")
    }

}