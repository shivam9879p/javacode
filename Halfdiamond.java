import java.util.Scanner;
public class Halfdiamond {
    
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int n1 = n+1;
        int n2 = n1-1;
        int i = 1;
        while(i <= n1){
            int stars=1;
            while(stars <= i){
                System.out.print("*");
            
            }
            int j =1;
            int p =1;
            while(j <= i-1){
                System.out.print(p);
                p++;
                j++;
            }
            p = i-2;
            j=1;
            while(j <= i-2){
                System.out.print(p);
                p--;
                j++;
            }
            System.out.println();
            i++;
        }
        
    }
}