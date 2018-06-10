package dynamic.programming;

import org.junit.Test;

public class MaxSequenceTest {

    @Test
    public void test() {
        char[] seq1 = {'a', 'b', 'd', 'a', 'c'};
        char[] seq2 = {'a', 'b', 'a', 'c', 'd', 'e', 'b'};
        System.out.println(new MaxSequence().MaxSequenceLength(seq1, seq2));
    }
}