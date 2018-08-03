package Software;

import java.util.LinkedList;
import java.util.List;

public class Moodle {
    private List<Student> students ;
    private String msg ;
    private SendEmail sendEmail ;

    public Moodle(){
        students = new LinkedList<>() ;
        sendEmail = new SendEmail() ;
    }

    public void setMessage(String msg){
        this.msg = msg ;
    }

    public String getMessage(){
        return this.msg ;
    }

    public void subscribe(String name,String roll,String e_mail){
        Student s = new Student(name,roll,e_mail) ;
        students.add(s) ;
    }

    public int unsubscribe(String roll){
        for(Student s:students){
            if(s.getRoll().equalsIgnoreCase(roll)){
                students.remove(s) ;
                return 1 ;
            }
        }
        return  0 ;
    }

    public void notifyAllObservers(){
        String to[] = new String[students.size()] ;
        for(int i=0;i<students.size();i++){
            to[i] = students.get(i).getE_mail() ;
            students.get(i).update(getMessage()) ;
        }
        sendEmail.send(to,"Moodle Notice",getMessage()) ;
    }
}
