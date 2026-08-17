public class PedidoExpress extends Pedido{


    public PedidoExpress(String idPedido, String direccionEntrega, String tipoPedido){

        super(idPedido, direccionEntrega, tipoPedido);

    }




    @Override
    public void asignarRepartidor(){
        super.asignarRepartidor();

        System.out.println("Este pedido es de supermercados y/o farmacias ");
    }



    @Override
    public void asignarRepartidor(String nombreRepartidor){
        super.asignarRepartidor(nombreRepartidor);

        System.out.println("Repartidor más cercano con disponibilidad inmediata -> ENCONTRADO");

    }

}
