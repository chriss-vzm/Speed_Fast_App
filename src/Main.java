import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        ArrayList<Pedido> arregloPedidos = new ArrayList<>();
        BlockingQueue<Pedido> colaPedidos  = new LinkedBlockingQueue<>(3);
        ExecutorService executor = Executors.newFixedThreadPool(4);


        //CREACION DE REPARTIDORES


        ArrayList<String> nombres = new ArrayList<>();


        nombres.add("Felipe Gonzales");
        nombres.add("Maria Sepulveda");
        nombres.add("Juan Lopez");

        Random random = new Random();


        String nombre1 = nombres.remove(random.nextInt(nombres.size()));
        String nombre2 = nombres.remove(random.nextInt(nombres.size()));
        String nombre3 = nombres.remove(random.nextInt(nombres.size()));





        //CREACION DE PEDIDOS

        Pedido pedidoComida = new PedidoComida(
                "Comida",
                "#100",
                "Pajaritos, La Cisterna",
                "1",
                Pedido.estadoPedido.EN_REPARTO
        );

        Pedido pedidoComida2 = new PedidoComida(
                "Comida",
                "#103",
                "San Isidro, Santiago Centro",
                "3",
                Pedido.estadoPedido.EN_REPARTO
        );


        Pedido pedidoEncomienda = new PedidoEncomienda(
                "Encomienda",
                "#101",
                "Los Leones 314",
                "4",
                Pedido.estadoPedido.EN_REPARTO

        );

        Pedido pedidoEncomienda2 = new PedidoEncomienda(
                "Encomienda",
                "#104",
                "Av.Tobalaba 989",
                "3",
                Pedido.estadoPedido.EN_REPARTO

        );

        Pedido pedidoExpress = new PedidoExpress(
                "Express",
                "#102",
                "Cienfuegos 31, Los Heroes",
                "2",
                Pedido.estadoPedido.EN_REPARTO
        );





        arregloPedidos.add(pedidoComida);
        arregloPedidos.add(pedidoComida2);
        arregloPedidos.add(pedidoEncomienda);
        arregloPedidos.add(pedidoEncomienda2);
        arregloPedidos.add(pedidoExpress);

        //SEÑALES DE FINALIZACION

        arregloPedidos.add(new PoisonPill());
        arregloPedidos.add(new PoisonPill());
        arregloPedidos.add(new PoisonPill());



        executor.execute(new ZonaDeCarga(arregloPedidos,colaPedidos));

        executor.execute(new Repartidor(colaPedidos,nombre1));
        executor.execute(new Repartidor(colaPedidos,nombre2));
        executor.execute(new Repartidor(colaPedidos,nombre3));


        executor.shutdown();


        try{
            executor.awaitTermination(1,TimeUnit.MINUTES);
        }catch (InterruptedException e){
            executor.shutdown();
        }




    }

}