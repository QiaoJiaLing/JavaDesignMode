package partten.proxy;

public class Test {
    public static void main(String[] args) {
        Agent agent = new Agent(new Act());

        agent.act();
    }
}
