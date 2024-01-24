package cz.spsmb.sec.generics;

public class TwoNumbersPrinter<T extends Number, V extends Number> {

    T attribute;
    V attribute2;

    public TwoNumbersPrinter(T attribute, V attribute2) {
        this.attribute = attribute;
        this.attribute2 = attribute2;
    }

    public void print() {
        System.out.println("Zadané atributy jsou: " + attribute + ", " + attribute2);
    }

    public Number plus() {
        return attribute.doubleValue() + attribute2.doubleValue();
    }
}
