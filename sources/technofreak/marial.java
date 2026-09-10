package technofreak;

import java.util.Objects;

/* JADX INFO: compiled from: ObjectsCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class marial {
    public static boolean attabal(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static <T> T dern(T t) {
        t.getClass();
        return t;
    }

    public static String marial(Object obj, String str) {
        return obj != null ? obj.toString() : str;
    }

    public static int saneness(Object... objArr) {
        return Objects.hash(objArr);
    }

    public static <T> T wireman(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
