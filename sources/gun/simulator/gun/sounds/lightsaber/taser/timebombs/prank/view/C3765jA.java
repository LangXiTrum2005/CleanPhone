package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.jA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3765jA {
    public final EX d;
    public int g;
    public int h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4542a = 4096;
    public int b = 4096;
    public final ArrayList c = new ArrayList();
    public C4183nz[] e = new C4183nz[8];
    public int f = 7;

    public C3765jA(IA ia) {
        this.d = AbstractC4496rb.f(ia);
    }

    public final int a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.e.length;
            while (true) {
                length--;
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                C4183nz c4183nz = this.e[length];
                AbstractC2995aW.n(c4183nz);
                int i4 = c4183nz.c;
                i -= i4;
                this.h -= i4;
                this.g--;
                i3++;
            }
            C4183nz[] c4183nzArr = this.e;
            System.arraycopy(c4183nzArr, i2 + 1, c4183nzArr, i2 + 1 + i3, this.g);
            this.f += i3;
        }
        return i3;
    }

    public final C3971lc b(int i) throws IOException {
        if (i >= 0) {
            C4183nz[] c4183nzArr = AbstractC3941lA.f4638a;
            if (i <= c4183nzArr.length - 1) {
                return c4183nzArr[i].f4769a;
            }
        }
        int length = this.f + 1 + (i - AbstractC3941lA.f4638a.length);
        if (length >= 0) {
            C4183nz[] c4183nzArr2 = this.e;
            if (length < c4183nzArr2.length) {
                C4183nz c4183nz = c4183nzArr2[length];
                AbstractC2995aW.n(c4183nz);
                return c4183nz.f4769a;
            }
        }
        throw new IOException(AbstractC2995aW.v0(Integer.valueOf(i + 1), "Header index too large "));
    }

    public final void c(C4183nz c4183nz) {
        this.c.add(c4183nz);
        int i = this.b;
        int i2 = c4183nz.c;
        if (i2 > i) {
            C4183nz[] c4183nzArr = this.e;
            U5.l0(null, c4183nzArr, 0, c4183nzArr.length);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            return;
        }
        a((this.h + i2) - i);
        int i3 = this.g + 1;
        C4183nz[] c4183nzArr2 = this.e;
        if (i3 > c4183nzArr2.length) {
            C4183nz[] c4183nzArr3 = new C4183nz[c4183nzArr2.length * 2];
            System.arraycopy(c4183nzArr2, 0, c4183nzArr3, c4183nzArr2.length, c4183nzArr2.length);
            this.f = this.e.length - 1;
            this.e = c4183nzArr3;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        this.e[i4] = c4183nz;
        this.g++;
        this.h += i2;
    }

    public final C3971lc d() {
        int i;
        EX ex = this.d;
        byte b = ex.readByte();
        byte[] bArr = Vg0.f3884a;
        int i2 = b & 255;
        int i3 = 0;
        boolean z = (b & 128) == 128;
        long jE = e(i2, EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
        if (!z) {
            return ex.F(jE);
        }
        C4848vb c4848vb = new C4848vb();
        int[] iArr = AbstractC3151cB.f4210a;
        AbstractC2995aW.q(ex, "source");
        C3003ac c3003ac = AbstractC3151cB.c;
        C3003ac c3003ac2 = c3003ac;
        long j = 0;
        int i4 = 0;
        while (j < jE) {
            j++;
            byte b2 = ex.readByte();
            byte[] bArr2 = Vg0.f3884a;
            i3 = (i3 << 8) | (b2 & 255);
            i4 += 8;
            while (i4 >= 8) {
                C3003ac[] c3003acArr = (C3003ac[]) c3003ac2.c;
                AbstractC2995aW.n(c3003acArr);
                c3003ac2 = c3003acArr[(i3 >>> (i4 - 8)) & 255];
                AbstractC2995aW.n(c3003ac2);
                if (((C3003ac[]) c3003ac2.c) == null) {
                    c4848vb.R(c3003ac2.f4129a);
                    i4 -= c3003ac2.b;
                    c3003ac2 = c3003ac;
                } else {
                    i4 -= 8;
                }
            }
        }
        while (i4 > 0) {
            C3003ac[] c3003acArr2 = (C3003ac[]) c3003ac2.c;
            AbstractC2995aW.n(c3003acArr2);
            C3003ac c3003ac3 = c3003acArr2[(i3 << (8 - i4)) & 255];
            AbstractC2995aW.n(c3003ac3);
            if (((C3003ac[]) c3003ac3.c) != null || (i = c3003ac3.b) > i4) {
                break;
            }
            c4848vb.R(c3003ac3.f4129a);
            i4 -= i;
            c3003ac2 = c3003ac;
        }
        return c4848vb.F(c4848vb.b);
    }

    public final int e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte b = this.d.readByte();
            byte[] bArr = Vg0.f3884a;
            int i5 = b & 255;
            if ((b & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (b & 127) << i4;
            i4 += 7;
        }
    }
}
