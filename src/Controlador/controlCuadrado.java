
package Controlador;
import Vista.*;
import Modelo.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
public class controlCuadrado implements ActionListener{
    private Vista_Cuadrado v_Cuadrado;

    public controlCuadrado(Vista_Cuadrado v_Cuadrado) {
        this.v_Cuadrado = v_Cuadrado;
        this.v_Cuadrado.setLocation(475, 200);
        this.v_Cuadrado.btnCalcular.addActionListener(this);
        this.v_Cuadrado.btnSalir.addActionListener(this);
    }

    public void iniciar()
    {
//        v_Cuadrado.cmbOpc.addActionListener(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==v_Cuadrado.btnCalcular)
        {
            if(v_Cuadrado.txtLado.getText()!="")
            {
                Double[] Datos= {Double.parseDouble(v_Cuadrado.txtLado.getText())};
                IFiguras Cuadrado=Construye_Figura.Instancias(1,Datos);
                v_Cuadrado.txtArea.setText(Cuadrado.Area());
                v_Cuadrado.txtPerimetro.setText(Cuadrado.Perimetro());
                v_Cuadrado.txtDescripcion.setText(Cuadrado.Descripcion());
            }else {
                JOptionPane.showMessageDialog(null,"Ingre el lado");
            }
        }else if(e.getSource()==v_Cuadrado.btnSalir)
        {
            v_Cuadrado.dispose();
        }
    }
    
    
   
}
