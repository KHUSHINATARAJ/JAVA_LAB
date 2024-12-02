class CollegeThread extends Thread {
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) { // Check for interruption
                System.out.println("BMS College of Engineering");
                Thread.sleep(10000); // Sleep for 10 seconds
            }
        } catch (InterruptedException e) {
            System.out.println("CollegeThread interrupted: " + e.getMessage());
            // Optionally, handle cleanup if necessary
        }
    }
}

// Thread to display "CSE" every 2 seconds
class CSEThread extends Thread {
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) { // Check for interruption
                System.out.println("CSE");
                Thread.sleep(2000); // Sleep for 2 seconds
            }
        } catch (InterruptedException e) {
            System.out.println("CSEThread interrupted: " + e.getMessage());
            // Optionally, handle cleanup if necessary
        }
    }
}

// Main class to run the threads
public class DisplayMessage{
    public static void main(String[] args) {
        // Create threads
        CollegeThread collegeThread = new CollegeThread();
        CSEThread cseThread = new CSEThread();

        // Start threads
        collegeThread.start();
        cseThread.start();

        // Optional: Adding a delay before stopping threads for demonstration purposes
        try {
            // Run for 30 seconds before stopping both threads (for example)
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }

        // Interrupt the threads
        collegeThread.interrupt();
        cseThread.interrupt();

        try {
            // Ensure both threads finish before the main thread exits
            collegeThread.join();
            cseThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted during join: " + e.getMessage());
        }

        System.out.println("Main thread finished.");
    }
}
