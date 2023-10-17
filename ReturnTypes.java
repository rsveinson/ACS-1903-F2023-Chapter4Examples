import java.util.Scanner;
/** 
 * ACS-1903 Assignment X Question Y
 * @author 
*/

public class ReturnTypes{
    public static void main(String[] args) {
    // **** variables and constants ***
    
    // **** objects ****
        Scanner scanner = new Scanner(System.in);
        
    // **** input ****
    
    // **** example method calls ****
    
        int number1 = 12;
        int number2 = 3;
        boolean bigger = trueOrFalse(number1, number2);
        System.out.println(bigger);
        
        int n = 3;
        int cubed = 0;
        
        cubed = cubeN(n);
        System.out.println(n + "^3 = " + cubed);
        
        int temp = passByValue(n);
        System.out.println("n = " + n);
        System.out.println("temp = " + temp);
        
    // **** output ****
    
    // *** end of program ****
        System.out.println("end of program");
    }
    
    public static boolean trueOrFalse(int n1, int n2){
        boolean result = false;
        result = n1 > n2;
        
        return result;
    }// end trueOrFalse
    
    public static int cubeN(int n){
        return n * n * n;
    }// end cubeN
    
    public static int passByValue(int n){
        n = n * 5;
        return n;
    }// end passByValue
}
