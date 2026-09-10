package ads_mobile_sdk;

import saneness.empress;

/* JADX INFO: loaded from: classes.dex */
abstract class sb {
    private static boolean a = false;
    static boolean b = false;
    private static final Class<?> c;
    private static final boolean d;

    static {
        c = a ? empress.class : a("libcore.io.Memory");
        d = (a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean b() {
        if (a) {
            return true;
        }
        return (c == null || d) ? false : true;
    }

    public static Class<?> a() {
        return c;
    }
}
