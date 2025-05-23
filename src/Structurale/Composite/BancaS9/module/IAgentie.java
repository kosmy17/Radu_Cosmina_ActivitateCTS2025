package Structurale.Composite.BancaS9.module;

public interface IAgentie {
    void adaugaNod(IAgentie agentie) throws Exception;
    void stergeNod(IAgentie agentie) throws Exception;
    void getNod(int  index) throws Exception;
    void descriere();
}
