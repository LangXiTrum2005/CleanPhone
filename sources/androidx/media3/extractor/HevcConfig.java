package androidx.media3.extractor;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.NalUnitUtil;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class HevcConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6777c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6778e;
    public final int f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f6779h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f6780i;
    public final String j;

    public HevcConfig(List list, int i2, int i3, int i4, int i5, int i6, int i7, float f, int i8, String str) {
        this.f6775a = list;
        this.f6776b = i2;
        this.f6777c = i3;
        this.d = i4;
        this.f6778e = i5;
        this.f = i6;
        this.g = i7;
        this.f6779h = f;
        this.f6780i = i8;
        this.j = str;
    }

    public static HevcConfig a(ParsableByteArray parsableByteArray) throws ParserException {
        boolean z2;
        try {
            parsableByteArray.H(21);
            int iU = parsableByteArray.u() & 3;
            int iU2 = parsableByteArray.u();
            int i2 = parsableByteArray.f5668b;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                z2 = true;
                if (i4 >= iU2) {
                    break;
                }
                parsableByteArray.H(1);
                int iA = parsableByteArray.A();
                for (int i6 = 0; i6 < iA; i6++) {
                    int iA2 = parsableByteArray.A();
                    i5 += iA2 + 4;
                    parsableByteArray.H(iA2);
                }
                i4++;
            }
            parsableByteArray.G(i2);
            byte[] bArr = new byte[i5];
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            float f = 1.0f;
            String strA = null;
            int i13 = 0;
            int i14 = 0;
            while (i13 < iU2) {
                int iU3 = parsableByteArray.u() & 63;
                int iA3 = parsableByteArray.A();
                int i15 = i3;
                while (i15 < iA3) {
                    int iA4 = parsableByteArray.A();
                    boolean z3 = z2;
                    int i16 = iU;
                    System.arraycopy(NalUnitUtil.f5695a, i3, bArr, i14, 4);
                    int i17 = i14 + 4;
                    System.arraycopy(parsableByteArray.f5667a, parsableByteArray.f5668b, bArr, i17, iA4);
                    if (iU3 == 33 && i15 == 0) {
                        NalUnitUtil.H265SpsData h265SpsDataC = NalUnitUtil.c(i17, i17 + iA4, bArr);
                        i7 = h265SpsDataC.f5701e + 8;
                        i8 = h265SpsDataC.f + 8;
                        i9 = h265SpsDataC.m;
                        int i18 = h265SpsDataC.f5705n;
                        int i19 = h265SpsDataC.o;
                        float f2 = h265SpsDataC.k;
                        int i20 = h265SpsDataC.f5704l;
                        strA = CodecSpecificDataUtil.a(h265SpsDataC.f5698a, h265SpsDataC.f5699b, h265SpsDataC.f5700c, h265SpsDataC.d, h265SpsDataC.g, h265SpsDataC.f5702h);
                        f = f2;
                        i12 = i20;
                        i11 = i19;
                        i10 = i18;
                    }
                    i14 = i17 + iA4;
                    parsableByteArray.H(iA4);
                    i15++;
                    z2 = z3;
                    iU = i16;
                    iU2 = iU2;
                    i3 = 0;
                }
                i13++;
                i3 = 0;
            }
            return new HevcConfig(i5 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iU + 1, i7, i8, i9, i10, i11, f, i12, strA);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw ParserException.a(e2, "Error parsing HEVC config");
        }
    }
}
