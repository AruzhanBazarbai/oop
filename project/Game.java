import java.util.ArrayList;
public class Game{
    private Map map;
    private ArrayList<Player> players;
    public Game(Map m){
        this.map=m;
        this.players=new ArrayList<Player>();
    }
    public void setMap(Map m){
        this.map=m;
    }
    public void addPlayer(Player p){
        p.setMap(map);
        players.add(p);
    }
}
// Creates a game based on some map; +
// Adds a player(s) to the game. +
