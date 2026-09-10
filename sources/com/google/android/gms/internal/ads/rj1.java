package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f19601a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static final zq1 a(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < '!' || cCharAt > '~') {
                StringBuilder sb2 = new StringBuilder(String.valueOf(cCharAt).length() + 33);
                sb2.append("Not a printable ASCII character: ");
                sb2.append(cCharAt);
                throw new aa.b(sb2.toString(), 7);
            }
            bArr[i10] = (byte) cCharAt;
        }
        return zq1.a(bArr);
    }

    public static final zq1 b(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < '!' || cCharAt > '~') {
                StringBuilder sb2 = new StringBuilder(String.valueOf(cCharAt).length() + 33);
                sb2.append("Not a printable ASCII character: ");
                sb2.append(cCharAt);
                throw new GeneralSecurityException(sb2.toString());
            }
            bArr[i10] = (byte) cCharAt;
        }
        return zq1.a(bArr);
    }

    public static boolean c(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (bArr2[i10] != bArr[i10]) {
                return false;
            }
        }
        return true;
    }
}
