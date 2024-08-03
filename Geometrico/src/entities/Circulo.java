package entities;

public class Circulo {
   public Circulo(){
       System.out.println("Objeto instanciado");
   }



    private double raio;

    public double getArea(){
        return Math.PI * Math.pow(raio, 2);
    }

    public double getPerimetro(){
        return Math.PI * 2 * raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString(){
        return String.format("Área: %.3f\nPerímetro: %.3f", getArea(), getPerimetro());
    }

}