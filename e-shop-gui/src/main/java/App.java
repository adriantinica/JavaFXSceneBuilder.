import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;

public class App extends Application {

    @Override
    public void start(Stage stage) {

        try {
            Parent root = FXMLLoader.load(new URL("file:D:\\Java\\e-shop-gui\\src\\main\\layout.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {  
            e.printStackTrace();
        }


    

        
    }

    public static void main(String[] args) {
        launch();
    }

}