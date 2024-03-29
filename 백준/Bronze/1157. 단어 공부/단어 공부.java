import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

       String s = br.readLine().toUpperCase();
       HashSet<Character> sets = new HashSet<Character>();

       for(int i=0; i<s.length(); i++) sets.add(s.charAt(i));

       int len=s.length();
       int l=0;
       char c='?';

       for(char set : sets) {
            s=s.replace(Character.toString(set), "");
            if(l<len-s.length()) {
                l=len-s.length();
                c=set;
            } else if(l==len-s.length()) {
                c='?';
            }
            len=s.length();
       }
       bw.write(c);
       bw.close();
    }
}