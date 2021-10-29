public class ThreadsExemplo {
    public static void main(String[] args) {
        Thread thread = new Thread(new BarraCarregamento2());
        Thread thread2 = new Thread(new BarraCarregamento3());

        thread.start();
        thread2.start();
        System.out.println(thread.getName());
        System.out.println(thread2.getName());
    }
}

class BarraCarregamento2 implements Runnable{
    @Override
    public void run(){
        try{
            Thread.sleep(3000);
            System.out.println("Rodei - BarraCarregamento2");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class BarraCarregamento3 implements Runnable{
    @Override
    public void run(){
        try{
            Thread.sleep(1000);
            System.out.println("Rodei - BarraCarregamento3");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}