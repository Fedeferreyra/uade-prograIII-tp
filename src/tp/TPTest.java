package tp;

import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;

import static org.junit.Assert.*;

public class TPTest {

    @Test
    public void test() throws IOException {
        final Elemento[][] elementos = TP.parseFile("/Users/fferr10/Desktop/test.txt");

        System.out.println(Arrays.deepToString(elementos));
    }
}