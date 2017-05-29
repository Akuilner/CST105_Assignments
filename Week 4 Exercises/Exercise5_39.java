import java.util.Scanner;
public class Exercise5_39 {
    public static void main (String[]Args){
    	Scanner sc = new Scanner(System.in);
    	final double Infinity = (32d / 0d);
        System.out.print("Enter the total amount you would like to earn: ");
        double dC = sc.nextDouble();
        int sA = 0;
        double cR = 0;
        double cA = 0;
        for (sA= 1; sA <= Infinity; sA++){
        if(sA <= 5000){
            cR =  0.08;
        }
        if (sA >= 5001 &&  sA <= 10000){
            cR = 0.10;
        }
        if (sA >= 10000){
            cR = 0.12;  
        }   
        sA += 4999;
        cA = sA * cR;
       
        if(cA == dC){
            break;}
        }
        System.out.print("To earn a commission amount of $" + dC + " , Your sales amount has to reach $" + sA);
    }
}
