package Structurale.Adapter.SpitalSub5.model.Softnou;

import java.util.ArrayList;
import java.util.List;

public class Reteta implements Ireteta{
    private int nrReteta;
    private List <String> lista=new ArrayList<>();

    public Reteta(int nrReteta, List<String> lista) {
        this.nrReteta = nrReteta;
        this.lista = lista;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("nrReteta=").append(nrReteta);
        sb.append(", lista=").append(lista);
        sb.append('}');
        return sb.toString();
    }



    @Override
    public void prezintaReteta() {
        System.out.println("Sa prezentat  reteta cu numarul "+nrReteta);
    }
}
