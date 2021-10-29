import java.util.function.UnaryOperator;

public class Imutabilidade {
    public static void main(String[] args){
        int valor = 20;
        UnaryOperator<Integer> retornarDobro = x -> x * 2;
        System.out.println(retornarDobro.apply(valor));
        System.out.println(valor);
    }
}