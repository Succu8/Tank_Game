package Game_Tank;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Game extends Application {
    static Pane pane;
    private Map map;
    private Player player;

    public Game(Map map){
        this.map = map;
    }

    public Game() {}

    public void setMap(Map map) {
        this.map = map;
    }

    public void addPlayer(Player player) {
        this.player = player;
    }
    public void start(Stage stage) throws FileNotFoundException {
        init();
        Scene scene = new Scene(map, 560, 560);
        Tank tank = new Tank(map.getStartPosition().getX(), map.getStartPosition().getY(),map);
        map.getChildren().add(tank.getTank());
        map.getChildren().addAll(map.getTrees());
        scene.setOnKeyPressed(e -> {
            if(e.getCode() == KeyCode.UP)
                tank.moveUp();
            if(e.getCode() == KeyCode.DOWN)
                tank.moveDown();
            if(e.getCode() == KeyCode.RIGHT)
                tank.moveRight();
            if(e.getCode() == KeyCode.LEFT)
                tank.moveLeft();
            if(e.getCode() == KeyCode.SPACE){
                Bullet bullet = new Bullet(map, tank);
                map.getChildren().remove(tank.getTank());
                map.getChildren().removeAll(map.getTrees());
                map.getChildren().addAll(bullet.getBullet(), tank.getTank());
                map.getChildren().addAll(map.getTrees());
            }
        });

        stage.setScene(scene);
        stage.setTitle("Tank Game");
        stage.show();
    }
    public void init() throws FileNotFoundException {

        map = new Map(new Scanner(new File("src/game_tank/images/map.txt")), 14);
    }
}

