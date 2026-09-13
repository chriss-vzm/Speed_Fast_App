import java.util.ArrayList;

public class PedidoEncomienda extends Pedido {



    public PedidoEncomienda (String tipoPedido, String idPedido, String direccionEntrega, String distanciaKM,estadoPedido estado){

        super(tipoPedido, idPedido, direccionEntrega,distanciaKM, estado);

    }

    //INTERFACES
    @Override
    public void despachar() {

        System.out.println("Pedido de tipo ENCOMIENDA despachado");
    }

    @Override
    public void cancelar(ArrayList<Pedido> list, String id) {
        super.cancelar(list, id);

        System.out.println("Pedido: " + id + " de tipo ENCOMIENDA cancelado");
    }


    @Override
    public void verHistorial(ArrayList<Pedido> list) {

        super.verHistorial(list);

        for (Pedido pedido : list){
            if(pedido.getTipoPeido() == "Encomienda"){
                System.out.println(pedido);
            }
        }


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
