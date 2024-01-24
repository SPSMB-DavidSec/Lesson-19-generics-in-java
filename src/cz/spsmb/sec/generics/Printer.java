package cz.spsmb.sec.generics;

public class Printer<T> {

    T attribute;

    public Printer(T attribute) {
        this.attribute = attribute;
    }

    public void print() {
        System.out.println("Zadaný atribut je: " + attribute);
    }
}
