package backtracking;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParticionEnMitadesTest {

    @Test
    public void test(){
        int[] array = {2,5,8,3,2};
        new ParticionEnMitades().partir(array, new int[array.length], 0);
    }

}