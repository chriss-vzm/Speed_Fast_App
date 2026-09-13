import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Repartidor implements Runnable{

    BlockingQueue<Pedido> listaPedidos = new LinkedBlockingQueue<>();
    String nombreRepartidor;


    public Repartidor(BlockingQueue<Pedido> listaPedidos, String nombreRepartidor){

        this.listaPedidos = listaPedidos;
        this.nombreRepartidor = nombreRepartidor;


    }



    @Override
    public void run() {

        while(true){

            try {

                Pedido pedido = listaPedidos.take();

                if(pedido instanceof PoisonPill){
                    break;
                }

                System.out.println("Repartidor |" + nombreRepartidor + "| entregando pedido |" + pedido.getIdPedido() + "|");

                Random random = new Random();
                int delay = random.nextInt(3000) + 1000;

                Thread.sleep(delay);

                System.out.println("Pedido |" + pedido.getIdPedido() + "| entregado.");


            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }



        }

    }
}
