package partten.command;

public class OnLightCommand implements InvokerInterface {

    Command command;

    public OnLightCommand(Command command) {
        this.command = command;
    }
    @Override
    public void execution() {
        command.command1();
    }
}
