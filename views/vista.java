package views;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;
import paneles.PanelBuscar;
import paneles.PanelProductos;

public class vista extends JFrame {

    public vista() {
        setTitle("Tienda Java");
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // centrar ventana

        // Panel contenedor principal
        JPanel panelPadre = new JPanel();
        panelPadre.setLayout(new BorderLayout());
        panelPadre.setBorder(new LineBorder(Color.RED, 2));

        // Panel Buscar (izquierda)
        PanelBuscar panelBuscar = new PanelBuscar();
        panelPadre.add(panelBuscar.getPanel(), BorderLayout.WEST);

        // Panel Productos (centro)
        PanelProductos panelProductos = new PanelProductos();
        panelPadre.add(panelProductos.getPanel(), BorderLayout.CENTER);

        // Agregar panelPadre al JFrame
        add(panelPadre);
    }
}
