package ComparatorPrac;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ComparatorIc2 {
    public static void main(String[] args) {
        ArrayList<Ipl> iplPlayers = new ArrayList<Ipl>();
        iplPlayers.add(new Ipl(42, "M.S Dhoni", "CSK"));
        iplPlayers.add(new Ipl(34, "Virat Kohli", "RCB"));
        iplPlayers.add(new Ipl(36, "Rohit Sharma", "MI"));

        Collections.sort(iplPlayers, new NameComparator());
        Iterator<Ipl> itr = iplPlayers.iterator();
        System.out.println("------IPL TEAMS-----");

        while (itr.hasNext()) {
            Ipl iplTeam = (Ipl) itr.next();
            System.out.println(iplTeam.team + " " + iplTeam.name + " " + iplTeam.age);
        }
    }
}

class Ipl {
    int age = 0;
    String name = "";
    String team = "";

    Ipl(int age, String name, String team) {
        this.age = age;
        this.name = name;
        this.team = team;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setname(String name) {
        this.name = name;

    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}

class AgeComparator implements Comparator<Ipl> {

    @Override
    public int compare(Ipl player1, Ipl player2) {
        if (player1.age == player2.age)
            return 0;
        else if (player1.age > player2.age)
            return 1;
        else
            return 1;
    }
}

class NameComparator implements Comparator<Ipl> {
    @Override
    public int compare(Ipl player1, Ipl player2) {
        return player1.name.compareTo(player2.name);
    }

}
// Methods in comparator IC
    // 1. public int compare(Object o1, Object o2)
    // 2.public boolean equals(Object obj)