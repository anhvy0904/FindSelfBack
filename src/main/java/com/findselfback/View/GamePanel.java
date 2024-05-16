package com.findselfback.View;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    public GamePanel(){

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillRect(100,100,20,20);

    }
}
