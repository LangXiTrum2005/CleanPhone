package androidx.media3.common.util;

import android.text.TextUtils;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes.dex */
public final class Log {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f5649a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f5650b = Logger.f5651a;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface LogLevel {
    }

    public interface Logger {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Logger f5651a = new AnonymousClass1();

        /* JADX INFO: renamed from: androidx.media3.common.util.Log$Logger$1, reason: invalid class name */
        public class AnonymousClass1 implements Logger {
        }
    }

    public static String a(String str, Throwable th) {
        String strE = e(th);
        if (TextUtils.isEmpty(strE)) {
            return str;
        }
        StringBuilder sbX = android.support.v4.media.a.x(str, "\n  ");
        sbX.append(strE.replace(IOUtils.LINE_SEPARATOR_UNIX, "\n  "));
        sbX.append('\n');
        return sbX.toString();
    }

    public static void b(String str, String str2) {
        synchronized (f5649a) {
            android.util.Log.d(str, a(str2, null));
        }
    }

    public static void c(String str, String str2) {
        synchronized (f5649a) {
            android.util.Log.e(str, a(str2, null));
        }
    }

    public static void d(String str, String str2, Throwable th) {
        synchronized (f5649a) {
            android.util.Log.e(str, a(str2, th));
        }
    }

    public static String e(Throwable th) {
        boolean z2;
        if (th == null) {
            return null;
        }
        synchronized (f5649a) {
            Throwable cause = th;
            while (true) {
                if (cause == null) {
                    z2 = false;
                    break;
                }
                try {
                    if (cause instanceof UnknownHostException) {
                        z2 = true;
                        break;
                    }
                    cause = cause.getCause();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z2) {
                return "UnknownHostException (no network)";
            }
            return android.util.Log.getStackTraceString(th).trim().replace("\t", "    ");
        }
    }

    public static void f(String str, String str2) {
        synchronized (f5649a) {
            android.util.Log.i(str, a(str2, null));
        }
    }

    public static void g(String str, String str2) {
        synchronized (f5649a) {
            android.util.Log.w(str, a(str2, null));
        }
    }

    public static void h(String str, String str2, Throwable th) {
        synchronized (f5649a) {
            android.util.Log.w(str, a(str2, th));
        }
    }
}
