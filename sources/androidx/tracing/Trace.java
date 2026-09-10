package androidx.tracing;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class Trace {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f8394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f8395b;

    public static boolean a() {
        try {
            if (f8395b == null) {
                return android.os.Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f8395b == null) {
                f8394a = android.os.Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f8395b = android.os.Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f8395b.invoke(null, Long.valueOf(f8394a))).booleanValue();
        } catch (Exception e2) {
            if (!(e2 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e2);
                return false;
            }
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }
}
