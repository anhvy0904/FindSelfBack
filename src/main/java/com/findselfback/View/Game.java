package com.findselfback.View;

public class Game {
    private MainGame mainGame;
    private GamePanel gamePanel;
    public Game(){
        gamePanel=new GamePanel();
        mainGame=new MainGame(gamePanel);
        gamePanel.requestFocus();
    }
}
