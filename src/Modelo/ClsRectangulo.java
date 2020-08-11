package Modelo;
public class ClsRectangulo implements IFiguras{
   Double []dato;
    
public ClsRectangulo(Double []dato) {
    this.dato=dato;
}

    @Override
    public String Area()
    {
       return ""+(dato[0]*dato[1]);
    }
    
    @Override
     public String Perimetro()
    {
        double R=(2*dato[0])+(2*dato[1]);
       return ""+R;
    }
    
     @Override
      public String Descripcion()
    {
       return "La figura es un rectangulo, que \n tiene 2 lados mas largos del mismo \n tamaño y dos mas  cortos del\n mismo tamaño";
    } 
}
