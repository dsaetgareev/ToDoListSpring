package ru.dinis.ibm.ru.dinis.ibm.button;


import java.awt.event.ActionEvent;

/**
 * Create by dinis of 05.01.18.
 */
public class AddNewButtonActionListener extends ListTableListener {

    public void actionPerformed(ActionEvent e) {
        list.add("New item");
        table.revalidate();
    }
}
