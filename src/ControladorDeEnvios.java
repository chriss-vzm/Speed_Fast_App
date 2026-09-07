import java.util.ArrayList;

public class ControladorDeEnvios implements Despachable,Cancelable,Rastreable{


    private ArrayList<Pedido> pedidoArrayList = new ArrayList<>();


    @Override
    public void despachar() {


    }

    @Override
    public void cancelar(ArrayList<Pedido> list, String id) {

    }

    @Override
    public void verHistorial(ArrayList<Pedido> lista) {

    }


    public void agregarLista(Pedido pedido){

    }







}
