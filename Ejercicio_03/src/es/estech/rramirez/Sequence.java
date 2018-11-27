package es.estech.rramirez;

public class Sequence {
    protected int size;
    protected int[] numbers = new int[this.size];

    public Sequence(int size, int[] numbers) {
        this.size = size;
        this.numbers = numbers;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }
}
