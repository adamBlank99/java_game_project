package spaceinvaders.UIelements.ShooterType;

import spaceinvaders.SpaceInvadersUI;

public abstract class ShooterType {

    protected int speed;

    public int getSpeed(SpaceInvadersUI game) {
        return speed;
    }

    public abstract void useAbility(SpaceInvadersUI game, ShooterUI shooter);
}