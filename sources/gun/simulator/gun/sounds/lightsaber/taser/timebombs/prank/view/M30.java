package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes2.dex */
public final class M30 implements InterfaceC4503re0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L30 f3389a;
    public final JT b = new JT(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public M30(L30 l30) {
        this.f3389a = l30;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4503re0
    public final void a(int i, JT jt) {
        boolean z = (i & 1) != 0;
        int iT = z ? jt.b + jt.t() : -1;
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            jt.E(iT);
            this.d = 0;
        }
        while (jt.a() > 0) {
            int i2 = this.d;
            JT jt2 = this.b;
            if (i2 < 3) {
                if (i2 == 0) {
                    int iT2 = jt.t();
                    jt.E(jt.b - 1);
                    if (iT2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int iMin = Math.min(jt.a(), 3 - this.d);
                jt.d(jt2.f3266a, this.d, iMin);
                int i3 = this.d + iMin;
                this.d = i3;
                if (i3 == 3) {
                    jt2.E(0);
                    jt2.D(3);
                    jt2.F(1);
                    int iT3 = jt2.t();
                    int iT4 = jt2.t();
                    this.e = (iT3 & 128) != 0;
                    int i4 = (((iT3 & 15) << 8) | iT4) + 3;
                    this.c = i4;
                    byte[] bArr = jt2.f3266a;
                    if (bArr.length < i4) {
                        jt2.b(Math.min(4098, Math.max(i4, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(jt.a(), this.c - this.d);
                jt.d(jt2.f3266a, this.d, iMin2);
                int i5 = this.d + iMin2;
                this.d = i5;
                int i6 = this.c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (this.e) {
                        byte[] bArr2 = jt2.f3266a;
                        int i7 = Ug0.f3833a;
                        int i8 = -1;
                        for (int i9 = 0; i9 < i6; i9++) {
                            i8 = Ug0.l[((i8 >>> 24) ^ (bArr2[i9] & 255)) & 255] ^ (i8 << 8);
                        }
                        if (i8 != 0) {
                            this.f = true;
                            return;
                        }
                        jt2.D(this.c - 4);
                    } else {
                        jt2.D(i6);
                    }
                    jt2.E(0);
                    this.f3389a.a(jt2);
                    this.d = 0;
                }
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4503re0
    public final void b(Mc0 mc0, InterfaceC4353pt interfaceC4353pt, C4416qe0 c4416qe0) {
        this.f3389a.b(mc0, interfaceC4353pt, c4416qe0);
        this.f = true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4503re0
    public final void seek() {
        this.f = true;
    }
}
