package ba.unsa.etf.rpr;
import java.util.Scanner;
public class Main {

    public static int sumaCifara(int n){
        int s=0;
        while(n>0)
        {
            s=s+n%10;
            n=n/10;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            if(i%sumaCifara(i)==0)
                System.out.print(i+"");

        }

    }
}
