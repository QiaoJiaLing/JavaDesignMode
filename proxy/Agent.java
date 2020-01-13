package partten.proxy;

public class Agent implements People {
    private People people;

    public Agent(People people) {
        this.people = people;
    }

    @Override
    public void act() {
        System.out.println("经纪人：我接到戏了，请念出你的台词");
        people.act();
        System.out.println("经纪人：你是个傻子吧？");
    }
}
