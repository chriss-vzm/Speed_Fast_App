public class PedidoEncomienda extends Pedido{



    public PedidoEncomienda (String idPedido, String direccionEntrega, String tipoPedido){

        super(idPedido,direccionEntrega,tipoPedido);

    }


    @Override
    public void asignarRepartidor(){
        super.asignarRepartidor();

        System.out.println("Este pedido es de documentos y paquetes");

    }


    @Override
    public void asignarRepartidor(String nombreRepartidor){
        super.asignarRepartidor(nombreRepartidor);
        System.out.println("Validacion de peso y embalaje -> OK");
    }

}
