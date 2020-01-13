package partten.command;

public class OffLightCommand implements  InvokerInterface {

    private Command command;

    public OffLightCommand(Command command) {
        this.command = command;
    }
    @Override
    public void execution() {
        command.command2();
    }
}
