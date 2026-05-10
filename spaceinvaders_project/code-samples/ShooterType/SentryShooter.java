package spaceinvaders.UIelements.ShooterType;

import spaceinvaders.SpaceInvadersUI;

public class SentryShooter extends ShooterType {

    public SentryShooter() {
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
        if (game.shooters.size() > 3) return;

        ShooterUI sentry = new ShooterUI(
            shooter.getX(),
            shooter.getY(),
            shooter.getShooterType()
        );

        game.shooters.add(sentry);
        shooter.abilityUsed = true;
    }
}