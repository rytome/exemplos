public class FatorialTailToCall {
    public static void  main(String[] args){
        System.out.println(fatorialA(5));
    }

    public static double fatorialComTailCall(double valor, double numero){
        if (valor == 0){
            return numero;
        }
        return fatorialComTailCall(valor-1, numero*valor);
    }

    public static double fatorialA(double valor){
        return fatorialComTailCall(valor, 1);
    }
}
