package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Handler;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Tm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2782Tm implements InterfaceC3208cq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3031aq f3791a;
    public InterfaceC2889Xp b;
    public boolean c;
    public final /* synthetic */ com.google.android.exoplayer2.drm.b d;

    public C2782Tm(com.google.android.exoplayer2.drm.b bVar, C3031aq c3031aq) {
        this.d = bVar;
        this.f3791a = c3031aq;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3208cq
    public final void e() {
        Handler handler = this.d.t;
        handler.getClass();
        Ug0.P(handler, new RunnableC2928Zc(this, 8));
    }
}
