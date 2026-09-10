package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2429Fw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4326pd0 f3094a;
    public C4414qd0 d;
    public C2601Mn e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean l;
    public final C3886kd0 b = new C3886kd0();
    public final JT c = new JT();
    public final JT j = new JT(1);
    public final JT k = new JT();

    public C2429Fw(InterfaceC4326pd0 interfaceC4326pd0, C4414qd0 c4414qd0, C2601Mn c2601Mn) {
        this.f3094a = interfaceC4326pd0;
        this.d = c4414qd0;
        this.e = c2601Mn;
        this.d = c4414qd0;
        this.e = c2601Mn;
        interfaceC4326pd0.e(c4414qd0.f4891a.f);
        d();
    }

    public final C3798jd0 a() {
        if (!this.l) {
            return null;
        }
        C3886kd0 c3886kd0 = this.b;
        C2601Mn c2601Mn = c3886kd0.f4605a;
        int i = Ug0.f3833a;
        int i2 = c2601Mn.f3424a;
        C3798jd0 c3798jd0 = c3886kd0.m;
        if (c3798jd0 == null) {
            C3798jd0[] c3798jd0Arr = this.d.f4891a.k;
            c3798jd0 = c3798jd0Arr == null ? null : c3798jd0Arr[i2];
        }
        if (c3798jd0 == null || !c3798jd0.f4561a) {
            return null;
        }
        return c3798jd0;
    }

    public final boolean b() {
        this.f++;
        if (!this.l) {
            return false;
        }
        int i = this.g + 1;
        this.g = i;
        int[] iArr = this.b.g;
        int i2 = this.h;
        if (i != iArr[i2]) {
            return true;
        }
        this.h = i2 + 1;
        this.g = 0;
        return false;
    }

    public final int c(int i, int i2) {
        JT jt;
        C3798jd0 c3798jd0A = a();
        if (c3798jd0A == null) {
            return 0;
        }
        C3886kd0 c3886kd0 = this.b;
        int length = c3798jd0A.d;
        if (length != 0) {
            jt = c3886kd0.n;
        } else {
            int i3 = Ug0.f3833a;
            byte[] bArr = c3798jd0A.e;
            int length2 = bArr.length;
            JT jt2 = this.k;
            jt2.C(bArr, length2);
            length = bArr.length;
            jt = jt2;
        }
        boolean z = c3886kd0.k && c3886kd0.l[this.f];
        boolean z2 = z || i2 != 0;
        JT jt3 = this.j;
        jt3.f3266a[0] = (byte) ((z2 ? 128 : 0) | length);
        jt3.E(0);
        InterfaceC4326pd0 interfaceC4326pd0 = this.f3094a;
        interfaceC4326pd0.b(1, jt3);
        interfaceC4326pd0.b(length, jt);
        if (!z2) {
            return length + 1;
        }
        JT jt4 = this.c;
        if (!z) {
            jt4.B(8);
            byte[] bArr2 = jt4.f3266a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i2 & 255);
            bArr2[4] = (byte) ((i >> 24) & 255);
            bArr2[5] = (byte) ((i >> 16) & 255);
            bArr2[6] = (byte) ((i >> 8) & 255);
            bArr2[7] = (byte) (i & 255);
            interfaceC4326pd0.b(8, jt4);
            return length + 9;
        }
        JT jt5 = c3886kd0.n;
        int iY = jt5.y();
        jt5.F(-2);
        int i4 = (iY * 6) + 2;
        if (i2 != 0) {
            jt4.B(i4);
            byte[] bArr3 = jt4.f3266a;
            jt5.d(bArr3, 0, i4);
            int i5 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
            bArr3[2] = (byte) ((i5 >> 8) & 255);
            bArr3[3] = (byte) (i5 & 255);
        } else {
            jt4 = jt5;
        }
        interfaceC4326pd0.b(i4, jt4);
        return length + 1 + i4;
    }

    public final void d() {
        C3886kd0 c3886kd0 = this.b;
        c3886kd0.d = 0;
        c3886kd0.p = 0L;
        c3886kd0.q = false;
        c3886kd0.k = false;
        c3886kd0.o = false;
        c3886kd0.m = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.l = false;
    }
}
