package TicTacToe.Models;

public class Humanplayer extends Player {

    private Integer level;
    private Integer coins;
    public Humanplayer(String name,int ID,Symbol symbol) {
        super(name,ID,symbol,Playertype.HUMAN_PLAYER);
        this.level = 1;
        this.coins = 0;
    }
    public void setLevel(Integer level) {
        this.level=level;
    }
    public Integer getLevel() {
        return level;
    }
    public void setCoins(Integer coins) {
        this.coins=coins;
    }
    public Integer getCoins() {
        return coins;
    }
}
