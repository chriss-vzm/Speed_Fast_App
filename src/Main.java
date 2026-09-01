import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Pedido> arregloPedido = new ArrayList<>();



        Scanner sc = new Scanner(System.in);


        //CREACION DE PEDIDOS

        Pedido pedidoComida = new PedidoComida(
                "#100",
                "Pajaritos, La Cisterna",
                "1"
        );


        Pedido pedidoEncomienda = new PedidoEncomienda(
                "#101",
                "Los Leones 314",
                "4"

        );

        Pedido pedidoExpress = new PedidoExpress(
                "#102",
                "Cienfuegos 31, Los Heroes",
                "2"
        );



        arregloPedido.add(pedidoComida);
        arregloPedido.add(pedidoEncomienda);
        arregloPedido.add(pedidoExpress);






        //ASIGNACION DE REPARTIDORES AUTOMATICOS

        pedidoComida.asignarRepartidor("Juan Perez");

        //ASIGNACION DE REPARTIDORES MANUAL

        System.out.println("Ingrese nombre repartidor para pedido de tipo ENCOMIENDA: ");
        String r1 = sc.nextLine();

        System.out.println("Ingrese nombre repartidor para pedido de tipo EXPRESS: ");
        String r2 = sc.nextLine();

        pedidoEncomienda.asignarRepartidor(r1);
        pedidoExpress.asignarRepartidor(r2);




        pedidoComida.mostrarResumen();
        pedidoComida.calcularTiempoEntrega();
        pedidoComida.despachar();

        pedidoEncomienda.mostrarResumen();
        pedidoEncomienda.calcularTiempoEntrega();
        pedidoEncomienda.despachar();


        pedidoExpress.mostrarResumen();
        pedidoExpress.calcularTiempoEntrega();
        pedidoExpress.despachar();



        pedidoComida.cancelar(arregloPedido,"#100");










    }

}