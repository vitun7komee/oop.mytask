class SmartLamp {
    
    boolean isOn;
    SmartLampMode mode;
    int brightness;

    SmartLamp() {
        this.isOn = false;
        this.brightness = 50;
        this.mode = SmartLampMode.DAY;
    }

    public void turnOn() {
        this.isOn = true;
        System.out.println("SmartLamp: On");
    }

    public void turnOff() {
        this.isOn = false;
        System.out.println("SmartLamp: Off");
    }

    public void increaseBrightness() {
        if (this.brightness < 100)
            //brightness++;
            brightness+=5;
        System.out.println("brightness: " + brightness);
    }

    public void decreaseBrightness() {
        if (this.brightness > 0)
            //brightness--;
            brightness-=5;
        System.out.println("brightness: " + brightness);
    }

    public void setMode(SmartLampMode mode) {
        this.mode = mode;
        System.out.println("SmartLamp mode: " + mode.toString());
    }

    public Integer getBrightness() {
        return this.brightness;
    }

    public String getMode(){
        return (this.mode.toString());
    }
}
