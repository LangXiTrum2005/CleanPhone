package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.SystemClock;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Dm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2367Dm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2419Fm f2989a;

    public final void a(int i) {
        C2419Fm c2419Fm = this.f2989a;
        synchronized (c2419Fm) {
            int i2 = c2419Fm.i;
            if (i2 == 0 || c2419Fm.e) {
                if (i2 == i) {
                    return;
                }
                c2419Fm.i = i;
                if (i != 1 && i != 0 && i != 8) {
                    c2419Fm.l = c2419Fm.b(i);
                    ((Oa0) c2419Fm.d).getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    c2419Fm.c(c2419Fm.f > 0 ? (int) (jElapsedRealtime - c2419Fm.g) : 0, c2419Fm.h, c2419Fm.l);
                    c2419Fm.g = jElapsedRealtime;
                    c2419Fm.h = 0L;
                    c2419Fm.k = 0L;
                    c2419Fm.j = 0L;
                    M70 m70 = c2419Fm.c;
                    m70.b.clear();
                    m70.d = -1;
                    m70.e = 0;
                    m70.f = 0;
                }
            }
        }
    }
}
