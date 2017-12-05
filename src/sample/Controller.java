package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    Label TextLb;
    @FXML
    Button PreOrdenBtn,InOrdenBtn,PostOrdenBtn,TamañoBtn,MayorBtn,MenorBtn,BuscarBtn;

    MetodosArbol arbol = new MetodosArbol();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Nodo nodo1 = new Nodo(1);
        nodo1.setNodoIzquierdo(new Nodo(10));
        nodo1.setNodoDerecho(new Nodo(11));
        Nodo nodo2 = new Nodo(6);
        Nodo nodo3 = new Nodo(5);
        nodo3.setNodoIzquierdo(nodo2);
        nodo3.setNodoDerecho(nodo1);
        Nodo nodo4 = new Nodo(3);
        Nodo nodo5 = new Nodo(7);
        nodo5.setNodoIzquierdo(nodo4);
        nodo5.setNodoDerecho(nodo3);
        Nodo raiz = new Nodo(8);
        raiz.setNodoIzquierdo(nodo5);
        Nodo nodo6 = new Nodo(2);
        nodo6.setNodoIzquierdo(new Nodo(12));
        nodo6.setNodoDerecho(new Nodo(22));
        Nodo nodo7 = new Nodo(4);
        Nodo nodo8 = new Nodo(9);
        nodo8.setNodoIzquierdo(nodo7);
        nodo8.setNodoDerecho(nodo6);
        raiz.setNodoDerecho(nodo8);
    }



}