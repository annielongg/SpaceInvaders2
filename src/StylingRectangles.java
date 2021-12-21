import java.awt.*;

public class StylingRectangles {
    private int length;
    private int width;
    private int x;
    private int y;

    public StylingRectangles(int length, int width, int x, int y) {
        this.length = length;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    public void drawRects(int x, int y, int length,int width, Graphics2D g2){
        g2.setColor(Color.decode("#6F8968"));
        g2.fillRect(x,y,width,length);
    }

}
