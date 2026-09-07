import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Pedido> arregloPedido = new ArrayList<>();



        Scanner sc = new Scanner(System.in);


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
                "1"
        );


        Pedido pedidoEncomienda = new PedidoEncomienda(
                "Encomienda",
                "#101",
                "Los Leones 314",
                "4"

        );

        Pedido pedidoExpress = new PedidoExpress(
                "Express",
                "#102",
                "Cienfuegos 31, Los Heroes",
                "2"
        );



        arregloPedido.add(pedidoComida);
        arregloPedido.add(pedidoComida2);
        arregloPedido.add(pedidoEncomienda);
        arregloPedido.add(pedidoExpress);





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




        pedidoComida.verHistorial(arregloPedido);
























    }

}