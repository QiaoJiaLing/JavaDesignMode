package partten.strategy;

public class AStrategy implements Strategy {
    @Override
    public void toDoSomething() {
        System.out.println("我是A策略");
    }
}
