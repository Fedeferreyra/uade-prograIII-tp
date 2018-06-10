package tp;

public class TP {

    int valorOptimo;

    public Posicion[] tp(Elemento[][] matriz, Posicion inicio, Posicion fin) throws Exception {
        if (matriz.length > inicio.x && matriz[0].length > inicio.y) {
            if (matriz.length > fin.x && matriz[0].length > fin.y) {
                return caminoOptimo(inicio, matriz, new Posicion[1000], 0, fin, 0);
            } else {
                throw new Exception("Fin esta fuera de la matriz");
            }
        } else {
            throw new Exception("Inicio esta fuera de la matriz");
        }
    }

    private Posicion[] caminoOptimo(Posicion actual, Elemento[][] matriz, Posicion[] visitadas, int valorParcial, Posicion fin, int nivel) {
        Posicion[][] results = new Posicion[4][matriz.length * matriz[0].length];
        valorParcial += matriz[actual.x][actual.y].getValor();
        visitadas[nivel] = actual;
        if (actual.x == fin.x && actual.y == fin.y) {
            if (valorParcial > valorOptimo) {
                final Posicion[] posiciones = new Posicion[nivel + 1];
                posiciones[nivel] = actual;
                return posiciones;
            }
        }
        if (actual.y > 0) {
            final Posicion aVisitar = new Posicion(actual.x, actual.y - 1);
            if (esVisitable(aVisitar, matriz, visitadas, nivel)) {
                final Posicion[] camino = caminoOptimo(aVisitar, matriz, visitadas, valorParcial, fin, nivel + 1);
                if (camino != null) {
                    results[0] = addPosicionActual(actual, nivel, camino);

                }
            }
        }
        if (actual.x > 0) {
            final Posicion aVisitar = new Posicion(actual.x - 1, actual.y);
            if (esVisitable(aVisitar, matriz, visitadas, nivel)) {
                final Posicion[] camino = caminoOptimo(aVisitar, matriz, visitadas, valorParcial, fin, nivel + 1);
                if (camino != null) {
                    results[1] = addPosicionActual(actual, nivel, camino);
                }
            }
        }
        if (actual.y < matriz[actual.x].length - 1) {
            final Posicion aVisitar = new Posicion(actual.x, actual.y + 1);
            if (esVisitable(aVisitar, matriz, visitadas, nivel)) {
                final Posicion[] camino = caminoOptimo(aVisitar, matriz, visitadas, valorParcial, fin, nivel + 1);
                if (camino != null) {
                    results[2] = addPosicionActual(actual, nivel, camino);
                }
            }
        }
        if (actual.x < matriz.length - 1) {
            final Posicion aVisitar = new Posicion(actual.x + 1, actual.y);
            if (esVisitable(aVisitar, matriz, visitadas, nivel)) {
                final Posicion[] camino = caminoOptimo(aVisitar, matriz, visitadas, valorParcial, fin, nivel + 1);
                if (camino != null) {
                    results[3] = addPosicionActual(actual, nivel, camino);
                }
            }
        }
        return getMejorResultado(matriz, results);
    }

    private Posicion[] getMejorResultado(Elemento[][] matriz, Posicion[][] results) {
        int valorOptimo = 0;
        Posicion[] caminoOptimo = null;
        for (int i = 0; i < results.length; i++) {
            int suma = 0;
            for (int j = 0; j < results[i].length; j++) {
                if (results[i][j] != null) {
                    final Posicion posicion = results[i][j];
                    suma += matriz[posicion.x][posicion.y].getValor();
                }
                if (suma > valorOptimo) {
                    valorOptimo = suma;
                    caminoOptimo = results[i];
                }
            }
        }
        return caminoOptimo;
    }

    private Posicion[] addPosicionActual(Posicion actual, int nivel, Posicion[] camino) {
        if (camino[nivel + 1] != null) {
            camino[nivel] = actual;
        } else {
            camino[nivel] = null;
        }
        return camino;
    }


    private boolean esVisitable(Posicion actual, Elemento[][] matriz, Posicion[] visitadas, int nivel) {
        return nuncaFueVisitada(actual, visitadas, nivel) && matriz[actual.x][actual.y].getPuedeMover() == 'A';
    }

    private boolean nuncaFueVisitada(Posicion actual, Posicion[] visitadas, int nivel) {
        for (int i = 0; i < nivel; i++) {
            Posicion visitada = visitadas[i];
            if (actual.x == visitada.x && actual.y == visitada.y) {
                return false;
            }
        }
        return true;
    }
}
