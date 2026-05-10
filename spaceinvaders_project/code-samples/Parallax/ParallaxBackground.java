package spaceinvaders.Parallax;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ParallaxBackground {
    private final List<ParallaxLayers> layers = new ArrayList<>();

    public ParallaxBackground(int screenWidth, int screenHeight){
        layers.add(new ParallaxLayers(100, 1, .05, screenWidth, screenHeight));
        layers.add(new ParallaxLayers(50, 2, .2, screenWidth, screenHeight));
        layers.add(new ParallaxLayers(25, 3, .3, screenWidth, screenHeight));
    }

    public void update() {
        for (ParallaxLayers layer : layers) {
            layer.update();
        }
    }

    public void draw(Graphics2D g) {
        for (ParallaxLayers layer : layers) {
            layer.draw(g);
        }
    }
}

