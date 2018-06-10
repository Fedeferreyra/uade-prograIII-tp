package tp;

public class Posicion {

    public Posicion(int x, int y){
        this.x = x;
        this.y = y;
    }
    int x;
    int y;

    @Override
    public String toString() {
        return "Posicion{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
