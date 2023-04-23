public class Main {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Ali", 10, 120, 100, 90);
        Fighter fighter2= new Fighter("Veli", 20, 85, 85, 88);
        Match match = new Match(fighter1, fighter2, 85, 100);
        match.run();
    }
}