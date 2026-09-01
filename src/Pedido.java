import java.util.ArrayList;
import java.util.Objects;

public abstract class Pedido extends ControladorDeEnvios {

    private String idPedido;
    private String direccionEntrega;
    private String distanciaKM;


    //CONSTRUCTOR

    public Pedido (String idPedido, String direccionEntrega, String distanciaKM){
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.distanciaKM = distanciaKM;
    }

    //GETTERS

    public String getIdPedido() {
        return idPedido;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public String getDistanciaKM() {
        return distanciaKM;
    }

    //SETTERS

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public void setDistanciaKM(String distanciaKM) {
        this.distanciaKM = distanciaKM;
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


    @Override
    public void despachar() {
        System.out.println("El pedido fue despachado correctamente");
    }


    @Override
    public void cancelar(ArrayList<Pedido> list, String id) {

        for(int i = 0 ; i < list.size(); i++){
            if(list.get(i).getIdPedido() == id){
                list.remove(i);
                break;
            }
        }

        System.out.println("Pedido cancelado correctamente");

    }

    @Override
    public void verHistorial(ArrayList<Pedido> list) {

        for (int i = 0 ; i < list.size(); i++){
            System.out.println("Pedido: " + list.get(i).getIdPedido() + "entregado por - "  );
        }


    }





    public void mostrarResumen() {
        System.out.println(
                "======== RESUMEN PEDIDO ========" +
                        "\nID pedido: " + idPedido +
                        "\nDirreccion entrega: " + direccionEntrega +
                        "\nDistancia en KM: " + distanciaKM
        );
    }







}
