
package figurageom;

public class Cuadrado extends FiguraGeom {
    
 public Cuadrado (double base,double altura){
        super(base,altura);
        
    
    
}

    @Override
    public double Perimetro() {
        return 4*base;
    }

    @Override
    public double Area() {
        return base*altura;
    }

    @Override
    public double Angulo() {
        return 90*4;
        
    }
 
 
}
