package TicTacToe.Controller;


import java.util.List;

import TicTacToe.Models.Game;
import TicTacToe.Models.Gamestate;
import TicTacToe.Models.Player;
import TicTacToe.strategies.Winningstrategy;

public class Gamecontroller {
    public Game Startgame(int size, List<Player> players, List<Winningstrategy> winningstrategy) {
        return new Game(size,players,winningstrategy);
    }
    public Gamestate getGamestate(Game game){
        return null;
    }
    public void display(Game game){
        game.displayBoard();
    }
    public void Makemove(Game game){}
    public void Undo(Game game){}
    public Player getWinner(Game game){
        return null;
    }

}

