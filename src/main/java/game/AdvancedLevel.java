package game;

public class AdvancedLevel extends PlayerLevel {

    @Override
    public void run() {
        System.out.println("빨리  달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("can jump");
    }

    @Override
    public void turn() {
        System.out.println("can turn");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("***advanced level***");

    }
}
