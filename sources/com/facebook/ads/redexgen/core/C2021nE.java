package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.umeng.analytics.pro.cw;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2021nE extends AbstractC03841v {
    public static byte[] A01;
    public static final String A02;
    public final Uri A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 98);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{cw.n, 43, 51, 54, 47, 46, -22, 62, 57, -22, 57, 58, 47, 56, -22, 54, 51, 56, 53, -22, 63, 60, 54, 4, -22};
    }

    static {
        A01();
        A02 = C2021nE.class.getSimpleName();
    }

    public C2021nE(C1828k1 c1828k1, A7 a7, String str, Uri uri) {
        super(c1828k1, a7, str);
        this.A00 = uri;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC03841v
    public final EnumC03831u A0C(String str) {
        try {
            C2.A0D(new C2(), super.A00, this.A00, this.A02);
        } catch (Exception unused) {
            String str2 = A00(0, 25, 104) + this.A00.toString();
        }
        return EnumC03831u.A09;
    }
}
