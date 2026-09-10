package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2503kG extends AbstractC1552Mt {
    public static byte[] A02;
    public static final String A03;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 87);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{52, 54, 45, 51, 54, 45, 56, 61, -32, -27, -36, -47};
    }

    static {
        A01();
        A03 = C2503kG.class.getSimpleName();
    }

    public C2503kG(C2300gi c2300gi, VA va, String str, Uri uri, Map<String, String> mExtraData) {
        super(c2300gi, va, str);
        this.A00 = uri;
        this.A01 = mExtraData;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1552Mt
    public final EnumC1549Mq A0G(String str) {
        VC vc = VC.A05;
        String queryParameter = this.A00.getQueryParameter(A00(0, 8, 109));
        if (!TextUtils.isEmpty(queryParameter)) {
            try {
                vc = VC.values()[Integer.valueOf(queryParameter).intValue()];
            } catch (Exception unused) {
            }
        }
        this.A02.ABq(this.A03, this.A01, this.A00.getQueryParameter(A00(8, 4, 21)), vc);
        return EnumC1549Mq.A09;
    }
}
