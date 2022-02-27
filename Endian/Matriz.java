import javax.swing.JOptionPane;
public class Matriz
{
    public static void main(String []args){
        String giro=JOptionPane.showInputDialog("sentido");
        int filas=Integer.parseInt(JOptionPane.showInputDialog("numero de filas"));
        int columnas=Integer.parseInt(JOptionPane.showInputDialog("numero de columnas"));
        int ndatos=Integer.parseInt(JOptionPane.showInputDialog("numero de datos"));
        String s="",s2="",s3="";
        char [][]matriz=new char[filas][columnas];
        int cont=0;
        int cont2=0;
        
        
        for(int i=0;i<ndatos;i++){
            String dato=JOptionPane.showInputDialog("tipo de dato");
            if(dato.equalsIgnoreCase("entero")){
                int x=Integer.parseInt(JOptionPane.showInputDialog("ingrese datos"));
                int y=((x/256)*1000)+(x%256);
                s+=y+" ";
            }else{
                s+=JOptionPane.showInputDialog("ingrese datos")+" ";
            }
        }
        if(giro.equalsIgnoreCase("izquierda")){
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                if(cont<s.length()){
                    matriz[i][j]=s.charAt(cont);
                }else{
                    matriz[i][j]=' ';
                }
                cont++;
            }
        }
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                s2+=matriz[i][j]+" | ";
            }
            s2+="\n";
        }
        System.out.println(s2);
        }else if(giro.equalsIgnoreCase("derecha")){
        for(int i=0;i<filas;i++){
            for(int j=matriz.length-1;j>=0;j--){
                if(cont2<s.length()){
                    matriz[i][j]=s.charAt(cont2);
                }else{
                    matriz[i][j]=' ';
                }
                cont2++;
                
            }
        }
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                s3+=matriz[i][j]+" | ";
            }
            s3+="\n";
        }
        System.out.println(s3);
    }
    }
}
