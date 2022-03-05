package Game_Tank;

import javafx.scene.image.ImageView;

public class Tree {
    private int x;
    private int y;
    private ImageView tree;
    public Tree(int x, int y){
        this.x = x;
        this.y = y;
        tree = new ImageView("Game_Tank/images/trees.png");
        tree.setX(x * 40);
        tree.setY(y * 40);
        tree.setFitWidth(40);
        tree.setFitHeight(40);
    }
    public ImageView getTree(){
        return tree;
    }
}
