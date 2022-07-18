
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Control de la ventana Nuevo Usuario
 * Acciones de los elementos de la ventana Nuevo Usuario
 * @author: Grupo VI
 * @version 1.0
 */

    public class NewUserController {

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
        FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("NumCuenta.fxml"));
        Parent root1= (Parent)fxmlLoader.load();

        Stage stage= new Stage();
     

        stage.setScene(new Scene(root1));
    
        stage.show();
        } catch (IOException e) 
            {
            }
        }

        @FXML
        void btnInfo(ActionEvent event) {
            try
            {
        //Proceso adicional para mostrar la ventana Informacion adicional
        Node source = (Node) event.getSource();
        Stage primarystage = (Stage) source.getScene().getWindow();
        primarystage.close();
        FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("InfoAdicional.fxml"));
        Parent root1= (Parent)fxmlLoader.load();

        Stage stage= new Stage();
     

        stage.setScene(new Scene(root1));
    
        stage.setTitle("Informacion Adicional");
        stage.show();
        } catch (IOException e) 
            {
            }
        }
    
        @FXML
        void comBoxAño(ActionEvent event) {
    
        }
    
        @FXML
        void comBoxDia(ActionEvent event) {
    
        }
    
        @FXML
        void comBoxMes(ActionEvent event) {
    
        }
    
        @FXML
        void txtCantIni(ActionEvent event) {
    
        }
    
        @FXML
        void txtCedula(ActionEvent event) {
    
        }
    
        @FXML
        void txtDireccion(ActionEvent event) {
    
        }
    
        @FXML
        void txtName(ActionEvent event) {
    
        }
    
    } 

