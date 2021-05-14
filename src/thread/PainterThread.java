package thread;
import model.Color;

public class PainterThread extends Thread{

    private Color color;
    private int xPos;
    private int xFPos;
    private String colorValue;
    private int width;
    private int sleep;

    public PainterThread(Color cp, int xp, int xfp, String cl, int w, int s){
        xPos = xp;
        xFPos = xfp;
        colorValue = cl;
        width = w;
        color = cp;
        sleep = s;
    }


    @Override
    public void run(){
        try {
            for (int j = 0; j < width; j++) {
                for (int i = xPos; i < xFPos; i++) {
                    color.paint(i,j,colorValue);
                    Thread.sleep(sleep);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
