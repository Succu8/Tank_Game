package Game_Tank;

public interface Player {
    void moveUp();
    void moveDown();
    void moveRight();
    void moveLeft();
    void setMap(Map map);
    Position getPosition();
}
