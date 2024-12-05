import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] d = new int[n];
            
            for (int i = 0; i < n; i++) {
                d[i] = scanner.nextInt();
            }
            
            // Your code goes here
            boolean isNonDecreasing=true;
            for(int k=0;k<d.length-1;k++){
                if(d[k]>d[k+1]){
                    isNonDecreasing=false;
                    break;
                }
            }
            if(isNonDecreasing){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
