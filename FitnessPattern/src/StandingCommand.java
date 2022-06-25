public class StandingCommand implements Command {
    private Exercises exercises;

    public StandingCommand(Exercises exercises) {
        this.exercises = exercises;
    }

    @Override
    public void execute() {
        this.exercises.Standing();
    }
}
