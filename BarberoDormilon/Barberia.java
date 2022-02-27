import javax.swing.JOptionPane;
import java.util.*;
public class Barberia
{
    public static void LineaEspera(){
        int numeroasientos=Integer.parseInt(JOptionPane.showInputDialog("numero de asientos"));
        int numeroclientes=Integer.parseInt(JOptionPane.showInputDialog("numero de clientes"));
        boolean []asientos=new boolean[numeroasientos];
        int cont=1;
        String aux="";
        Calendar calendario=Calendar.getInstance();
        int hora=calendario.get(Calendar.HOUR_OF_DAY);
        int minutos=calendario.get(Calendar.MINUTE);
        int segundos=calendario.get(Calendar.SECOND);
        System.out.println("incio a las: "+hora+":"+minutos+":"+segundos);
        while(numeroclientes>0){
            if(numeroclientes>numeroasientos){
                System.out.println("esta atendiendo al cliente #"+cont+" ,los asientos estan llenos y los clientes que estan en cola son: "+(numeroclientes-asientos.length-1));
                numeroclientes--;
                cont++;
                try{
                    Thread.sleep(5000);
                }catch(InterruptedException e){}              
            }else if(numeroclientes>1){
                for(int i=1;i<asientos.length;i++){
                    asientos[i]=false;
                }
                for(int i=1;i<numeroclientes;i++){
                    asientos[i]=true;
                    aux+=(i)+",";
                }
                System.out.println("esta atendiendo al cliente #"+cont+" ,y los asientos ocupados son el: "+aux.substring(0,aux.length()-1));
                cont++;
                numeroclientes--;
                aux="";
                try{
                    Thread.sleep(3000);
                }catch(InterruptedException e){}
            }else{
                System.out.println("esta atendiendo al cliente #"+cont+" ,y ya no queda nadie en las sillas");
                numeroclientes--;
            }
        }
        System.out.print("TERMINO \n");
        Calendar calendario2=Calendar.getInstance();
        hora=calendario2.get(Calendar.HOUR_OF_DAY);
        minutos=calendario2.get(Calendar.MINUTE);
        segundos=calendario2.get(Calendar.SECOND);
        System.out.println("hora final: "+hora+":"+minutos+":"+segundos);
    }
}
