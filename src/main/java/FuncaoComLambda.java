public class FuncaoComLambda {
    public static void main(String[] args){
        Funcao colocarPrefixoSrNaString = x -> "Sr" + x;
        System.out.println(colocarPrefixoSrNaString.gerar("Roberto"));

        Funcao1 funcao1 = x -> System.out.println(x);
        funcao1.gerar("Pedro");

    }
}

interface Funcao1{
    void gerar(String valor);
}

