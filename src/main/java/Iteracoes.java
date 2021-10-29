import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {
    public static void main(String[] args){
        String[] nomes = {"João", "Paulo", "Oliveira", "Santos", "Instrutor", "Java", "João"};
        Integer[] numeros = {1,2,3,4,5};
        imprimirNomesFiltrados(nomes);
        imprimirTodosNomes(nomes);
        imprimirTodosNumeros(numeros);
        imprimirTodosNumerosDobrados(numeros);

        List<String> profissoes = new ArrayList<>();
        profissoes.add("Desenvolvedor");
        profissoes.add("Testador");
        profissoes.add("Gerente de projeto");
        profissoes.add("Gerente de qualidade");

        profissoes.stream()
                .filter(x -> x.startsWith("Gerente"))
                .forEach(System.out::println);

    }

    public static void imprimirNomesFiltrados(String... nomes){
        String nomesParaImpimirDaStream = Stream.of(nomes)
                .filter(nome -> nome.equals("João"))
                .collect(Collectors.joining(","));
        System.out.println("Nomes: " + nomesParaImpimirDaStream);
    }

    public static void imprimirTodosNomes(String... nomes){
        Stream.of(nomes)
                .forEach(x -> System.out.println("Imprimido pelo forEach: " + x));
    }

    public static void imprimirTodosNumeros(Integer... numeros){
        Stream.of(numeros)
                .forEach(x -> System.out.println("Imprimido pelo forEach: " + x));
    }

    public static void imprimirTodosNumerosDobrados(Integer... numeros){
        Stream.of(numeros)
                .map(x -> x*2)
                .forEach(x -> System.out.println("Imprimido pelo forEach dobrado: " + x));
    }

}
