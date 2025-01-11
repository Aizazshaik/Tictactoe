package TicTacToe.strategies;

import TicTacToe.Models.Board;
import TicTacToe.Models.Cell;
import TicTacToe.Models.Cellstate;
import TicTacToe.Models.Move;

import java.util.List;

public class Easybotplayingstrategy implements Botplayingstrategy{
    @Override
    public Move makeMove(Board board) {
        for(List<Cell> row:board.getGrid())
        {
            for(Cell cell:row)
            {
                if(cell.getCellstate().equals(Cellstate.EMPTY))
                {
                    return new Move(new Cell(cell.getRow(), cell.getCol()),null);
                }
            }
        }
    return null;
    }
}


// Fill the first empty cell for easy bot playing strategy