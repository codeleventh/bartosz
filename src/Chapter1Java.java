import java.util.function.Function;

public class Chapter1Java {
    public static <T> T id(T o) {
        return o;
    }

    public static <I, R, O> Function<I, O> compose(Function<R, O> f, Function<I, R> g) {
        return (I x) -> f.apply(g.apply(x));
    }
}
