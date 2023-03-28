package ohm.softa.a03;

public class HungryState extends State {


    public HungryState(int duration) {
        super(duration);
    }

    @Override
    public State successor(Cat cat) {
        logger.info("I've starved for a too long time...good bye...");
        return new DeathState(0);
    }
}