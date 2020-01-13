package partten.command;

public class Test {
    public static void main(String[] args) {
        Command command = new Command();
        Invoker invoker = new Invoker();
        // 执行命令1
        invoker.setInvokerInterface(new OnLightCommand(command));
        invoker.execution();
        // 执行命令2
        invoker.setInvokerInterface(new OffLightCommand(command));
        invoker.execution();
    }
}
