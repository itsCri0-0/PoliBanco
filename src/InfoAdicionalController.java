import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Control de la ventana Informacion Adicional
 * Acciones de los elementos de la ventana Informacion Adicional
 * @author: Grupo VI
 * @version 1.0
 */

public class InfoAdicionalController {

    @FXML
    void btnCancelar(ActionEvent event) {

        try
        {
    //En caso de dar click en Cancelar se regresa a la ventana Nuevo Usuario
    Node source = (Node) event.getSource();
    Stage primarystage = (Stage) source.getScene().getWindow();
    primarystage.close();
    FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("NewUser.fxml"));
    Parent root1= (Parent)fxmlLoader.load();

    Stage stage= new Stage();
 

    stage.setScene(new Scene(root1));
    //Muestra la nueva ventana
    stage.setTitle("Nuevo Usuario");
    stage.show();
    } catch (IOException e) 
        {
        }

    }

    @FXML
    void btnConfirmar(ActionEvent event) {
        try
        {
    //En caso de dar click en Confirmar se muestra la ventana emergente Numero de Cuenta
    Node source = (Node) event.getSource();
    Stage primarystage = (Stage) source.getScene().getWindow();
    primarystage.close();
    FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("NumCuenta.fxml"));
    Parent root1= (Parent)fxmlLoader.load();

    Stage stage= new Stage();
 

    stage.setScene(new Scene(root1));
    //Muestra la ventana emergente
    stage.show();
    } catch (IOException e) 
        {
        }
    }

}
