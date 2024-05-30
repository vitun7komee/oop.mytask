class SmartLampOff implements ICommand {

    private SmartLamp SmartLamp;

    SmartLampOff(SmartLamp SmartLamp) {
        this.SmartLamp = SmartLamp;
    }

    @Override
    public void execute() {
        this.SmartLamp.turnOff();
    }
}
