import java.util.ArrayList;

public class PedidoExpress extends Pedido{


    public PedidoExpress(String tipoPedido, String idPedido, String direccionEntrega, String distanciaKM,estadoPedido estado){

        super(tipoPedido, idPedido, direccionEntrega, distanciaKM, estado);

    }


    //INTERFACES

    @Override
    public void despachar() {

        System.out.println("Pedido de tipo EXPRESS despachado");
    }

    @Override
    public void cancelar(ArrayList<Pedido> list, String id) {
        super.cancelar(list, id);

        System.out.println("Pedido: " + id + " de tipo EXPRESS cancelado");
    }


    @Override
    public void verHistorial(ArrayList<Pedido> list) {

        super.verHistorial(list);

        for (Pedido pedido : list){
            if(pedido.getTipoPeido() == "Express"){
                System.out.println(pedido);
            }
        }


    }







    @Override
    public void asignarRepartidor() {
        System.out.println("El pedido ha sido asignado de tipo EXPRESS");
    }


    @Override
    public void asignarRepartidor(String nombre) {
        super.asignarRepartidor(nombre);
        System.out.println("Repartidor mas cercano con disponibilidad inmediata encontrado");
    }

    @Override
    public void calcularTiempoEntrega() {

        int km = Integer.parseInt(getDistanciaKM());
        if (km > 5){
            System.out.println("Tiempo entrega: 15min");
        }else{
            System.out.println("Tiempo entrega: 10min");
        }



    }
}
