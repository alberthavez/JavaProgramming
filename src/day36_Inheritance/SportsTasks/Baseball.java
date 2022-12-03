package day36_Inheritance.SportsTasks;

public class Baseball extends Sport{
    public Baseball(String name, String rules, int numberOfPlayers, int numberOfReferees) {
        super(name, rules, numberOfPlayers, numberOfReferees);
    }
public void baseballPlayers(){
    System.out.println(name+" is playing this game.");
}
    @Override
    public String toString() {
        return "baseball{" +
                "name='" + name + '\'' +
                ", rules='" + rules + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferees=" + numberOfReferees +
                '}';
    }
}
