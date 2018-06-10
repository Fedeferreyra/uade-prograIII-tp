package backtracking;

import java.util.Arrays;

public class ParticionEnMitades {

    int particion1 = 0;

    public void partir(int[] subA, int[] subB, int i) {
        if (sumarElementos(subA) == sumarElementos(subB)) {
            particion1++;
            System.out.println(particion1);
            System.out.println("SubconjuntoA:");
            System.out.println(Arrays.toString(subA));
            System.out.println("SubconjuntoB:");
            System.out.println(Arrays.toString(subB));
        }
        if (contarElementos(subA, subB) > i) {
            final int value = subA[i];
        }
    }

    private int contarElementos(int[] subA, int[] subB) {

        return contarElementosDesigualesA0(subA) + contarElementosDesigualesA0(subB);
    }

    private int contarElementosDesigualesA0(int[] subA) {
        int counter = 0;
        for (int i = 0; i < subA.length; i++) {
            if (subA[i] != 0)
                counter++;
        }
        return counter;
    }

    public int sumarElementos(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return suma;
    }
}
//[1,2,3,4,5,6,7,8]

