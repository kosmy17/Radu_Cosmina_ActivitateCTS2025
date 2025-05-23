package Structurale.Composite.FarmacieS8.module;

public interface Isectiune {
    //adaugam  obligatoriu  cele  3 metode
    void adaugaNod( Isectiune sectiune) throws Exception;
    void stergeNod( Isectiune sectiune) throws Exception;
    void getNod (int index) throws Exception;
    void descriere();
}
