package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class SY {
    public static final long d = TimeUnit.HOURS.toMillis(24);
    public static final long e = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Yg0 f3719a;
    public long b;
    public int c;

    public SY() {
        if (C2498In.b == null) {
            Pattern pattern = Yg0.c;
            C2498In.b = new C2498In(4);
        }
        C2498In c2498In = C2498In.b;
        if (Yg0.d == null) {
            Yg0.d = new Yg0(c2498In);
        }
        this.f3719a = Yg0.d;
    }

    public final synchronized long a(int i) {
        try {
            if (i != 429 && (i < 500 || i >= 600)) {
                return d;
            }
            double dPow = Math.pow(2.0d, this.c);
            this.f3719a.getClass();
            return (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), e);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001b  */
    public final synchronized boolean b() {
        boolean z;
        if (this.c != 0) {
            this.f3719a.f4032a.getClass();
            if (System.currentTimeMillis() > this.b) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        return z;
    }

    public final synchronized void c() {
        this.c = 0;
    }

    public final synchronized void d(int i) {
        try {
            if ((i >= 200 && i < 300) || i == 401 || i == 404) {
                c();
                return;
            }
            this.c++;
            long jA = a(i);
            this.f3719a.f4032a.getClass();
            this.b = System.currentTimeMillis() + jA;
        } catch (Throwable th) {
            throw th;
        }
    }
}
