package game;

public class SuperLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("very fast run");
    }

    @Override
    public void jump() {
        System.out.println("very high jump");
    }

    @Override
    public void turn() {
        System.out.println("turn arount");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("super level");
    }
}
