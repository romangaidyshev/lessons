package CockroachRaces;

public class Cockroach implements Runnable {
    private int coorX;
    private int coorY;
    private int time;
    private boolean running;
    private int number;
    private boolean isStarted;
    private int finish;


    public Cockroach(int num, int coordX, int coordY, int sleepTime, boolean running, int finishLine) {
        coorX = coordX;
        coorY = coordY;
        finish = finishLine;
        time = sleepTime;
        number = num;
        this.running = running;
    }

    @Override
    public void run() {

        while (running) {

            try {
                Thread.sleep(this.time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (isStarted) {
                coorX++;
                if (coorX > finish) {
                    System.out.println(this.number + 1);
                    running = false;
                }
            }
        }
    }

    public Thread startThread() {
        Thread t = new Thread(this);
        t.start();
        return t;
    }

    public int getCoorX() {
        return coorX;
    }


    public void setCoorX(int coorX) {
        this.coorX = coorX;
    }


    public int getCoorY() {
        return coorY;
    }


    public void setCoorY(int coorY) {
        this.coorY = coorY;
    }

    public boolean isStarted() {
        return isStarted;
    }

    public void setStarted(boolean started) {
        this.isStarted = started;
    }

}
