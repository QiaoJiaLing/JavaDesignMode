package partten.memento;

public class Memento {
    public String state;


    public Memento(String state){
        System.out.println("我是存档" + state);
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
