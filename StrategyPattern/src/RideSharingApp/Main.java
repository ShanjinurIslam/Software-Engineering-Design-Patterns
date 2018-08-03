package RideSharingApp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Context context ;
        Scanner s = new Scanner(System.in) ;
        int n = 0 ;
        int d = 0 ;
        int t = 0 ;
        System.out.println("Enter Numner of Passengers : ");
        n = s.nextInt() ;
        s.nextLine() ;
        System.out.println("Enter Distance : ");
        d = s.nextInt() ;
        s.nextLine() ;
        System.out.println("Enter priority : ");
        t = s.nextInt() ;
        s.nextLine() ;

        if (n < 2) {
            context = new Context(new PathaoMoto()) ;
            System.out.println(context.execute(n,d,t));
            context = new Context(new UberMoto()) ;
            System.out.println(context.execute(n,d,t)) ;
        }
        else{
            context = new Context(new PathaoCar()) ;
            System.out.println(context.execute(n,d,t));
            context = new Context(new UberCar()) ;
            System.out.println(context.execute(n,d,t)) ;
        }
    }
}
