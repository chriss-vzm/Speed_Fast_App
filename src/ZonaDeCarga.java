import java.util.ArrayList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ZonaDeCarga implements Runnable{

    BlockingQueue<Pedido> colaPedidos = new LinkedBlockingQueue<>();
    ArrayList<Pedido> arregloPedidos = new ArrayList<>();


    //CONSTRUCTOR


    ZonaDeCarga(ArrayList<Pedido> arregloPedidos, BlockingQueue<Pedido> colaPedidos){

        this.arregloPedidos = arregloPedidos;
        this.colaPedidos = colaPedidos;

    }



    @Override
    public void run() {

        for(Pedido pedidos : arregloPedidos){
            try {
                colaPedidos.put(pedidos);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
