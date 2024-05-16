package com.findselfback.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//public class InGame extends JPanel{
//    private JButton startButton, settingButton, exitButton;
//    public InGame(GameView gameView){
//        setSize(gameView.getSize());
//        setLayout(null);
//        init();
//        System.out.println(getSize());
//
//        startButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                gameView.setView(new MainMenu(gameView));
//            }
//        });
//    }
//
//    private void init(){
//        startButton = new JButton("Change");
//        settingButton = new JButton("Setting");
//        exitButton = new JButton("Exit");
//        autoSize();
//
//        add(startButton);
//        debug();
//    }
//
//    public void autoSize(){
//        startButton.setSize(70,30);
//        startButton.setLocation(this.getWidth()/3/2 - startButton.getWidth()/2, this.getHeight()/3-startButton.getHeight());
//    }
//
//    public void debug(){
//        this.setBackground(Color.ORANGE);
//        startButton.setBackground(Color.green);
//    }
//}
