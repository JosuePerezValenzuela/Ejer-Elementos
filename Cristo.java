import java.util.Scanner;
import java.util.ArrayList;
public class Cristo{
    public static void main(String[] args)
    {
        Cristo c = new Cristo();
        Scanner sc = new Scanner(System.in);
        System.out.println(c.cristo(sc.nextInt()));
    }
    public int cristo(int x){
        int subir = 1399 - x;
        if (x < 1365 || x > 1399){
          return 0;
        }
        if (subir == 0) return 1;
        else return cristo(subir, x);
    }
    private int cristo(int subir, int x){
        if(subir < 6){
          if (subir == 1){
            return 1;
          }
          if(subir == 2){
            return 2;
          }
          if (subir == 3){
            return 4;
          }
          return cristo(subir-1, x) + cristo(subir-2, x) + cristo(subir-3, x);
        }else{
          if(subir == 6){
             return 23;
            }
          if(subir == 7){
             return 42;
            }
          if (subir == 8){
             return 75;
            }
          return cristo(subir-1, x) + cristo(subir-2, x) + cristo(subir-3, x);  
        }
    }
}
