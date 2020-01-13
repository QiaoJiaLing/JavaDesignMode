package partten.builder;

public class BuilderFatPeople implements BuilderPeopleInterface {
    @Override
    public void builderHeader() {
        System.out.println("我的胖头");
    }

    @Override
    public void builderBody() {
        System.out.println("我的大肚子");
    }

    @Override
    public void builderLeftHand() {
        System.out.println("我的粗左手");
    }

    @Override
    public void builderRightHand() {
        System.out.println("我的粗右手");
    }

    @Override
    public void builderLeftLeg() {
        System.out.println("我的粗左腿");
    }

    @Override
    public void builderRightLeg() {
        System.out.println("我的粗右腿");
    }
}
