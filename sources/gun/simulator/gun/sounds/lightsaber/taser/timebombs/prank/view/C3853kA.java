package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.kA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3853kA {
    public final C4848vb b;
    public boolean d;
    public int h;
    public int i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4591a = true;
    public int c = Integer.MAX_VALUE;
    public int e = 4096;
    public C4183nz[] f = new C4183nz[8];
    public int g = 7;

    public C3853kA(C4848vb c4848vb) {
        this.b = c4848vb;
    }

    public final void a(int i) {
        int i2;
        if (i > 0) {
            int length = this.f.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.g;
                if (length < i2 || i <= 0) {
                    break;
                }
                C4183nz c4183nz = this.f[length];
                AbstractC2995aW.n(c4183nz);
                i -= c4183nz.c;
                int i4 = this.i;
                C4183nz c4183nz2 = this.f[length];
                AbstractC2995aW.n(c4183nz2);
                this.i = i4 - c4183nz2.c;
                this.h--;
                i3++;
                length--;
            }
            C4183nz[] c4183nzArr = this.f;
            int i5 = i2 + 1;
            System.arraycopy(c4183nzArr, i5, c4183nzArr, i5 + i3, this.h);
            C4183nz[] c4183nzArr2 = this.f;
            int i6 = this.g + 1;
            Arrays.fill(c4183nzArr2, i6, i6 + i3, (Object) null);
            this.g += i3;
        }
    }

    public final void b(C4183nz c4183nz) {
        int i = this.e;
        int i2 = c4183nz.c;
        if (i2 > i) {
            C4183nz[] c4183nzArr = this.f;
            U5.l0(null, c4183nzArr, 0, c4183nzArr.length);
            this.g = this.f.length - 1;
            this.h = 0;
            this.i = 0;
            return;
        }
        a((this.i + i2) - i);
        int i3 = this.h + 1;
        C4183nz[] c4183nzArr2 = this.f;
        if (i3 > c4183nzArr2.length) {
            C4183nz[] c4183nzArr3 = new C4183nz[c4183nzArr2.length * 2];
            System.arraycopy(c4183nzArr2, 0, c4183nzArr3, c4183nzArr2.length, c4183nzArr2.length);
            this.g = this.f.length - 1;
            this.f = c4183nzArr3;
        }
        int i4 = this.g;
        this.g = i4 - 1;
        this.f[i4] = c4183nz;
        this.h++;
        this.i += i2;
    }

    public final void c(C3971lc c3971lc) throws EOFException {
        AbstractC2995aW.q(c3971lc, "data");
        boolean z = this.f4591a;
        C4848vb c4848vb = this.b;
        int i = 0;
        if (z) {
            int[] iArr = AbstractC3151cB.f4210a;
            int iC = c3971lc.c();
            long j = 0;
            int i2 = 0;
            while (i2 < iC) {
                int i3 = i2 + 1;
                byte bF = c3971lc.f(i2);
                byte[] bArr = Vg0.f3884a;
                j += (long) AbstractC3151cB.b[bF & 255];
                i2 = i3;
            }
            if (((int) ((j + ((long) 7)) >> 3)) < c3971lc.c()) {
                C4848vb c4848vb2 = new C4848vb();
                int[] iArr2 = AbstractC3151cB.f4210a;
                int iC2 = c3971lc.c();
                long j2 = 0;
                int i4 = 0;
                while (i < iC2) {
                    int i5 = i + 1;
                    byte bF2 = c3971lc.f(i);
                    byte[] bArr2 = Vg0.f3884a;
                    int i6 = bF2 & 255;
                    int i7 = AbstractC3151cB.f4210a[i6];
                    byte b = AbstractC3151cB.b[i6];
                    j2 = (j2 << b) | ((long) i7);
                    i4 += b;
                    while (i4 >= 8) {
                        i4 -= 8;
                        c4848vb2.R((int) (j2 >> i4));
                    }
                    i = i5;
                }
                if (i4 > 0) {
                    c4848vb2.R((int) ((255 >>> i4) | (j2 << (8 - i4))));
                }
                C3971lc c3971lcF = c4848vb2.F(c4848vb2.b);
                e(c3971lcF.c(), EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, 128);
                c4848vb.x(c3971lcF);
                return;
            }
        }
        e(c3971lc.c(), EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, 0);
        c4848vb.x(c3971lc);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Code duplicated, block: B:28:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:0x008c  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:55:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ac A[SYNTHETIC] */
    public final void d(ArrayList arrayList) throws EOFException {
        int length;
        int length2;
        C3971lc c3971lc;
        int i;
        int length3;
        C4183nz c4183nz;
        C4183nz c4183nz2;
        if (this.d) {
            int i2 = this.c;
            if (i2 < this.e) {
                e(i2, 31, 32);
            }
            this.d = false;
            this.c = Integer.MAX_VALUE;
            e(this.e, 31, 32);
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            int i4 = i3 + 1;
            C4183nz c4183nz3 = (C4183nz) arrayList.get(i3);
            C3971lc c3971lcI = c4183nz3.f4769a.i();
            Integer num = (Integer) AbstractC3941lA.b.get(c3971lcI);
            C3971lc c3971lc2 = c4183nz3.b;
            if (num != null) {
                int iIntValue = num.intValue();
                length2 = iIntValue + 1;
                if (2 <= length2 && length2 < 8) {
                    C4183nz[] c4183nzArr = AbstractC3941lA.f4638a;
                    if (AbstractC2995aW.i(c4183nzArr[iIntValue].b, c3971lc2)) {
                        length = length2;
                    } else if (AbstractC2995aW.i(c4183nzArr[length2].b, c3971lc2)) {
                        length2 = iIntValue + 2;
                        length = length2;
                    }
                    if (length2 == -1) {
                        i = this.g + 1;
                        length3 = this.f.length;
                        while (i < length3) {
                            int i5 = i + 1;
                            c4183nz = this.f[i];
                            AbstractC2995aW.n(c4183nz);
                            if (AbstractC2995aW.i(c4183nz.f4769a, c3971lcI)) {
                                c4183nz2 = this.f[i];
                                AbstractC2995aW.n(c4183nz2);
                                if (AbstractC2995aW.i(c4183nz2.b, c3971lc2)) {
                                    length2 = AbstractC3941lA.f4638a.length + (i - this.g);
                                    break;
                                } else if (length == -1) {
                                    length = AbstractC3941lA.f4638a.length + (i - this.g);
                                }
                            }
                            i = i5;
                        }
                    }
                    if (length2 != -1) {
                        e(length2, EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, 128);
                    } else if (length == -1) {
                        this.b.R(64);
                        c(c3971lcI);
                        c(c3971lc2);
                        b(c4183nz3);
                    } else {
                        c3971lc = C4183nz.d;
                        c3971lcI.getClass();
                        AbstractC2995aW.q(c3971lc, "prefix");
                        if (c3971lcI.h(c3971lc, c3971lc.c()) || AbstractC2995aW.i(C4183nz.i, c3971lcI)) {
                            e(length, 63, 64);
                            c(c3971lc2);
                            b(c4183nz3);
                        } else {
                            e(length, 15, 0);
                            c(c3971lc2);
                        }
                    }
                    i3 = i4;
                }
                length = length2;
            } else {
                length = -1;
            }
            length2 = -1;
            if (length2 == -1) {
                i = this.g + 1;
                length3 = this.f.length;
                while (i < length3) {
                    int i6 = i + 1;
                    c4183nz = this.f[i];
                    AbstractC2995aW.n(c4183nz);
                    if (AbstractC2995aW.i(c4183nz.f4769a, c3971lcI)) {
                        c4183nz2 = this.f[i];
                        AbstractC2995aW.n(c4183nz2);
                        if (AbstractC2995aW.i(c4183nz2.b, c3971lc2)) {
                            length2 = AbstractC3941lA.f4638a.length + (i - this.g);
                            break;
                        } else if (length == -1) {
                            length = AbstractC3941lA.f4638a.length + (i - this.g);
                        }
                    }
                    i = i6;
                }
            }
            if (length2 != -1) {
                e(length2, EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, 128);
            } else if (length == -1) {
                this.b.R(64);
                c(c3971lcI);
                c(c3971lc2);
                b(c4183nz3);
            } else {
                c3971lc = C4183nz.d;
                c3971lcI.getClass();
                AbstractC2995aW.q(c3971lc, "prefix");
                if (c3971lcI.h(c3971lc, c3971lc.c())) {
                    e(length, 63, 64);
                    c(c3971lc2);
                    b(c4183nz3);
                } else {
                    e(length, 63, 64);
                    c(c3971lc2);
                    b(c4183nz3);
                }
            }
            i3 = i4;
        }
    }

    public final void e(int i, int i2, int i3) {
        C4848vb c4848vb = this.b;
        if (i < i2) {
            c4848vb.R(i | i3);
            return;
        }
        c4848vb.R(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            c4848vb.R(128 | (i4 & EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE));
            i4 >>>= 7;
        }
        c4848vb.R(i4);
    }
}
