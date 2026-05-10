package spaceinvaders.UIelements.ShooterType;

import spaceinvaders.SpaceInvadersUI;

public class PhaseShooter extends ShooterType {

public boolean phasing = false;

    public PhaseShooter() {
        speed = 8;
    }
    public int getSpeed(SpaceInvadersUI game) {
        ShooterUI player = game.shooters.get(0);
        return player.ability ? 20 : speed;
    }  

    @Override
    public void useAbility(SpaceInvadersUI game, ShooterUI shooter) {
        if (!shooter.abilityUsed) {
            game.phasing = true;
            shooter.abilityUsed = true;
        }
    }
}