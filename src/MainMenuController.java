

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Control de la ventana Menu Principal
 * Acciones de los elementos de la ventana Menu Principal
 * @author: Grupo VI
 * @version 1.0
 */

    public class MainMenuController {
    
        @FXML
        void btnConsultaClicked(ActionEvent event) {
            try
            {
        //Proceso para mostrar la ventana Consulta
        Node source = (Node) event.getSource();
        Stage primarystage = (Stage) source.getScene().getWindow();
        primarystage.close();
        FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("Consulta.fxml"));
        Parent root1= (Parent)fxmlLoader.load();

        Stage stage= new Stage();
     

        stage.setScene(new Scene(root1));
    
        stage.setTitle("Consulta");
        stage.show();
        } catch (IOException e) 
            {
            }
        }
    
        @FXML
        void btnDepositoClicked(ActionEvent event) {
            try
            {
        //Proceso para mostrar la ventana Deposito
        Node source = (Node) event.getSource();
        Stage primarystage = (Stage) source.getScene().getWindow();
        primarystage.close();
        FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("Deposito.fxml"));
        Parent root1= (Parent)fxmlLoader.load();

        Stage stage= new Stage();
     

        stage.setScene(new Scene(root1));
    
        stage.setTitle("Deposito");
        stage.show();
        } catch (IOException e) 
            {
            }
        }
    
        @FXML
        void btnNewUserClicked(ActionEvent event) { 
 
        try
            {
        //Proceso para mostrar la ventana Nuevo Usuario
        Node source = (Node) event.getSource();
        Stage primarystage = (Stage) source.getScene().getWindow();
        primarystage.close();
        FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("NewUser.fxml"));
        Parent root1= (Parent)fxmlLoader.load();

        Stage stage= new Stage();
     

        stage.setScene(new Scene(root1));
    
        stage.setTitle("Nuevo usuario");
        stage.show();
        } catch (IOException e) 
            {
            }
        }
    
        @FXML
        void btnPrestamosClicked(ActionEvent event) {
            try
            {
        //Proceso para mostrar la ventana Prestamo
        Node source = (Node) event.getSource();
        Stage primarystage = (Stage) source.getScene().getWindow();
        primarystage.close();
        FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("Prestamo.fxml"));
        Parent root1= (Parent)fxmlLoader.load();

        Stage stage= new Stage();
     

        stage.setScene(new Scene(root1));
    
        stage.setTitle("Prestamo");
        stage.show();
        } catch (IOException e) 
            {
            }
        }
    
        @FXML
        void btnRetiroClicked(ActionEvent event) {
            try
            {
        //Proceso para mostrar la ventana Retiro
        Node source = (Node) event.getSource();
        Stage primarystage = (Stage) source.getScene().getWindow();
        primarystage.close();
        FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("Retiro.fxml"));
        Parent root1= (Parent)fxmlLoader.load();

        Stage stage= new Stage();
     

        stage.setScene(new Scene(root1));
    
        stage.setTitle("Retiro");
        stage.show();
        } catch (IOException e) 
            {
            }
        }
    
    }
