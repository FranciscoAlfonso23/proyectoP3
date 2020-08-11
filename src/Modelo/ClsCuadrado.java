package Modelo;
public class ClsCuadrado implements IFiguras{
Double []dato;
    
public ClsCuadrado(Double []dato) {
    this.dato=dato;
}

    @Override
    public String Area()
    {
       return ""+(dato[0]*dato[0]);
    }
    
    @Override
     public String Perimetro()
    {
       return ""+4*dato[0];
    }
    
     @Override
      public String Descripcion()
    {
       return "La figura es una cuadrado, que \n tiene cuatro lados iguales";
    }
    
}
