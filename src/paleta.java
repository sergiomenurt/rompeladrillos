

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;


public class paleta extends Sprite implements comun {

    String paddle = "paleta.png";

    int dx;

    public paleta() {

        ImageIcon ii = new ImageIcon(this.getClass().getResource(paddle));
        image = ii.getImage();

        width = image.getWidth(null);
        heigth = image.getHeight(null);

        resetState();
    }

    public void mover() {
        x += dx;
        if (x <= 2)
            x = 2;
        if (x >= comun.PADDLE_RIGHT)
            x = comun.PADDLE_RIGHT;
    }

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = -2;

        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 2;
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }
    }

    public void resetState() {
        x = 200;
        y = 360;
    }
}
