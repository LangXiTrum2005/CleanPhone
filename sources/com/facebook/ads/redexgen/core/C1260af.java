package com.facebook.ads.redexgen.core;

import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.af, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1260af implements JQ {
    public static byte[] A04;
    public int A00;
    public String A01;
    public Map<String, List<String>> A02;
    public byte[] A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 124);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{72, 99, 114, 113, 105, 116, 109, 38, 99, 116, 116, 105, 116};
    }

    public C1260af(HttpURLConnection httpURLConnection, byte[] bArr) {
        try {
            this.A00 = httpURLConnection.getResponseCode();
            this.A01 = httpURLConnection.getURL().toString();
        } catch (IOException e) {
            Log.e(getClass().getSimpleName(), A00(0, 13, 122), e);
        }
        this.A02 = httpURLConnection.getHeaderFields();
        this.A03 = bArr;
    }

    @Override // com.facebook.ads.redexgen.core.JQ
    public final byte[] A6s() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.JQ
    public final String A6t() {
        if (this.A03 != null) {
            return new String(this.A03);
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.JQ
    public final Map<String, List<String>> A84() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.JQ
    public final int A92() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.JQ
    public final String getUrl() {
        return this.A01;
    }
}
