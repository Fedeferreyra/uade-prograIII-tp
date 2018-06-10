package dynamic.programming;

public class ZigZag {
    public int longestZigZag(int[] sequence) {
        int[] subsequence = new int[sequence.length];
        int counter = 0;
        boolean next = false;
        for (int i = 0; i < sequence.length; i++) {
            if (i == 0) {
                next = sequence[i] > sequence[i + 1];
            } else if (sequence.length - i == 1) {

            } else if (sequence[i] > sequence[i + 1] && !next) {
                next = true;
            } else if (sequence[i] < sequence[i + 1] && next) {
                next = false;
            } else {
                continue;
            }
            counter++;
            subsequence[i] = sequence[i];
        }
        return counter;
    }
}