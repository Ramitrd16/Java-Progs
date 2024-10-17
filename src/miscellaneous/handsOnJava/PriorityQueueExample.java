package miscellaneous.handsOnJava;

import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        // Create a PriorityQueue of integers
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Adding elements to the PriorityQueue
        priorityQueue.add(10);
        priorityQueue.add(50);
        priorityQueue.add(20);
        priorityQueue.add(5);
        priorityQueue.add(30);

        // Display the elements in the PriorityQueue (it will not be sorted at this point)
        System.out.println("Elements in PriorityQueue: " + priorityQueue);

        // Polling elements (retrieving and removing the head element)
        System.out.println("Polling elements from PriorityQueue:");

        while (!priorityQueue.isEmpty()) {
            // Elements are retrieved in natural order (smallest to largest for Integers)
            System.out.println(priorityQueue.poll());
        }
    }
}
      