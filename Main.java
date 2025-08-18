import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;
import paneles.PanelBuscar;
import paneles.PanelProductos;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tienda Java");

        // Crear ventana principal
        JFrame miVentana = new JFrame();
        miVentana.setTitle("Tienda Java");
        miVentana.setSize(1000, 600);
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setLocationRelativeTo(null);

        // Panel contenedor (padre) con borde rojo
        JPanel panelPadre = new JPanel();
        panelPadre.setLayout(new BorderLayout());
        panelPadre.setBorder(new LineBorder(Color.RED, 2));
        // Panel Productos (centro)
        PanelProductos panelProductos = new PanelProductos();
        panelPadre.add(panelProductos.getPanel(), BorderLayout.CENTER);

        // Panel Buscar (izquierda)
        PanelBuscar panelBuscar = new PanelBuscar();
        panelPadre.add(panelBuscar.getPanel(), BorderLayout.WEST);

        // Agregar panelPadre al JFrame
        miVentana.add(panelPadre);

        miVentana.setVisible(true);
    }
}
