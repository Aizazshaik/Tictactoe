package TicTacToe.Models;

public class Bot extends Player{
    private Botdifficultylevel difficultylevel;
    public Bot(String name,int ID,Symbol symbol,Botdifficultylevel difficultylevel) {
        super(name,ID,symbol,Playertype.BOT);
        this.difficultylevel = difficultylevel;
    }

    public Botdifficultylevel getDifficultylevel() {
        return difficultylevel;
    }

    public void setDifficultylevel(Botdifficultylevel difficultylevel) {
        this.difficultylevel = difficultylevel;
    }
}
