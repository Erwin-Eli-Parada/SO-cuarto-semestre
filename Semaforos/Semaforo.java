public class Semaforo
{
    static int[] plazabella=new int[7];
    static int[] gasolinera=new int[7];
    static int[] cerro=new int[7];
    static int[] central=new int[7];
    
    static Nodo head=new Nodo();
    static Nodo tail=head;
    
    public static void crearCola(int [] a){
        for(int i=0;i<a.length;i++){
            int b=(int)(Math.random()*3);
            a[i]=b;
        }
    }
    public static void mostrar(){
        for(Nodo n=head;n.next!=head;n=n.next){
            System.out.println(n.val.toString()+" ");
            System.out.println(tail.val.toString());
        }
    }
    public static String direccion(int i){
        if(i==0){
            return "derecha";
        }else if(i==1){
            return "adelante";
        }else if(i==2){
            return "izquierda";
        }
        return "";
    }
    public static void agregarArreglo(int []a){
        Nodo x=new Nodo();
        x.next=head;
        x.val=a;
        tail.next=x;
        tail=x;
    }
    
    public static void main(String []args){
        head.next=head;
        crearCola(plazabella);
        head.val=plazabella;
        crearCola(gasolinera);
        crearCola(cerro);
        crearCola(central);
        agregarArreglo(central);
        agregarArreglo(gasolinera);
        agregarArreglo(cerro);
        
        //mostrar();
        int tiempo=0;
        Nodo a=head;
        int vuelta=0;
        
        int contplaza=plazabella.length;
        int contcerro=cerro.length;
        int contcentral=central.length;
        int contgasolinera=gasolinera.length;
        
        while(contplaza!=0||contcerro!=0||contcentral!=0||contgasolinera!=0){
            System.out.println(contplaza+"-"+contgasolinera+"-"+contcerro+"-"+contcentral);
            if(a==head){
                vuelta++;
                System.out.println("\n vuelta: "+vuelta);
            }
            if(a.val==plazabella){
                System.out.println("----guiate con esto XD-----");
                System.out.println("semaforo de plaza bella");
                for(int i=0;i<5;i++){
                    if(contplaza!=0){
                        int carro=plazabella[contplaza-1];
                        System.out.println("carro va hacia "+ direccion(carro));
                        contplaza--;
                    }else{
                        break;
                    }
                }
                for(int i=0;i<5;i++){
                    if(contgasolinera!=0 && gasolinera[contgasolinera-1]==0){
                        int carro=gasolinera[contgasolinera-1];
                        System.out.println("carro del semaforo de la gasolinera va hacia "+direccion(carro));
                        contgasolinera--;
                    }
                }
                System.out.println("------guiate con esto XD------");
                tiempo+=5;
            }else if(a.val==gasolinera){
                System.out.println("----guiate con esto XD-----");
                System.out.println("semaforo de gasolinera");
                for(int i=0;i<5;i++){
                    if(contgasolinera!=0){
                        int carro=gasolinera[contgasolinera-1];
                        System.out.println("carro va hacia "+ direccion(carro));
                        contgasolinera--;
                    }else{
                        break;
                    }
                }
                for(int i=0;i<5;i++){
                    if(contcerro!=0 && cerro[contcerro-1]==0){
                        int carro=cerro[contcerro-1];
                        System.out.println("carro del semaforo del cerro va hacia "+direccion(carro));
                        contcerro--;
                    }
                }
                System.out.println("------guiate con esto XD------");
                tiempo=tiempo+6;
            }else if(a.val==central){
                System.out.println("----guiate con esto XD-----");
                System.out.println("semaforo de la central");
                for(int i=0;i<5;i++){
                    if(contcentral!=0){
                        int carro=central[contcentral-1];
                        System.out.println("carro va hacia "+ direccion(carro));
                        contcentral--;
                    }else{
                        break;
                    }
                }
                for(int i=0;i<5;i++){
                    if(contplaza!=0 && plazabella[contplaza-1]==0){
                        int carro=plazabella[contplaza-1];
                        System.out.println("carro del semaforo de plaza bella va hacia "+direccion(carro));
                        contplaza--;
                    }
                }
                System.out.println("------guiate con esto XD------");
                tiempo=tiempo+10;
            }else if(a.val==cerro){
                System.out.println("----guiate con esto XD-----");
                System.out.println("semaforo del cerro");
                for(int i=0;i<5;i++){
                    if(contcerro!=0){
                        int carro=cerro[contcerro-1];
                        System.out.println("carro va hacia "+ direccion(carro));
                        contcerro--;
                    }else{
                        break;
                    }
                }
                for(int i=0;i<5;i++){
                    if(contcentral!=0 && central[contcentral-1]==0){
                        int carro=central[contcentral-1];
                        System.out.println("carro del semaforo de la central va hacia "+direccion(carro));
                        contcentral--;
                    }
                }
                System.out.println("------guiate con esto XD------");
                tiempo=tiempo+15;
            }
            a=a.next;
            
        }
        System.out.println("El tiempo requerido fue: "+tiempo+" segundos ");
    }
}
