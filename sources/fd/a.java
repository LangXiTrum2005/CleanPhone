package fd;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile a f40787c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f40788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f40789b = false;

    public a() {
        b bVar;
        synchronized (b.class) {
            try {
                if (b.f40790b == null) {
                    b.f40790b = new b(0);
                }
                bVar = b.f40790b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f40788a = bVar;
    }

    public static a d() {
        if (f40787c == null) {
            synchronized (a.class) {
                try {
                    if (f40787c == null) {
                        f40787c = new a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f40787c;
    }

    public final void a(String str) {
        if (this.f40789b) {
            this.f40788a.getClass();
            Log.d("FirebasePerformance", str);
        }
    }

    public final void b(String str, Object... objArr) {
        if (this.f40789b) {
            String str2 = String.format(Locale.ENGLISH, str, objArr);
            this.f40788a.getClass();
            Log.d("FirebasePerformance", str2);
        }
    }

    public final void c(String str, Object... objArr) {
        if (this.f40789b) {
            String str2 = String.format(Locale.ENGLISH, str, objArr);
            this.f40788a.getClass();
            Log.e("FirebasePerformance", str2);
        }
    }

    public final void e(String str, Object... objArr) {
        if (this.f40789b) {
            String str2 = String.format(Locale.ENGLISH, str, objArr);
            this.f40788a.getClass();
            Log.i("FirebasePerformance", str2);
        }
    }

    public final void f(String str) {
        if (this.f40789b) {
            this.f40788a.getClass();
            Log.w("FirebasePerformance", str);
        }
    }

    public final void g(String str, Object... objArr) {
        if (this.f40789b) {
            String str2 = String.format(Locale.ENGLISH, str, objArr);
            this.f40788a.getClass();
            Log.w("FirebasePerformance", str2);
        }
    }
}
