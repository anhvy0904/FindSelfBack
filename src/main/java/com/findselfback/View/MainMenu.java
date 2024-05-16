package com.findselfback.View;

import org.sonatype.guice.bean.containers.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//public class MainMenu extends JPanel {
//    private JButton startButton, settingButton, exitButton;
//    public MainMenu(GameView gameView){
//        setSize(gameView.getSize());
//        setLayout(null);
//        init();
//        System.out.println(getSize());
//
//        startButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                gameView.setView(new InGame(gameView));
//            }
//        });
//    }
//
//    private void init(){
//        startButton = new JButton("Start");
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
//        this.setBackground(Color.GRAY);
//        startButton.setBackground(Color.green);
//    }
//}
