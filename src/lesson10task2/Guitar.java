package lesson10task2;

import java.util.Objects;

public class Guitar implements MusicalInstrument {
    private int numberOfStrings;

    public Guitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара с количеством струн равным - " + numberOfStrings);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guitar guitar = (Guitar) o;
        return numberOfStrings == guitar.numberOfStrings;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfStrings);
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "numberOfStrings=" + numberOfStrings +
                '}';
    }
}
