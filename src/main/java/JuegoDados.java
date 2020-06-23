public class JuegoDados {

     public int P1=0;

     public int suma;
     public int random;


    public  int lanzarDado(){

        for(int i=0;i<2;i++) {
            System.out.println("Resultlado del lanzamiento numero"+(i+1));
           random = (int) (Math.random() * 6 + 1);


            try {
                if (random >= 1 && random <= 6) {
                    System.out.println(random);
                } else {
                    System.out.println("algo salio mal");
                    error();
                }
            } catch(StackOverflowError e) {
                System.err.println("!!!!!");
                System.out.println("algo salio mal");

            }
            suma = random + suma;

        }

            if(suma>=2 && suma<=12){
                System.out.println("la suma de los lanzamientos es:"+suma);
            }else{
                System.out.println("la suma de los lanzamientos es:"+suma);
                System.out.println("algo salio mal");
                error();

            }


        return suma;
    }

    public void  juego(){

            System.out.println("esta jugado jugador 1");
            lanzarDado();

          P1=P1+suma;

            System.out.println("RESULTSDOS:");
            System.out.println("Puntaje del jugador="+P1);
            System.out.println("por lo tanto");

            if(P1==7){
                System.out.println("Ganaste");
            }else {

                System.out.println("perdiste");

            }

    }
    public void error(){
        System.out.println("si ves esto es porque modificaste el codigo");
        System.out.println(">:(");
        System.exit(0);
    }


}
