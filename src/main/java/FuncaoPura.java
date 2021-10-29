import java.util.function.BiPredicate;

public class FuncaoPura {
    public static void main(String[] args){
        BiPredicate<Integer, Integer> verificarSeEMaior = (x, y) -> x > y;
        System.out.println(verificarSeEMaior.test(13, 12));
        System.out.println(verificarSeEMaior.test(13, 12));
    }
}
