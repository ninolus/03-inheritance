package ohm.softa.a03;

public class DigestingState extends State{
    private int remaingingAwakeTime;

    public DigestingState(int duration, int remaingingAwakeTime) {
        super(duration);
        this.remaingingAwakeTime = remaingingAwakeTime;
    }

    @Override
    public State successor(Cat cat) {
        logger.info("Getting in a playful mood!");
        return new PlayfulState(remaingingAwakeTime);
    }
}
