package ComparatorPrac;
import java.util.ArrayList;
import java.util.Collections;

public class ComparableIc {
    public static void main(String[] args) {
        ArrayList<Cricketers> cricket=new ArrayList<Cricketers>();
        cricket.add(new Cricketers(7,"M.S Dhoni",42));
        cricket.add(new Cricketers(18, "Virat Kohli", 34));
        cricket.add(new Cricketers(41, "Shreyas Iyer", 28));

        Collections.sort(cricket);
        for (Cricketers c:cricket){
            System.out.println(c.jerseyNo+" "+c.name+" "+c.age);
        }
    }
}


 class Cricketers implements Comparable<Cricketers> {
    int jerseyNo = 0;
    String name = "";
    int age = 0;

    Cricketers(int cJerseyNo, String cName, int cAge) {
        this.jerseyNo = cJerseyNo;
        this.name = cName;
        this.age = cAge;
    }

    @Override
    public int compareTo(Cricketers c) {
        if (age == c.age) 
            return 0;
         else if (age > c.age) 
        // else if (age < c.age) -reverse order age
            return 1;
        else 
            return -1;
    }

}