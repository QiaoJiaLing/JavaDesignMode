package partten.memento;

public class Origin {
    public String state;
    // 创建一个备忘录
    public Memento createMemento() {
        System.out.println("创建存档"+state);
        Memento memento = new Memento(state);
        System.out.println(memento.getState());
        return memento;
    }

    public void recoveData(Memento memento) {
        System.out.println("恢复" + memento.getState());
        state = memento.getState();
    }

    public void show() {
        System.out.println("this is " + state);
    }
}
