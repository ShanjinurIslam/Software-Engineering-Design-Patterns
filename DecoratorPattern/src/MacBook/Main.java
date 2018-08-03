package MacBook;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
	    Model model ;
        System.out.println("Choose Model\n1. MacBook 12\n2. MacBook Pro\n3. MacBook Air");
        int choice = s.nextInt() ;
        if(choice==1){
            model = new MacBook() ;
        }
        else if(choice==2){
            model = new MacBookPro() ;
        }
        else{
            model = new MacBookAir() ;
        }

        System.out.println("Choose Processor\n1.Core i5\n2.Core i7");
        s.nextLine();
        choice = s.nextInt() ;
        if(choice==1){
            model = new processorCustomizer(model,"i5") ;
        }else{
            model = new processorCustomizer(model,"i7") ;
        }
        System.out.println("Choose Processor\n1.8GB\n2.16GB");
        s.nextLine();
        choice = s.nextInt() ;
        if(choice==1){
            model = new ramCustomizer(model,8) ;
        }else{
            model = new ramCustomizer(model,8) ;
        }
        System.out.println("Choose Processor\n1.128GB\n2.256GB\n3.512");
        s.nextLine();
        choice = s.nextInt() ;
        if(choice==1){
            model = new storageCustomizer(model,128) ;
        }
        else if(choice==2){
            model = new storageCustomizer(model,256) ;
        }
        else{
            model = new storageCustomizer(model,512) ;
        }

        System.out.println(model.getDescription() + "\nPrice : " + model.getCost());
    }
}
