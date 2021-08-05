package Catch_the_drop;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class GameWindow extends JFrame {

    private static GameWindow gameWindow;

    private static Image background;
    private static Image drop;
    private static Image gameOver;

    private static float drop_left=100;
    private static float drop_top=-100;
    private static float drop_v=100;

    private static long last_frame_time;

    private static int score=0;

    public static void main(String[] args) throws IOException {

        background= ImageIO.read(GameWindow.class.getResourceAsStream("background.png"));
        drop= ImageIO.read(GameWindow.class.getResourceAsStream("drop.png"));
        gameOver= ImageIO.read(GameWindow.class.getResourceAsStream("game_over.png"));

        gameWindow=new GameWindow();
        gameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gameWindow.setLocation(200,100);
        gameWindow.setSize(906,478);

        GameField gameField=new GameField();
        gameWindow.add(gameField);

        gameField.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                int x=e.getX();
                int y=e.getY();
                float drop_right=drop_left+drop.getWidth(null);
                float drop_button=drop_top+drop.getHeight(null);

                boolean is_drop= x>=drop_left && x<=drop_right && y>=drop_top && y<=drop_button;

                if(is_drop) {
                    drop_top = -100;
                    drop_left = (int) (Math.random() * (gameWindow.getWidth() - drop.getWidth(null)));
                    drop_v+=20;
                    score++;
                    gameWindow.setTitle("Score"+score);
                }
            }
        });

        last_frame_time=System.nanoTime();

        gameWindow.setResizable(false);
        gameWindow.setVisible(true);
    }

    private static void onRepaint(Graphics g){
        long currentTime=System.nanoTime();
        float deltaTime=(currentTime-last_frame_time)*0.000000001f;
        last_frame_time=currentTime;
        drop_top=drop_top+drop_v*deltaTime;


        g.drawImage(background,0,0,null);
        g.drawImage(drop,(int)drop_left,(int)drop_top,null);
        if(drop_top>gameWindow.getHeight())g.drawImage(gameOver,280,120,null);
    }

    private static class GameField extends JPanel{

        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            onRepaint(g);
            repaint();
        }
    }
}
