import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Clase primaria
 * Llama a ejecutar el MainMenu
 * @author: Grupo VI
 * @version 1.0
 */

public class App extends Application {
    @Override
    public void start(Stage primaryStage) {

    Parent root;
    try {
        //Cargando el Main Menu
        root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        Scene scene = new Scene(root);
        //Mostrando la ventana
        primaryStage.setTitle("Bienvenido");
        primaryStage.setScene(scene);
        primaryStage.show();
    } catch (IOException e) {
    }

    }
 
 public static void main(String[] args) {
        launch(args);
    }
}
