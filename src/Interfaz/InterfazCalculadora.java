package Interfaz;

import mundo.*;
import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class InterfazCalculadora extends JFrame {

    public static void main(String args[]) {

        InterfazCalculadora ejecutar = new InterfazCalculadora();
        ejecutar.setVisible(true);
    }

    public static String strResultado = "";

    private PanelPantalla panelPantalla;
    private PanelOperaciones panelOperaciones;
    private PanelNumeros panelNumeros;
    double num1;
    double num2;

    Operaciones c = new Operaciones();

    public InterfazCalculadora() {

        panelPantalla = new PanelPantalla();
        panelOperaciones = new PanelOperaciones(this);
        panelNumeros = new PanelNumeros(this);

        this.add(panelPantalla);
        this.add(panelNumeros);
        this.add(panelOperaciones);

        this.setResizable(false);
        this.setSize(260, 290);
        this.setBounds(500, 300, 260, 290);
        this.setTitle("Mi Calculadora");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
    }

    public void ActualizarNumPantalla() {
        panelPantalla.setPantalla(InterfazCalculadora.strResultado);
    }

    public void sumar() {
        num1 = Double.parseDouble(panelPantalla.getPantalla());
        strResultado = " ";
    }

    public void restar() {
        num1 = Double.parseDouble(panelPantalla.getPantalla());
        strResultado = " ";
    }

    public void multiplicar() {
        num1 = Double.parseDouble(panelPantalla.getPantalla());
        strResultado = " ";
    }

    public void dividir() {
        num1 = Double.parseDouble(panelPantalla.getPantalla());
        strResultado = " ";
    }

    public void limpiar() {
        num1 = 0;
        num2 = 0;
        panelPantalla.setPantalla("");
    }

    public void igualSuma() {
        num2 = Double.parseDouble(panelPantalla.getPantalla());
        panelPantalla.setPantalla("" + c.suma(num1, num2));
    }

    public void igualResta() {
        num2 = Double.parseDouble(panelPantalla.getPantalla());
        panelPantalla.setPantalla("" + c.resta(num1, num2));
    }

    public void igualMultiplicacion() {
        num2 = Double.parseDouble(panelPantalla.getPantalla());
        panelPantalla.setPantalla("" + c.multiplicacion(num1, num2));
    }

    public void igualDivision() {
        num2 = Double.parseDouble(panelPantalla.getPantalla());
        panelPantalla.setPantalla("" + c.division(num1, num2));
    }
}
