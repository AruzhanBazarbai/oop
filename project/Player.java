public interface Player{
    public void setMap(Map m);
    public void moveRight();
    public void moveLeft();
    public void moveUp();
    public void moveDown();
    public Position getPosition();
}
// Interface for a player object, with some basic commands; +
// Moving commands: moveRight, moveLeft, moveUp, moveDown; +
// setMap: to add a map to a player; +
// getPosition: to get the position of a player. +
