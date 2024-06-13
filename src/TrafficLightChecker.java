
import java.util.Scanner;

public class TrafficLightChecker {

    public static void main(String args[]) {
      
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira o código da cor \n");
        
        int luz = sc.nextInt();
        sc.close();
        
        
        if(luz == 1)
        {
            System.out.println("A próxima luz será a verde");
        }
        
        
        else if (luz == 2)    
        {
            System.out.println("A próxima luz será a amarela");
        }
        
        
         else if (luz == 3)    
        {
            System.out.println("A próxima luz será a vermelha");
        }
        
        
         else
         {
             System.out.println("Cor inválida");
         }
    }

}
