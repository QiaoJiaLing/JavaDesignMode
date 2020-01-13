package partten.accusedofchain;

// 主管能决定1到3天的请假
public class Satrap extends Leader {
    private int date;

    public Satrap(String name, Leader leader) {
        super(name, leader);
    }
    @Override
    public void handleRequest(int date) {
        if(date > 0  && date <= 3) {
            System.out.println("主管批你假了");
        }else {
            nextLeader.handleRequest(date);
        }
    }
}
