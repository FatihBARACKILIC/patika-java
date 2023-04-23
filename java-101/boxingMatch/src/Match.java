public class Match {
    Fighter fighter1;
    Fighter fighter2;
    int minWeight;
    int maxWeight;

    Match(Fighter fighter1, Fighter fighter2, int minWeight, int maxWeight) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        if (isWeightMatch()) {
            while (this.fighter1.health > 0 && this.fighter2.health > 0) {
                System.out.println("========== NEW ROUND ==========");
                int newHealth;
                newHealth = this.fighter1.hit(this.fighter2);
                if (newHealth < this.fighter2.health) {
                    System.out.println(this.fighter2.name + ": " + this.fighter2.health +" > "+ newHealth);
                    this.fighter2.health = newHealth;
                }
                if (isWin()) break;
                newHealth = this.fighter2.hit(this.fighter1);
                if (newHealth < this.fighter1.health) {
                    System.out.println(this.fighter1.name + " => " + this.fighter1.health+" > "+ newHealth);
                    this.fighter1.health = newHealth;
                }
                if (isWin()) break;

            }

        } else {
            System.out.println("The weights of the athletes do not match!");
        }
    }

    public boolean isWeightMatch() {
        return (this.fighter1.weight >= this.minWeight && this.fighter1.weight <= this.maxWeight) &&
                (this.fighter2.weight >= this.minWeight && this.fighter2.weight <= this.maxWeight);
    }

    public boolean isWin() {
        if (this.fighter1.health == 0) {
            System.out.println("===== WINNER =====");
            System.out.println(this.fighter2.name);
            System.out.println("==================");
            return true;
        } else if (this.fighter2.health == 0) {
            System.out.println("===== WINNER =====");
            System.out.println(this.fighter1.name);
            System.out.println("==================");
            return true;
        }
        return false;
    }
}
