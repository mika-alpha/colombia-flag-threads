package ui;
import model.Color;
import thread.PainterThread;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.print("[2J");//Clear screen
        Color cp = new Color();
        PainterThread yellow = new PainterThread(cp,0,15,"43",200,3);
        PainterThread blue = new PainterThread(cp,15,23,"44",200,9);
        PainterThread red = new PainterThread(cp,23,31,"41",200,12);
        yellow.join();
        red.join();
        blue.join();
        yellow.start();
        red.start();
        blue.start();
    }
}
