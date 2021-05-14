package thread;
import model.Color;

public class PainterThread extends Thread{

    private final Color color;
    private final int xPos;
    private final int xFPos;
    private final String colorValue;
    private final int width;
    private final int sleep;

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
