package javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("formm.fxml"));
        primaryStage.setTitle("Hello World");// tiêu đề
        primaryStage.setScene(new Scene(root, 680, 400)); // độ rộng
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
