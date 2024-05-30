class SmartLampSetMode implements ICommand {

    private SmartLamp SmartLamp;
    private SmartLampMode mode;

    SmartLampSetMode(SmartLamp SmartLamp, SmartLampMode mode) {
        this.SmartLamp = SmartLamp;
        this.mode = mode;
    }

    @Override
    public void execute() {
        this.SmartLamp.setMode(mode);
    }
}
