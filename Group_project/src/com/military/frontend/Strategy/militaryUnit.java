package com.military.frontend.Strategy;

import java.awt.*;
import javax.swing.*;
import java.awt.event.MouseEvent;
import javax.swing.border.Border;
import javax.swing.event.MouseInputAdapter;

public class militaryUnit extends JComponent {
    private Point pointPressed;
    private JComponent draggable;

    public militaryUnit(final JComponent component) {
        draggable = component;
        draggable.setCursor(draggable.getCursor());
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setSize(component.getPreferredSize());
        setLayout(new BorderLayout());
        add(component);
        MouseInputAdapter mouseAdapter = new MouseHandler();
        addMouseMotionListener(mouseAdapter);
        addMouseListener(mouseAdapter);
    }

    private class MouseHandler extends MouseInputAdapter {
        @Override
        // mouseDragged
        public void mouseDragged(final MouseEvent e) {
            Point pointDragged = e.getPoint();
            Point loc = getLocation();
            loc.translate(pointDragged.x - pointPressed.x,
                    pointDragged.y - pointPressed.y);
            setLocation(loc);
        }
        @Override
        // mousePressed
        public void mousePressed(final MouseEvent e) {
            pointPressed = e.getPoint();
        }
    }
}
