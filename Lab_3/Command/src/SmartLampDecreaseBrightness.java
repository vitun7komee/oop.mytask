public class SmartLampDecreaseBrightness implements ICommand {
    
    private SmartLamp SmartLamp;

    SmartLampDecreaseBrightness(SmartLamp SmartLamp) {
        this.SmartLamp = SmartLamp;
    }

    @Override
    public void execute() {
        this.SmartLamp.decreaseBrightness();
    }
}
