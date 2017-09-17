public class factorial {

    public static void main(String[] args) {
      factorial x = new factorial();
        System.out.println("EL FACTORIAL DEl NUMERO POR METODO RECURSIVO " + x.factorialRecursivo(4));
        System.out.println("EL FACTORIAL DEL NUMERO POR CICLO ES: " + x.factorialCiclo(4));
    }

    public int factorialRecursivo(int n) {
        if (n < 0) {
            return 0;
        } else {

            if (n == 0)
                return 1;
            else {
                return n * factorialRecursivo(n - 1);
            }
        }
    }


    public int factorialCiclo(int n){
        int factor = 1;
        if (n < 0) {
            return 0;
        } else {
            while (n != 0) {
                factor = n * factor;
                n--;
            }
            return factor;
        }
    }
}
