package es.estech.rramirez;

public class Square extends Figure {
    private int element;

    public Square(int element) {
        super(4);
        this.element = element;
    }

    public String print() {
        String printSquare = "";
        for (int i = 0; i < this.element; i++) {
            for (int j = 0; j < this.element; j++) {
                printSquare += "*\t";
            }
            printSquare += "\n";
        }
        return printSquare;
    }
}
