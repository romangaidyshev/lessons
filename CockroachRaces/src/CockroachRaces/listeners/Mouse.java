package CockroachRaces.listeners;

import CockroachRaces.View;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Mouse implements MouseListener {
    private boolean flagX;
    private boolean flagY;
    View view;

    public Mouse(View view) {
        this.view = view;
    }

    @Override
    public void mouseClicked(MouseEvent arg0) {

        for (int i = 0; i < view.getCockroachList().size(); i++) {
            int x = view.getCockroachList().get(i).getCoorX();
            int y = view.getCockroachList().get(i).getCoorY();

            int k = 0;
            while (k < 40) {

                if ((arg0.getX() == x + k)) flagX = true;
                if ((arg0.getY() == y + k)) flagY = true;

                if (flagX && flagY) {
                    view.getCockroachList().get(i).setCoorX(x + 50);

                    flagX = false;
                    flagY = false;
                }

                k++;
            }
        }
    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
        view.getButton().setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
    }

    @Override
    public void mouseExited(MouseEvent arg0) {
        view.getButton().setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
    }

    @Override
    public void mousePressed(MouseEvent arg0) {
    }

    @Override
    public void mouseReleased(MouseEvent arg0) {
    }
}