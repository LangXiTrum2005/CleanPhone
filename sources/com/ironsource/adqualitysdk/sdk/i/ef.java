package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.InterfaceC0435l1;
import java.io.UnsupportedEncodingException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ef {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f1923 = {22, '&', 17};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1924 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1925 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2162(String str, int[] iArr, boolean z10) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (h.f2261) {
            try {
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                char[] cArr = new char[i11];
                System.arraycopy(f1923, i10, cArr, 0, i11);
                if (bArr != null) {
                    char[] cArr2 = new char[i11];
                    h.f2262 = 0;
                    char c4 = 0;
                    while (true) {
                        int i14 = h.f2262;
                        if (i14 >= i11) {
                            break;
                        }
                        if (bArr[i14] == 1) {
                            cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c4);
                        } else {
                            cArr2[i14] = (char) ((cArr[i14] << 1) - c4);
                        }
                        c4 = cArr2[i14];
                        h.f2262 = i14 + 1;
                    }
                    cArr = cArr2;
                }
                if (i13 > 0) {
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr, 0, cArr3, 0, i11);
                    int i15 = i11 - i13;
                    System.arraycopy(cArr3, 0, cArr, i15, i13);
                    System.arraycopy(cArr3, i13, cArr, 0, i15);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    h.f2262 = 0;
                    while (true) {
                        int i16 = h.f2262;
                        if (i16 >= i11) {
                            break;
                        }
                        cArr4[i16] = cArr[(i11 - i16) - 1];
                        h.f2262 = i16 + 1;
                    }
                    cArr = cArr4;
                }
                if (i12 > 0) {
                    h.f2262 = 0;
                    while (true) {
                        int i17 = h.f2262;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr[i17] = (char) (cArr[i17] - iArr[2]);
                        h.f2262 = i17 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public abstract ea mo2164(ee eeVar, cl clVar);

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final ea m2165(ee eeVar, cl clVar) {
        while (true) {
            ea eaVarMo2164 = this.mo2164(eeVar, clVar);
            if (eaVarMo2164 == null) {
                return eaVarMo2164;
            }
            int i10 = f1925 + 39;
            f1924 = i10 % 128;
            if (i10 % 2 != 0) {
                eaVarMo2164.m2124();
                throw null;
            }
            if (!(eaVarMo2164.m2124() instanceof ef)) {
                return eaVarMo2164;
            }
            int i11 = f1925 + 83;
            f1924 = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
            this = (ef) eaVarMo2164.m2124();
            f1924 = (f1925 + 65) % 128;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String m2163(Object[] objArr) throws UnsupportedEncodingException {
        String strM2162;
        StringBuilder sb2 = new StringBuilder();
        int length = objArr.length;
        boolean z10 = true;
        int i10 = 0;
        while (i10 < length) {
            Object obj = objArr[i10];
            if (!z10) {
                sb2.append(m2162("\u0000\u0000", new int[]{0, 2, 0, 1}, true).intern());
            }
            if (obj instanceof String) {
                int i11 = f1925 + 87;
                f1924 = i11 % 128;
                if (i11 % 2 != 0) {
                    sb2.append(m2162(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, new int[]{2, 1, 0, 0}, false).intern());
                    sb2.append(obj);
                    strM2162 = m2162(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, new int[]{2, 1, 0, 0}, false);
                } else {
                    sb2.append(m2162(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, new int[]{2, 1, 0, 0}, false).intern());
                    sb2.append(obj);
                    strM2162 = m2162(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, new int[]{2, 1, 0, 0}, false);
                }
                sb2.append(strM2162.intern());
            } else {
                sb2.append(obj);
                f1924 = (f1925 + InterfaceC0435l1.d.b.f29105b) % 128;
            }
            i10++;
            f1925 = (f1924 + 9) % 128;
            z10 = false;
        }
        return sb2.toString();
    }
}
