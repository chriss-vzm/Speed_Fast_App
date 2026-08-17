public class PedidoComida extends Pedido{




    public PedidoComida(String idPedido, String direccionEntrega, String tipoPedido) {

        super(idPedido, direccionEntrega,tipoPedido);

    }

    @Override
    public void asignarRepartidor(){
        super.asignarRepartidor();

        System.out.println("Este pedido es para Restaurantes");

    }


    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        super.asignarRepartidor(nombreRepartidor);

        System.out.println("Validacion de mochila térmica -> OK");
    }

}
