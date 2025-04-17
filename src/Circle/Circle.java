package Circle;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Field;

public abstract class Circle extends JPanel{
    private int x;
    private int y;
    private int width;
    private int height;
    private String colorC;

    Circle(int x, int y, int width, int height, String colorC){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.colorC = colorC.toUpperCase();
        setOpaque(false); // делаем панель прозрачной
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        try{
            Field field = Color.class.getField(colorC);
            Color color = (Color)field.get(null);
            g2d.setColor(color);
        }catch (Exception e){
            g2d.setColor(Color.BLACK);
        }

        g2d.fillOval(x, y, width, height);
    }
}
