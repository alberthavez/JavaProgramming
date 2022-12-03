package day36_Inheritance.SportsTasks;

public class Football extends Sport{
    public Football(String name, String rules, int numberOfPlayers, int numberOfReferees) {
        super(name, rules, numberOfPlayers, numberOfReferees);
    }
public void footballPlayers(){
    System.out.println(name+" is playing this game.");
}
    @Override
    public String toString() {
        return "football{" +
                "name='" + name + '\'' +
                ", rules='" + rules + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferees=" + numberOfReferees +
                '}';
    }
}
