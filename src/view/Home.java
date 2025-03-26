package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Home extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Image imgIconStarbucks = new Image(getClass().getResourceAsStream("/view/img/iconSmall.png"));

        BorderPane mainPane = new BorderPane();
        mainPane.setStyle("-fx-background-image: url('/view/img/bg.jpg')");
        Scene scene = new Scene(mainPane, 1024, 700);
        stage.setScene(scene);
        stage.setTitle("Starbucks");
        stage.getIcons().add(imgIconStarbucks);
        stage.setMaximized(true);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}