public  class Pedido {

    private String idPedido;
    private String direccionEntrega;
    private String tipoPedido;



    public Pedido (String idPedido, String direccionEntrega, String tipoPedido){
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.tipoPedido = tipoPedido;
    }



    public void asignarRepartidor(){
        System.out.println("Repartidor con ID: " + idPedido +
                "\nDireccion de entrega: " + direccionEntrega +
                "\nTipo pedido: " + tipoPedido
        );
    }


    public void asignarRepartidor(String nombreRepartidor){
        System.out.println("Pedido asignado a: " + nombreRepartidor);
    }



}
