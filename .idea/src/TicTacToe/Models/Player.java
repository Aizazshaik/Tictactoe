package TicTacToe.Models;

public abstract class Player {
    private String name;
    private int ID;
    private Symbol symbol;
    private Playertype playertype;

    public Player(String name,int ID,Symbol symbol,Playertype playertype) {
        this.name = name;
        this.symbol = symbol;
        this.ID = ID;
        this.playertype = playertype;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public int getID(){
        return ID;
    }
    public void setID(int ID){
        this.ID=ID;
    }
    public Symbol getSymbol(){
        return symbol;
    }
    public void setSymbol(Symbol symbol){
        this.symbol=symbol;
    }
    public Playertype getPlayertype(){
        return playertype;
    }
    public void setPlayertype(Playertype playertype)
    {
        this.playertype=playertype;
    }
}
