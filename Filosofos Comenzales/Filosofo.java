
public class Filosofo implements Runnable{

   private Thread hilo;
   protected CenadeFilosofos cena;
   protected int pizq, pder;
   protected int numero;

public Filosofo (int n, CenadeFilosofos cena){
      this.numero= n;
      this.cena= cena;
      pizq= cena.getpalilloIzq(numero);
      pder= cena.getpalilloDer(numero);
      hilo = new Thread(this);
      hilo.start();
   }
public void Pensar(){
     try{
        System.out.println ("Filosofo "+numero+"  esta pensando");
        int espera = (int)(Math.random()*100);
        hilo.sleep(espera);
        System.out.println ("Filosofo "+numero+" tiene hambre");
     }catch(InterruptedException e){
 e.printStackTrace();
     }
}
public void tomarPalillos(){
     System.out.println ("Tomando palillos");
     Palillo p1= cena.getpalillo(pizq);
     Palillo p2= cena.getpalillo(pder);
     p1.Usar();
     p2.Usar();
}
public void Comer(){
     try{
        System.out.println("Filosofo "+numero+" esta comiendo");
        int espera= (int)(Math.random()*100); 
        hilo.sleep(espera);
        System.out.println("Filosofo "+numero+" ha termino de comer");
     }catch(InterruptedException e){
  e.printStackTrace();
     }
}
protected void dejarPalillos(){
     System.out.println("Soltando palillos ");
     Palillo p1= cena.getpalillo(pizq);
     Palillo p2= cena.getpalillo(pder);
     p1.Dejar();
     p2.Dejar();
}
public void run(){
    
         Pensar();
         tomarPalillos();
         Comer();
         dejarPalillos();
        
}
}
