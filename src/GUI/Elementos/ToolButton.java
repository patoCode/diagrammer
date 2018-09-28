package GUI.Elementos;

import GUI.Comportamientos.ActionButtonsListener;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;


public class ToolButton extends JButton{
    private JPanel actionZone;
    private ActionButtonsListener acciones;
    private DrawElement dibujo;

    public ToolButton(JPanel actionZone, DrawInterfaceElement dibujo, String texto, Dimension dimension) {
        this.actionZone = actionZone;
        this.dibujo = dibujo;
        this.acciones = new ActionButtonsListener(actionZone, texto);
        // estilos
        setBackground(new Color(220,218,221));
        setForeground(Color.WHITE);
        setOpaque(true);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setBorder(new LineBorder(new Color(223,121,1)));
        setPreferredSize(dimension);
        setText(texto.toUpperCase());
        // end estilos
        addActionListener(this.acciones);
    }
    public ToolButton(JPanel actionZone, DrawClassElement dibujo, String texto, Dimension dimension) {
        this.actionZone = actionZone;
        this.dibujo = dibujo;
        this.acciones = new ActionButtonsListener(actionZone, texto);
        // estilos
        setBackground(new Color(220,218,221));
        setForeground(Color.WHITE);
        setOpaque(true);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setBorder(new LineBorder(new Color(243,142,62)));
        setPreferredSize(dimension);
        setText(texto.toUpperCase());
        // end estilos
        addActionListener(this.acciones);
    }
    public ToolButton(JPanel actionZone, DrawPersonaElement dibujo, String texto, Dimension dimension) {
        this.actionZone = actionZone;
        this.dibujo = dibujo;
        this.acciones = new ActionButtonsListener(actionZone, texto);
        // estilos
        setBackground(new Color(220,218,221));
        setForeground(Color.WHITE);
        setOpaque(true);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setBorder(new LineBorder(new Color(223,121,1)));
        setPreferredSize(dimension);
        setText(texto.toUpperCase());
        // end estilos
        addActionListener(this.acciones);
    }
    @Override
    protected void paintComponent(Graphics g) {
        final Graphics2D g2 = (Graphics2D) g.create();
        g2.setPaint(new GradientPaint(
                new Point(0, 0),
                new Color(255,170,42),
                new Point(0, getHeight()),
                new Color(247,142,19)));
        g2.fillRect(0, 0, getWidth(), getHeight());
        g2.dispose();
        super.paintComponent(g);
    }



}