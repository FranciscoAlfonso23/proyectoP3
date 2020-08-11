package Controlador;
import Vista.*;
import Modelo.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
public class controlTriangulo implements ActionListener{
     private Vista_Trinagulo v_Triangulo;

    public controlTriangulo(Vista_Trinagulo v_Triangulo) {
        this.v_Triangulo = v_Triangulo;
        this.v_Triangulo.setLocation(475, 200);
        this.v_Triangulo.btnCalcular.addActionListener(this);
        this.v_Triangulo.btnSalir.addActionListener(this);
    }

    public void iniciar()
    {
//        v_Triangulo.cmbOpc.addActionListener(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==v_Triangulo.btnCalcular)
        {
            if(v_Triangulo.txtLadoA.getText()!="" && v_Triangulo.txtLadoB.getText()!="" && v_Triangulo.txtLadoC.getText()!="")
            {
                Double[] Datos= {Double.parseDouble(v_Triangulo.txtLadoA.getText()),Double.parseDouble(v_Triangulo.txtLadoB.getText()),Double.parseDouble(v_Triangulo.txtLadoC.getText())};
                IFiguras Triangulo=Construye_Figura.Instancias(3,Datos);
                v_Triangulo.txtArea.setText(Triangulo.Area());
                v_Triangulo.txtPerimetro.setText(Triangulo.Perimetro());
                v_Triangulo.txtDescripcion.setText(Triangulo.Descripcion());
                
            }else {
                JOptionPane.showMessageDialog(null,"Ingre el lado");
            }
        }else if(e.getSource()==v_Triangulo.btnSalir)
        {
            v_Triangulo.dispose();
        }
    }
       
}
