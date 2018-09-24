package iPhone;

public class Main {
    public static void main(String args[]){
        phone p = new iPhoneXR() ;
        p = new storageDecorator(p,"128GB") ;
        p = new colorDecorator(p,"Gold") ;
        System.out.println(p.getDetails());
        System.out.println(p.getPrice());
    }
}
