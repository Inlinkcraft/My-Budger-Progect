package inlinkcraft.mybudger.app;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SceneManager {

    public final static String[] SCENES = {
            "app_main_screen",
            "app_budget_setup_screen"
    };

    private HashMap<String, Scene> scenes;
    private Stage primaryStage;

    public void initialize(Stage primaryStage) throws IOException {

        // Initialize the class
        this.scenes = new HashMap<String, Scene>();
        this.primaryStage = primaryStage;

        // Load Scenes
        for (String fxmlFileName: SCENES) {

            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFileName + ".fxml"));

            loader.load();

            Scene loadedScene = new Scene(loader.getRoot());
            scenes.put(fxmlFileName, loadedScene);

        }
    }

    public void setActiveScene(String sceneName){
        primaryStage.setScene(scenes.get(sceneName));
    }

    public Scene getScene(String sceneName){
        return scenes.get(sceneName);
    }

}
