import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Weekly Sleep Tracker");
        System.out.println("This program tracks how many hours you sleep each day.");
        System.out.println("Try to be honest so you can get accurate feedback.\n");

        double[] weekData = new double[7];

        for (int i = 0; i < weekData.length; i++) {
            System.out.print("Enter hours of sleep for day " + (i + 1) + ": ");
            double hours = input.nextDouble();

            while (hours < 0) {
                System.out.print("Sleep hours cannot be negative. Re-enter: ");
                hours = input.nextDouble();
            }

            weekData[i] = hours;
        }

        WeeklyData sleepWeek = new WeeklyData(weekData);

        System.out.println("\nSleep Analysis Results");
        System.out.println("Total hours slept: " + sleepWeek.getTotal());
        System.out.println("Average hours per night: " + sleepWeek.getAverage());
        System.out.println("Least sleep in one night: " + sleepWeek.getMin());
        System.out.println("Most sleep in one night: " + sleepWeek.getMax());

        System.out.println("\nFull Week of Sleep Data");
        System.out.println(sleepWeek.toString());

        double average = sleepWeek.getAverage();

        if (average < 7) {
            System.out.println("You are not getting enough sleep. Try to rest more next week.");
        } else if (average <= 9) {
            System.out.println("Great job. You are getting a healthy amount of sleep.");
        } else {
            System.out.println("You slept a lot this week. Make sure your schedule is balanced.");
        }

        input.close();
    }
}
