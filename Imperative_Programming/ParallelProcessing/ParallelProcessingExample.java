package ParallelProcessing;

public class ParallelProcessingExample {

    public static void main(String[] args) {
        // Number of threads to create
        int numThreads = 5;

        // Create an array to store thread objects
        Thread[] threads = new Thread[numThreads];

        // Create and start threads
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(new Task("Thread " + (i + 1)));
            threads[i].start();
        }

        // Wait for all threads to finish
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("All threads have finished execution.");
    }

    // Task class representing the work to be done by each thread
    static class Task implements Runnable {
        private String name;

        public Task(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println(name + " started execution.");
            // Simulate some work
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + " finished execution.");
        }
    }
}