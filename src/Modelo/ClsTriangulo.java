package Modelo;


public class ClsTriangulo implements IFiguras{
    Double []dato;
    
public ClsTriangulo(Double []dato) {
    this.dato=dato;
}

    @Override
    public String Area()
    {
       return ""+((dato[0]*dato[1]))/2;
    }
    
    @Override
     public String Perimetro()
    {
        double P= dato[0]+dato[1]+dato[2];
       return ""+P;
    }
    
     @Override
      public String Descripcion()
    {
       return "La figura es un Trinagulo"+"\n"+" y tiene tres lados";
    }  
}
