package CockroachRaces;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class View extends JPanel {

    private int WIDTH;
    private int HEIGHT;
    private int numOfTracks;
    private int finishLine;
    private boolean leading;
    private JButton button;
    private Panel namesPanel;
    private JLabel label;
    private ArrayList<Cockroach> cockroachList;


    public View(int WIDTH, int HEIGHT, int numOfTracks, int finishLine) {

        this.WIDTH = WIDTH;
        this.HEIGHT = HEIGHT;
        this.numOfTracks = numOfTracks;
        this.finishLine = finishLine;

        JFrame frame = new JFrame("Cockroaches Races");

        setPreferredSize(new Dimension(this.WIDTH, this.HEIGHT));
        JScrollPane trackScroller = new JScrollPane(this);
        trackScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        namesPanel = new Panel();
        namesPanel.setLayout(new BoxLayout(namesPanel, BoxLayout.Y_AXIS));
        for (int i = 1; i <= numOfTracks; i++) {
            JTextField field = new JTextField(10);
            field.setText("NAME " + i);
            namesPanel.add(field);
        }
        JScrollPane nameScroller = new JScrollPane(namesPanel);
        nameScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        button = new JButton("START");
        label = new JLabel("Press 'START' to begin the game");
        label.setFont(new Font("Courier New", 3, 15));

        frame.getContentPane().add(nameScroller, BorderLayout.WEST);
        frame.getContentPane().add(label, BorderLayout.NORTH);
        frame.getContentPane().add(button, BorderLayout.SOUTH);
        frame.getContentPane().add(trackScroller, BorderLayout.CENTER);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setVisible(true);

    }


    public void update() {
        System.out.println("Finish places: ");
        while (true) {
            repaint();
            setleader();
        }
    }


    private void setleader() {
        int a = 0;
        int b = cockroachList.get(0).getCoorX();

        if (leading) {
            for (int i = 1; i < cockroachList.size(); i++) {
                if (cockroachList.get(i).getCoorX() > b) {
                    b = cockroachList.get(i).getCoorX();
                    a = i;
                }
            }
            JTextField field1 = (JTextField) namesPanel.getComponent(a);
            label.setText(field1.getText() + " is a leader!");

            for (int i = 0; i < cockroachList.size(); i++) {
                if (cockroachList.get(i).getCoorX() > finishLine) {
                    JTextField field = (JTextField) namesPanel.getComponent(i);
                    label.setText(field.getText() + " is the winner!");
                    leading = false;
                }
            }
        }
    }

    public void paint(Graphics g) {

        g.setColor(Color.WHITE);
        g.fillRect(0, 0, this.WIDTH, this.HEIGHT);

        g.setColor(Color.BLUE);
        for (int i = 0; i < this.numOfTracks; i++) {
            g.drawLine(0, i * 50, 1100, i * 50);
        }

        g.setColor(Color.RED);
        g.drawLine(1000, 0, 1000, HEIGHT);
        ImageIcon icon = new ImageIcon(this.getClass().getResource("images/cr.gif"));
        Image cockroach = icon.getImage();

        for (int i = 0; i < numOfTracks; i++) {

            g.drawImage(cockroach, cockroachList.get(i).getCoorX(), cockroachList.get(i).getCoorY() + 10, this);
        }
    }


    public void setLeading(boolean leading) {
        this.leading = leading;
    }

    public JButton getButton() {
        return button;
    }


    public ArrayList<Cockroach> getCockroachList() {
        return cockroachList;
    }

    public void setCockroachList(ArrayList<Cockroach> cockroachList) {
        this.cockroachList = cockroachList;
    }


}