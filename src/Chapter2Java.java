import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Chapter2Java {
    public class Memoizer<I, O> {
        Map<I, O> map = new HashMap<>();

        void put(I key, O val) {
            if (!map.containsKey(key))
                map.put(key, val);
        }

        O get(I key) {
            return map.getOrDefault(key, null);
        }

        public O memoize(Function<I, O> fun, I arg) {
            O ans = get(null);
            if (ans != null)
                return ans;
            else {
                ans = fun.apply(arg);
                put((I)arg, (O)ans);
                return ans;
            }
        }

    }
}
