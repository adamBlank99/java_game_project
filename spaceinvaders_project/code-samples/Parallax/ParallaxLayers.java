package spaceinvaders.Parallax;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallaxLayers{
    private final List<Particle> particles = new ArrayList<>();
    private final Random random = new Random();

    private final int screenWidth;
    private final int screenHeight;


    public ParallaxLayers(int count, int size, double speed, int screenWidth, int screenHeight){

        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;

        for(int i = 0;  i < count; i++){
            int x = random.nextInt(screenWidth);
            int y = random.nextInt(screenHeight);

            particles.add(new Particle(x, y, size, speed));
        }
    }

    public void update(){
        for (Particle particle: particles){
            particle.update(screenHeight, screenWidth, random);

        }
    }

    public void draw(Graphics2D g) {
        for (Particle particle : particles) {
            particle.draw(g);
        }
    }
}