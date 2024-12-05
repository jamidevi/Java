import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        
        for(int i = 0; i < t; i++){
            int happy = 0;
            int min = 0;
            int max = 0;
            int n = read.nextInt();
            int l = read.nextInt();
            int r = read.nextInt();
            int[] arr = new int[n];
            for(int j = 0; j < n; j++){
                arr[j] = read.nextInt();
            }
            for(int k = 0; k < n; k++){
                if(l <= arr[k] && arr[k] <= r){
                    happy += 1;
                } else {
                    happy -= 1;
                }
                if(happy < min){
                    min = happy;
                }
                if(happy > max){
                    max = happy;
                }
            }
            System.out.println(max + " " + min);
        }
        read.close();
    }
}
