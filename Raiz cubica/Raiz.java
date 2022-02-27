public class Raiz
{
    public static double cubica(double a,int b){
        
        if(b==0){
            return a;
        }
        return 0.5*((a/(cubica(a,b-1)*cubica(a,b-1)))+cubica(a,b-1));
    }
    public static void main(String [] args){
        System.out.println(cubica(27,20));
    }
}
