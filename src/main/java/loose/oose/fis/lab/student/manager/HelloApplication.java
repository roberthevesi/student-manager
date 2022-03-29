package loose.oose.fis.lab.student.manager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override

//     public void start(Stage primaryStage) throws Exception {
//         Parent root = FXMLLoader.load(getClass().getResource("fxml/view-students.fxml"));
//         primaryStage.setTitle("Student Manager");
//         primaryStage.setScene(new Scene(root, 600, 400));
//         primaryStage.show();
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("fxml/login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("FIS - Student Manager");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}