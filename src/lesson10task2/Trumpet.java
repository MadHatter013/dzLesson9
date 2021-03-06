package lesson10task2;

import java.util.Objects;

public class Trumpet implements MusicalInstrument {
    private double diameter;

    public Trumpet(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Играет труба с диаметром раным - " + diameter);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trumpet trumpet = (Trumpet) o;
        return Double.compare(trumpet.diameter, diameter) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(diameter);
    }

    @Override
    public String toString() {
        return "Trumpet{" +
                "diameter=" + diameter +
                '}';
    }
}
