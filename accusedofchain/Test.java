package partten.accusedofchain;

public class Test {
    public static void main(String[] args) {
        Leader leader = new Satrap("卫国", new Manager("Tommy",null));
        leader.handleRequest(18);
    }
}
