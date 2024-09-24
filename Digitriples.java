import java.util.Scanner;
import java.util.ArrayList;
public class Digitriples{
    public int digitriples(int n){
        ArrayList <Integer> multiplos3 = new ArrayList <>();
        ArrayList <Integer> Nmultiplos3 = new ArrayList <>();
        return digitriples (n, multiplos3, Nmultiplos3);
    }
    private int digitriples(int numero, ArrayList <Integer> multiplos3
                            ,ArrayList <Integer> Nmultiplos3){
        int resp;
        if(numero < 0 || numero > Math.pow(10, 9)){
          resp = 0; 
        }else{
          llenarListas(numero, multiplos3, Nmultiplos3);
          int x = sumarDigitosLista(multiplos3);
          int y = sumarDigitosLista(Nmultiplos3);
          resp = x * y;
        }
        return resp;
    }
    private void llenarListas(int numero,ArrayList <Integer> multiplos3
                            ,ArrayList <Integer> Nmultiplos3){
        if(numero != 0){
          int dig = numero%10;
          if (dig%3 == 0){
              multiplos3.add(dig);
            }else{
              Nmultiplos3.add(dig);
            }
          llenarListas(numero/10, multiplos3, Nmultiplos3);  
        }
    }
    private int sumarDigitosLista(ArrayList <Integer> numeros){
        int resp = 0;
        if(numeros.size() == 0){
           return resp;
        }else{
           int dig = numeros.remove(0);
           resp = dig + sumarDigitosLista(numeros);
        }
        return resp;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Digitriples d = new Digitriples();
        System.out.println(d.digitriples(sc.nextInt()));
    }
}
