public class PedidoEncomienda extends Pedido{



    public PedidoEncomienda (String idPedido, String direccionEntrega, String distanciaKM){

        super(idPedido,direccionEntrega,distanciaKM);

    }

    @Override
    public void calcularTiempoEntrega() {

        double tiempo = 20 + (1.5 * Integer.parseInt(getDistanciaKM()));
        System.out.println("Tiempo entrega: " + tiempo + "min");

    }
}
