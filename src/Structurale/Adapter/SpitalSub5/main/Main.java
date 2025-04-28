package Structurale.Adapter.SpitalSub5.main;

import Structurale.Adapter.SpitalSub5.model.AdapterObiecte;
import Structurale.Adapter.SpitalSub5.model.Imedicament;
import Structurale.Adapter.SpitalSub5.model.Medicament;
import Structurale.Adapter.SpitalSub5.model.Softnou.Ireteta;
import Structurale.Adapter.SpitalSub5.model.Softnou.Reteta;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//luam un ob de tipul Imedicament
        Imedicament medicament = new Medicament("paracetamol", 100);
        medicament.achizitioneazaMedicament();
        //luam un ob de tipul Ireteta
        List<String> lista = new ArrayList<>();
        //adaugam element in lista
        lista.add("Med1");
        lista.add("Med2");
        lista.add("Med3");
        Ireteta reteta = new Reteta(2, lista);
        //cream un ob de  tipul adapter
        AdapterObiecte adapter = new AdapterObiecte(reteta);
        adapter.achizitioneazaMedicament();

    }
}
