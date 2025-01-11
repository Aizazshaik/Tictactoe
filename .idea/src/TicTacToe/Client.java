package TicTacToe;

import TicTacToe.Controller.Gamecontroller;
import TicTacToe.Models.*;
import TicTacToe.strategies.Winningstrategy;


import java.util.ArrayList;
import java.util.List;


public class Client {
    public static void main(String[] args) {
    Gamecontroller gamecontroller =new Gamecontroller();
   List<Player> players =new ArrayList<>();
   players.add(new Humanplayer("aizaz",1,new Symbol('X')));
   players.add(new Bot("botty",1,new Symbol('O'), Botdifficultylevel.EASY));
   int size=3;
   List<Winningstrategy> winningstrategies =new ArrayList<>();


    Game game= gamecontroller.Startgame(
            size,
            players,
            winningstrategies
    );

    while(gamecontroller.getGamestate(game).equals(Gamestate.IN_PROGRESS))
    {
        gamecontroller.display(game);
        gamecontroller.Makemove(game);
        //make move
        // take input to make move
        // update the game state if required
        // update the turn
    }
    if(gamecontroller.getGamestate(game).equals(Gamestate.SUCCESS)){
        System.out.println("Player won : "+gamecontroller.getWinner(game));
        }
    else if(gamecontroller.getGamestate(game).equals(Gamestate.DRAW))
    {
        System.out.println("Game has ended in a draw : ");
    }

    }
}

// client wants to play game
// client wants to create players
// client basically want to have flow of execution of game

//-------- Game process------------
// Display Board
// Ask current player to make a move
// Check for winner
// if YES game over
// else game continues