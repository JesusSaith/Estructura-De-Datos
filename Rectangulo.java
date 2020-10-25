package figurageom;


public class Rectangulo extends FiguraGeom {
    public Rectangulo(double base,double altura){
        super(base,altura);
        
        
        
    }

    @Override
    public double Area() {
        return base * altura;
    }

    @Override
    public double Angulo() {
        return 90*4;
    }

    @Override
    public double Perimetro() {
    return base*2 + altura*2;
    }
    
}
