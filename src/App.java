import java.io.IOException;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) {

        Parent root;
        try {

            // root = FXMLLoader.load(getClass().getResource("Main.fxml"));
            // root = FXMLLoader.load(getClass().getResource("Main1.fxml"));
            root = FXMLLoader.load(getClass().getResource("Main2.fxml"));
            // root = FXMLLoader.load(getClass().getResource("Menu.fxml"));

            Scene scene = new Scene(root);

            // scene.getStylesheets().add(getClass().getResource("nonogram.css").toExternalForm());

            // scene.getStylesheets().add(getClass().getResource("nonogram1.css").toExternalForm());
            scene.getStylesheets().add(getClass().getResource("nonogram2.css").toExternalForm());
            // scene.getStylesheets().add(getClass().getResource("menu.css").toExternalForm());

            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {

        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}