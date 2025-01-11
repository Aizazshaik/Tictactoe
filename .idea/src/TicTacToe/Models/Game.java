package TicTacToe.Models;

import TicTacToe.strategies.Winningstrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private Integer nextPlayerIndex;
    private Player winner;
    private List<Move> moves;
    private Gamestate gamestate;
    private List<Winningstrategy> winningstrategy;

    public Game(Integer size, List<Player> players,List<Winningstrategy> winningstrategy) {
        this.players = players;
        this.winningstrategy = winningstrategy;
        this.moves = new ArrayList<>();
    }
    public void displayBoard(Board board){
        board.display();
    }
    public void setBoard(Board board) {
        this.board=board;
    }
    public Board getBoard()
    {
        return board;
    }
    public void setPlayers(List<Player> players) {
        this.players = players;
    }
    public List<Player> getPlayers()
    {
        return players;
    }
    public void setNextPlayerIndex(Integer nextPlayerIndex) {
        this.nextPlayerIndex=nextPlayerIndex;
    }

    public Integer getNextPlayerIndex(){
        return nextPlayerIndex;
    }

    public void setGamestate(Gamestate gamestate) {
        this.gamestate = gamestate;
    }
    public Gamestate getGamestate() {
        return gamestate;
    }
    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }
    public List<Move> getMoves()
    {
        return moves;
    }
    public void setWinner(Player winner) {
        this.winner = winner;
    }
    public Player getWinner() {
        return winner;
    }

    public void setWinningstrategy(List<Winningstrategy> winningstrategy) {
        this.winningstrategy = winningstrategy;
    }
    public List<Winningstrategy> getWinningstrategy() {
        return winningstrategy;
    }

}
