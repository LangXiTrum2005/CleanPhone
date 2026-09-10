package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.CodecSpecificDataUtil;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class AvcConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f18987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18989c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f18990e;
    public final String f;

    public AvcConfig(ArrayList arrayList, int i2, int i3, int i4, float f, String str) {
        this.f18987a = arrayList;
        this.f18988b = i2;
        this.f18989c = i3;
        this.d = i4;
        this.f18990e = f;
        this.f = str;
    }

    public static AvcConfig a(ParsableByteArray parsableByteArray) throws ParserException {
        byte[] bArr;
        float f;
        String str;
        int i2;
        int i3;
        try {
            parsableByteArray.G(4);
            int iU = (parsableByteArray.u() & 3) + 1;
            if (iU == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iU2 = parsableByteArray.u() & 31;
            int i4 = 0;
            while (true) {
                bArr = CodecSpecificDataUtil.f18893a;
                if (i4 >= iU2) {
                    break;
                }
                int iZ = parsableByteArray.z();
                int i5 = parsableByteArray.f18957b;
                parsableByteArray.G(iZ);
                byte[] bArr2 = parsableByteArray.f18956a;
                byte[] bArr3 = new byte[iZ + 4];
                System.arraycopy(bArr, 0, bArr3, 0, 4);
                System.arraycopy(bArr2, i5, bArr3, 4, iZ);
                arrayList.add(bArr3);
                i4++;
            }
            int iU3 = parsableByteArray.u();
            for (int i6 = 0; i6 < iU3; i6++) {
                int iZ2 = parsableByteArray.z();
                int i7 = parsableByteArray.f18957b;
                parsableByteArray.G(iZ2);
                byte[] bArr4 = parsableByteArray.f18956a;
                byte[] bArr5 = new byte[iZ2 + 4];
                System.arraycopy(bArr, 0, bArr5, 0, 4);
                System.arraycopy(bArr4, i7, bArr5, 4, iZ2);
                arrayList.add(bArr5);
            }
            if (iU2 > 0) {
                NalUnitUtil.SpsData spsDataD = NalUnitUtil.d(iU, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                int i8 = spsDataD.f18942e;
                int i9 = spsDataD.f;
                f = spsDataD.g;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(spsDataD.f18939a), Integer.valueOf(spsDataD.f18940b), Integer.valueOf(spsDataD.f18941c));
                i2 = i8;
                i3 = i9;
            } else {
                f = 1.0f;
                str = null;
                i2 = -1;
                i3 = -1;
            }
            return new AvcConfig(arrayList, iU, i2, i3, f, str);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw ParserException.a(e2, "Error parsing AVC config");
        }
    }
}
