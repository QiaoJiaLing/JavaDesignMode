package partten.memento;

public class Test {
    public static void main(String[] args) {
        // 维护存档的人
        Mantainer mantainer = new Mantainer();

        Origin origin = new Origin();
        origin.state = "on";
        // 将存档交给维护的人
        mantainer.memento = origin.createMemento();

        origin.state = "off";
        origin.show();

        origin.recoveData(mantainer.memento);
        origin.show();
    }
}
