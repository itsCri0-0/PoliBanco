import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Control de la ventana Prestamo
 * Acciones de los elementos de la ventana Prestamo
 * @author: Grupo VI
 * @version 1.0
 */

public class PrestamoController {

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
    void btnConfirmar(ActionEvent event) {
        try
        {
    //Proceso en caso de dar click en el boton Confirmar 
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
    void txtCantPrestamo(ActionEvent event) {

    }

    @FXML
    void txtMesesCredito(ActionEvent event) {

    }

    @FXML
    void txtNumCuenta(ActionEvent event) {

    }

    @FXML
    void txtSalarioNeto(ActionEvent event) {

    }

}
