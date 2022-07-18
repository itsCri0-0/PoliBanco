import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Control de la ventana Deposito
 * Acciones de los elementos de la ventana Deposito
 * @author: Grupo VI
 * @version 1.0
 */

public class DepositoController {

    @FXML
    void btnCancelar(ActionEvent event) {
        try
        {
    //En caso de dar click en Cancelar se muestra el Menu Principal
    Node source = (Node) event.getSource();
    Stage primarystage = (Stage) source.getScene().getWindow();
    primarystage.close();
    FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("MainMenu.fxml"));
    Parent root1= (Parent)fxmlLoader.load();

    Stage stage= new Stage();
 

    stage.setScene(new Scene(root1));
    //Muestra la nueva ventana
    stage.setTitle("Menu Principal");
    stage.show();
    } catch (IOException e) 
        {
        }
    }

    @FXML
    void btnDepositar(ActionEvent event) {
        try
        {
    //En caso de dar click en el boton Depositar se muestra el Menu Principal
    Node source = (Node) event.getSource();
    Stage primarystage = (Stage) source.getScene().getWindow();
    primarystage.close();
    FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("MainMenu.fxml"));
    Parent root1= (Parent)fxmlLoader.load();

    Stage stage= new Stage();
 
    //Se muestra la nueva ventana
    stage.setScene(new Scene(root1));
    stage.setTitle("Menu Principal");
    stage.show();
    } catch (IOException e) 
        {
        }
    }

    @FXML
    void txtDeposito(ActionEvent event) {

    }

    @FXML
    void txtNumCuenta(ActionEvent event) {

    }

}
