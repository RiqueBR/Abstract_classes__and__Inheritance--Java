public class Ghidorah extends Kaiju implements IAttack, IDamage{


    public Ghidorah(String name, String roar, int healthValue, int attackValue) {
        super(name, roar, healthValue, attackValue);
    }

    public int takeDamage(int damage) {
        return super.getHealthValue() - damage;
    }

    public void attack(IDamage damage) {
        damage.takeDamage(super.getAttackValue());
    }
}
