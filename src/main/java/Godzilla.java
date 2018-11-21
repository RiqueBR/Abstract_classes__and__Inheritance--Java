public class Godzilla extends Kaiju implements IDamage, IAttack {


    public Godzilla(String name, String roar, int healthValue, int attackValue) {
        super(name, roar, healthValue, attackValue);
    }


    public String locomotion(){
        return "I can walk!";
    }

}
