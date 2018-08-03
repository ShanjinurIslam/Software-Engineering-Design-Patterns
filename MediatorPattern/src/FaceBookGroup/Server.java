package FaceBookGroup;

import java.util.ArrayList;

class Server implements sendNotification{
    ArrayList<Admin> admins ;
    ArrayList<Friend> friends ;

    Server(){
        admins = new ArrayList<>() ;
        friends = new ArrayList<>() ;
    }

    void addAdmins(Admin admin){
        admins.add(admin) ;
    }

    void addFriend(Friend friend){
        friends.add(friend) ;
    }

    @Override
    public void send(String msg,String type,String name) {
        if(type.equals("AdminNotification")){
            System.out.println("Admin - " + name + " : "+msg);
        }
        if(type.equals("GroupNotification")){
            System.out.println("Group Member - " + name + " : "+msg);
        }
    }
}
