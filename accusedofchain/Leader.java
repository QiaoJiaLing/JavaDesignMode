package partten.accusedofchain;

public abstract class Leader {
    private String name;
    protected Leader nextLeader;

    public Leader(String name, Leader leader) {
        this.name = name;
        this.nextLeader = leader;
    }

    public abstract void handleRequest(int date);
}
