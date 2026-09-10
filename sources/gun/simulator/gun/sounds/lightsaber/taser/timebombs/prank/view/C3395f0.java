package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3395f0 implements InterfaceC2656Oq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uh0 f4344a;
    public final JT b;
    public final String c;
    public String d;
    public InterfaceC4326pd0 e;
    public int f;
    public int g;
    public boolean h;
    public long i;
    public C4619sw j;
    public int k;
    public long l;

    public C3395f0(String str) {
        Uh0 uh0 = new Uh0(new byte[16], 2, (Object) null);
        this.f4344a = uh0;
        this.b = new JT(uh0.d);
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.l = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.c = str;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2656Oq
    public final void a(JT jt) {
        FW.t(this.e);
        while (jt.a() > 0) {
            int i = this.f;
            JT jt2 = this.b;
            if (i == 0) {
                while (jt.a() > 0) {
                    if (this.h) {
                        int iT = jt.t();
                        this.h = iT == 172;
                        if (iT == 64 || iT == 65) {
                            boolean z = iT == 65;
                            this.f = 1;
                            byte[] bArr = jt2.f3266a;
                            bArr[0] = -84;
                            bArr[1] = (byte) (z ? 65 : 64);
                            this.g = 2;
                            break;
                        }
                    } else {
                        this.h = jt.t() == 172;
                    }
                }
            } else if (i == 1) {
                byte[] bArr2 = jt2.f3266a;
                int iMin = Math.min(jt.a(), 16 - this.g);
                jt.d(bArr2, this.g, iMin);
                int i2 = this.g + iMin;
                this.g = i2;
                if (i2 == 16) {
                    Uh0 uh0 = this.f4344a;
                    uh0.p(0);
                    C3483g0 c3483g0E0 = AbstractC2995aW.e0(uh0);
                    C4619sw c4619sw = this.j;
                    if (c4619sw == null || c3483g0E0.b != c4619sw.y || c3483g0E0.f4395a != c4619sw.z || !"audio/ac4".equals(c4619sw.l)) {
                        C4531rw c4531rw = new C4531rw();
                        c4531rw.f4954a = this.d;
                        c4531rw.k = "audio/ac4";
                        c4531rw.x = c3483g0E0.b;
                        c4531rw.y = c3483g0E0.f4395a;
                        c4531rw.c = this.c;
                        C4619sw c4619sw2 = new C4619sw(c4531rw);
                        this.j = c4619sw2;
                        this.e.e(c4619sw2);
                    }
                    this.k = c3483g0E0.c;
                    this.i = (((long) c3483g0E0.d) * 1000000) / ((long) this.j.z);
                    jt2.E(0);
                    this.e.d(16, jt2);
                    this.f = 2;
                }
            } else if (i == 2) {
                int iMin2 = Math.min(jt.a(), this.k - this.g);
                this.e.d(iMin2, jt);
                int i3 = this.g + iMin2;
                this.g = i3;
                int i4 = this.k;
                if (i3 == i4) {
                    long j = this.l;
                    if (j != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                        this.e.a(j, 1, i4, 0, null);
                        this.l += this.i;
                    }
                    this.f = 0;
                }
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2656Oq
    public final void b(int i, long j) {
        if (j != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            this.l = j;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2656Oq
    public final void c(InterfaceC4353pt interfaceC4353pt, C4416qe0 c4416qe0) {
        c4416qe0.a();
        c4416qe0.b();
        this.d = c4416qe0.e;
        c4416qe0.b();
        this.e = interfaceC4353pt.track(c4416qe0.d, 1);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2656Oq
    public final void seek() {
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.l = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2656Oq
    public final void packetFinished() {
    }
}
