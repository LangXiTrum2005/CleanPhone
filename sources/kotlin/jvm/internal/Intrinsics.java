package kotlin.jvm.internal;

import android.support.v4.media.a;
import com.thinkup.core.common.n.mo;
import java.util.Arrays;
import kotlin.UninitializedPropertyAccessException;

/* JADX INFO: loaded from: classes7.dex */
public class Intrinsics {

    public static class Kotlin {
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static void b(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(str.concat(" must not be null"));
        j(illegalStateException, Intrinsics.class.getName());
        throw illegalStateException;
    }

    public static void c(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        j(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        j(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    public static void e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(a.m(str, " must not be null"));
        j(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    public static void f(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(i(str));
        j(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    public static void g(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(i(str));
        j(illegalArgumentException, Intrinsics.class.getName());
        throw illegalArgumentException;
    }

    public static int h(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    public static String i(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = Intrinsics.class.getName();
        int i2 = 0;
        while (!stackTrace[i2].getClassName().equals(name)) {
            i2++;
        }
        while (stackTrace[i2].getClassName().equals(name)) {
            i2++;
        }
        StackTraceElement stackTraceElement = stackTrace[i2];
        StringBuilder sbQ = androidx.datastore.preferences.protobuf.a.q("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), mo.ono, stackTraceElement.getMethodName(), ", parameter ");
        sbQ.append(str);
        return sbQ.toString();
    }

    public static void j(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
    }

    public static String k(Object obj, String str) {
        return str + obj;
    }

    public static void l() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void m(String str) {
        UninitializedPropertyAccessException uninitializedPropertyAccessException = new UninitializedPropertyAccessException(a.n("lateinit property ", str, " has not been initialized"));
        j(uninitializedPropertyAccessException, Intrinsics.class.getName());
        throw uninitializedPropertyAccessException;
    }
}
