package view.components;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class Sidebar extends VBox {

    public Button btnFonecedor = new Button("Fonecedores");
    public Button btnProduto = new Button("Produtos");
    public Button btnCliente = new Button("Clientes");
    public Button btnPedido = new Button("Pedidos");


    public Sidebar(){

        Label lblMenu = new Label("Starbucks");
        lblMenu.setStyle("-fx-font-size: 16px; -fx-font-weight: bold; ");

        btnFonecedor.setStyle("-fx-background-color: green; -fx-text-fill: white; -fx-font-size: 16px; -fx-min-width: 200px; -fx-min-height: 50px; -fx-translate-x: 10px;");
        btnProduto.setStyle("-fx-background-color: white; -fx-text-fill: black; -fx-font-size: 16px; -fx-min-width: 200px; -fx-min-height: 50px; -fx-translate-x: 10px;");
        btnCliente.setStyle("-fx-background-color: white; -fx-text-fill: black; -fx-font-size: 16px; -fx-min-width: 200px; -fx-min-height: 50px; -fx-translate-x: 10px;");
        btnPedido.setStyle("-fx-background-color: white; -fx-text-fill: black; -fx-font-size: 16px; -fx-min-width: 200px; -fx-min-height: 50px; -fx-translate-x: 10px;");

        getChildren().addAll(lblMenu, btnFonecedor,btnProduto, btnCliente, btnPedido);
    }

}
