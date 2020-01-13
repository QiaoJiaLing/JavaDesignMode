package partten.state;

public class AfternoonState implements State {
    @Override
    public void work(Work work) {
        System.out.println("中午工作状态");
        if(work.getHours() > 12 && work.getHours() < 22) {
            System.out.println("我的状态不是很好，但是可以工作");
        }else {
            System.out.println("我要睡觉了");
        }
    }
}
