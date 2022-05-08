package com.javaWithGUI;

import javax.swing.*;
import java.awt.*;

public class Snake extends JFrame {
    public Snake () {
        initUI();
    }
    public void initUI() {
        add(new Board());

        setResizable(true);
        pack();

        setTitle("Snake");
        setLocationRelativeTo(null); //locate at the center
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(()-> {
            JFrame ex = new Snake();
            ex.setVisible(true);
        });
    }
}
