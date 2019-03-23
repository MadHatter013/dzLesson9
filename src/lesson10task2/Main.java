package lesson10task2;

public class Main {
    public static void main(String[] args) {
        MusicalInstrument[] musicalInstruments = new MusicalInstrument[]{
                new Guitar(6), new Drum(4), new Trumpet(14)
        };

        for (MusicalInstrument musicI : musicalInstruments) {
            musicI.play();
        }    }
}
