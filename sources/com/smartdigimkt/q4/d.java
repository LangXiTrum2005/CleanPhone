package com.smartdigimkt.q4;

import com.smartdigimkt.p4.p;
import com.smartdigimkt.p4.s;
import com.smartdigimkt.w3.t;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<byte[]> f37898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37899b;

    private d(List<byte[]> list, int i2) {
        this.f37898a = list;
        this.f37899b = i2;
    }

    public static d a(s sVar) throws t {
        try {
            sVar.f(21);
            int iX = sVar.x() & 3;
            int iX2 = sVar.x();
            int iC = sVar.c();
            int i2 = 0;
            for (int i3 = 0; i3 < iX2; i3++) {
                sVar.f(1);
                int iD = sVar.D();
                for (int i4 = 0; i4 < iD; i4++) {
                    int iD2 = sVar.D();
                    i2 += iD2 + 4;
                    sVar.f(iD2);
                }
            }
            sVar.e(iC);
            byte[] bArr = new byte[i2];
            int i5 = 0;
            for (int i6 = 0; i6 < iX2; i6++) {
                sVar.f(1);
                int iD3 = sVar.D();
                for (int i7 = 0; i7 < iD3; i7++) {
                    int iD4 = sVar.D();
                    byte[] bArr2 = p.f37595b;
                    System.arraycopy(bArr2, 0, bArr, i5, bArr2.length);
                    int length = i5 + bArr2.length;
                    System.arraycopy(sVar.f37616a, sVar.c(), bArr, length, iD4);
                    i5 = length + iD4;
                    sVar.f(iD4);
                }
            }
            return new d(i2 == 0 ? null : Collections.singletonList(bArr), iX + 1);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new t("Error parsing HEVC config", e2);
        }
    }
}
