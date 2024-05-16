package com.findselfback.View;

import javax.swing.*;

public class MainGame {
    private JFrame jFrame;
    public MainGame(GamePanel gamePanel){
        jFrame = new JFrame();
        jFrame.setSize(1280,720);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(gamePanel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
}
