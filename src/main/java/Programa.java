import java.util.function.UnaryOperator;

public class Programa {
    public static void main(String[] args){
        UnaryOperator<Integer> multiplicaPor3 = x -> x*3;
        int valor = 10;
        System.out.println("O resultado é: " + multiplicaPor3.apply(valor));
    }
}
