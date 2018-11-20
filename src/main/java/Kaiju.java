public abstract class Kaiju {

    private String name;
    private String roar;
    private int healthValue;
    private int attackValue;

    public Kaiju(String name, String roar, int healthValue, int attackValue) {
        this.name = name;
        this.roar = roar;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getName() {
        return name;
    }

    public String getRoar() {
        return roar;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }
}
