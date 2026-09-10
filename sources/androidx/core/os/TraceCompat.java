package androidx.core.os;

import android.os.Build;
import android.os.Trace;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class TraceCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4357a = 0;

    public static class Api29Impl {
        public static void a(String str, int i2) {
            Trace.beginAsyncSection(str, i2);
        }

        public static void b(String str, int i2) {
            Trace.endAsyncSection(str, i2);
        }

        public static boolean c() {
            return Trace.isEnabled();
        }

        public static void d(String str, long j) {
            Trace.setCounter(str, j);
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e2) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e2);
            }
        }
    }
}
