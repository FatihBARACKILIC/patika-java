import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int temperature;

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the temperature?");
        temperature = scan.nextInt();

        if (temperature < 5) {
            System.out.println("You may ski.");
        } else if(temperature < 15){
            System.out.println("You may go to the cinema.");
        } else if(temperature < 25){
            System.out.println("You may have a picnic");
        } else {
            System.out.println("You may swim.");
        }

    }
}