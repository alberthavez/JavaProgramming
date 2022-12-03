package day36_Inheritance.PlanetTask;

public class Mercury extends Planet{
    public Mercury(String name, double mass, double radius, double surfaceGravity, double surfaceArea, double volume, long population) {
        super(name, mass, radius, surfaceGravity, surfaceArea, volume, population);
    }

    @Override
    public String toString() {
        return "Mercury{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                ", radius=" + radius +
                ", surfaceGravity=" + surfaceGravity +
                ", surfaceArea=" + surfaceArea +
                ", volume=" + volume +
                ", population=" + population +
                '}';
    }
}
