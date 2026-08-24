
public class Main {
    public static void main(String[] args) {



        Pedido pedidoComida = new PedidoComida(
                "3241",
                "Pajaritos, La Cisterna",
                "1"
        );



        Pedido pedidoEncomienda = new PedidoEncomienda(
                "8001",
                "Los Leones 314",
                "4"

        );

        Pedido pedidoExpress = new PedidoExpress(
                "5410",
                "Cienfuegos 31, Los Heroes",
                "2"
        );


        pedidoComida.mostrarResumen();
        pedidoComida.calcularTiempoEntrega();


        pedidoEncomienda.mostrarResumen();
        pedidoEncomienda.calcularTiempoEntrega();

        pedidoExpress.mostrarResumen();
        pedidoExpress.calcularTiempoEntrega();

    }

}