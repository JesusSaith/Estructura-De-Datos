
package figurageom;


public abstract class FiguraGeom implements Interface{
    
    protected double base;
    protected double altura;
    
    public FiguraGeom(double base,double altura){
        this.base = base;
        this.altura = altura;
    }
    
    //Metodos getters

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
    
     public abstract double Perimetro();
    
    @Override
    public abstract double Area();
    public abstract double Angulo();
   
    
    
}
