package heaps.min_heap_insert;

import java.util.ArrayList;
import java.util.List;

public class MinHeap {
    private List<Integer> heap;

    public MinHeap() {
        this.heap = new ArrayList<>();
    }

    public List<Integer> getHeap() {
        return new ArrayList<>(heap);
    }

    private int leftChild(int index) {
        return 2 * index + 1;
    }

    private int rightChild(int index) {
        return 2 * index + 2;
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private void swap(int index1, int index2) {
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    public void insert(int value) {
        int minIndex = heap.size();
        heap.add(value);
        while (true) {
            int parentIndex = parent(minIndex);
            if (parentIndex >= 0 && heap.get(parentIndex) > heap.get(minIndex)) {
                swap(minIndex, parentIndex);
                minIndex = parentIndex;
            } else {
                break;
            }
        }
    }
}
