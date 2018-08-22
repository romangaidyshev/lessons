package CockroachRaces;

import CockroachRaces.listeners.Button;
import CockroachRaces.listeners.Mouse;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class Main extends JApplet {
    private final int WIDTH = 1100;
    private final int FINISH = 1000;
    private int height;
    private int numOfTracks;


    public void init() {
        setBumOfTracks();
        View view = new View(WIDTH, height, numOfTracks, FINISH);
        view.setCockroachList(fillCockroachList());
        view.addMouseListener(new Mouse(view));
        view.getButton().addActionListener(new Button(view));
        view.update();
    }


    private void setBumOfTracks() {
        try {
            String tracks = JOptionPane.showInputDialog("Enter numbers of tracks");
            numOfTracks = Integer.parseInt(tracks);
        } catch (Exception e) {
            numOfTracks = 10;
            System.out.println("Invalid input, game starts with default value");
        }
        height = numOfTracks * 50;
    }


    private ArrayList<Cockroach> fillCockroachList() {
        ArrayList<Cockroach> cockroachList = new ArrayList<>();
        for (int i = 0; i < numOfTracks; i++) {
            int time = new Random().nextInt(15) + 5;
            Cockroach cockroach = new Cockroach(i, 5, 50 * i, time, true, FINISH);
            cockroach.startThread();
            cockroachList.add(cockroach);
        }
        return cockroachList;
    }


}
