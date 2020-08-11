
package Modelo;

public class Construye_Figura {
    public static IFiguras Instancias(int opc,Double[]Datos){
        switch(opc){
            case 1:
                return new ClsCuadrado(Datos);
                
            case 2:
                return new ClsRectangulo(Datos);
            case 3:
                return new ClsTriangulo(Datos);
                  
                //ojo cargar en la vista de las siguiente manera
                //Double[] Datos= {Double.parseDouble(v_Cuadrado.txtBase.getText()),double.parseDouble(v_Cuadrado.Altura.getText())};
            default: return null;
        
        }
          
    }
}
