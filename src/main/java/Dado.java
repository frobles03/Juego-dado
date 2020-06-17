public class Dado {


    private int lados;
    private String material;
    private String tipografia;
    private String color;
    private double peso;

    public Dado(String material, String tipografia, String color, int lados, double peso) {
        super();
        this.material = material;
        this.tipografia = tipografia;
        this.color = color;
        this.lados = lados;
        this.peso = peso;
    }

    public void constructor(String material, String tipografia, String color, int lados, double peso) {

        this.material = material;
        this.tipografia = tipografia;
        this.color = color;
        this.lados = lados;
        this.peso = peso;
    }

    public String getMaterial() {
        return material;
    }

    public void   setMaterial(String material){
        this.material="plastico";
    }

    public String getTipografia() {
        return tipografia;
    }

    public void setTipografia(String tipografia){
        this.tipografia="numeros";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color){
        this.color="rojo";
    }

    public int getLados() {
        return lados;
    }

    public void setLados(int lados){
        this.lados=6;
    }

    public double getPeso(){
        return peso;
    }

    public void  setPeso(double peso){
        this.peso=3.76;
    }


}
