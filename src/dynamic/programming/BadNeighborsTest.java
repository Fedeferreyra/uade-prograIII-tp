package dynamic.programming;

import org.junit.Test;

public class BadNeighborsTest {
    @Test
    public void test() {
        int[] donations = { 94, 40, 49, 65, 21, 21, 106, 80, 92, 81, 679, 4, 61,
                6, 237, 12, 72, 74, 29, 95, 265, 35, 47, 1, 61, 397,
                52, 72, 37, 51, 1, 81, 45, 435, 7, 36, 57, 86, 81, 72 };
        System.out.println(new BadNeighbors().maxDonations(donations));
    }

}