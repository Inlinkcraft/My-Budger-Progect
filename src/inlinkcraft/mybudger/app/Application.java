package inlinkcraft.mybudger.app;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Application extends javafx.application.Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader mainloader = new FXMLLoader(getClass().getResource("app_main_screen.fxml"));
        mainloader.load();

        Scene mainScene = new Scene(mainloader.getRoot());

        primaryStage.setScene(mainScene);

        primaryStage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
