package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.logging.Level;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.qb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC4410qb0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4497rb0 f4888a;

    public RunnableC4410qb0(C4497rb0 c4497rb0) {
        this.f4888a = c4497rb0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC3882kb0 abstractC3882kb0C;
        long jNanoTime;
        while (true) {
            C4497rb0 c4497rb0 = this.f4888a;
            synchronized (c4497rb0) {
                abstractC3882kb0C = c4497rb0.c();
            }
            if (abstractC3882kb0C == null) {
                return;
            }
            C4234ob0 c4234ob0 = abstractC3882kb0C.c;
            AbstractC2995aW.n(c4234ob0);
            C4497rb0 c4497rb1 = this.f4888a;
            boolean zIsLoggable = C4497rb0.i.isLoggable(Level.FINE);
            if (zIsLoggable) {
                c4234ob0.f4794a.f4936a.getClass();
                jNanoTime = System.nanoTime();
                AbstractC2871Wx.M(abstractC3882kb0C, c4234ob0, "starting");
            } else {
                jNanoTime = -1;
            }
            try {
                C4497rb0.a(c4497rb1, abstractC3882kb0C);
                if (zIsLoggable) {
                    c4234ob0.f4794a.f4936a.getClass();
                    AbstractC2871Wx.M(abstractC3882kb0C, c4234ob0, AbstractC2995aW.v0(AbstractC2871Wx.a0(System.nanoTime() - jNanoTime), "finished run in "));
                }
            } catch (Throwable th) {
                try {
                    C4322pb0 c4322pb0 = c4497rb1.f4936a;
                    c4322pb0.getClass();
                    c4322pb0.f4840a.execute(this);
                    throw th;
                } catch (Throwable th2) {
                    if (zIsLoggable) {
                        c4234ob0.f4794a.f4936a.getClass();
                        AbstractC2871Wx.M(abstractC3882kb0C, c4234ob0, AbstractC2995aW.v0(AbstractC2871Wx.a0(System.nanoTime() - jNanoTime), "failed a run in "));
                    }
                    throw th2;
                }
            }
        }
    }
}
