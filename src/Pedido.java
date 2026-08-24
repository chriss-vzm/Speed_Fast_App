public abstract class Pedido {

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


    public void mostrarResumen() {
        System.out.println(
                "======== RESUMEN PEDIDO ========" +
                        "\nID pedido: " + idPedido +
                        "\nDirreccion entrega: " + direccionEntrega +
                        "\nDistancia en KM: " + distanciaKM
        );
    }







}
