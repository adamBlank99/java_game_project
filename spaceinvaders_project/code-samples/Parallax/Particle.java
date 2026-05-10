package spaceinvaders.Parallax;

import java.awt.*;
import java.util.Random;

public class Particle {

    private double x;
    private double y;
    private int size;
    private double speed;

    public Particle(double x, double y, int size, double speed){
        this.x = x;
        this.y = y;
        this.size = size;
        this.speed = speed;
    }
    public void update(int screenHeight, int screenWidth, Random random){
        y += speed;

        if(y > screenHeight){
            y = -size * 2;
            x = random.nextInt(screenWidth);
        }
    }

    public void draw(Graphics2D g){
        int drawX = (int) x;
        int drawY = (int) y;

        g.setColor(Color.WHITE);
        g.fillRect(drawX, drawY, size, size);

        int half = size / 2;

        g.fillPolygon(
            new int[]{drawX, drawX + half, drawX + size},
            new int[]{drawY, drawY - size, drawY},
            3
        );

        g.fillPolygon(
            new int[]{drawX, drawX + half, drawX + size},
            new int[]{drawY + size, drawY + size * 2, drawY + size},
            3
        );

        g.fillPolygon(
            new int[]{drawX, drawX - size, drawX},
            new int[]{drawY, drawY + half, drawY + size},
            3
        );

        g.fillPolygon(
            new int[]{drawX + size, drawX + size * 2, drawX + size},
            new int[]{drawY, drawY + half, drawY + size},
            3
        );
    }
}
