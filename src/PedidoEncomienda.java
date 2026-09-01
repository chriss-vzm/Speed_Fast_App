public class PedidoEncomienda extends Pedido {



    public PedidoEncomienda (String idPedido, String direccionEntrega, String distanciaKM){

        super(idPedido,direccionEntrega,distanciaKM);

    }




    @Override
    public void asignarRepartidor() {
        System.out.println("El pedido ha sido asignado de tipo ENCOMIENDA");
    }

    @Override
    public void asignarRepartidor(String nombre) {
        super.asignarRepartidor(nombre);
        System.out.println("Validando peso y embalaje: OK");
    }

    @Override
    public void calcularTiempoEntrega() {

        double tiempo = 20 + (1.5 * Integer.parseInt(getDistanciaKM()));
        System.out.println("Tiempo entrega: " + tiempo + "min");

    }
}
