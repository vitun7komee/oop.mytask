public class SmartLampIncreaseBrightness implements ICommand {
    
    private SmartLamp SmartLamp;

    SmartLampIncreaseBrightness(SmartLamp SmartLamp) {
        this.SmartLamp = SmartLamp;
    }

    @Override
    public void execute() {
        this.SmartLamp.increaseBrightness();
    }

}
