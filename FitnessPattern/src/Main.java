public class Main {

    public static void main(String[] args) {
        Exercises exercises = new Exercises();

        Command layingCommand = new LayingCommand(exercises);
        //Command standingCommand = new StandingCommand(exercises);

        RemoteController remote = new RemoteController();


        remote.setCommand(layingCommand);
        remote.pressButton();

        //remote.setCommand(standingCommand);
        //remote.pressButton();

    }
}
