package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.u00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4713u00 implements K00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J00 f5059a;
    public InterfaceC4326pd0 c;
    public int d;
    public long f;
    public long g;
    public final Uh0 b = new Uh0();
    public long e = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;

    public C4713u00(J00 j00) {
        this.f5059a = j00;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K00
    public final void a(InterfaceC4353pt interfaceC4353pt, int i) {
        InterfaceC4326pd0 interfaceC4326pd0Track = interfaceC4353pt.track(i, 1);
        this.c = interfaceC4326pd0Track;
        interfaceC4326pd0Track.e(this.f5059a.c);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K00
    public final void b(long j) {
        FW.s(this.e == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
        this.e = j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K00
    public final void c(int i, long j, JT jt, boolean z) {
        int iT = jt.t() & 3;
        int iT2 = jt.t() & 255;
        long jI0 = FW.i0(this.g, j, this.e, this.f5059a.b);
        if (iT != 0) {
            if (iT == 1 || iT == 2) {
                int i2 = this.d;
                if (i2 > 0) {
                    InterfaceC4326pd0 interfaceC4326pd0 = this.c;
                    int i3 = Ug0.f3833a;
                    interfaceC4326pd0.a(this.f, 1, i2, 0, null);
                    this.d = 0;
                }
            } else if (iT != 3) {
                throw new IllegalArgumentException(String.valueOf(iT));
            }
            int iA = jt.a();
            InterfaceC4326pd0 interfaceC4326pd1 = this.c;
            interfaceC4326pd1.getClass();
            interfaceC4326pd1.d(iA, jt);
            int i4 = this.d + iA;
            this.d = i4;
            this.f = jI0;
            if (z && iT == 3) {
                InterfaceC4326pd0 interfaceC4326pd2 = this.c;
                int i5 = Ug0.f3833a;
                interfaceC4326pd2.a(jI0, 1, i4, 0, null);
                this.d = 0;
                return;
            }
            return;
        }
        int i6 = this.d;
        if (i6 > 0) {
            InterfaceC4326pd0 interfaceC4326pd3 = this.c;
            int i7 = Ug0.f3833a;
            interfaceC4326pd3.a(this.f, 1, i6, 0, null);
            this.d = 0;
        }
        if (iT2 == 1) {
            int iA2 = jt.a();
            InterfaceC4326pd0 interfaceC4326pd4 = this.c;
            interfaceC4326pd4.getClass();
            interfaceC4326pd4.d(iA2, jt);
            InterfaceC4326pd0 interfaceC4326pd5 = this.c;
            int i8 = Ug0.f3833a;
            interfaceC4326pd5.a(jI0, 1, iA2, 0, null);
            return;
        }
        byte[] bArr = jt.f3266a;
        Uh0 uh0 = this.b;
        uh0.getClass();
        uh0.o(bArr, bArr.length);
        uh0.t(2);
        long j2 = jI0;
        for (int i9 = 0; i9 < iT2; i9++) {
            C3219d0 c3219d0J = WD.J(uh0);
            InterfaceC4326pd0 interfaceC4326pd6 = this.c;
            interfaceC4326pd6.getClass();
            interfaceC4326pd6.d(c3219d0J.e, jt);
            InterfaceC4326pd0 interfaceC4326pd7 = this.c;
            int i10 = Ug0.f3833a;
            interfaceC4326pd7.a(j2, 1, c3219d0J.e, 0, null);
            j2 += ((long) (c3219d0J.f / c3219d0J.c)) * 1000000;
            uh0.t(c3219d0J.e);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K00
    public final void seek(long j, long j2) {
        this.e = j;
        this.g = j2;
    }
}
