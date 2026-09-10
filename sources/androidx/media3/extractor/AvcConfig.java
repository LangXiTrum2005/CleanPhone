package androidx.media3.extractor;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.NalUnitUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class AvcConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f6709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6711c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6712e;
    public final int f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6713h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f6714i;
    public final int j;
    public final float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f6715l;

    public AvcConfig(ArrayList arrayList, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, String str) {
        this.f6709a = arrayList;
        this.f6710b = i2;
        this.f6711c = i3;
        this.d = i4;
        this.f6712e = i5;
        this.f = i6;
        this.g = i7;
        this.f6713h = i8;
        this.f6714i = i9;
        this.j = i10;
        this.k = f;
        this.f6715l = str;
    }

    public static AvcConfig a(ParsableByteArray parsableByteArray) throws ParserException {
        byte[] bArr;
        String str;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        float f;
        int i8;
        int i9;
        try {
            parsableByteArray.H(4);
            int iU = (parsableByteArray.u() & 3) + 1;
            if (iU == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iU2 = parsableByteArray.u() & 31;
            int i10 = 0;
            while (true) {
                bArr = CodecSpecificDataUtil.f5627a;
                if (i10 >= iU2) {
                    break;
                }
                int iA = parsableByteArray.A();
                int i11 = parsableByteArray.f5668b;
                parsableByteArray.H(iA);
                byte[] bArr2 = parsableByteArray.f5667a;
                byte[] bArr3 = new byte[iA + 4];
                System.arraycopy(bArr, 0, bArr3, 0, 4);
                System.arraycopy(bArr2, i11, bArr3, 4, iA);
                arrayList.add(bArr3);
                i10++;
            }
            int iU3 = parsableByteArray.u();
            for (int i12 = 0; i12 < iU3; i12++) {
                int iA2 = parsableByteArray.A();
                int i13 = parsableByteArray.f5668b;
                parsableByteArray.H(iA2);
                byte[] bArr4 = parsableByteArray.f5667a;
                byte[] bArr5 = new byte[iA2 + 4];
                System.arraycopy(bArr, 0, bArr5, 0, 4);
                System.arraycopy(bArr4, i13, bArr5, 4, iA2);
                arrayList.add(bArr5);
            }
            if (iU2 > 0) {
                NalUnitUtil.SpsData spsDataD = NalUnitUtil.d(iU, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                int i14 = spsDataD.f5711e;
                int i15 = spsDataD.f;
                int i16 = spsDataD.f5712h + 8;
                int i17 = spsDataD.f5713i + 8;
                int i18 = spsDataD.f5716p;
                int i19 = spsDataD.q;
                int i20 = spsDataD.r;
                int i21 = spsDataD.s;
                float f2 = spsDataD.g;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(spsDataD.f5708a), Integer.valueOf(spsDataD.f5709b), Integer.valueOf(spsDataD.f5710c));
                i5 = i19;
                i6 = i20;
                i7 = i21;
                f = f2;
                i3 = i15;
                i4 = i16;
                i8 = i17;
                i9 = i18;
                i2 = i14;
            } else {
                str = null;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = -1;
                i7 = 16;
                f = 1.0f;
                i8 = -1;
                i9 = -1;
            }
            return new AvcConfig(arrayList, iU, i2, i3, i4, i8, i9, i5, i6, i7, f, str);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw ParserException.a(e2, "Error parsing AVC config");
        }
    }
}
