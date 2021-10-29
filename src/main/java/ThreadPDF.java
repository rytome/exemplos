public class ThreadPDF {
    public static void main(String[] args) {
        GeradorPDF iniciaGeradorPDF = new GeradorPDF();
        BarraCarregamento iniciarCarregamento = new BarraCarregamento(iniciaGeradorPDF);

        iniciaGeradorPDF.start();
        iniciarCarregamento.start();
    }
}

class GeradorPDF extends Thread{
    @Override
    public void run(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Gerar PDF");
    }
}

class BarraCarregamento extends Thread{
    private Thread iniciaCarregadorPDF;

    public BarraCarregamento(Thread iniciaCarregadorPDF){
        this.iniciaCarregadorPDF = iniciaCarregadorPDF;
    }
    @Override
    public void run(){
        while(true) {
            try {
                Thread.sleep(500);
                if (!iniciaCarregadorPDF.isAlive()) {
                    break;
                }
                System.out.println("Loading...");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}