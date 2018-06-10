package dynamic.programming;

public class BadNeighbors {

    public int maxDonations(int[] donations) {
        int sum0 = getSum(donations, 0);
        int sum1 = getSum(donations, 1);
        return sum0 > sum1 ? sum0 : sum1;
    }

    private int getSum(int[] donations, int startingIndex) {
        int firstIndex = -1;
        int sum = 0;
        for (int i = startingIndex; i < donations.length; i += 2) {
            if (donations.length - i == 1 && firstIndex == 0) {
                continue;
            }
            if(sum == 0){
                firstIndex = i;
            }
            sum += donations[i];
        }
        return sum;
    }
}
