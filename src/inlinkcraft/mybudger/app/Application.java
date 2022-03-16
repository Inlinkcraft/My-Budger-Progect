package inlinkcraft.mybudger.app;

import javafx.scene.Scene;
import javafx.stage.Stage;

import java.security.PublicKey;

public class Application extends javafx.application.Application {

    public static final SceneManager SCENE_MANAGER = new SceneManager();

    @Override
    public void start(Stage primaryStage) throws Exception {

        SCENE_MANAGER.initialize(primaryStage);

        SCENE_MANAGER.setActiveScene("app_main_screen");

        primaryStage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
