package tp;

public class Elemento {
    private char puedeMover;
    private int valor;

    public Elemento(char puedeMover, int valor) {
        this.puedeMover = puedeMover;
        this.valor = valor;
    }

    public char getPuedeMover() {
        return puedeMover;
    }

    public void setPuedeMover(char puedeMover) {
        this.puedeMover = puedeMover;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
