package dd;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final fd.a f38830c = fd.a.d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static w f38831d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile SharedPreferences f38832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f38833b;

    public w(ExecutorService executorService) {
        this.f38833b = executorService;
    }

    public static Context a() {
        try {
            mb.g.e();
            mb.g gVarE = mb.g.e();
            gVarE.a();
            return gVarE.f45928a;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public static synchronized w b() {
        try {
            if (f38831d == null) {
                f38831d = new w(Executors.newSingleThreadExecutor());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f38831d;
    }

    public final synchronized void c(Context context) {
        if (this.f38832a == null && context != null) {
            this.f38833b.execute(new com.unity3d.services.ads.operation.show.b(4, this, context));
        }
    }

    public final void d(long j10, String str) {
        if (this.f38832a == null) {
            c(a());
            if (this.f38832a == null) {
                return;
            }
        }
        this.f38832a.edit().putLong(str, j10).apply();
    }

    public final void e(String str, double d10) {
        if (this.f38832a == null) {
            c(a());
            if (this.f38832a == null) {
                return;
            }
        }
        this.f38832a.edit().putLong(str, Double.doubleToRawLongBits(d10)).apply();
    }

    public final void f(String str, String str2) {
        if (this.f38832a == null) {
            c(a());
            if (this.f38832a == null) {
                return;
            }
        }
        if (str2 == null) {
            this.f38832a.edit().remove(str).apply();
        } else {
            this.f38832a.edit().putString(str, str2).apply();
        }
    }

    public final void g(String str, boolean z10) {
        if (this.f38832a == null) {
            c(a());
            if (this.f38832a == null) {
                return;
            }
        }
        this.f38832a.edit().putBoolean(str, z10).apply();
    }
}
