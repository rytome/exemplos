import java.util.Arrays;

public class Composicao {
    public static void main(String[] args){
        int[] valores = {1, 2, 3, 4};
        Arrays.stream(valores)
                .filter(x -> x % 2 == 0)
                .map(x -> x * 2)
                .forEach(x -> System.out.println(x));
    }
}
