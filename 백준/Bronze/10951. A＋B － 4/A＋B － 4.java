import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws Exception {

       Scanner sc = new Scanner(System.in);
       int First, Second;

       while(sc.hasNext()){
           First = sc.nextInt();
           Second = sc.nextInt();
           System.out.println(First+Second);
       }
    }
}