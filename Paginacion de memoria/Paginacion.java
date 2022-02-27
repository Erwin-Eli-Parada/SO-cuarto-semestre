import javax.swing.JOptionPane;
public class Paginacion
{
    public static void main(String []args){
        int documento=Integer.parseInt(JOptionPane.showInputDialog("tamaño del documento"));
        int pagina=Integer.parseInt(JOptionPane.showInputDialog("tamaño de la pagina"));
        int npaginas=documento/pagina;
        Ventana v1=new Ventana();
        v1.setVisible(true);
        int rnd=0;
        for(int i=0;i<npaginas;i++){
            if(rnd==5){
                rnd=0;
            }
            v1.componentesPf(i+1,rnd);
            v1.componentesPv(i+1,rnd);
            rnd++;
        }
    }
}
