package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.j9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3763j9 implements InterfaceC4429ql {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4540a;
    public final ArrayList b = new ArrayList(1);
    public int c;
    public C4868vl d;

    public AbstractC3763j9(boolean z) {
        this.f4540a = z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public final void c(Bd0 bd0) {
        bd0.getClass();
        ArrayList arrayList = this.b;
        if (arrayList.contains(bd0)) {
            return;
        }
        arrayList.add(bd0);
        this.c++;
    }

    public final void g(int i) {
        C4868vl c4868vl = this.d;
        int i2 = Ug0.f3833a;
        for (int i3 = 0; i3 < this.c; i3++) {
            Bd0 bd0 = (Bd0) this.b.get(i3);
            boolean z = this.f4540a;
            C2419Fm c2419Fm = (C2419Fm) bd0;
            synchronized (c2419Fm) {
                C3965lY c3965lY = C2419Fm.n;
                if (z && (c4868vl.i & 8) != 8) {
                    c2419Fm.h += (long) i;
                }
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public Map getResponseHeaders() {
        return Collections.emptyMap();
    }

    public final void h() {
        C4868vl c4868vl = this.d;
        int i = Ug0.f3833a;
        for (int i2 = 0; i2 < this.c; i2++) {
            Bd0 bd0 = (Bd0) this.b.get(i2);
            boolean z = this.f4540a;
            C2419Fm c2419Fm = (C2419Fm) bd0;
            synchronized (c2419Fm) {
                try {
                    C3965lY c3965lY = C2419Fm.n;
                    if (z && (c4868vl.i & 8) != 8) {
                        FW.s(c2419Fm.f > 0);
                        ((Oa0) c2419Fm.d).getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        int i3 = (int) (jElapsedRealtime - c2419Fm.g);
                        c2419Fm.j += (long) i3;
                        long j = c2419Fm.k;
                        long j2 = c2419Fm.h;
                        c2419Fm.k = j + j2;
                        if (i3 > 0) {
                            c2419Fm.c.a((int) Math.sqrt(j2), (j2 * 8000.0f) / i3);
                            if (c2419Fm.j >= 2000 || c2419Fm.k >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                                c2419Fm.l = (long) c2419Fm.c.b();
                            }
                            c2419Fm.c(i3, c2419Fm.h, c2419Fm.l);
                            c2419Fm.g = jElapsedRealtime;
                            c2419Fm.h = 0L;
                        }
                        c2419Fm.f--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.d = null;
    }

    public final void i() {
        for (int i = 0; i < this.c; i++) {
            ((Bd0) this.b.get(i)).getClass();
        }
    }

    public final void j(C4868vl c4868vl) {
        this.d = c4868vl;
        for (int i = 0; i < this.c; i++) {
            Bd0 bd0 = (Bd0) this.b.get(i);
            boolean z = this.f4540a;
            C2419Fm c2419Fm = (C2419Fm) bd0;
            synchronized (c2419Fm) {
                try {
                    C3965lY c3965lY = C2419Fm.n;
                    if (z && (c4868vl.i & 8) != 8) {
                        if (c2419Fm.f == 0) {
                            ((Oa0) c2419Fm.d).getClass();
                            c2419Fm.g = SystemClock.elapsedRealtime();
                        }
                        c2419Fm.f++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
