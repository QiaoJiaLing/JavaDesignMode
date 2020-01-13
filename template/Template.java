package partten.template;

import java.time.Duration;
import java.time.Instant;

public abstract class Template {

    public abstract void toDoSomething();

    public void calculateDifference() {
        Instant inst1 = Instant.now();
        toDoSomething();
        Instant inst2 = Instant.now();
        System.out.println("Difference in milliseconds : " + Duration.between(inst1, inst2).toMillis());
    }
}
