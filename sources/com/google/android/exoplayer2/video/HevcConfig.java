package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.CodecSpecificDataUtil;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class HevcConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f19002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f19004c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19005e;
    public final int f;
    public final String g;

    public HevcConfig(List list, int i2, float f, String str, int i3, int i4, int i5) {
        this.f19002a = list;
        this.f19003b = i2;
        this.f19004c = f;
        this.g = str;
        this.d = i3;
        this.f19005e = i4;
        this.f = i5;
    }

    public static HevcConfig a(ParsableByteArray parsableByteArray) throws ParserException {
        boolean z2;
        try {
            parsableByteArray.G(21);
            int iU = parsableByteArray.u() & 3;
            int iU2 = parsableByteArray.u();
            int i2 = parsableByteArray.f18957b;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                z2 = true;
                if (i4 >= iU2) {
                    break;
                }
                parsableByteArray.G(1);
                int iZ = parsableByteArray.z();
                for (int i6 = 0; i6 < iZ; i6++) {
                    int iZ2 = parsableByteArray.z();
                    i5 += iZ2 + 4;
                    parsableByteArray.G(iZ2);
                }
                i4++;
            }
            parsableByteArray.F(i2);
            byte[] bArr = new byte[i5];
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            float f = 1.0f;
            String strA = null;
            int i10 = 0;
            int i11 = 0;
            while (i10 < iU2) {
                int iU3 = parsableByteArray.u() & 63;
                int iZ3 = parsableByteArray.z();
                int i12 = i3;
                while (i12 < iZ3) {
                    int iZ4 = parsableByteArray.z();
                    boolean z3 = z2;
                    int i13 = iU;
                    System.arraycopy(NalUnitUtil.f18927a, i3, bArr, i11, 4);
                    int i14 = i11 + 4;
                    System.arraycopy(parsableByteArray.f18956a, parsableByteArray.f18957b, bArr, i14, iZ4);
                    if (iU3 == 33 && i12 == 0) {
                        NalUnitUtil.H265SpsData h265SpsDataC = NalUnitUtil.c(i14, i14 + iZ4, bArr);
                        i7 = h265SpsDataC.j;
                        i8 = h265SpsDataC.k;
                        i9 = h265SpsDataC.f18936l;
                        f = h265SpsDataC.f18935i;
                        strA = CodecSpecificDataUtil.a(h265SpsDataC.f18930a, h265SpsDataC.f18931b, h265SpsDataC.f18932c, h265SpsDataC.d, h265SpsDataC.f18933e, h265SpsDataC.f);
                    }
                    i11 = i14 + iZ4;
                    parsableByteArray.G(iZ4);
                    i12++;
                    z2 = z3;
                    iU = i13;
                    iU2 = iU2;
                    i3 = 0;
                }
                i10++;
                i3 = 0;
            }
            return new HevcConfig(i5 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iU + 1, f, strA, i7, i8, i9);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw ParserException.a(e2, "Error parsing HEVC config");
        }
    }
}
