package Game_Tank;

public class MyPlayer implements Player{
    private Map map;
    private Position playerPosition;
    private int x;
    private int y;
    public MyPlayer(Map map){
        this.map = map;
        playerPosition = map.getStartPosition();
    }
    public MyPlayer(){
    }
    public void setMap(Map map){
        this.map = map;
    }
    public void moveRight(){
        this.x = playerPosition.getX();
        this.y = playerPosition.getY();
        if(x + 1 < map.getSize() && map.getValueAt(x + 1, y) != 1){
            playerPosition.setX(++x);
        }
    }
    public void moveLeft(){
        this.x = playerPosition.getX();
        this.y = playerPosition.getY();
        if(x > 0 && map.getValueAt(x - 1, y) != 1){
            playerPosition.setX(--x);
        }
    }
    public void moveUp(){
        this.x = playerPosition.getX();
        this.y = playerPosition.getY();
        if(y > 0 && map.getValueAt(x, y - 1) != 1){
            playerPosition.setY(--y);
        }
    }
    public void moveDown(){
        this.x = playerPosition.getX();
        this.y = playerPosition.getY();
        if(y + 1 < map.getSize() && map.getValueAt(x, y + 1) != 1){
            playerPosition.setY(++y);
        }
    }
    public Position getPosition(){
        return playerPosition;
    }
}
