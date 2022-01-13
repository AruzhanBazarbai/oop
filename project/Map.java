import java.util.*; 
public class Map{
    private int size,posx,posy;
    private char[][] map; 

    public Map(Scanner input) throws InvalidMapException{
        int x=input.nextInt();
        if(x==0){
            throw new InvalidMapException("Map size can not be zero");
            // System.exit(0);
        }
        this.size=x;
        map=new char[x][x];
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                String s=input.next();
                char val=s.charAt(0);
                if(val=='P'){
                    this.posx=j;
                    this.posy=i;
                    // val='0';
                }
                if(val=='R' || val=='L' || val=='D' || val=='U'){
                    throw new InvalidMapException("Not enough map elements");
                }
                map[i][j]=val;
            }
        }
    }
    public int getPosX(){ 
        return this.posx;
    }
    public int getPosY(){ 
        return this.posy;
    }
    public int getSize(){
        return this.size;
    }
    public char getValueAt(int x,int y){
        return map[x][y];
    }
    public void print(){
        for(int i=0;i<map.length;i++){
            for(int j=0;j<map[i].length;j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
// Constructs a map from a given input (command-line or file); +
// size: size of map (number of columns/rows); +
// Fills the map; +
// Provides the starting point for the player; +
// Throws InvalidMapException with the following messages: +
// “Not enough map elements” - problems with input values
// “Map size can not be zero” - if map size is zero. +
