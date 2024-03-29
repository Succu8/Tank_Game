package Game_Tank;

import javafx.scene.image.ImageView;

public class Brick {
    private ImageView brick;
    private int x;
    private int y;
    private int lives = 4;
    public Brick(int x, int y){
        brick = new ImageView("Game_Tank/images/brick.jpg");
        brick.setX(x * 40);
        brick.setY(y * 40);
        brick.setFitHeight(40);
        brick.setFitWidth(40);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getLives() {
        return lives;
    }

    public void decreaseLives(){
        --lives;
    }

    public ImageView getBrick(){
        return brick;
    }
}
