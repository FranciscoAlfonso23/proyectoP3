package Controlador;

import Vista.*;
import Modelo.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class controlRectangulo implements ActionListener {
       private Vista_Rectangulo v_Rectangulo;

    public controlRectangulo(Vista_Rectangulo v_Rectangulo) {
        this.v_Rectangulo = v_Rectangulo;
        this.v_Rectangulo.setLocation(475, 200);
        this.v_Rectangulo.btnCalcular.addActionListener(this);
        this.v_Rectangulo.btnSalir.addActionListener(this);
    }

    public void iniciar()
    {
//        v_Triangulo.cmbOpc.addActionListener(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==v_Rectangulo.btnCalcular)
        {
            if(v_Rectangulo.txtBase.getText()!="" && v_Rectangulo.txtAltura.getText()!="")
            {
                Double[] Datos= {Double.parseDouble(v_Rectangulo.txtBase.getText()),Double.parseDouble(v_Rectangulo.txtAltura.getText())};
                IFiguras Rectangulo=Construye_Figura.Instancias(2,Datos);
                v_Rectangulo.txtArea.setText(Rectangulo.Area());
                v_Rectangulo.txtPerimetro.setText(Rectangulo.Perimetro());
                v_Rectangulo.txtDescripcion.setText(Rectangulo.Descripcion());
            }else {
                JOptionPane.showMessageDialog(null,"Ingrese el lado");
            }
        }else if(e.getSource()==v_Rectangulo.btnSalir)
        {
            v_Rectangulo.dispose();
        }
    }
    
     
}
