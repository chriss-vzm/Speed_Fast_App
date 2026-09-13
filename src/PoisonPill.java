public class PoisonPill extends Pedido{


    public PoisonPill (){

        super("FIN","FIN","FIN","O",estadoPedido.ENTREGADO);

    }


    @Override
    public void calcularTiempoEntrega() {}




}
