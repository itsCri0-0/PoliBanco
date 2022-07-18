import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Control de la ventana Consulta
 * Acciones de los elementos de la ventana consulta
 * @author: Grupo VI
 * @version 1.0
 */

public class ConsultaController {

    @FXML
    void btnBusCedula(ActionEvent event) {

    }

    @FXML
    void btnBusNumCuenta(ActionEvent event) {

    }

    @FXML
    void txtBusqueda(ActionEvent event) {

    }

    @FXML
    void btnConfirmar(ActionEvent event) {
        try
        {
    //En caso de dar click en el boton confirmar se muestra el Main Menu
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

}

