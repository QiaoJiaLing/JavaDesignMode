package partten.strategy;

public class Test {
    public static void main(String[] args) {
        Director director = new Director();
        director.toDoSomething(new AStrategy());
        director.toDoSomething(new BStrategy());
    }
}
