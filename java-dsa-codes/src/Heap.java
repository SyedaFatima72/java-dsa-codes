public class Heap {
    private int[] heapData;
    private int sizeOfHeap;
    private int heapMaxSize;
    private static final int FRONT = 1;
    public Heap(int heapMaxSize)  {
        this.heapMaxSize = heapMaxSize;
        this.sizeOfHeap = 0;
        heapData = new int[this.heapMaxSize + 1];
        heapData[0] = Integer.MIN_VALUE;
    }
    private int getParentPosition(int position)  {
        return position / 2;
    }
    private int getLeftChildPosition(int position)  {
        return (2 * position);
    }
    private int getRightChildPosition(int position)  {
        return (2 * position) + 1;
    }
    private boolean checkLeaf(int position)  {
        if (position >= (sizeOfHeap / 2) && position <= sizeOfHeap) {
            return true;
        }
        return false;
    }

}
