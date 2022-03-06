import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Swaminarayan {

    public static void main(String[] args) throws IOException {
        //BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        //int x=Integer.parseInt(bf.readLine());
//        String fuck=findvalue(702,"");
//        System.out.println(fuck);
        System.out.println(encode(10));
        System.out.println(encode(26));
        System.out.println(encode(28));
        int rem,dev; ;
//88 %26 =10
//…
//88/26 =3

//cj


    }

    public static String findvalue(int x,String a){
       int rem =x%26;
        int dev =x/26;
        if(rem==0){
            dev=dev-1;
        }
        if(dev>0){
            a=findvalue(dev,a);

        }

//        System.out.print((char)(rem+64));
        return rem==0 ?a+"Z":a+(char)(rem+64);

    }

     static String encode(int x){
        String ans="";
        while(x/26>0){
            if(x%26==0){
                ans="Z"+ans;
                x=(x-1)/26;
            }else {
                ans = (char) (x % 26 + 'A' - 1) + ans;
                x = x / 26;
            }
        }
        if(x%26>0) {
            ans = (char) (x % 26 + 'A' - 1) + ans;
        }
        return ans;
    }
}
