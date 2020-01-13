package partten.command;

public class Invoker {
    InvokerInterface invokerInterface;

    public void setInvokerInterface(InvokerInterface invokerInterface) {
        this.invokerInterface = invokerInterface;
    }

    public void execution() {
        invokerInterface.execution();
    }
}
