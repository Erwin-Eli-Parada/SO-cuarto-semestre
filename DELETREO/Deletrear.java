public class Deletrear
{
   public static void Deletreo(String s){
       if(s.length()==1){
           System.out.println(s);
       }else{
           System.out.println(s.charAt(0));
           Deletreo(s.substring(1,s.length()));
       }
   }
   public static void DeletreoInv(String s){
       if(s.length()==1){
           System.out.println(s);
       }else{
           System.out.println(s.charAt(s.length()-1));
           DeletreoInv(s.substring(0,s.length()-1));
       }
   }
   public static void main(String []args){
       String s="oaxaca";
       Deletreo(s);
       DeletreoInv(s);
   }
}
