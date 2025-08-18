package paneles;

import javax.swing.*;
import java.awt.*;

public class PanelProductos {
    private JPanel panelProductos; 

    public PanelProductos() {
        panelProductos = new JPanel();
        panelProductos.setLayout(new BorderLayout()); 

        // Texto título arriba
        JLabel titulo = new JLabel("Productos");
        titulo.setHorizontalAlignment(JLabel.CENTER); 
        panelProductos.add(titulo, BorderLayout.NORTH);

        // Panel con GridLayout 2 filas x 4 columnas
        JPanel productosGrid = new JPanel();
        productosGrid.setLayout(new GridLayout(2, 4, 15, 15)); 
        productosGrid.setPreferredSize(new Dimension(450, 250));

        for (int i = 1; i <= 8; i++) {
            JPanel producto = new JPanel();
        producto.setPreferredSize(new Dimension(100, 120));
            producto.setBorder(BorderFactory.createLineBorder(Color.GREEN));
            productosGrid.add(producto);
        }

        panelProductos.add(productosGrid, BorderLayout.CENTER);
        panelProductos.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
    }
    
    public JPanel getPanel() {
        return panelProductos;
    }
}
