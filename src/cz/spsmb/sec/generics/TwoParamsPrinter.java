package cz.spsmb.sec.generics;

public class TwoParamsPrinter<T, V> {

    T attribute;
    V attribute2;

    public TwoParamsPrinter(T attribute, V attribute2) {
        this.attribute = attribute;
        this.attribute2 = attribute2;
    }

    public void print() {
        System.out.println("Zadané atributy jsou: " + attribute + ", " + attribute2);
    }
}
