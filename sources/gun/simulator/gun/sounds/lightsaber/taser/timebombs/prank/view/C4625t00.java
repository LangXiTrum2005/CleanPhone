package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.t00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4625t00 implements K00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J00 f5009a;
    public final Uh0 b = new Uh0();
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public long g;
    public InterfaceC4326pd0 h;
    public long i;

    public C4625t00(J00 j00) {
        this.f5009a = j00;
        this.c = j00.b;
        String str = (String) j00.d.get("mode");
        str.getClass();
        if (FW.C(str, "AAC-hbr")) {
            this.d = 13;
            this.e = 3;
        } else {
            if (!FW.C(str, "AAC-lbr")) {
                throw new UnsupportedOperationException("AAC mode not supported");
            }
            this.d = 6;
            this.e = 2;
        }
        this.f = this.e + this.d;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K00
    public final void a(InterfaceC4353pt interfaceC4353pt, int i) {
        InterfaceC4326pd0 interfaceC4326pd0Track = interfaceC4353pt.track(i, 1);
        this.h = interfaceC4326pd0Track;
        interfaceC4326pd0Track.e(this.f5009a.c);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K00
    public final void b(long j) {
        this.g = j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K00
    public final void c(int i, long j, JT jt, boolean z) {
        this.h.getClass();
        short sQ = jt.q();
        int i2 = sQ / this.f;
        long jI0 = FW.i0(this.i, j, this.g, this.c);
        Uh0 uh0 = this.b;
        uh0.n(jt);
        int i3 = this.e;
        int i4 = this.d;
        if (i2 == 1) {
            int i5 = uh0.i(i4);
            uh0.s(i3);
            this.h.d(jt.a(), jt);
            if (z) {
                this.h.a(jI0, 1, i5, 0, null);
                return;
            }
            return;
        }
        jt.F((sQ + 7) / 8);
        long jR = jI0;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = uh0.i(i4);
            uh0.s(i3);
            this.h.d(i7, jt);
            this.h.a(jR, 1, i7, 0, null);
            jR += Ug0.R(i2, 1000000L, this.c);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K00
    public final void seek(long j, long j2) {
        this.g = j;
        this.i = j2;
    }
}
