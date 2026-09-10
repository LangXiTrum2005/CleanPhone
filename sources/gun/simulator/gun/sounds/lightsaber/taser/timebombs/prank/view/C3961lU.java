package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Bitmap;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.lU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3961lU extends R60 {
    public final JT m = new JT();
    public final JT n = new JT();
    public final C3873kU o = new C3873kU();
    public Inflater p;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x0078  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r3v10, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JT] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JT] */
    /* JADX WARN: Type inference failed for: r4v1, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JT] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v30 */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.R60
    public final InterfaceC4495ra0 b(byte[] bArr, int i, boolean z) {
        ?? r3;
        ?? r4;
        C2417Fk c2417Fk;
        ?? r5;
        ?? r6;
        int iT;
        ?? r7;
        ?? r8;
        ?? r20;
        int i2;
        int i3;
        int iV;
        ?? r9;
        JT jt = this.m;
        jt.C(bArr, i);
        if (jt.a() > 0 && jt.c() == 120) {
            if (this.p == null) {
                this.p = new Inflater();
            }
            Inflater inflater = this.p;
            JT jt2 = this.n;
            if (Ug0.H(jt, jt2, inflater)) {
                jt.C(jt2.f3266a, jt2.c);
            }
        }
        C3873kU c3873kU = this.o;
        int i4 = 0;
        c3873kU.d = 0;
        c3873kU.e = 0;
        c3873kU.f = 0;
        c3873kU.g = 0;
        c3873kU.h = 0;
        c3873kU.i = 0;
        JT jt3 = c3873kU.f4599a;
        jt3.B(0);
        c3873kU.c = false;
        ArrayList arrayList = new ArrayList();
        ?? r10 = jt3;
        while (true) {
            int i5 = 2;
            if (jt.a() < 3) {
                return new C4237od(Collections.unmodifiableList(arrayList), i5);
            }
            int i6 = jt.c;
            int iT2 = jt.t();
            int iY = jt.y();
            int i7 = jt.b + iY;
            if (i7 > i6) {
                jt.E(i6);
                r9 = r10;
                c2417Fk = null;
            } else {
                int[] iArr = c3873kU.b;
                if (iT2 != 128) {
                    switch (iT2) {
                        case 20:
                            if (iY % 5 == 2) {
                                jt.F(2);
                                Arrays.fill(iArr, i4);
                                int i8 = iY / 5;
                                int i9 = 0;
                                while (i9 < i8) {
                                    r8 = r10;
                                    int iT3 = jt.t();
                                    int[] iArr2 = iArr;
                                    double dT = jt.t();
                                    double dT2 = jt.t() - 128;
                                    double dT3 = jt.t() - 128;
                                    iArr2[iT3] = (Ug0.j((int) ((1.402d * dT2) + dT), 0, 255) << 16) | (jt.t() << 24) | (Ug0.j((int) ((dT - (0.34414d * dT3)) - (dT2 * 0.71414d)), 0, 255) << 8) | Ug0.j((int) ((dT3 * 1.772d) + dT), 0, 255);
                                    i9++;
                                    iArr = iArr2;
                                    i8 = i8;
                                    r8 = r8;
                                }
                                r8 = r10;
                                r20 = r8;
                                c3873kU.c = true;
                            } else {
                                r20 = r10;
                            }
                            break;
                        case 21:
                            if (iY >= 4) {
                                jt.F(3);
                                int i10 = iY - 4;
                                if (!((128 & jt.t()) != 0)) {
                                    i2 = r10.b;
                                    i3 = r10.c;
                                    if (i2 < i3 && i10 > 0) {
                                        int iMin = Math.min(i10, i3 - i2);
                                        jt.d(r10.f3266a, i2, iMin);
                                        r10.E(i2 + iMin);
                                    }
                                } else if (i10 >= 7 && (iV = jt.v()) >= 4) {
                                    c3873kU.h = jt.y();
                                    c3873kU.i = jt.y();
                                    r10.B(iV - 4);
                                    i10 = iY - 11;
                                    i2 = r10.b;
                                    i3 = r10.c;
                                    if (i2 < i3) {
                                        int iMin2 = Math.min(i10, i3 - i2);
                                        jt.d(r10.f3266a, i2, iMin2);
                                        r10.E(i2 + iMin2);
                                    }
                                }
                            }
                            r20 = r10;
                            break;
                        case 22:
                            if (iY >= 19) {
                                c3873kU.d = jt.y();
                                c3873kU.e = jt.y();
                                jt.F(11);
                                c3873kU.f = jt.y();
                                c3873kU.g = jt.y();
                            }
                            r20 = r10;
                            break;
                        default:
                            r20 = r10;
                            break;
                    }
                    r7 = r20;
                    c2417Fk = null;
                } else {
                    ?? r21 = r10;
                    if (c3873kU.d == 0 || c3873kU.e == 0 || c3873kU.h == 0 || c3873kU.i == 0) {
                        r3 = r21;
                    } else {
                        r6 = r21;
                        int i11 = r6.c;
                        if (i11 != 0 && r6.b == i11 && c3873kU.c) {
                            r6.E(0);
                            int i12 = c3873kU.h * c3873kU.i;
                            int[] iArr3 = new int[i12];
                            int i13 = 0;
                            while (i13 < i12) {
                                int iT4 = r6.t();
                                if (iT4 != 0) {
                                    r3 = r6;
                                    r3 = r6;
                                    r3 = r6;
                                    iT = i13 + 1;
                                    iArr3[i13] = iArr[iT4];
                                } else {
                                    int iT5 = r6.t();
                                    if (iT5 != 0) {
                                        r3 = r6;
                                        r3 = r6;
                                        r3 = r6;
                                        iT = ((iT5 & 64) == 0 ? iT5 & 63 : ((iT5 & 63) << 8) | r6.t()) + i13;
                                        Arrays.fill(iArr3, i13, iT, (iT5 & 128) == 0 ? 0 : iArr[r6.t()]);
                                    } else {
                                        r3 = r6;
                                        r3 = r6;
                                        r3 = r6;
                                    }
                                }
                                i13 = iT;
                            }
                            r3 = r6;
                            r3 = r6;
                            r3 = r6;
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr3, c3873kU.h, c3873kU.i, Bitmap.Config.ARGB_8888);
                            float f = c3873kU.f;
                            float f2 = c3873kU.d;
                            float f3 = f / f2;
                            float f4 = c3873kU.g;
                            float f5 = c3873kU.e;
                            c2417Fk = new C2417Fk(null, null, null, bitmapCreateBitmap, f4 / f5, 0, 0, f3, 0, Integer.MIN_VALUE, -3.4028235E38f, c3873kU.h / f2, c3873kU.i / f5, false, ViewCompat.MEASURED_STATE_MASK, Integer.MIN_VALUE, 0.0f);
                            r4 = 0;
                            r5 = r6;
                        }
                        c3873kU.d = r4;
                        c3873kU.e = r4;
                        c3873kU.f = r4;
                        c3873kU.g = r4;
                        c3873kU.h = r4;
                        c3873kU.i = r4;
                        r5.B(r4);
                        c3873kU.c = r4;
                        r7 = r5;
                    }
                    r3 = r6;
                    r3 = r6;
                    r3 = r6;
                    r3 = r6;
                    r3 = r6;
                    r3 = r6;
                    r4 = 0;
                    c2417Fk = null;
                    r5 = r3;
                    c3873kU.d = r4;
                    c3873kU.e = r4;
                    c3873kU.f = r4;
                    c3873kU.g = r4;
                    c3873kU.h = r4;
                    c3873kU.i = r4;
                    r5.B(r4);
                    c3873kU.c = r4;
                    r7 = r5;
                }
                jt.E(i7);
                r9 = r7;
            }
            if (c2417Fk != null) {
                arrayList.add(c2417Fk);
            }
            r10 = r9;
            i4 = 0;
        }
    }
}
