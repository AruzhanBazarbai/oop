public class Position{
    int posx,posy;
    public Position(int x,int y){
        this.posx=x;
        this.posy=y;
    }
    public void setX(int x){
        this.posx=x;
    }
    public void setY(int y){
        this.posy=y;
    }
    public int getX(){
        return this.posx;
    }
    public int getY(){
        return this.posy;
    }
    public boolean equals(Position p){
        if(p.getX()==this.posx && p.getY()==this.posy){
            return true;
        }
        else return false;
    }
    public String toString(){
        return "At position: "+this.posx+" "+this.posy;
    }
}
// Stores a position (x and y coordinates). +