package Interfaz;

import mundo.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class PanelNumeros extends JPanel implements ActionListener {

    private JButton cero;
    private JButton uno;
    private JButton dos;
    private JButton tres;
    private JButton cuatro;
    private JButton cinco;
    private JButton seis;
    private JButton siete;
    private JButton ocho;
    private JButton nueve;
    private JButton punto;
    private JButton limpiar;

    Operaciones numeros = new Operaciones();

    private InterfazCalculadora principal;

    int cont = 0;

    public PanelNumeros(InterfazCalculadora pPrincipal) {

        principal = pPrincipal;

        cero = new JButton("0");
        uno = new JButton("1");
        dos = new JButton("2");
        tres = new JButton("3");
        cuatro = new JButton("4");
        cinco = new JButton("5");
        seis = new JButton("6");
        siete = new JButton("7");
        ocho = new JButton("8");
        nueve = new JButton("9");
        punto = new JButton(".");
        limpiar = new JButton("C");

        this.add(siete);
        siete.setActionCommand("siete");
        siete.addActionListener(this);

        this.add(ocho);
        ocho.setActionCommand("ocho");
        ocho.addActionListener(this);

        this.add(nueve);
        nueve.setActionCommand("nueve");
        nueve.addActionListener(this);

        this.add(cuatro);
        cuatro.setActionCommand("cuatro");
        cuatro.addActionListener(this);

        this.add(cinco);
        cinco.setActionCommand("cinco");
        cinco.addActionListener(this);

        this.add(seis);
        seis.setActionCommand("seis");
        seis.addActionListener(this);

        this.add(uno);
        uno.setActionCommand("uno");
        uno.addActionListener(this);

        this.add(dos);
        dos.setActionCommand("dos");
        dos.addActionListener(this);

        this.add(tres);
        tres.setActionCommand("tres");
        tres.addActionListener(this);

        this.add(punto);
        punto.setActionCommand("punto");
        punto.addActionListener(this);

        this.add(cero);
        cero.setActionCommand("cero");
        cero.addActionListener(this);

        this.add(limpiar);
        limpiar.setActionCommand("limpiar");
        limpiar.addActionListener(this);

        this.setLayout(new GridLayout(4, 3));

        this.setPreferredSize(new Dimension(238, 125));
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("cero")) {
            InterfazCalculadora.strResultado += "0";
            principal.ActualizarNumPantalla();
        }

        if (e.getActionCommand().equals("uno")) {
            InterfazCalculadora.strResultado += "1";
            principal.ActualizarNumPantalla();
        }
        if (e.getActionCommand().equals("dos")) {
            InterfazCalculadora.strResultado += "2";
            principal.ActualizarNumPantalla();
        }

        if (e.getActionCommand().equals("tres")) {
            InterfazCalculadora.strResultado += "3";
            principal.ActualizarNumPantalla();
        }

        if (e.getActionCommand().equals("cuatro")) {
            InterfazCalculadora.strResultado += "4";
            principal.ActualizarNumPantalla();
        }

        if (e.getActionCommand().equals("cinco")) {
            InterfazCalculadora.strResultado += "5";
            principal.ActualizarNumPantalla();
        }

        if (e.getActionCommand().equals("seis")) {
            InterfazCalculadora.strResultado += "6";
            principal.ActualizarNumPantalla();
        }

        if (e.getActionCommand().equals("siete")) {
            InterfazCalculadora.strResultado += "7";
            principal.ActualizarNumPantalla();
        }
        if (e.getActionCommand().equals("ocho")) {
            InterfazCalculadora.strResultado += "8";
            principal.ActualizarNumPantalla();
        }

        if (e.getActionCommand().equals("nueve")) {
            InterfazCalculadora.strResultado += "9";
            principal.ActualizarNumPantalla();
        }

        if (e.getActionCommand().equals("limpiar")) {
            principal.ActualizarNumPantalla();
            principal.limpiar();
        }

        if (e.getActionCommand().equals("punto")) {
            cont++;
            System.out.println(cont);
            if (cont <= 1) {
                InterfazCalculadora.strResultado += ".";
                principal.ActualizarNumPantalla();
            }
        }
    }
}
