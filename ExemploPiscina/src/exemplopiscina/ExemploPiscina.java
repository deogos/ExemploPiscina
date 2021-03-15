
package exemplopiscina;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExemploPiscina extends JFrame implements ActionListener {
    JLabel lbllarg, lblprof, lblalt,lblresult;
    JTextField txtlarg,txtprof,lblaltt;
    JButton btncalcular,btnlimpar;
    
    public static void main(String[] args) {
        JFrame janela = new ExemploPiscina ();
                janela.setUndecorated(true);
                janela.getRootPane().setWindowDecorationStyle(JRootPane.Frame);
                
    }
    
}
