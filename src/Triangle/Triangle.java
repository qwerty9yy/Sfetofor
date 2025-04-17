package Triangle;
import javax.swing.*;
import java.awt.*;

public abstract class Triangle extends JPanel {
    private int xTriangle1;
    private int xTriangle2;
    private int xTriangle3;
    private int yTriangle1;
    private int yTriangle2;
    private int yTriangle3;

    public Triangle(int x1, int x2, int x3, int y1, int y2, int y3) {
        this.xTriangle1 = x1;
        this.xTriangle2 = x2;
        this.xTriangle3 = x3;
        this.yTriangle1 = y1;
        this.yTriangle2 = y2;
        this.yTriangle3 = y3;
        setOpaque(false); // Делаем панель прозрачной
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        int[] xPoints = {xTriangle1, xTriangle2, xTriangle3};
        int[] yPoints = {yTriangle1, yTriangle2, yTriangle3};

        // Заливка треугольника
        g2d.setColor(new Color(0, 0, 0, 255));
        g2d.fillPolygon(xPoints, yPoints, 3);

        // Граница треугольника
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(10, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g2d.drawPolygon(xPoints, yPoints, 3);
    }
}