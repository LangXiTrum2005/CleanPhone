package ferrovanadium;

import android.os.Build;
import android.os.Trace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: Trace.java */
/* JADX INFO: loaded from: classes.dex */
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static long f26264attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static Method f26265saneness;

    public static void attabal(String str) {
        saneness.attabal(beachfront(str));
    }

    public static String beachfront(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    public static void dern(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static boolean marial() {
        try {
            if (f26265saneness == null) {
                f26264attabal = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f26265saneness = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f26265saneness.invoke(null, Long.valueOf(f26264attabal))).booleanValue();
        } catch (Exception e) {
            dern("isTagEnabled", e);
            return false;
        }
    }

    public static void saneness() {
        saneness.saneness();
    }

    public static boolean wireman() {
        return Build.VERSION.SDK_INT >= 29 ? dern.attabal() : marial();
    }
}
