package TicTacToe.Models;

public class Cell {
    private int row;
    private int col;
    private Symbol symbol;
    private Cellstate cellstate;
    public Cell(int row,int col) {
        this.row=row;
        this.col=col;
        this.symbol=null;
        this.cellstate=Cellstate.EMPTY;
    }

    public Cellstate getCellstate() {
        return cellstate;
    }
    public void setCellstate(Cellstate cellstate) {
        this.cellstate=cellstate;
    }

    public void setRow(int row) {
        this.row=row;
    }
    public int getRow() {
        return row;
    }
    public void setCol(int col) {
        this.col=col;
    }
    public int getCol() {
        return col;
    }
    public void setSymbol(Symbol symbol) {
        this.symbol=symbol;
    }
    public Symbol getSymbol() {
        return symbol;
    }

}
