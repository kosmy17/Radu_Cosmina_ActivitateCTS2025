package Structurale.Composite.RestaurantS8.module;

public interface Ioptiune {
    void adaugaNod (Ioptiune optiune) throws Exception;
    void stergeNod(Ioptiune optiune) throws Exception;
    void getNod (int index) throws Exception;
    void descriere();
}
