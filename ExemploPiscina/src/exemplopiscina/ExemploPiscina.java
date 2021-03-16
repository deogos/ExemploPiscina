
package exemplopiscina;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExemploPiscina extends JFrame implements ActionListener{
    
    JLabel lbllarg, lblprof, lblalt,lblresult;
    JTextField txtlarg,txtprof,txtalt,txtresult;
    JButton btncalcular,btnlimpar;
    
    public static void main(String[] args) {
        
                JFrame janela = new ExemploPiscina();
                janela.setUndecorated(true);
                janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
                janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                janela.setVisible(true);
    }
                ExemploPiscina()
                        {
                            setTitle("Calculadora metros cubicos");
                            setBounds(400,200,400,200);
                            getContentPane().setBackground(new Color(211,211,211));
                            getContentPane().setLayout(new GridLayout(6,2));
                            
                            lbllarg = new JLabel ("Largura");
                            lbllarg.setForeground(Color.black);
                            lbllarg.setFont(new Font("",Font.BOLD,14));
                            
                            lblprof = new JLabel ("Profundidade");
                            lblprof.setForeground(Color.black);
                            lblprof.setFont(new Font("",Font.BOLD,14));
                            
                            lblalt = new JLabel ("Altura");
                            lblalt.setForeground(Color.black);
                            lblalt.setFont(new Font("",Font.BOLD,14));
                            
                            lblresult = new JLabel ("Resultado");
                            lblresult.setForeground(Color.black);
                            lblresult.setFont(new Font("",Font.BOLD,14));
                            
                            
                            btncalcular = new JButton("Calcular");      btncalcular.addActionListener(this);
                            btnlimpar = new JButton("Limpar");          btnlimpar.addActionListener(this);
                            
                            txtlarg = new JTextField();
                            txtprof = new JTextField();
                            txtalt = new JTextField();
                            txtresult = new JTextField();
                            txtresult.setEditable(false);
                            
                            
                            
                            getContentPane().add(lbllarg);      getContentPane().add(txtlarg);  
                            getContentPane().add(lblprof);      getContentPane().add(txtprof); 
                            getContentPane().add(lblalt);       getContentPane().add(txtalt); 
                            getContentPane().add(lblresult);    getContentPane().add(txtresult); 
                            getContentPane().add(btncalcular);     
                            getContentPane().add(btnlimpar);
                        }

    public void actionPerformed(ActionEvent e) {
        {
          if (e.getSource()==btnlimpar)
          {
              txtlarg.setText("");
              txtalt.setText("");
              txtprof.setText("");
              txtresult.setText("");
              return;
          }
          double alt =0, prof=0,larg=0,result=0;
          try
          {
              alt = Double.parseDouble(txtalt.getText());
              larg = Double.parseDouble(txtlarg.getText());
              prof = Double.parseDouble(txtprof.getText());
          }
          catch(NumberFormatException error)
          {
              txtresult.setText("Só números");
              return;
          }
          
          if(e.getSource()==btncalcular) result = (larg*alt*prof)*300;
          txtresult.setText("O valor será: R$"+result);
        }  
    }
}