package ru.dinis.ibm.ru.dinis.ibm.button;


import java.awt.event.ActionEvent;

/**
 * Create by dinis of 05.01.18.
 */
public class DeleteButtonActionListener extends ListTableListener {

    public void actionPerformed(ActionEvent e) {
        int selectedRow = table.getSelectedRow();

        if (selectedRow == -1) {
            // if there is no selected row, don't do anything
            return;
        }

        if (table.isEditing()) {
            // if we are editing the table, don't do anything
            return;
        }

        list.remove(selectedRow);
        table.revalidate();
    }
}
