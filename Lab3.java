import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asks users for the Hill type, turns string into all uppercase
        System.out.print("Enter Hill Type: ");
        String hillType = scanner.nextLine().toUpperCase();

        // If-else statement that decides the scoring system based off the hill type
        int height, par;
        double pointsPerMeter;

        if (hillType.equals("NORMAL")) {
            height = 46;
            pointsPerMeter = 2;
            par = 90;
        } else {
            height = 70;
            pointsPerMeter = 1.8;
            par = 120;
        }

        // Asks users for the speed of the jumper
        // Uses that value to calculate the distance traveled and points earned
        System.out.print("Enter the speed of the jumper at the end of the ramp: ");
        double speedOfJump = scanner.nextDouble();

        double airTime = Math.sqrt((2 * height) / 9.8);
        double distanceTravelled = speedOfJump * airTime;
        double pointsEarned = 60 + (distanceTravelled - par) * pointsPerMeter;

        // If-else statement that outputs a response depending on the jumper's score
        if (pointsEarned >= 61) {
            System.out.println("Great job for doing better than par!");
        } else if (pointsEarned < 10) {
            System.out.println("What happened??");
        } else {
            System.out.println("Sorry you didn't go very far");
        }

        // Outputs the results of the jumper
        System.out.printf("The distance you travelled was: %.3f%n", distanceTravelled);
        System.out.printf("The total points you earned was: %.3f%n", pointsEarned);
    }
}

	    
