package day36_Inheritance.SportsTasks;

public class Basketball extends Sport{
    public Basketball(String name, String rules, int numberOfPlayers, int numberOfReferees) {
        super(name, rules, numberOfPlayers, numberOfReferees);
    }
public void BasketballPlayers(){
    System.out.println(name+" is playing this game.");
}
    @Override
    public String toString() {
        return "Basketball{" +
                "name='" + name + '\'' +
                ", rules='" + rules + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferees=" + numberOfReferees +
                '}';
    }
}
