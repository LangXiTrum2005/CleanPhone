package claque;

import android.os.Build;
import android.os.Trace;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: TraceCompat.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class impassible {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static long f15626attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static Method f15627dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static Method f15628marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static Method f15629saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static Method f15630wireman;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f15626attabal = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f15629saneness = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f15627dern = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f15630wireman = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f15628marial = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception unused) {
            }
        }
    }

    public static void attabal(String str) {
        Trace.beginSection(str);
    }

    public static void saneness() {
        Trace.endSection();
    }
}
