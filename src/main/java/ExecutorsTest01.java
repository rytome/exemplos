import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Printer implements Runnable{
    private final int num;

    public Printer(int num){
        this.num = num;
    }

    @Override
    public void run(){
        System.out.printf("%s início: %d%n", Thread.currentThread().getName(), num);
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("%s fim%n", Thread.currentThread().getName());
    }

}
public class ExecutorsTest01 {
    public static void main(String[] args) {
        //Quantidade de processadores 2 processadores reais e 2 virtuais
        System.out.println(Runtime.getRuntime().availableProcessors());

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.execute(new Printer(1));// tem que executar um runnable
        executorService.execute(new Printer(2));
        executorService.execute(new Printer(3));
        executorService.execute(new Printer(4));
        executorService.execute(new Printer(5));
        executorService.execute(new Printer(6));
        executorService.shutdown();
        System.out.println("Agora tem que aguardar as execuções");
    }
}