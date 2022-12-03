package day36_Inheritance.SportsTasks;

public class Sport {
   public String name,  rules;
   public int numberOfPlayers, numberOfReferees;

    public Sport(String name, String rules, int numberOfPlayers, int numberOfReferees) {
        this.name = name;
        this.rules = rules;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfReferees = numberOfReferees;
    }
    public void play(){
        System.out.println(name +" is playing sports");
    }

    @Override
    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", rules='" + rules + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferees=" + numberOfReferees +
                '}';
    }
}
