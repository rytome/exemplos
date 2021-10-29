import java.util.function.Consumer;

public class Consumidores {
    public static void main(String[] atrgs){
        Consumer<String> imprimirUmaFrase = x -> System.out.println(x);
        Consumer<String> imprimirUmaFrase2 = System.out::println;

        imprimirUmaFrase.accept("Olá");
        imprimirUmaFrase2.accept("Olá 2");
    }
}
