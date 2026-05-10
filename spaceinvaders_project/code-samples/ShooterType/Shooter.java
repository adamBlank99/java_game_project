package spaceinvaders.UIelements.ShooterType;

public class ShooterUI {

    private int x;
    private int y;

    public int abilityTimer = 0;
    public int abilityCoolDownTimer = 0;
    public int abilityCoolDownTimerDuration = 250;
    public int abilityDuration = 300;
    public boolean abilityUsed = false;
    public boolean ability = false;
    public boolean abilityReady = true;
    public int direction;

    private ShooterType shooterType;

    private int width = 50;
    private int height = 60;

    public ShooterUI(int x, int y, ShooterType shooterType) {
        this.x = x;
        this.y = y;
        this.shooterType = shooterType;
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public int getAbilityCooldown() { return abilityCoolDownTimer; }

    public ShooterType getShooterType() { return shooterType;}

    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }


    public int getWidth() { return width; }
    public int getHeight() { return height; }
}