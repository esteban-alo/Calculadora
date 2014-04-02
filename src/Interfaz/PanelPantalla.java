package Interfaz;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class PanelPantalla extends JPanel {

    private JTextField resultado;

    public PanelPantalla() {

        Font font = new Font("Consolas", Font.PLAIN, 25);
        resultado = new JTextField();
        resultado.isDisplayable();
        resultado.setFont(font);
        this.add(resultado);
        this.setLayout(new GridLayout(1, 1));
        this.setPreferredSize(new Dimension(235, 40));
        resultado.setHorizontalAlignment(JTextField.RIGHT);
    }

    public void setPantalla(String a) {
        resultado.setText(a);
    }

    public String getPantalla() {
        return resultado.getText();
    }
}
