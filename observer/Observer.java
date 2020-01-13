package partten.observer;

import java.util.ArrayList;

public class Observer {

    private ArrayList<Subscriber> subscribers = new ArrayList<Subscriber>();

    public void addSubcriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void updateData() {
        System.out.println("我更新了数据");
        notifySubscribers();
    }

    private void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.updateSubscriber();
        }
    }
}
