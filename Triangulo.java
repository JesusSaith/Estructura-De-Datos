
package figurageom;


public class Triangulo extends FiguraGeom {
    
    protected double lado1;
    protected double lado2;
    protected double lado3;
    protected double sumaP;
    protected double angulo1;
    protected double angulo2;
    protected double angulo3;
   
    
    public Triangulo(double base,double altura,double lado1, double lado2,double lado3){
        super(base,altura);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    //Metodos abstractos

    @Override
    public double Perimetro() {
       return lado1+lado2+lado3;
    }

    @Override
    public double Area() {
        return base*altura/2;
    }

    @Override
    public double Angulo() {
        return angulo1+angulo2+angulo3;
    }
    
    
    
}
