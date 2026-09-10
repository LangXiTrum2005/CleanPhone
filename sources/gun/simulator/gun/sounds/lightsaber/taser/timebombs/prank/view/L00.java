package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class L00 implements K00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J00 f3333a;
    public InterfaceC4326pd0 b;
    public long c = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    public long d = 0;
    public int e = -1;

    public L00(J00 j00) {
        this.f3333a = j00;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K00
    public final void a(InterfaceC4353pt interfaceC4353pt, int i) {
        InterfaceC4326pd0 interfaceC4326pd0Track = interfaceC4353pt.track(i, 1);
        this.b = interfaceC4326pd0Track;
        interfaceC4326pd0Track.e(this.f3333a.c);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K00
    public final void b(long j) {
        this.c = j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K00
    public final void c(int i, long j, JT jt, boolean z) {
        this.b.getClass();
        int i2 = this.e;
        if (i2 != -1 && i != G00.a(i2)) {
            int i3 = Ug0.f3833a;
            Locale locale = Locale.US;
        }
        long jI0 = FW.i0(this.d, j, this.c, this.f3333a.b);
        int iA = jt.a();
        this.b.d(iA, jt);
        this.b.a(jI0, 1, iA, 0, null);
        this.e = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K00
    public final void seek(long j, long j2) {
        this.c = j;
        this.d = j2;
    }
}
