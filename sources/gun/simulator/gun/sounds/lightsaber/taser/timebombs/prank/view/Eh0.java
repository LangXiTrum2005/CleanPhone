package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Eh0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Gh0 f3033a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;

    public /* synthetic */ Eh0(Gh0 gh0, Surface surface, long j) {
        this.f3033a = gh0;
        this.b = surface;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Gh0 gh0 = this.f3033a;
        gh0.getClass();
        int i = Ug0.f3833a;
        C2736Rs c2736Rs = ((SurfaceHolderCallbackC2658Os) gh0.b).f3526a;
        C4167nm c4167nm = (C4167nm) c2736Rs.q;
        C3403f4 c3403f4M = c4167nm.M();
        Object obj = this.b;
        c4167nm.N(c3403f4M, 26, new C5035xg0(c3403f4M, obj, this.c));
        if (c2736Rs.P == obj) {
            c2736Rs.l.e(26, new Nd0(22));
        }
    }
}
