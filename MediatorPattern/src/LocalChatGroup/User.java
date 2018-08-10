package LocalChatGroup;

public class User {
    private String name ;
    private Server s;


    User(String name,Server s){
        this.name = name ;
        this.s = s ;
    }

    void sendMsg(String msg){
        s.send(msg,name);
    }

}
