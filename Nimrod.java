public class Nimrod {
    public static int laser = 100_000;
    public static int rocket = 10_000;
    public static int angelicaKiss;

    public int health = 1_000_000;

    public void defend(int damage) {
        this.health -= applyShield(damage);
    }

    public int attack() {
        return angelicaKiss;
    }

    public byte applyShield(int damage) {
        return (byte) damage;
    }
}
