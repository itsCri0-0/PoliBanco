
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * Control de la ventana Numero de Cuenta
 * Acciones de los elementos de la ventana Numero de Cuenta
 * @author: Grupo VI
 * @version 1.0
 */

public class NumCuentaController {

    @FXML
    private Label lblCodUn;

    @FXML
    void btnConfirmar(ActionEvent event) {
        try
        {
    //Proceso de la accion del boton Confirmar para mostrar el Menu Principal
    Node source = (Node) event.getSource();
    Stage primarystage = (Stage) source.getScene().getWindow();
    primarystage.close();
    FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("MainMenu.fxml"));
    Parent root1= (Parent)fxmlLoader.load();

    Stage stage= new Stage();
 

    stage.setScene(new Scene(root1));


    stage.show();
    } catch (IOException e) 
        {
        }
    }

}
