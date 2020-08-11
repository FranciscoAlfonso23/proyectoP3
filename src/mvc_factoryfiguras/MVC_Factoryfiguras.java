package mvc_factoryfiguras;
import Vista.MDI_figuras;
import Controlador.controladoMDI;
public class MVC_Factoryfiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MDI_figuras vista = new MDI_figuras();        
        controladoMDI control = new controladoMDI(vista);
        vista.setVisible(true);
    }
    
}
