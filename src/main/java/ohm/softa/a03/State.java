package ohm.softa.a03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class State {
    public static final Logger logger = LogManager.getLogger();

    private int time;
    private final int duration;

    public State(int duration) {
        this.duration = duration;
    }

    public int getTime() {
        return time;
    }

    public final State tick(Cat cat) {
        time++;
        logger.info("{}/{}", time, duration);
        if (time == duration) {
            return this.successor(cat);
        }
        return this;
    }

    public abstract State successor(Cat cat);
}
