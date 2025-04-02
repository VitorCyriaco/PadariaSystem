package view.components;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.image.Image;

import java.util.Objects;

public class Sidebar extends VBox {


    public Button btnFornecedor = new Button("Fonecedores");
    public Button btnProduto = new Button("Produtos");
    public Button btnCliente = new Button("Clientes");
    public Button btnPedido = new Button("Pedidos");

    public Sidebar(){

        Image fornecedorIcon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/view/img/fornecedorIcon.png")));
        Image personIcon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/view/img/personIcon.png")));
        Image cakeIcon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/view/img/cakeIcon.png")));
        Image orderIcon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/view/img/orderIcon.png")));

        Label lblMenu = new Label("Starbucks");
        lblMenu.setStyle("-fx-font-size: 16px; -fx-font-weight: bold; ");

        ImageView imgViewIconFornecedor = new ImageView(fornecedorIcon);
        imgViewIconFornecedor.setFitHeight(25);
        imgViewIconFornecedor.setFitWidth(25);

        ImageView imgViewPerson = new ImageView(personIcon);
        imgViewPerson.setFitHeight(25);
        imgViewPerson.setFitWidth(25);

        ImageView imgViewCake = new ImageView(cakeIcon);
        imgViewCake.setFitHeight(25);
        imgViewCake.setFitWidth(25);

        ImageView imgViewOrder = new ImageView(orderIcon);
        imgViewOrder.setFitHeight(25);
        imgViewOrder.setFitWidth(25);

        btnFornecedor.setStyle("-fx-background-color: green; -fx-text-fill: white; -fx-font-size: 16px; -fx-min-width: 180px; -fx-min-height: 50px; -fx-alignment: center-left;");
        btnFornecedor.setGraphic(imgViewIconFornecedor);
        btnProduto.setStyle("-fx-background-color: transparent; -fx-text-fill: black; -fx-font-size: 16px; -fx-min-width: 180px; -fx-min-height: 50px; -fx-alignment: center-left;");
        btnProduto.setGraphic(imgViewCake);
        btnCliente.setStyle("-fx-background-color: transparent; -fx-text-fill: black; -fx-font-size: 16px; -fx-min-width: 180px; -fx-min-height: 50px; -fx-alignment: center-left;");
        btnCliente.setGraphic(imgViewPerson);
        btnPedido.setStyle("-fx-background-color: transparent; -fx-text-fill: black; -fx-font-size: 16px; -fx-min-width: 180px; -fx-min-height: 50px; -fx-alignment: center-left;");
        btnPedido.setGraphic(imgViewOrder);

        getChildren().addAll(lblMenu, btnFornecedor,btnProduto, btnCliente, btnPedido);
    }

}
