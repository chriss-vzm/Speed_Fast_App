import java.util.ArrayList;

public class PedidoComida extends Pedido  {




    public PedidoComida(String tipoPedido, String idPedido, String direccionEntrega, String distanciaKM) {

        super(tipoPedido, idPedido, direccionEntrega, distanciaKM);

    }



    //INTERFACES

    @Override
    public void despachar() {

        System.out.println("Despachando pedido COMIDA... ");

    }

    @Override
    public void cancelar(ArrayList<Pedido> list, String id) {
        super.cancelar(list, id);

        System.out.println("Pedido: " + id + " de tipo COMIDA cancelado");
    }


    @Override
    public void verHistorial(ArrayList<Pedido> list) {

        super.verHistorial(list);

        for (Pedido pedido : list){
            if(pedido.getTipoPeido() == "Comida"){
                System.out.println(pedido);
            }
        }


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
