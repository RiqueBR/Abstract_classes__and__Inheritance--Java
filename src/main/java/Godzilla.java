public class Godzilla extends Kaiju implements IDamage, IAttack {


    public Godzilla(String name, String roar, int healthValue, int attackValue) {
        super(name, roar, healthValue, attackValue);
    }

    public int takeDamage(int damage) {
        return super.getHealthValue() - damage;
    }

    public void attack(IDamage damaged) {
        damaged.takeDamage(this.getAttackValue());
    }

    public String locomotion(){
        return "I can walk!";
    }

}
