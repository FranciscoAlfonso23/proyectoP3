package Controlador;
import Vista.*;
import Modelo.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class controladoMDI implements ActionListener{
    private MDI_figuras mdi;
    
    public controladoMDI(MDI_figuras mdi) {
        this.mdi = mdi;
        this.mdi.btnCuadrados.addActionListener(this);
        this.mdi.btnRectangulo.addActionListener(this);
        this.mdi.btnTriangulo.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==mdi.btnCuadrados){
            
        Vista_Cuadrado vist_Cua = new Vista_Cuadrado();
        controlCuadrado control = new controlCuadrado(vist_Cua);
        control.iniciar();
        mdi.d.add(vist_Cua);     
        vist_Cua.setVisible(true);
        }
        else if(e.getSource()==mdi.btnRectangulo){     
            
        Vista_Rectangulo vist_Rec = new Vista_Rectangulo();
        controlRectangulo control = new controlRectangulo(vist_Rec);
        control.iniciar();
        mdi.d.add(vist_Rec);     
        vist_Rec.setVisible(true);
        }else{
        if(e.getSource()==mdi.btnTriangulo){
         Vista_Trinagulo vist_Tri = new Vista_Trinagulo();
        controlTriangulo control = new controlTriangulo(vist_Tri);
        control.iniciar();
        mdi.d.add(vist_Tri);     
        vist_Tri.setVisible(true);   
        }
        
        } 
        
        
    }



    
}
