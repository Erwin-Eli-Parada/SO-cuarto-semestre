
public class CenadeFilosofos{
 
 static int total = 5; //numero de filosofos y palillos
 Palillo palillos[]=new Palillo[total];

public CenadeFilosofos(){
 for(int i=0; i<total; i++){
  palillos[i] = new Palillo(i);
 }
}
public Palillo getpalillo(int n){
 return palillos[n];
 }
public int getpalilloDer(int n){
 return (n+1)%total;
 }
public int getpalilloIzq(int n){
 return n;
 }
 public static void main(String args[]){
 System.out.println("Cena de los Filosofos");
 CenadeFilosofos cena = new CenadeFilosofos();
 for(int i=0; i<total; i++){
  Filosofo pensante = new Filosofo(i, cena);
 }
}
}
