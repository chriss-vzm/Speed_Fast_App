import java.time.Period;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Repartidor implements Runnable{

    BlockingQueue<Pedido> listaPedidos = new LinkedBlockingQueue<>();


    public Repartidor(BlockingQueue<Pedido> listaPedidos){

        this.listaPedidos = listaPedidos;

    }



    @Override
    public void run() {

        try {
            listaPedidos.take();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
