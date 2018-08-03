package Software;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Moodle m = new Moodle() ;
        Scanner s = new Scanner(System.in) ;
        while (true){
            System.out.println("1. Subscribe Student 2. Unsubscribe Student 3. Set Message 4. Notify All Students 5. Exit");
            int i = s.nextInt() ;
            s.nextLine() ;
            if(i==1){
                String name,roll,email ;
                System.out.println("Enter Name : ");
                name = s.nextLine() ;
                System.out.println("Enter Roll : ");
                roll = s.next() ;
                System.out.println("Enter Email : ");
                email = s.next() ;
                m.subscribe(name,roll,email);
                System.out.println("Subscription Successful");
            }
            if(i==2){
                System.out.println("Enter Roll : ");
                String roll = s.next() ;
                int temp = m.unsubscribe(roll);
                if(temp==1){
                    System.out.println("Unsubscription Successful");
                }
                else{
                    System.out.println("Student Not Found");
                }
            }

            if(i==3){
                System.out.println("Set Notice Message");
                String msg = s.nextLine() ;
                m.setMessage(msg);
            }

            if(i==4){
                m.notifyAllObservers();
            }

            if(i==5){
                break;
            }
        }
    }
}
