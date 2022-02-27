
public class Palillo{

int numerodepalillo;
boolean usado;
 
public Palillo(int n){
 numerodepalillo = n;
 }

synchronized public void Usar(){ 
      if(usado){
         System.out.println("Palillo "+numerodepalillo+" esta siendo utilizado, tiene que esperar");
      }else{
      usado= true;
         System.out.println("Utilizar el palillo "+numerodepalillo );
      }
}

synchronized public void Dejar(){ 
      usado = false;
      System.out.println("palillo "+numerodepalillo+"  disponible");
   }
}