package Interfaz;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class PanelOperaciones extends JPanel implements ActionListener {

    private JButton suma;
    private JButton resta;
    private JButton multiplicacion;
    private JButton division;
    private JButton igual;
    private JButton borrar;

    int prueba = 0;

    private InterfazCalculadora principal;

    public PanelOperaciones(InterfazCalculadora principal) {

        this.principal = principal;

        suma = new JButton("+");
        resta = new JButton("-");
        multiplicacion = new JButton("*");
        division = new JButton("/");
        igual = new JButton("=");
        borrar = new JButton("CE");

        this.add(suma);
        suma.setActionCommand("suma");
        suma.addActionListener(this);

        this.add(resta);
        resta.setActionCommand("resta");
        resta.addActionListener(this);

        this.add(multiplicacion);
        multiplicacion.setActionCommand("multiplicacion");
        multiplicacion.addActionListener(this);

        this.add(division);
        division.setActionCommand("division");
        division.addActionListener(this);

        this.add(igual);
        igual.setActionCommand("=");
        igual.addActionListener(this);

        this.add(borrar);
        borrar.setActionCommand("CE");
        borrar.addActionListener(this);

        this.setLayout(new GridLayout(2, 4));
        this.setSize(240, 60);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("suma")) {
            principal.sumar();
            prueba = 1;
        }

        if (e.getActionCommand().equals("resta")) {
            principal.restar();
            prueba = 2;
        }

        if (e.getActionCommand().equals("multiplicacion")) {
            principal.multiplicar();
            prueba = 3;
        }

        if (e.getActionCommand().equals("division")) {
            principal.dividir();
            prueba = 4;
        }

        if (e.getActionCommand().equals("CE")) {
            principal.strResultado = "";
            principal.limpiar();
        }

        if (e.getActionCommand().equals("=")) {
            if (prueba == 1) {
                principal.igualSuma();
            } else if (prueba == 2) {
                principal.igualResta();
            } else if (prueba == 3) {
                principal.igualMultiplicacion();
            } else if (prueba == 4) {
                principal.igualDivision();
            }
        }
    }
}
