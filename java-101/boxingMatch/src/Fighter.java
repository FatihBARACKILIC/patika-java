public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    Fighter(String name, int damage, int health, int weight, int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = (dodge >= 0 && dodge <= 100) ? dodge : 0;
    }

    public int hit(Fighter foe) {
        if (foe.isDodge()) {
            System.out.println(foe.name + " blocked incoming damage!");
            return foe.health;
        } else {
            System.out.println(this.name + " => " + foe.name + " gave " + this.damage + " damage!");
            return Math.max(0, foe.health - this.damage);
        }
    }

    public boolean isDodge() {
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }
}
