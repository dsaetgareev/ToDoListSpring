package ru.dinis.ibm.ru.dinis.ibm.button;


import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Create by dinis of 05.01.18.
 */
public class ActionListenerButton extends JButton {

    private ActionListener actionListener;

    public void setActionListener(ActionListener actionListener) {
        this.actionListener = actionListener;
    }

    public void init() {
        this.addActionListener(actionListener);
    }
}
