

import javax.swing.ImageIcon;


public class balon extends Sprite implements comun {

    private int xdir;
    private int ydir;

    protected String ball = "balon.png";

    public balon() {

        xdir = 1;
        ydir = -1;

        ImageIcon ii = new ImageIcon(this.getClass().getResource(ball));
        image = ii.getImage();

        width = image.getWidth(null);
        heigth = image.getHeight(null);

        resetState();
    }


    public void mover()
    {
        x += xdir;
        y += ydir;

        if (x == 0) {
            setXDir(1);
        }

        if (x == BALL_RIGHT) {
            setXDir(-1);
        }

        if (y == 0) {
            setYDir(1);
        }
    }

    public void resetState()
    {
        x = 230;
        y = 355;
    }

    public void setXDir(int x)
    {
        xdir = x;
    }

    public void setYDir(int y)
    {
        ydir = y;
    }

    public int getYDir()
    {
        return ydir;
    }
}
