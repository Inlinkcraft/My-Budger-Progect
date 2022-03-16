package inlinkcraft.mybudger.controllers;

import inlinkcraft.mybudger.app.Application;
import inlinkcraft.mybudger.app.SceneManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainScreenController {

    @FXML
    void BudgetButtonPressed(ActionEvent event) {
        Application.SCENE_MANAGER.setActiveScene("app_budget_setup_screen");
    }

}
