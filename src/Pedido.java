import java.util.ArrayList;
import java.util.Objects;

public abstract class Pedido implements Despachable, Cancelable, Rastreable{

    private String tipoPeido;
    private String idPedido;
    private String direccionEntrega;
    private String distanciaKM;
    private estadoPedido estado;




    public enum estadoPedido{
        PENDIENTE,
        EN_REPARTO,
        ENTREGADO
    }


    //CONSTRUCTOR

    public Pedido (String tipoPeido,String idPedido, String direccionEntrega, String distanciaKM,estadoPedido estado){
        this.tipoPeido = tipoPeido;
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.distanciaKM = distanciaKM;
        this.estado = estado;

    }

    //GETTERS


    public String getTipoPeido() {
        return tipoPeido;
    }

    public String getIdPedido() {
        return idPedido;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public String getDistanciaKM() {
        return distanciaKM;
    }

    public estadoPedido getEstado() {
        return estado;
    }

    //SETTERS


    public void setTipoPeido(String tipoPeido) {
        this.tipoPeido = tipoPeido;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public void setDistanciaKM(String distanciaKM) {
        this.distanciaKM = distanciaKM;
    }

    public void setEstado(estadoPedido estado) {
        this.estado = estado;
    }

    //METODO ABSTRACTO

    public abstract void calcularTiempoEntrega();


    //OVERRIDE

    public void asignarRepartidor(){
        System.out.println("El pedido ha sido asignado");
    }

    //OVERRIDING

    public void asignarRepartidor(String nombre){

        System.out.println("Pedido asignado a: " + nombre);

    }


    //INTERFACES


   public void despachar(){
       System.out.println("Despachando...");
   }


    @Override
    public void cancelar(ArrayList<Pedido> list, String id) {

        System.out.println("====== CANCELANDO PEDIDO ======");

        for(int i = 0 ; i < list.size(); i++){
            if(list.get(i).getIdPedido().equals(id)){
                list.remove(i);
                break;
            }
        }


    }

    @Override
    public void verHistorial(ArrayList<Pedido> list) {

        System.out.println("====== HISTORIAL PEDIDOS ======");


    }



    @Override
    public String toString(){
        return
                "======== RESUMEN PEDIDO ========" +
                        "\nTipo pedido: " + tipoPeido +
                        "\nID pedido: " + idPedido +
                        "\nDirreccion entrega: " + direccionEntrega +
                        "\nDistancia en KM: " + distanciaKM;
    }




}
