package game;

public class BeginnerLeve extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("cannot jump");
    }

    @Override
    public void turn() {
        System.out.println("cannot turn");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("***beginner level***");

    }
}
