package es.estech.rramirez;

public class Operation extends Sequence {
    public Operation(int size, int[] numbers) {
        super(size, numbers);
    }

    public int[] order() {
        int order = 0, counterPair = 0, counterOdd = 1, auxPair,auxOdd;
        while (order < (this.numbers.length / 2)) {
            if (order % 2 == 0) {
                auxPair = this.numbers[order];
                this.numbers[order] = this.numbers[this.numbers.length - 1 - counterPair];
                this.numbers[this.numbers.length - 1 - counterPair] = auxPair;
                counterPair = counterPair + 2;
            } else {
                auxOdd = this.numbers[order];
                this.numbers[order] = this.numbers[this.numbers.length - 1 - counterOdd];
                this.numbers[this.numbers.length - 1 - counterOdd] = auxOdd;
                counterOdd = counterOdd + 2;
            }
            order++;
        }
        return this.numbers;
    }
}
