 public class Dado1 extends Dado {

    public void dado1(String material, String tipografia, String color, int lados, double peso){
        //super(material, tipografia, color, lados, peso);
        super("oro","puntos","dorado",6,3.76);
    }

    public void lanzar(){
       System.out.println("hola mundo");
    }
}
