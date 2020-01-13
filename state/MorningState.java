package partten.state;

public class MorningState implements  State {

    @Override
    public void work(Work work) {
        if(work.getHours() < 12) {
            System.out.println("早晨，我的状态很好，开心的工作");
        }else {
            work.setState(new AfternoonState());
            work.currentWork();

        }
    }
}
