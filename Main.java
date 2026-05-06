public class Main {
    /**
     * Entry point for the test harness.
     * Creates sample heap arrays and runs both print and validate tests.
     */
    public static void main(String[] args) {
        Practical23B solver = new Practical23B();

        System.out.println("=== Heap print tests ===");
        String[] heap1 = {"", "A", "B", "C", "D", "E", "F", "G", "H", "I"};
        System.out.println("Heap: [" + String.join(", ", heap1) + "]");
        solver.print(heap1);

        System.out.println();
        String[] heap2 = {"", "M", "P", "R", "S", "T", "U", "V"};
        System.out.println("Heap: [" + String.join(", ", heap2) + "]");
        solver.print(heap2);

        System.out.println("\n=== Heap validation tests ===");

        String[] minHeap = {"", "A", "B", "C", "D", "E", "F"};
        String[] maxHeap = {"", "M", "K", "J", "F", "E", "D"};
        String[] invalidHeap = {"", "A", "Z", "B", "Y", "C", "X"};

        printValidation(solver, minHeap, "minHeap");
        printValidation(solver, maxHeap, "maxHeap");
        printValidation(solver, invalidHeap, "invalidHeap");

        String[] smallHeap = {"", "A"};
        printValidation(solver, smallHeap, "smallHeap");
        printValidation(solver, null, "nullHeap");
    }

    /**
     * Prints a validation result for a given heap array.
     * Shows the heap contents and whether it is a valid ternary heap.
     */
    private static void printValidation(Practical23B solver, String[] heap, String name) {
        System.out.println("Test " + name + ":");
        if (heap == null) {
            System.out.println("  heap is null");
        } else {
            System.out.println("  heap = [" + String.join(", ", heap) + "]");
        }
        System.out.println("  valid ternary heap? " + solver.validate(heap));
    }
}
