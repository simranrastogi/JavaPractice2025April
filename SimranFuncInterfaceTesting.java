

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SimranFuncInterfaceTesting {
    public SimranFuncInterfaceTesting() {
    }

    public static void main(String[] args) {
        Predicate<String> ref = (x) -> {
            return x.startsWith("x");
        };
        Boolean b = ref.test("vikas");
        Boolean b1 = ref.test("xmas");
        System.out.println(b1);
        System.out.println(b);
        Function<String, Integer> ref1 = (s) -> {
            return s.length();
        };
        Integer i = (Integer)ref1.apply("my name is khan");
        System.out.println(i);
        BiFunction<Integer, Integer, Integer> ref2 = (x, y) -> {
            return x + y;
        };
        Integer iapp = (Integer)ref2.apply(3, 4);
        System.out.println(iapp);
        Supplier<Integer> supplier = () -> {
            return 5;
        };
        Integer supp = (Integer)supplier.get();
        System.out.println(supp);
        Consumer<String> consumer = (s) -> {
            System.out.println(s);
        };
        consumer.accept("hello java");
    }
}
