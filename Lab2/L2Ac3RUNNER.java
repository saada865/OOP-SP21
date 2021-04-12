package l2ac3;
 
import javax.swing.JOptionPane;

public class L2Ac3RUNNER {

    public static void main(String[] args) { 
        
        CarPart car1 = new CarPart ();
        
    String x = JOptionPane.showInputDialog("What is Model Number?" );
    String y = JOptionPane.showInputDialog("What is Part Number?" );
    String z = JOptionPane.showInputDialog("What is Cost?" );
    
    car1.setparameter(x,y,z);
    car1.display();

    }
    
}
