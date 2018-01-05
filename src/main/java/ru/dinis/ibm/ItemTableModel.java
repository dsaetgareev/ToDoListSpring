package ru.dinis.ibm;


import javax.swing.table.AbstractTableModel;
import java.util.List;

/**
 * Create by dinis of 05.01.18.
 */
public class ItemTableModel extends AbstractTableModel {

    private List itemList;

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public String getColumnName(int column) {
        return "Items";
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        itemList.set(rowIndex, aValue);
    }

    public int getColumnCount() {
        return 1;
    }

    public int getRowCount() {
        return this.itemList.size();
    }

    public List getItemList() {
        return itemList;
    }

    public void setItemList(List itemList) {
        this.itemList = itemList;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        return itemList.get(rowIndex);
    }
}
