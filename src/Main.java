import Circle.*;
import Triangle.*;

import java.awt.*;
import java.awt.geom.Path2D;
import javax.swing.*;

import static java.awt.Color.white;

public class Main extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        // Рисуем закруглённый прямоугольник основной
        g2d.setColor(Color.BLACK);
        g2d.fillRoundRect(200, 50, 100, 320, 20, 20);

        // Рисуем закруглённый прямоугольник Нижний
        g2d.setColor(Color.BLACK);
        g2d.fillRoundRect(228, 375, 46, 60, 10, 10);

        // Устанавливаем цвет для "шляпки" светофора
        g.setColor(new Color(0, 0, 0));

//        // Рисуем прямоугольник - основную часть шляпки
//        g.fillRect(200, 50, 100, 20);

        // Рисуем скругленную нижнюю часть шляпки (полуэллипс)
        g.fillArc(215, 25, 70, 40, 0, 180);

    }

    public static void main(String[] args) {
        JFrame fr = new JFrame("Светофор");
        fr.setLayout(new BorderLayout()); // Устанавливаем layout

        Main mainPanel = new Main();
        mainPanel.setLayout(null); // Отключаем layout для точного позиционирования
//
        //Верхний красный круг
        CircleRed circleRed = new CircleRed(215, 78, 70, 70, "RED");
        circleRed.setBounds(0, 0, 500, 500);
        mainPanel.add(circleRed);

        //Верхний черный круг
        CircleBlack1 circleBlack1 = new CircleBlack1(210, 72, 80, 80, "BLACK");
        circleBlack1.setBounds(0, 0, 500, 500);
        mainPanel.add(circleBlack1);

        //Верхний белый круг
        Circle1 circle1 = new Circle1(210, 60, 80, 80, "WHITE");
        circle1.setBounds(0, 0, 500, 500);
        mainPanel.add(circle1);

        //В середине желтый круг
        CircleYellow circleYellow = new CircleYellow(215, 178, 70, 70, "YELLOW");
        circleYellow.setBounds(0, 0, 500, 500);
        mainPanel.add(circleYellow);

        //В середине черный круг
        CircleBlack2 circleBlack2 = new CircleBlack2(210, 172, 80, 80, "BLACK");
        circleBlack2.setBounds(0, 0, 500, 500);
        mainPanel.add(circleBlack2);

        //В середине белый круг
        Circle2 circle2 = new Circle2(210, 160, 80, 80, "WHITE");
        circle2.setBounds(0, 0, 500, 500);
        mainPanel.add(circle2);

        //Внизу зеленый круг
        CircleGreen circleGreen = new CircleGreen(215, 278, 70, 70, "GREEN");
        circleGreen.setBounds(0, 0, 500, 500);
        mainPanel.add(circleGreen);

        //Внизу Черный круг
        CircleBlack3 circleBlack3 = new CircleBlack3(210, 272, 80, 80, "BLACK");
        circleBlack3.setBounds(0, 0, 500, 500);
        mainPanel.add(circleBlack3);

        //Внизу белый круг
        Circle3 circle3 = new Circle3(210, 260, 80, 80, "WHITE");
        circle3.setBounds(0, 0, 500, 500);
        mainPanel.add(circle3);

        //Левый верхний
        Triangle1 triangle1 = new Triangle1(190, 190, 130, 70, 130, 70);
        triangle1.setBounds(0, 0, 500, 500); // Устанавливаем размер и положение
        mainPanel.add(triangle1);

        //Левый в середине
        Triangle2 triangle2 = new Triangle2(190, 190, 130, 170, 230, 170);
        triangle2.setBounds(0, 0, 500, 500);
        mainPanel.add(triangle2);

        //Левый нижний
        Triangle3 triangle3 = new Triangle3(190, 190, 130, 270, 330, 270);
        triangle3.setBounds(0, 0, 500, 500);
        mainPanel.add(triangle3);

        //Правый верхний
        Triangle4 triangle4 = new Triangle4(310, 310, 370, 70, 130, 70);
        triangle4.setBounds(0, 0, 500, 500);
        mainPanel.add(triangle4);

        //Правый в середине
        Triangle5 triangle5 = new Triangle5(310, 310, 370, 170, 230, 170);
        triangle5.setBounds(0, 0, 500, 500);
        mainPanel.add(triangle5);

        //Правый нижний
        Triangle6 triangle6 = new Triangle6(310, 310, 370, 270, 330, 270);
        triangle6.setBounds(0, 0, 500, 500);
        mainPanel.add(triangle6);


        fr.add(mainPanel);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(500, 500);
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
    }
}