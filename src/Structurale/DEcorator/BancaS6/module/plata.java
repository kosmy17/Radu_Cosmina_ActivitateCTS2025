package Structurale.DEcorator.BancaS6.module;

public class plata implements Iplata{
    private String data;


    public plata(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("plataNormal{");
        sb.append("data='").append(data).append('\'');
        sb.append('}');
        return sb.toString();
    }


    @Override
    public void platesteNormalcuCardul() {
        System.out.println("S-a facut plata normal cu  cardul.");
    }

    @Override
    public void platesteOnline() {
        System.out.println("S-a facut plata Online cu  cardul.");
    }
}
