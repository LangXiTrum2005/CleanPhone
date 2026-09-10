package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes2.dex */
public final class C00 implements K00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J00 f2902a;
    public final int b;
    public InterfaceC4326pd0 c;
    public long d;
    public int e;
    public int f;
    public long g;
    public long h;

    public C00(J00 j00) {
        this.f2902a = j00;
        try {
            this.b = d(j00.d);
            this.d = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            this.e = -1;
            this.f = 0;
            this.g = 0L;
            this.h = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        } catch (KT e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int d(FC fc) throws KT {
        String str = (String) fc.get("config");
        int i = 0;
        i = 0;
        if (str != null && str.length() % 2 == 0) {
            Uh0 uh0 = new Uh0(Ug0.q(str), 2, (Object) null);
            int i2 = uh0.i(1);
            if (i2 != 0) {
                throw new KT(AbstractC3950lJ.p("unsupported audio mux version: ", i2), null, true, 0);
            }
            FW.i(uh0.i(1) == 1, "Only supports allStreamsSameTimeFraming.");
            int i3 = uh0.i(6);
            FW.i(uh0.i(4) == 0, "Only suppors one program.");
            FW.i(uh0.i(3) == 0, "Only suppors one layer.");
            i = i3;
        }
        return i + 1;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K00
    public final void a(InterfaceC4353pt interfaceC4353pt, int i) {
        InterfaceC4326pd0 interfaceC4326pd0Track = interfaceC4353pt.track(i, 2);
        this.c = interfaceC4326pd0Track;
        int i2 = Ug0.f3833a;
        interfaceC4326pd0Track.e(this.f2902a.c);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K00
    public final void b(long j) {
        FW.s(this.d == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
        this.d = j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K00
    public final void c(int i, long j, JT jt, boolean z) {
        FW.t(this.c);
        int iA = G00.a(this.e);
        if (this.f > 0 && iA < i) {
            InterfaceC4326pd0 interfaceC4326pd0 = this.c;
            interfaceC4326pd0.getClass();
            interfaceC4326pd0.a(this.h, 1, this.f, 0, null);
            this.f = 0;
            this.h = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }
        for (int i2 = 0; i2 < this.b; i2++) {
            int i3 = 0;
            while (jt.b < jt.c) {
                int iT = jt.t();
                i3 += iT;
                if (iT != 255) {
                    break;
                }
            }
            this.c.d(i3, jt);
            this.f += i3;
        }
        this.h = FW.i0(this.g, j, this.d, this.f2902a.b);
        if (z) {
            InterfaceC4326pd0 interfaceC4326pd1 = this.c;
            interfaceC4326pd1.getClass();
            interfaceC4326pd1.a(this.h, 1, this.f, 0, null);
            this.f = 0;
            this.h = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }
        this.e = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K00
    public final void seek(long j, long j2) {
        this.d = j;
        this.f = 0;
        this.g = j2;
    }
}
