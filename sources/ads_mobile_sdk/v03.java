package ads_mobile_sdk;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;
import saneness.amphitheatre;
import saneness.neurotropism;

/* JADX INFO: loaded from: classes.dex */
public final class v03 {
    public final gf0 a;
    public final neurotropism b;
    public final amphitheatre c;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public long e = -1;
    public long f = -1;
    public Throwable g = null;

    public v03(gf0 gf0Var, amphitheatre amphitheatreVar, neurotropism neurotropismVar) {
        this.a = gf0Var;
        this.b = neurotropismVar;
        this.c = amphitheatreVar;
    }

    public final void a() {
        if (this.d.getAndSet(true)) {
            throw new IllegalStateException("Finished trace.");
        }
        this.c.getClass();
        this.f = SystemClock.uptimeMillis();
        ((kc1) this.b).a(this.a.a, this.d.get() ? this.f - this.e : -1L, this.g, null);
    }

    public final void b() {
        if (this.d.get()) {
            throw new IllegalStateException("Finished trace.");
        }
        this.c.getClass();
        this.e = SystemClock.uptimeMillis();
    }

    public final void a(Throwable th) {
        if (!this.d.get()) {
            this.g = th;
            return;
        }
        throw new IllegalStateException("Finished trace.");
    }
}
