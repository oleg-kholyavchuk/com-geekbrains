package geekbrains.lesson4.generic;


public class BoxWithNumber <N extends Number> {
    private N[] array;

    public BoxWithNumber(N... array) {
        this.array = array;
    }

    public double average() {
        double avg = 0.0;
        for (int i = 0; i < array.length; i++) {
            avg += array[i].doubleValue();
        }
        avg /= array.length;

        return avg;
    }

    public boolean compareAverage(BoxWithNumber<?> another) {
        return Math.abs(this.average() - another.average()) < 0.0001;
    }
}
