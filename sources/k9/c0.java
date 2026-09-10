package k9;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f44399a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f44400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f44401c;

    public static void a(String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void b(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 35 + 1);
            d5.u.r(sb2, "Must be called on ", name2, " thread, but got ", name);
            sb2.append(".");
            throw new IllegalStateException(sb2.toString());
        }
    }

    public static void d(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void e(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public static void f(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void g(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void h(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    public static void i(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void j(String str, boolean z10) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void k(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static j9.e m(Status status) {
        return status.f11656c != null ? new j9.n(status) : new j9.e(status);
    }
}
