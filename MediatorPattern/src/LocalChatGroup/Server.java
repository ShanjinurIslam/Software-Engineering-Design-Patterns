package LocalChatGroup;

import java.util.ArrayList;

public class Server implements Mediator{
    ArrayList<User> users ;

    Server(){
        users = new ArrayList<>() ;
    }

    void addUser(User a){
        users.add(a) ;
    }
    @Override
    public void send(String f) {
        System.out.println(f);
    }

    public void send(String f,String name){
        System.out.print(name + ": " );
        send(f);
    }
}
