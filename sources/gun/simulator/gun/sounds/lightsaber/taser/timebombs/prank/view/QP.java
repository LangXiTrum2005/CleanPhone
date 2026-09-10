package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes2.dex */
public final class QP implements InterfaceC2656Oq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JT f3602a;
    public final C3219d0 b;
    public final String c;
    public InterfaceC4326pd0 d;
    public String e;
    public int f = 0;
    public int g;
    public boolean h;
    public boolean i;
    public long j;
    public int k;
    public long l;

    public QP(String str) {
        JT jt = new JT(4);
        this.f3602a = jt;
        jt.f3266a[0] = -1;
        this.b = new C3219d0();
        this.l = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.c = str;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2656Oq
    public final void a(JT jt) {
        FW.t(this.d);
        while (jt.a() > 0) {
            int i = this.f;
            JT jt2 = this.f3602a;
            if (i == 0) {
                byte[] bArr = jt.f3266a;
                int i2 = jt.b;
                int i3 = jt.c;
                while (true) {
                    if (i2 >= i3) {
                        jt.E(i3);
                        break;
                    }
                    byte b = bArr[i2];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.i && (b & 224) == 224;
                    this.i = z;
                    if (z2) {
                        jt.E(i2 + 1);
                        this.i = false;
                        jt2.f3266a[1] = bArr[i2];
                        this.g = 2;
                        this.f = 1;
                        break;
                    }
                    i2++;
                }
            } else if (i == 1) {
                int iMin = Math.min(jt.a(), 4 - this.g);
                jt.d(jt2.f3266a, this.g, iMin);
                int i4 = this.g + iMin;
                this.g = i4;
                if (i4 >= 4) {
                    jt2.E(0);
                    int iF = jt2.f();
                    C3219d0 c3219d0 = this.b;
                    if (c3219d0.a(iF)) {
                        this.k = c3219d0.c;
                        if (!this.h) {
                            long j = ((long) c3219d0.g) * 1000000;
                            int i5 = c3219d0.d;
                            this.j = j / ((long) i5);
                            C4531rw c4531rw = new C4531rw();
                            c4531rw.f4954a = this.e;
                            c4531rw.k = (String) c3219d0.b;
                            c4531rw.l = 4096;
                            c4531rw.x = c3219d0.e;
                            c4531rw.y = i5;
                            c4531rw.c = this.c;
                            this.d.e(new C4619sw(c4531rw));
                            this.h = true;
                        }
                        jt2.E(0);
                        this.d.d(4, jt2);
                        this.f = 2;
                    } else {
                        this.g = 0;
                        this.f = 1;
                    }
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(jt.a(), this.k - this.g);
                this.d.d(iMin2, jt);
                int i6 = this.g + iMin2;
                this.g = i6;
                int i7 = this.k;
                if (i6 >= i7) {
                    long j2 = this.l;
                    if (j2 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                        this.d.a(j2, 1, i7, 0, null);
                        this.l += this.j;
                    }
                    this.g = 0;
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
        this.e = c4416qe0.e;
        c4416qe0.b();
        this.d = interfaceC4353pt.track(c4416qe0.d, 1);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2656Oq
    public final void seek() {
        this.f = 0;
        this.g = 0;
        this.i = false;
        this.l = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2656Oq
    public final void packetFinished() {
    }
}
