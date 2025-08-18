package paneles;

import javax.swing.*;
import java.awt.*;

public class PanelBuscar {
    private JPanel panelBuscar;   
    private JTextField txtBuscar; 
    private JButton btnBuscar; 

    public PanelBuscar() {
        panelBuscar = new JPanel();
        panelBuscar.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelBuscar.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2)); 
        panelBuscar.setPreferredSize(new Dimension(180, 100)); // tamaño del panel

        JLabel lblBuscar = new JLabel("Buscar");

        txtBuscar = new JTextField();
        txtBuscar.setPreferredSize(new Dimension(120, 25)); // tamaño del cuadro de texto

        btnBuscar = new JButton("Buscar"); 
        btnBuscar.setPreferredSize(new Dimension(80, 25)); 


        panelBuscar.add(lblBuscar);
        panelBuscar.add(txtBuscar);
        panelBuscar.add(btnBuscar);
    }

    public JPanel getPanel() {
        return panelBuscar;
    }

    
    public JTextField getTxtBuscar() {
        return txtBuscar;
    }

   
    public JButton getBtnBuscar() {
        return btnBuscar;
    }
}
