package tp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Objects;
import java.util.StringTokenizer;

public class TP {

    public static void main(String[] args) throws Exception {
        inicializar();

    }

    private static void inicializar() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese la ruta al archivo: ");

        String path = br.readLine();

        System.out.println("Ingrese el valor en el eje x del inicio: ");

        Integer inicioX = Integer.parseInt(br.readLine());

        System.out.println("Ingrese el valor en el eje y del inicio: ");

        Integer inicioY = Integer.parseInt(br.readLine());

        final Posicion inicio = new Posicion(inicioX, inicioY);

        System.out.println("Ingrese el valor en el eje x del fin: ");

        Integer finX = Integer.parseInt(br.readLine());

        System.out.println("Ingrese el valor en el eje y del fin: ");

        Integer finY = Integer.parseInt(br.readLine());

        final Posicion fin = new Posicion(finX, finY);

        final Elemento[][] elementos = parseFile(path);

        final Posicion[] buscar = new BuscadorCaminoOptimo().buscar(elementos, inicio, fin);
        if (buscar != null) {

            System.out.println(buscar.length);
            System.out.println(Arrays.toString(buscar));
        }else {
            System.out.println("No se encontro solucion");
        }


    }

    public static Elemento[][] parseFile(String path) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(path)));

        final Integer xLength = Integer.parseInt(content.substring(0, 1));
        final Integer yLength = Integer.parseInt(content.substring(2, 3));

        final Elemento[][] matriz = new Elemento[yLength][xLength];

        final StringTokenizer tokens = new StringTokenizer(content, "(");

        int fila = 0;
        int columna = 0;
        while (tokens.hasMoreTokens()) {
            final String token = tokens.nextToken();
            if (token.lastIndexOf("A") >= 0 || token.lastIndexOf("B") >= 0) {

                final String accesible = token.substring(0, token.lastIndexOf(","));

                final String valor = token.substring(token.lastIndexOf(",") + 1, token.lastIndexOf(")"));

                Integer integer = 0;
                if (!Objects.equals(valor, "X")) {
                    integer = Integer.parseInt(valor);
                }
                final Elemento elemento = new Elemento(accesible.charAt(0), integer);

                matriz[columna][fila] = elemento;
                columna++;
                if (token.lastIndexOf(" ") >= 0) {
                    fila++;
                    columna = 0;

                }
            }
        }
        return matriz;
    }
}
