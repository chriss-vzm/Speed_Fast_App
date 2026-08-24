public class PedidoComida extends Pedido{




    public PedidoComida(String idPedido, String direccionEntrega, String distanciaKM) {

        super(idPedido, direccionEntrega,distanciaKM);

    }


    @Override
    public void calcularTiempoEntrega() {

        int timepo = 15 + (2 * Integer.parseInt(getDistanciaKM()));
        System.out.println("Tiempo entrega: " + timepo + "min");

    }
}
