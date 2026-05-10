package spaceinvaders.UIelements.ShooterType;

import spaceinvaders.SpaceInvadersUI;

public class AssaultShooter extends ShooterType {

    public AssaultShooter() {
        speed = 8;
    }

    @Override
    public int getSpeed(SpaceInvadersUI game) {
        ShooterUI player = game.shooters.get(0);
        return player.ability ? 20 : speed;
    }

    @Override
    public void useAbility(SpaceInvadersUI game, ShooterUI shooter) {
        if (shooter.abilityUsed) return;
        if (game.shooters.size() > 1) return;

        ShooterUI clone = new ShooterUI(
            shooter.getX(),
            shooter.getY(),
            shooter.getShooterType()
        );

        game.shooters.add(clone);
        shooter.abilityUsed = true;
    }
}