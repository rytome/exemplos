import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args){
        Function<String, String> retornarNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        System.out.println(retornarNomeAoContrario.apply("Roberto"));

        Function<String, Integer> converterStringParaInteiro = Integer::valueOf;
        System.out.println(converterStringParaInteiro.apply("56"));

        Function<String, Integer> converterStringParaInteiroECalcularODobro = x -> Integer.valueOf(x)*2;
        System.out.println(converterStringParaInteiroECalcularODobro.apply("20"));


    }
}
