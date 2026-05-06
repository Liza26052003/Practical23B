public class Practical23B {
   
    public void print(String[] heap) {
        if (heap == null || heap.length <= 1) return;

        // Iterate through all possible parent nodes
        for (int i = 1; i < heap.length; i++) {
            int child1 = 3 * i - 1;
            int child2 = 3 * i;
            int child3 = 3 * i + 1;

            // Only print if the node has at least one child
            if (child1 < heap.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("Node ").append(heap[i]).append(" -> ");
                
                sb.append(heap[child1]);
                if (child2 < heap.length) sb.append(", ").append(heap[child2]);
                if (child3 < heap.length) sb.append(", ").append(heap[child3]);
                
                System.out.println(sb.toString());
            }
        }
    }

    /**
    code for a method to validate if it is a max or min heap 
    */
    public boolean validate(String[] heap) {
        if (heap == null || heap.length <= 2) return true;

        return isMinHeap(heap) || isMaxHeap(heap);
    }

    private boolean isMinHeap(String[] heap) {
        for (int i = 1; i < heap.length; i++) {
            for (int k = -1; k <= 1; k++) { // Check children at 3i-1, 3i, 3i+1
                int childIdx = 3 * i + k;
                if (childIdx < heap.length) {
      // Min-heap: parent must be <= child
                    if (heap[i].compareTo(heap[childIdx]) > 0) return false;
                }
            }
        }
        return true;
    }

    private boolean isMaxHeap(String[] heap) {
        for (int i = 1; i < heap.length; i++) {
            for (int k = -1; k <= 1; k++) {
                int childIdx = 3 * i + k;
                if (childIdx < heap.length) {
         // Max-heap: parent must be >= child
                    if (heap[i].compareTo(heap[childIdx]) < 0) return false;
                }
            }
        }
        return true;
    }
}

