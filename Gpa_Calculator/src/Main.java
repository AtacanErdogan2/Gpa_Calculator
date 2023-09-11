import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variable identification
        int mathScore, physicsScore, chemistryScore, turkishScore, historyScore, musicScore;

        // Retrieving data from the user
        System.out.print("Please enter your Mathematics Score: ");
        mathScore = input.nextInt();
        System.out.print("Please enter your Physics Score: ");
        physicsScore = input.nextInt();
        System.out.print("Please enter your Chemistry Score: ");
        chemistryScore = input.nextInt();
        System.out.print("Please enter your Turkish Score: ");
        turkishScore = input.nextInt();
        System.out.print("Please enter your History Score: ");
        historyScore = input.nextInt();
        System.out.print("Please enter your Music Score: ");
        musicScore = input.nextInt();

        // Calculation Section
        int totalScore;
        totalScore = (mathScore + physicsScore + chemistryScore + turkishScore + historyScore + musicScore);
        double averageScore;
        averageScore = totalScore / 6.0;
        double a = Math.round(averageScore*100) / 100.0 ; // for 2 digits after decimal
        String status;
        status = (averageScore >= 60) ? "You passed the class! Your Average Score: " + a : "You failed the class! Your Average Score: " + a;

        System.out.println(status);

    }
}