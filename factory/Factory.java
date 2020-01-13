package partten.factory;

public class Factory {

    public void produce(int i) {
        if(i == 1) {
            System.out.println("生产A");
        }else {
            System.out.println("生产B");
        }
    }
}
