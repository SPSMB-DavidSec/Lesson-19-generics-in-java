package cz.spsmb.sec.generics;

import cz.spsmb.sec.generics.utils.DateTimeUtils;
import cz.spsmb.sec.generics.utils.MathUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(10);
        printer.print();
        printer = new Printer(10.0f);
        printer.print();
        printer = new Printer(10.0d);
        printer.print();
        printer = new Printer("Hello world");
        printer.print();
        printer = new Printer(LocalDateTime.now());
        printer.print();

        TwoParamsPrinter<String, Integer> twoParamsPrinter = new TwoParamsPrinter<>("Hello", 10);
        twoParamsPrinter.print();

        TwoNumbersPrinter<Integer, Double> twoNumbersPrinter = new TwoNumbersPrinter<>(12, 2.1d);
        twoNumbersPrinter.print();
        System.out.println(twoNumbersPrinter.plus());

        TwoNumbersPrinter<Long, Float> twoNumbersPrinter2 = new TwoNumbersPrinter<>(10L, 10.2f);
        twoNumbersPrinter2.print();
        System.out.println(twoNumbersPrinter2.plus());

        Double d = MathUtils.plus2(10.0d, 110.0d, 14.1d, 100.3d);
        System.out.println(d);

        Double[] numbers = MathUtils.divide(2, 10.0d, 110.0d, 14.1d, 100.3d);
        for (Double n : numbers) {
            System.out.println(n);
        }

        System.out.println(MathUtils.plus(10, 10));
        System.out.println(MathUtils.plus(10f, 10f));
        System.out.println(MathUtils.plus(10d, 10f));
        System.out.println(MathUtils.plus(10L, 10f));
        System.out.println(MathUtils.plus(10L, 10d));

        Number[] num = MathUtils.divide2(2f, 10.0d, 110.0f, 17, 14L, 100.3d);

        System.out.println(DateTimeUtils.format(LocalDateTime.now()));
        System.out.println(DateTimeUtils.format(ZonedDateTime.now()));
        System.out.println(DateTimeUtils.format(LocalDate.now()));
        System.out.println(DateTimeUtils.format(LocalTime.now()));

    }
}
