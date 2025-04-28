package Creationale.Singleton.SingletonRegistry.main;

import Creationale.Singleton.SingletonRegistry.classes.PachetTuristic;

public class Main {
    public static void main(String[] args) {
        //cream un  ob de tipul  instantei si  folosim met  get instance pentru apelare constr private
        PachetTuristic pachet1=PachetTuristic.getInstance("Hawaii",1000);
        System.out.println(pachet1);
        PachetTuristic pachet2=PachetTuristic.getInstance("Ungaria",500);
        System.out.println(pachet2);
        PachetTuristic pachet3=PachetTuristic.getInstance("Hawaii",2500);
        System.out.println(pachet3);

    }
}
