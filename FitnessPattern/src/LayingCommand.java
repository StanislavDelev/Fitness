public class LayingCommand implements Command {

    private Exercises exercises;

    public LayingCommand(Exercises exercises) {
        this.exercises = exercises;
    }

    @Override
    public void execute() {
        this.exercises.Laying();
    }
}
