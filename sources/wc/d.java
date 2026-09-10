package wc;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import uc.j;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f53164d = TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f53165e = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f53166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f53167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f53168c;

    public d() {
        if (v1.j.f52330b == null) {
            Pattern pattern = j.f52002c;
            v1.j.f52330b = new v1.j(9);
        }
        v1.j jVar = v1.j.f52330b;
        if (j.f52003d == null) {
            j.f52003d = new j(jVar);
        }
        this.f53166a = j.f52003d;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001b  */
    public final synchronized boolean a() {
        boolean z10;
        if (this.f53168c != 0) {
            this.f53166a.f52004a.getClass();
            if (System.currentTimeMillis() > this.f53167b) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = true;
        }
        return z10;
    }

    public final synchronized void b(int i10) {
        long jMin;
        if ((i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404) {
            synchronized (this) {
                this.f53168c = 0;
            }
            return;
        }
        this.f53168c++;
        synchronized (this) {
            try {
                if (i10 == 429 || (i10 >= 500 && i10 < 600)) {
                    double dPow = Math.pow(2.0d, this.f53168c);
                    this.f53166a.getClass();
                    jMin = (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), f53165e);
                } else {
                    jMin = f53164d;
                }
                this.f53166a.f52004a.getClass();
                this.f53167b = System.currentTimeMillis() + jMin;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return;
        throw th;
    }
}
