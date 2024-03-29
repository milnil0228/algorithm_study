import java.util.*;
import java.lang.Math;
import java.io.*;


public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int s = 0;
        int m = N;
        
        for(int i=M; i<=N; i++){
            for(int j=1; j<=i/j; j++){
                if(i%j==0 && j!=1){
                    break;
                } else if(j+1 > i/(j+1) && i!=1) {
                    s += i;
                    m = m > i ? i : m;
                }
            }
        }
        
        if(s==0){System.out.println(-1);}
        else{
        System.out.println(s);
        System.out.println(m);
        }
    }
}