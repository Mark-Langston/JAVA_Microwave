import java.util.Scanner;

public class Main {

    // Microwave class
    static class Microwave {
        private int time;
        private int powerLevel;

        public Microwave() {
            this.time = 0; // initial time is 0 seconds
            this.powerLevel = 1; // initial power level is 1
        }

        // Method for increasing time in 30min intervals
        public void increaseTime() {
            time += 30;
            System.out.println("Added 30 seconds. Current time: " + time + " seconds.");
        }

        // Method for swapping power level
        public void switchPowerLevel() {
            if (powerLevel == 1) {
                powerLevel = 2;
            } else {
                powerLevel = 1;
            }
            System.out.println("Power level set to: " + powerLevel);
        }

        // Method for starting microwave and printing details to console
        public void start() {
            System.out.println("Cooking for " + time + " seconds at power level " + powerLevel + ".");
        }

        // Method for resetting the microwave
        public void reset() {
            time = 0;
            powerLevel = 1;
            System.out.println("Microwave reset. Time is now " + time + " seconds and power level is " + powerLevel + ".");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Microwave myMicrowave = new Microwave(); // Creating a new Microwave object
        boolean running = true;

        System.out.println("Mark's Microwave Controller v1.0:");
        System.out.println("1. Increase time by 30 seconds");
        System.out.println("2. Switch power level between 1 and 2");
        System.out.println("3. Microwave start");
        System.out.println("4. Microwave Reset");
        System.out.println("5. Turn off microwave");

        while (running) {
            System.out.print("Choose an option (1-5): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    myMicrowave.increaseTime();
                    break;
                case 2:
                    myMicrowave.switchPowerLevel();
                    break;
                case 3:
                    myMicrowave.start();
                    break;
                case 4:
                    myMicrowave.reset();
                    break;
                case 5:
                    System.out.println("Turning off the microwave. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please select a number between 1 and 5.");
            }
        }

        scanner.close();
    }
}
