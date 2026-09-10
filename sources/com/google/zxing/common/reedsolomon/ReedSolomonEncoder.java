package com.google.zxing.common.reedsolomon;

import android.support.v4.media.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ReedSolomonEncoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GenericGF f21354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f21355b;

    public ReedSolomonEncoder(GenericGF genericGF) {
        this.f21354a = genericGF;
        ArrayList arrayList = new ArrayList();
        this.f21355b = arrayList;
        arrayList.add(new GenericGFPoly(genericGF, new int[]{1}));
    }

    public final void a(int i2, int[] iArr) {
        GenericGFPoly genericGFPoly;
        GenericGFPoly genericGFPoly2;
        if (i2 == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i2;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        ArrayList arrayList = this.f21355b;
        int size = arrayList.size();
        int i3 = 1;
        GenericGF genericGF = this.f21354a;
        if (i2 >= size) {
            GenericGFPoly genericGFPoly3 = (GenericGFPoly) a.d(1, arrayList);
            int size2 = arrayList.size();
            while (size2 <= i2) {
                GenericGFPoly genericGFPoly4 = new GenericGFPoly(genericGF, new int[]{i3, genericGF.f21348a[(size2 - 1) + genericGF.f]});
                genericGFPoly3.getClass();
                GenericGF genericGF2 = genericGFPoly3.f21352a;
                if (!genericGF2.equals(genericGF)) {
                    throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                }
                if (genericGFPoly3.c() || genericGFPoly4.c()) {
                    genericGFPoly2 = genericGF2.f21350c;
                } else {
                    int[] iArr2 = genericGFPoly3.f21353b;
                    int length2 = iArr2.length;
                    int[] iArr3 = genericGFPoly4.f21353b;
                    int length3 = iArr3.length;
                    int[] iArr4 = new int[(length2 + length3) - i3];
                    for (int i4 = 0; i4 < length2; i4++) {
                        int i5 = iArr2[i4];
                        int i6 = 0;
                        while (i6 < length3) {
                            int i7 = i4 + i6;
                            int i8 = i6;
                            iArr4[i7] = iArr4[i7] ^ genericGF2.a(i5, iArr3[i8]);
                            i6 = i8 + 1;
                        }
                    }
                    genericGFPoly2 = new GenericGFPoly(genericGF2, iArr4);
                }
                genericGFPoly3 = genericGFPoly2;
                arrayList.add(genericGFPoly3);
                size2++;
                i3 = 1;
            }
        }
        GenericGFPoly genericGFPoly5 = (GenericGFPoly) arrayList.get(i2);
        int[] iArr5 = new int[length];
        System.arraycopy(iArr, 0, iArr5, 0, length);
        GenericGFPoly genericGFPolyD = new GenericGFPoly(genericGF, iArr5).d(i2, 1);
        genericGFPolyD.getClass();
        GenericGF genericGF3 = genericGFPoly5.f21352a;
        GenericGF genericGF4 = genericGFPolyD.f21352a;
        if (!genericGF4.equals(genericGF3)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (genericGFPoly5.c()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        int iB = genericGFPoly5.b();
        int[] iArr6 = genericGFPoly5.f21353b;
        int i9 = iArr6[(iArr6.length - 1) - iB];
        if (i9 == 0) {
            throw new ArithmeticException();
        }
        int i10 = genericGF4.f21348a[(genericGF4.d - genericGF4.f21349b[i9]) - 1];
        GenericGFPoly genericGFPoly6 = genericGF4.f21350c;
        GenericGFPoly genericGFPolyA = genericGFPoly6;
        while (genericGFPolyD.b() >= genericGFPoly5.b() && !genericGFPolyD.c()) {
            int iB2 = genericGFPolyD.b() - genericGFPoly5.b();
            int iB3 = genericGFPolyD.b();
            int[] iArr7 = genericGFPolyD.f21353b;
            int iA = genericGF4.a(iArr7[(iArr7.length - 1) - iB3], i10);
            GenericGFPoly genericGFPolyD2 = genericGFPoly5.d(iB2, iA);
            if (iB2 < 0) {
                throw new IllegalArgumentException();
            }
            if (iA == 0) {
                genericGFPoly = genericGFPoly6;
            } else {
                int[] iArr8 = new int[iB2 + 1];
                iArr8[0] = iA;
                genericGFPoly = new GenericGFPoly(genericGF4, iArr8);
            }
            genericGFPolyA = genericGFPolyA.a(genericGFPoly);
            genericGFPolyD = genericGFPolyD.a(genericGFPolyD2);
        }
        int[] iArr9 = new GenericGFPoly[]{genericGFPolyA, genericGFPolyD}[1].f21353b;
        int length4 = i2 - iArr9.length;
        for (int i11 = 0; i11 < length4; i11++) {
            iArr[length + i11] = 0;
        }
        System.arraycopy(iArr9, 0, iArr, length + length4, iArr9.length);
    }
}
