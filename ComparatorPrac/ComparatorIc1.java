package ComparatorPrac;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorIc1 {
    public static void main(String[] args) {
        ArrayList<IndianTeam> india=new ArrayList<IndianTeam>();
        india.add(new IndianTeam(45, "Rohit Sharma", 36));
        india.add(new IndianTeam(77, "Shubman Gill", 23));
        india.add(new IndianTeam(33, "Hardik Pandya", 29));

        Comparator<IndianTeam> com=Comparator.comparing(IndianTeam::getJerseyNo);
        // Comparator<IndianTeam> com=Comparator.comparing(IndianTeam::getAge);
        // Comparator<IndianTeam> com=Comparator.comparing(IndianTeam::getName);

        Collections.sort(india,com);
        for(IndianTeam i:india){
            System.out.println(i.jerseyNo+" "+i.name+" "+i.age);
        }
        
    }
}
class IndianTeam{
    int jerseyNo=0; 
    String name="";
    int age=0;
    IndianTeam(int jerseyNo,String name,int age){
        this.jerseyNo=jerseyNo;
        this.name=name;
        this.age=age;
    }
    public  int getJerseyNo(){
        return jerseyNo;
    }
    public void setJerseyNo(int jerseyNo){
         this.jerseyNo=jerseyNo;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }
    public void setName(int age){
        this.age=age;
    }
}
//  india.add(new Student(1,null,31));    

// Considers null to be less than non-null
//  Comparator<Student> cm1=Comparator.comparing(Student::getName,Comparator.nullsFirst(String::compareTo));  


// Considers null to be greater than non-null
//   Comparator<Student> cm2=Comparator.comparing(Student::getName,Comparator.nullsLast(String::compareTo));  

