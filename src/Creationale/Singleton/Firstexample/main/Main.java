package Creationale.Singleton.Firstexample.main;

import Creationale.Singleton.Firstexample.classes.Agentie;

public class Main {
    public static void main(String[] args) {
        //cream un ob de tipul clasei
        Agentie  agentie1=Agentie.getInstance(100,"DerTour");
        System.out.println(agentie1);
        Agentie agentie2=Agentie.getInstance(250,"ChristianTour");
        System.out.println(agentie2);

    }
}
