package partten.director;

public class Listen implements Mobile {
    private Mobile mobile;

    public Listen(Mobile mobile) {
        this.mobile = mobile;
    }

    @Override
    public void funcation() {
        mobile.funcation();
        System.out.println("我可以听歌");
    }
}
