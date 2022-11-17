package game;

public class Player {

    private PlayerLevel level;

    public Player() {
        level = new BeginnerLeve();
        level.showLevelMessage();
    }

    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
        level.showLevelMessage();
    }

    public void play(int count) {
        level.go(count);
    }


}
