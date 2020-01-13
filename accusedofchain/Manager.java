package partten.accusedofchain;

// 经理能批准3到15天的假
public class Manager extends Leader {

    public Manager(String name, Leader leader) {
        super(name,leader);
    }
    @Override
    public void handleRequest(int date) {
        if(date > 3 && date <=15) {
            System.out.println("经理能批准3到15天的假期");
        }else {
            System.out.println("小伙子，你不想干了吧");
        }
    }
}
