package CockroachRaces.listeners;

import CockroachRaces.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Button implements ActionListener {

    private View view;

    public Button(View view) {
        this.view = view;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (!view.getCockroachList().get(0).isStarted()) {
            for (int i = 0; i < view.getCockroachList().size(); i++) {
                view.getCockroachList().get(i).setStarted(true);
                view.setLeading(true);
            }

        } else {
            System.out.println("Race has been interrupted.");

            for (int i = 0; i < view.getCockroachList().size(); i++) {
                view.getCockroachList().get(i).setStarted(false);
                view.getCockroachList().get(i).setCoorX(5);
                view.setLeading(false);
            }
        }
    }
}
