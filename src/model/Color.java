package model;

public class Color {

    public Color(){
    }

    public synchronized void paint(int x,int y, String cl) throws InterruptedException {
            System.out.print("["+x+";"+y+"H");
            System.out.print("["+cl+"m"+(char)32);
    }

}
