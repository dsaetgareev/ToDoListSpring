package ru.dinis.ibm.ru.dinis.ibm.button;


import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * Create by dinis of 05.01.18.
 */
public abstract class ListTableListener implements ActionListener {

    protected JTable table;

    protected List list;

    public JTable getTable() {
        return table;
    }

    public void setTable(JTable table) {
        this.table = table;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }
}
