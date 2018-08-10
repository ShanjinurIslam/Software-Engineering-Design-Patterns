package LocalChatGroup;

public class Main {
    public static void main(String args[]){
        Server s = new Server() ;
        User a = new User("Jack",s) ;
        s.addUser(a);
        a.sendMsg("Hello");
    }
}
