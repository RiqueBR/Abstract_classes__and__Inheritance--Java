public class Army extends Vehicle implements IDamage{


    public Army(String type, int healthValue, int attackValue) {
        super(type, healthValue, attackValue);
    }

    public int takeDamage(int damage) {
        return super.getHealthValue() - damage;
    }

    public void attack(IDamage damage) {
        damage.takeDamage(super.getAttackValue());
    }
}
