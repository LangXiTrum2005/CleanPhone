package p002kotlin.jvm.internal;

import java.util.Arrays;
import p002kotlin.KotlinNullPointerException;
import p002kotlin.UninitializedPropertyAccessException;

/* JADX INFO: loaded from: classes5.dex */
public class Intrinsics {

    public static class attabal {
    }

    public static void adultoid(String str) {
        throw ((NullPointerException) triweekly(new NullPointerException(apical(str))));
    }

    public static String apical(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = Intrinsics.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    public static String arytenoidectomy(String str, Object obj) {
        return str + obj;
    }

    public static boolean attabal(Double d, double d2) {
        return d != null && d.doubleValue() == d2;
    }

    public static void beachfront(Object obj) {
        if (obj == null) {
            monoploid();
        }
    }

    public static void checkNotNullExpressionValue(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) triweekly(new NullPointerException(str + " must not be null")));
    }

    public static void checkNotNullParameter(Object obj, String str) {
        if (obj == null) {
            adultoid(str);
        }
    }

    public static void competently(Object obj, String str) {
        if (obj == null) {
            polloi(str);
        }
    }

    public static int cutely(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static boolean dern(Float f, Float f2) {
        if (f == null) {
            return f2 == null;
        }
        return f2 != null && f.floatValue() == f2.floatValue();
    }

    public static void dovishness() {
        gintrap("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void formularize() {
        dovishness();
    }

    public static void gintrap(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void graveside(String str) {
        throw ((IllegalArgumentException) triweekly(new IllegalArgumentException(apical(str))));
    }

    public static void impassible(int i, String str) {
        dovishness();
    }

    public static void impromptu(Object obj, String str) {
        if (obj == null) {
            graveside(str);
        }
    }

    public static <T extends Throwable> T kowloon(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    public static void marial(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) triweekly(new IllegalStateException(str + " must not be null")));
    }

    public static void molybdenite() {
        throw ((KotlinNullPointerException) triweekly(new KotlinNullPointerException()));
    }

    public static void monoploid() {
        throw ((NullPointerException) triweekly(new NullPointerException()));
    }

    public static void polloi(String str) {
        throw ((NullPointerException) triweekly(new NullPointerException(str)));
    }

    public static void preprohormone(String str) {
        rotuma("lateinit property " + str + " has not been initialized");
    }

    public static void rotuma(String str) {
        throw ((UninitializedPropertyAccessException) triweekly(new UninitializedPropertyAccessException(str)));
    }

    public static boolean saneness(Float f, float f2) {
        return f != null && f.floatValue() == f2;
    }

    public static int taiyuan(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static <T extends Throwable> T triweekly(T t) {
        return (T) kowloon(t, Intrinsics.class.getName());
    }

    public static boolean wireman(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }
}
