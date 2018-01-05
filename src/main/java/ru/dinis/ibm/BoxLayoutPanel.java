package ru.dinis.ibm;


import javax.swing.*;
import java.awt.*;
import java.util.Iterator;
import java.util.List;

/**
 * Create by dinis of 05.01.18.
 */
public class BoxLayoutPanel extends JPanel {

    private List panelComponents;

    private int axis;

    public List getPanelComponents() {
        return panelComponents;
    }

    public int getAxis() {
        return axis;
    }

    public void setPanelComponents(List panelComponents) {
        this.panelComponents = panelComponents;
    }

    public void setAxis(int axis) {
        this.axis = axis;
    }

    public void init() {
        setLayout(new BoxLayout(this, this.axis));

        for (Iterator iter = this.panelComponents.iterator(); iter.hasNext();) {
            Component component = (Component) iter.next();
            add(component);
        }
    }
}
