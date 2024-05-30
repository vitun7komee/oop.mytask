class SmartLampOn implements ICommand {

    private SmartLamp SmartLamp;

    SmartLampOn(SmartLamp SmartLamp) {
        this.SmartLamp = SmartLamp;
    }

    @Override
    public void execute() {
        this.SmartLamp.turnOn();
    }
}
