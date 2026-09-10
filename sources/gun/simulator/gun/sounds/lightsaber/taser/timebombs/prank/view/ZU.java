package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class ZU {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final YU f4072a;
    public final XU b;
    public final InterfaceC2412Ff c;
    public int d;
    public Object e;
    public final Looper f;
    public boolean g;
    public boolean h;
    public boolean i;

    public ZU(C2918Ys c2918Ys, YU yu, Gc0 gc0, int i, InterfaceC2412Ff interfaceC2412Ff, Looper looper) {
        this.b = c2918Ys;
        this.f4072a = yu;
        this.f = looper;
        this.c = interfaceC2412Ff;
    }

    public final synchronized void a(long j) {
        boolean z;
        FW.s(this.g);
        FW.s(this.f.getThread() != Thread.currentThread());
        ((Oa0) this.c).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        while (true) {
            z = this.i;
            if (z || j <= 0) {
                break;
            }
            this.c.getClass();
            wait(j);
            ((Oa0) this.c).getClass();
            j = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void b(boolean z) {
        this.h = z | this.h;
        this.i = true;
        notifyAll();
    }

    public final void c() {
        FW.s(!this.g);
        this.g = true;
        C2918Ys c2918Ys = (C2918Ys) this.b;
        synchronized (c2918Ys) {
            if (!c2918Ys.y && c2918Ys.j.getThread().isAlive()) {
                c2918Ys.h.a(14, this).b();
                return;
            }
            AbstractC4038mJ.f();
            b(false);
        }
    }
}
