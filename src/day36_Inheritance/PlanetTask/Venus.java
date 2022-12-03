package day36_Inheritance.PlanetTask;

public class Venus extends Planet{
    public Venus(String name, double mass, double radius, double surfaceGravity, double surfaceArea, double volume, long population) {
        super(name, mass, radius, surfaceGravity, surfaceArea, volume, population);
    }

    @Override
    public String toString() {
        return "Venus{" +
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
