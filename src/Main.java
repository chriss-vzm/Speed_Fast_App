import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        ArrayList<Pedido> arregloPedidos = new ArrayList<>();
        BlockingQueue<Pedido> colaPedidos  = new LinkedBlockingQueue<>(5);




        //CREACION DE PEDIDOS

        Pedido pedidoComida = new PedidoComida(
                "Comida",
                "#100",
                "Pajaritos, La Cisterna",
                "1"
        );

        Pedido pedidoComida2 = new PedidoComida(
                "Comida",
                "#103",
                "San Isidro, Santiago Centro",
                "3"
        );


        Pedido pedidoEncomienda = new PedidoEncomienda(
                "Encomienda",
                "#101",
                "Los Leones 314",
                "4"

        );

        Pedido pedidoEncomienda2 = new PedidoEncomienda(
                "Encomienda",
                "#104",
                "Av.Tobalaba 989",
                "3"

        );

        Pedido pedidoExpress = new PedidoExpress(
                "Express",
                "#102",
                "Cienfuegos 31, Los Heroes",
                "2"
        );



        arregloPedidos.add(pedidoComida);
        arregloPedidos.add(pedidoComida2);
        arregloPedidos.add(pedidoEncomienda);
        arregloPedidos.add(pedidoEncomienda2);
        arregloPedidos.add(pedidoExpress);





        pedidoComida.asignarRepartidor("Juan Perez");
        System.out.println(pedidoComida);
        pedidoComida.calcularTiempoEntrega();
        pedidoComida.despachar();





        System.out.println("Ingrese nombre repartidor para pedido de tipo ENCOMIENDA: ");
        String r1 = sc.nextLine();

        pedidoEncomienda.asignarRepartidor(r1);
        System.out.println(pedidoEncomienda);
        pedidoEncomienda.calcularTiempoEntrega();
        pedidoEncomienda.despachar();



        System.out.println("Ingrese nombre repartidor para pedido de tipo EXPRESS: ");
        String r2 = sc.nextLine();

        pedidoExpress.asignarRepartidor(r2);
        System.out.println(pedidoExpress);
        pedidoExpress.calcularTiempoEntrega();
        pedidoExpress.despachar();




        pedidoComida.verHistorial(arregloPedidos);






        ProductorPedidos productorPedidos = new ProductorPedidos(arregloPedidos,colaPedidos);
        Repartidor repartidor1 = new Repartidor(colaPedidos);
        Repartidor repartidor2 = new Repartidor(colaPedidos);


















    }

}