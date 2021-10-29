import java.util.function.Predicate;

public class Predicados {
    public static void main(String[] args){
        Predicate<String> estaVazio = x -> x.isEmpty();
        System.out.println(estaVazio.test(""));
        System.out.println(estaVazio.test("Roberto"));

        Predicate<String> estaVazio2 = String::isEmpty;
        System.out.println(estaVazio2.test("Oi"));
    }
}
