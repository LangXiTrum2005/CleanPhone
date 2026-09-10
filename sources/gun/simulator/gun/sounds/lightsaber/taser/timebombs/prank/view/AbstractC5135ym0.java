package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.EOFException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ym0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5135ym0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f5297a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(AbstractC2307Be.f2881a);
        AbstractC2995aW.p(bytes, "(this as java.lang.String).getBytes(charset)");
        f5297a = bytes;
    }

    public static final String a(C4848vb c4848vb, long j) throws EOFException {
        AbstractC2995aW.q(c4848vb, "<this>");
        if (j > 0) {
            long j2 = j - 1;
            if (c4848vb.n(j2) == ((byte) 13)) {
                String strS = c4848vb.s(j2, AbstractC2307Be.f2881a);
                c4848vb.skip(2L);
                return strS;
            }
        }
        String strS2 = c4848vb.s(j, AbstractC2307Be.f2881a);
        c4848vb.skip(1L);
        return strS2;
    }

    public static final int b(C4848vb c4848vb, XS xs, boolean z) {
        int i;
        int i2;
        V30 v30;
        byte[] bArr;
        int i3;
        AbstractC2995aW.q(c4848vb, "<this>");
        AbstractC2995aW.q(xs, "options");
        V30 v31 = c4848vb.f5139a;
        int i4 = -2;
        if (v31 == null) {
            return z ? -2 : -1;
        }
        int i5 = v31.b;
        int i6 = v31.c;
        byte[] bArr2 = v31.f3857a;
        V30 v32 = v31;
        int i7 = 0;
        int i8 = -1;
        loop0: while (true) {
            int i9 = i7 + 1;
            int[] iArr = xs.b;
            int i10 = iArr[i7];
            int i11 = i7 + 2;
            int i12 = iArr[i9];
            if (i12 != -1) {
                i8 = i12;
            }
            if (v32 == null) {
                break;
            }
            if (i10 >= 0) {
                int i13 = i5 + 1;
                int i14 = bArr2[i5] & 255;
                int i15 = i11 + i10;
                while (i11 != i15) {
                    if (i14 == iArr[i11]) {
                        i = iArr[i11 + i10];
                        if (i13 == i6) {
                            v32 = v32.f;
                            AbstractC2995aW.n(v32);
                            i2 = v32.b;
                            i6 = v32.c;
                            bArr2 = v32.f3857a;
                            if (v32 == v31) {
                                v32 = null;
                            }
                        } else {
                            i2 = i13;
                        }
                    } else {
                        i11++;
                    }
                }
                return i8;
            }
            int i16 = (i10 * (-1)) + i11;
            while (true) {
                int i17 = i5 + 1;
                int i18 = i11 + 1;
                if ((bArr2[i5] & 255) != iArr[i11]) {
                    return i8;
                }
                boolean z2 = i18 == i16;
                if (i17 == i6) {
                    AbstractC2995aW.n(v32);
                    V30 v33 = v32.f;
                    AbstractC2995aW.n(v33);
                    i3 = v33.b;
                    int i19 = v33.c;
                    bArr = v33.f3857a;
                    if (v33 != v31) {
                        v30 = v33;
                        i6 = i19;
                    } else {
                        if (!z2) {
                            break loop0;
                        }
                        i6 = i19;
                        v30 = null;
                    }
                } else {
                    v30 = v32;
                    bArr = bArr2;
                    i3 = i17;
                }
                if (z2) {
                    i = iArr[i18];
                    i2 = i3;
                    bArr2 = bArr;
                    v32 = v30;
                    break;
                }
                i5 = i3;
                bArr2 = bArr;
                v32 = v30;
                i11 = i18;
            }
            if (i >= 0) {
                return i;
            }
            i7 = -i;
            i5 = i2;
            i4 = -2;
        }
        return z ? i4 : i8;
    }
}
