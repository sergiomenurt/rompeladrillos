


import javax.swing.ImageIcon;


public class ladrillo extends Sprite {

    String brick = "ladrillo.png";

    boolean destroyed;


    public ladrillo(int x, int y) {
        this.x = x;
        this.y = y;

        ImageIcon ii = new ImageIcon(this.getClass().getResource(brick));
        image = ii.getImage();

        width = image.getWidth(null);
        heigth = image.getHeight(null);

        destroyed = false;
    }

    public boolean isDestroyed()
    {
        return destroyed;
    }

    public void setDestroyed(boolean destroyed) {
        this.destroyed = destroyed;
    }

}

