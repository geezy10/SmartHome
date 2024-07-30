class SmartTvDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {


    override val deviceType = "Smart Tv"

    private var speakerVolume by Rangeregulator(2, 1, 100)
    private var channelNumber by Rangeregulator(1, 0, 200)


    fun increaseSpeakerVolume() {
        speakerVolume++
        println("Speaker volume increased to $speakerVolume")
    }

    fun decreaseSpeakerVolume() {
        speakerVolume--
        println("Speaker volume increased to $speakerVolume")
    }

    fun nextChannel() {
        channelNumber++
        println("Channel number increased to $channelNumber")
    }

    fun previousChannel() {
        channelNumber--
        println("Channel number decreased to $channelNumber")
    }

    override fun turnOn() {
        deviceStatus = "on"
        println("$name is turned on. SpeakerVolume is set to $speakerVolume and channel Number is set to $channelNumber")
    }

    override fun turnOff() {
        deviceStatus = "off"
        println("$name turned off")
    }


}





