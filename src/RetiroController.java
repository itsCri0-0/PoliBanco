import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Control de la ventana Retiro
 * Aciones de los elementos de la ventana Retiro
 * @author: Grupo VI
 * @version 1.0
 */

public class RetiroController {

    @FXML
    void btnCancelar(ActionEvent event) {
        try
        {
    //Proceso en caso de dar click en el boton Cancelar 
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

    @FXML
    void btnRetirar(ActionEvent event) {
        try
        {
    //Proceso en caso de dar click en el boton Retirar
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

    @FXML
    void txtNumCuenta(ActionEvent event) {

    }

    @FXML
    void txtRCantRetiro(ActionEvent event) {

    }

    @FXML
    void txtSaldo(ActionEvent event) {

    }
}