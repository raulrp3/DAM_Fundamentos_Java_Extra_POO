package es.estech.rramirez;

public class CounterClass extends Counter {
    private int number;
    private String letter;

    public CounterClass(int number, String letter) {
        super();
        this.number = number;
        this.letter = letter;
    }

    private Object[] fill(Object[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 0;
        }
        return numbers;
    }

    public void print() {
        Object[] numbers = new Object[this.element];
        numbers = fill(numbers);
        int i = 0, number;
        while (i < this.element) {
            number = 0;
            for (int j = 0; j < this.limit; j++) {
                if (numbers[i] == this.letter) {
                    number = 3;
                }
                number++;
                if (number == this.number) {
                    numbers[i] = this.letter;
                } else {
                    numbers[i] = number;
                }
                System.out.println(printResult(numbers));
            }
            i++;
        }
    }

    private String printResult(Object[] numbers) {
        String result = "";
        for (int i = 0; i < numbers.length - 1; i++) {
            result += numbers[i] + " - ";
        }
        result += numbers[numbers.length - 1];
        return result;
    }
}
