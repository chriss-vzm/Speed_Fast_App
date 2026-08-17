
public class Main {
    public static void main(String[] args) {



        PedidoComida pedidoComida = new PedidoComida(
                "3241",
                "Pajaritos, La Cisterna",
                "Comida"
        );


        PedidoEncomienda pedidoEncomienda = new PedidoEncomienda(
                "8001",
                "Los Leones 314",
                "Encomienda"

        );

        PedidoExpress pedidoExpress = new PedidoExpress(
                "5410",
                "Cienfuegos 31, Los Heroes",
                "Express"
        );

        pedidoComida.asignarRepartidor();
        pedidoComida.asignarRepartidor("Felipe Gonzales");

        pedidoEncomienda.asignarRepartidor();
        pedidoEncomienda.asignarRepartidor("Maria Soto");

        pedidoExpress.asignarRepartidor();
        pedidoExpress.asignarRepartidor("Juan Lopez");



    }

}