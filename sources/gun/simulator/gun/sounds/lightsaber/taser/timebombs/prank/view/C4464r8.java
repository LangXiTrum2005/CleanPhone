package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.r8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4464r8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4918a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final String f;

    public /* synthetic */ C4464r8(List list, int i, int i2, int i3, float f, String str) {
        this.f4918a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
        this.f = str;
    }

    public static C4464r8 a(JT jt) throws KT {
        byte[] bArr;
        String strD;
        int i;
        int i2;
        float f;
        try {
            jt.F(4);
            int iT = (jt.t() & 3) + 1;
            if (iT == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iT2 = jt.t() & 31;
            int i3 = 0;
            while (true) {
                bArr = FW.f3068a;
                if (i3 >= iT2) {
                    break;
                }
                int iY = jt.y();
                int i4 = jt.b;
                jt.F(iY);
                byte[] bArr2 = jt.f3266a;
                byte[] bArr3 = new byte[iY + 4];
                System.arraycopy(bArr, 0, bArr3, 0, 4);
                System.arraycopy(bArr2, i4, bArr3, 4, iY);
                arrayList.add(bArr3);
                i3++;
            }
            int iT3 = jt.t();
            for (int i5 = 0; i5 < iT3; i5++) {
                int iY2 = jt.y();
                int i6 = jt.b;
                jt.F(iY2);
                byte[] bArr4 = jt.f3266a;
                byte[] bArr5 = new byte[iY2 + 4];
                System.arraycopy(bArr, 0, bArr5, 0, 4);
                System.arraycopy(bArr4, i6, bArr5, 4, iY2);
                arrayList.add(bArr5);
            }
            if (iT2 > 0) {
                C5100yQ c5100yQD = AbstractC5188zQ.d((byte[]) arrayList.get(0), iT, ((byte[]) arrayList.get(0)).length);
                int i7 = c5100yQD.e;
                int i8 = c5100yQD.f;
                float f2 = c5100yQD.g;
                strD = FW.d(c5100yQD.f5275a, c5100yQD.b, c5100yQD.c);
                i = i7;
                i2 = i8;
                f = f2;
            } else {
                strD = null;
                i = -1;
                i2 = -1;
                f = 1.0f;
            }
            return new C4464r8(arrayList, iT, i, i2, f, strD);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw KT.a("Error parsing AVC config", e);
        }
    }

    public static C4464r8 b(JT jt) throws KT {
        try {
            jt.F(21);
            int iT = jt.t() & 3;
            int iT2 = jt.t();
            int i = jt.b;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < iT2; i4++) {
                jt.F(1);
                int iY = jt.y();
                for (int i5 = 0; i5 < iY; i5++) {
                    int iY2 = jt.y();
                    i3 += iY2 + 4;
                    jt.F(iY2);
                }
            }
            jt.E(i);
            byte[] bArr = new byte[i3];
            String strE = null;
            int i6 = 0;
            int i7 = 0;
            int i8 = -1;
            int i9 = -1;
            float f = 1.0f;
            while (i6 < iT2) {
                int iT3 = jt.t() & 63;
                int iY3 = jt.y();
                int i10 = 0;
                while (i10 < iY3) {
                    int iY4 = jt.y();
                    int i11 = iT2;
                    System.arraycopy(AbstractC5188zQ.f5325a, i2, bArr, i7, 4);
                    int i12 = i7 + 4;
                    System.arraycopy(jt.f3266a, jt.b, bArr, i12, iY4);
                    if (iT3 == 33 && i10 == 0) {
                        C4924wQ c4924wQC = AbstractC5188zQ.c(bArr, i12, i12 + iY4);
                        int i13 = c4924wQC.g;
                        i9 = c4924wQC.h;
                        f = c4924wQC.i;
                        i8 = i13;
                        strE = FW.e(c4924wQC.f5178a, c4924wQC.b, c4924wQC.c, c4924wQC.d, c4924wQC.e, c4924wQC.f);
                    }
                    i7 = i12 + iY4;
                    jt.F(iY4);
                    i10++;
                    iT2 = i11;
                    iT3 = iT3;
                    iY3 = iY3;
                    i2 = 0;
                }
                i6++;
                i2 = 0;
            }
            return new C4464r8(i3 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), iT + 1, i8, i9, f, strE);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw KT.a("Error parsing HEVC config", e);
        }
    }
}
