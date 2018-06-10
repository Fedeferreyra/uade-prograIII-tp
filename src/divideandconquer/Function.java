package divideandconquer;

public class Function {

    public int exp(int base, int remainingExp) {
        if(remainingExp == 0){
            return 1;
        }
        if (remainingExp == 1) {
            return base;
        } else {
            return exp(base, remainingExp -1 ) * base;
        }
    }
}
