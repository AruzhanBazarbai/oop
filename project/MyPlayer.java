public class MyPlayer implements Player{
    private Map m;
    private Position p;
    @Override
    public void setMap(Map m){
        this.m=m;
        this.p=new Position(m.getPosX(),m.getPosY());
        // this.p.posx=m.posx;
        // this.p.posy=m.posy;
    }
    @Override
    public void moveDown(){
        if(p.getY()+1<m.getSize() && m.getValueAt(p.getY()+1,p.getX())!='1'){ 
            p.setY(p.getY()+1);
        }

    }
    @Override
    public void moveUp(){
        if(p.getY()-1>=0 && m.getValueAt(p.getY()-1,p.getX())!='1'){ 
            p.setY(p.getY()-1);
        }

    }
    @Override
    public void moveLeft(){
        if(p.getX()-1>=0 && m.getValueAt(p.getY(),p.getX()-1)!='1'){ 
            p.setX(p.getX()-1);
        }
    }
    @Override
    public void moveRight(){
        if(p.getX()+1<m.getSize() && m.getValueAt(p.getY(),p.getX()+1)!='1'){ 
            p.setX(p.getX()+1);
        }

    }
    @Override
    public Position getPosition(){
        return p;
    }
}
// Implements the Player interface; +
// Binds a player to a specific map; +
// Moves the player in four directions within the given map; +
// Makes sure a player does not go out of bounds or through the walls.+

