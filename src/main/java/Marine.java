public class Marine extends Vehicle {

    public Marine(String type, int healthValue, int attackValue) {
        super(type, healthValue, attackValue);
    }

    public int takeDamage(int damage) {
        return super.getHealthValue() - damage;
    }

    public void attack(IDamage damaged) {
        damaged.takeDamage(this.getAttackValue());
    }
}
