import java.awt.Dimension;
import java.awt.Color;
import javax.swing.*;
public class Ventana extends JFrame
{
    JPanel panel=new JPanel();
    int cont=10;
    public Ventana(){
        setSize(600,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Paginacion");
        setLocationRelativeTo(null);
        setResizable(true);    
        this.getContentPane().add(panel);
        panel.setLayout(null);
    }
    public void componentesPf(int a,int b){
        JLabel etiqueta=new JLabel(a+"pf",SwingConstants.CENTER);
        etiqueta.setBounds(235,cont,50,20);
        panel.add(etiqueta);
        if(b==0){
            etiqueta.setBackground(Color.BLUE);
        }else if(b==1){
            etiqueta.setBackground(Color.YELLOW);
        }else if(b==2){
            etiqueta.setBackground(Color.RED);
        }else if(b==3){
            etiqueta.setBackground(Color.WHITE);
        }else{
            etiqueta.setBackground(Color.GREEN);
        }
        etiqueta.setOpaque(true);
        cont=cont+30;
    }
    public void componentesPv(int a,int b){
        JLabel etiqueta=new JLabel(a+"pv",SwingConstants.CENTER);
        etiqueta.setBounds(235,cont,50,20);
        panel.add(etiqueta);
        if(b==0){
            etiqueta.setBackground(Color.BLUE);
        }else if(b==1){
            etiqueta.setBackground(Color.YELLOW);
        }else if(b==2){
            etiqueta.setBackground(Color.RED);
        }else if(b==3){
            etiqueta.setBackground(Color.WHITE);
        }else{
            etiqueta.setBackground(Color.GREEN);
        }
        etiqueta.setOpaque(true);
        cont=cont+30;
    }
}
