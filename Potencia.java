import java.util.Scanner;

public class Potencia
{
    int aux = 0;
    public int potencia(int n)
    {
        int resp;
        if(n >= 0 || n <= Math.pow(10, 9)){
           if(Math.pow(2, aux) <= n){
             aux = aux + 1;
             resp = potencia(n);
           }else{
             resp = (int) Math.pow(2, aux);
           }
        }else{
          return 0;
        }
        aux = 0;
        return resp;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Potencia p = new Potencia();
        System.out.println(p.potencia(sc.nextInt()));
    }
}
