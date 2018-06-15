package tp;

import org.junit.Test;

import java.util.Arrays;

public class TPTest {

    @Test
    public void test() throws Exception {
        final Elemento[][] elementos = new Elemento[4][4];
        elementos[0][0] = new Elemento('A', 8);
        elementos[0][1] = new Elemento('A', 3);
        elementos[0][2] = new Elemento('A', 5);
        elementos[0][3] = new Elemento('A', 9);
        elementos[1][0] = new Elemento('A', 8);
        elementos[1][1] = new Elemento('A', 5);
        elementos[1][2] = new Elemento('A', 10);
        elementos[1][3] = new Elemento('A', 20);
        elementos[2][0] = new Elemento('A', 1);
        elementos[2][1] = new Elemento('A', 1);
        elementos[2][2] = new Elemento('A', 1);
        elementos[2][3] = new Elemento('A', 1);
        elementos[3][0] = new Elemento('A', 60);
        elementos[3][1] = new Elemento('A', 4);
        elementos[3][2] = new Elemento('A', 6);
        elementos[3][3] = new Elemento('A', 9);
        final Posicion[] tp = new TP().tp(elementos, new Posicion(0, 0), new Posicion(1, 1));

        System.out.println(tp.length);
        System.out.println(Arrays.toString(tp));
    }

    public void test2() throws Exception {
        final Elemento[][] elementos = new Elemento[4][4];
        elementos[0][0] = new Elemento('B', 8);
        elementos[0][1] = new Elemento('A', 3);
        elementos[0][2] = new Elemento('A', 5);
        elementos[0][3] = new Elemento('A', 9);
        elementos[1][0] = new Elemento('B', 8);
        elementos[1][1] = new Elemento('A', 5);
        elementos[1][2] = new Elemento('B', 10);
        elementos[1][3] = new Elemento('A', 20);
        elementos[2][0] = new Elemento('A', 1);
        elementos[2][1] = new Elemento('A', 1);
        elementos[2][2] = new Elemento('A', 1);
        elementos[2][3] = new Elemento('A', 1);
        final Posicion[] tp = new TP().tp(elementos, new Posicion(1, 1), new Posicion(2, 3));

        System.out.println(tp.length);
        System.out.println(Arrays.toString(tp));
    }
}