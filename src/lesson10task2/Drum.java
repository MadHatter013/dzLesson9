package lesson10task2;

import java.util.Objects;

public class Drum implements MusicalInstrument {
    private double size;

    public Drum(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Играет барабан с размером равным - " + size);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drum drum = (Drum) o;
        return Double.compare(drum.size, size) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size);
    }

    @Override
    public String toString() {
        return "Drum{" +
                "size=" + size +
                '}';
    }
}
