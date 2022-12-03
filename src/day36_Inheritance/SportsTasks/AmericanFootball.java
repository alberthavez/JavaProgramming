package day36_Inheritance.SportsTasks;

public class AmericanFootball extends Sport{
    public AmericanFootball(String name, String rules, int numberOfPlayers, int numberOfReferees) {
        super(name, rules, numberOfPlayers, numberOfReferees);
    }
public void AmericanFootballPlayers(){
    System.out.println(name+" is playing this game.");
}
    @Override
    public String toString() {
        return "AmericanFootball{" +
                "name='" + name + '\'' +
                ", rules='" + rules + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferees=" + numberOfReferees +
                '}';
    }
}
