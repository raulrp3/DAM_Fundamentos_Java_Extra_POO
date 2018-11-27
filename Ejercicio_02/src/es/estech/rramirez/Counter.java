package es.estech.rramirez;

public class Counter {
    protected int limit;
    protected int element;

    public Counter() {
        this.limit = 9;
        this.element = 5;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }
}
