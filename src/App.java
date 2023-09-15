import Strategy.AgressiveBehavior;
import Strategy.DefensiveBehavior;
import Strategy.Robot;

public class App {
    public static void main(String[] args) throws Exception {
        Robot Bender = new Robot();
        Bender.setName("Bender");
        Bender.setBehavior(new AgressiveBehavior());
        System.out.println(Bender.getName());
        Bender.move();

        Robot Robocop = new Robot();
        Robocop.setName("Robocop");
        Robocop.setBehavior(new DefensiveBehavior());
        System.out.println(Robocop.getName());
        Robocop.move();


    }
}
