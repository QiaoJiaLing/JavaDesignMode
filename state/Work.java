package partten.state;

public class Work {
    private State state;
    private int hours;

    public Work(State state, int hours) {
        this.state = state;
        this.hours = hours;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void currentWork(){
        state.work(this);
    }
}
