package ru.dinis.ibm;


import javax.swing.*;
import java.awt.*;

/**
 * Create by dinis of 26.12.17.
 */
public class MyFrame extends JFrame {

    public void init() {
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new Dimension(600, 400));
        setVisible(true);

        setState(Frame.NORMAL);
    }

}
