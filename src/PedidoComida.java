public class PedidoComida extends Pedido  {




    public PedidoComida(String idPedido, String direccionEntrega, String distanciaKM) {

        super(idPedido, direccionEntrega, distanciaKM);

    }





    @Override
    public void asignarRepartidor() {
        System.out.println("El pedido ha sido asignado de tipo COMIDA");

    }


    @Override
    public void asignarRepartidor(String nombre) {
        super.asignarRepartidor(nombre);
        System.out.println("Verificando mochila termica: OK");
    }

    @Override
    public void calcularTiempoEntrega() {

        int timepo = 15 + (2 * Integer.parseInt(getDistanciaKM()));
        System.out.println("Tiempo entrega: " + timepo + "min");

    }
}
