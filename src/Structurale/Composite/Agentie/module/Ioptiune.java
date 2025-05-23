package Structurale.Composite.Agentie.module;

public interface Ioptiune {
    void adaugaNod (Ioptiune optiune) throws Exception;
    void stergeNod(Ioptiune optiune) throws Exception;
    void getNod(int index) throws Exception;
    void descriereNod() ;

}
