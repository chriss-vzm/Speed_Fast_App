public class PedidoExpress extends Pedido{


    public PedidoExpress(String idPedido, String direccionEntrega, String distanciaKM){

        super(idPedido, direccionEntrega, distanciaKM);

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
