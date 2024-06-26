package com.findselfback.View;

import com.findselfback.Control.KeyboardInputs;
import com.findselfback.Control.MouseInputs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GamePanel extends JPanel {
    private MouseInputs mouseInputs;
    private float xDelta=100, yDelta=100;
    private float xDir=0.003f, yDir=0.003f;
    private Color color = new Color(150, 20, 90);
    private Random random;
    private int frames=0;
    private long lastCheck=0;
    public GamePanel(){
        random = new Random();
        mouseInputs=new MouseInputs();
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
        setFocusable(true);
        requestFocus();

    }

    public void changeXDelta(int value){
        this.xDelta +=value;
    }
    public void changeYDelta(int value){
        this.yDelta +=value;

    }

    public void setRectPos(int x, int y){
        this.xDelta = x;
        this.yDelta = y;
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        updateRectangle();
        g.setColor(color);
        g.fillRect((int) xDelta, (int) yDelta,200,70);

        frames++;
        if(System.currentTimeMillis()- lastCheck >=1000){
            lastCheck = System.currentTimeMillis();
            System.out.println("FPS: " + frames);
            frames = 0;
        }

        repaint();
    }

    private void updateRectangle(){
        xDelta+=xDir;
        if(xDelta > 400 || xDelta<0) {
            xDir *= -1;
            color = getRndColor();
        }
        yDelta+=yDir;
        if(yDelta > 400 || yDelta<0) {
            yDir *= -1;
            color = getRndColor();
        }
    }

    private Color getRndColor() {
        int r=random.nextInt(255);
        int b= random.nextInt(255);
        int g= random.nextInt(255);
        return new Color(r,b,g);
    }


}
