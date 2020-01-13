package partten.observer;

public class Test {
   public static void main(String[] args) {
       Observer observer = new Observer();
       observer.addSubcriber(new Subscriber());
       observer.updateData();
   }
}
