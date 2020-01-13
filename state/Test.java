package partten.state;

public class Test {
    public static void main(String[] args) {
        Work work = new Work(new MorningState(), 8);
        work.currentWork();
        work.setHours(19);
        work.currentWork();
    }
}
