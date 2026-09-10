package xn;

import com.ironsource.B5;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f53927a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f53928b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f53929c = new b();

    public static final h a(b bVar, String str) {
        h hVar = new h(str);
        h.f53948d.put(str, hVar);
        return hVar;
    }

    public static String b(String str, int i10, int i11, int i12, String str2) throws EOFException {
        int i13 = (i12 & 1) != 0 ? 0 : i10;
        int length = (i12 & 2) != 0 ? str.length() : i11;
        boolean z10 = (i12 & 8) == 0;
        boolean z11 = (i12 & 16) == 0;
        boolean z12 = (i12 & 32) == 0;
        boolean z13 = (i12 & 64) == 0;
        kotlin.jvm.internal.n.f(str, "<this>");
        int iCharCount = i13;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i14 = 128;
            int i15 = 32;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z13) || an.h.r0(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z10 || (z11 && !d(str, iCharCount, length)))) || (iCodePointAt == 43 && z12)))) {
                lo.e eVar = new lo.e();
                eVar.u(i13, iCharCount, str);
                lo.e eVar2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z10 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 43 && z12) {
                            eVar.v(z10 ? "+" : "%2B");
                        } else if (iCodePointAt2 < i15 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i14 && !z13) || an.h.r0(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z10 || (z11 && !d(str, iCharCount, length)))))) {
                            if (eVar2 == null) {
                                eVar2 = new lo.e();
                            }
                            eVar2.w(iCodePointAt2);
                            while (!eVar2.exhausted()) {
                                byte b10 = eVar2.readByte();
                                eVar.q(37);
                                char[] cArr = m.f53988j;
                                eVar.q(cArr[((b10 & 255) >> 4) & 15]);
                                eVar.q(cArr[b10 & 15]);
                            }
                        } else {
                            eVar.w(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i14 = 128;
                    i15 = 32;
                }
                return eVar.readUtf8();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strSubstring = str.substring(i13, length);
        kotlin.jvm.internal.n.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static boolean d(String str, int i10, int i11) {
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && yn.a.q(str.charAt(i10 + 1)) != -1 && yn.a.q(str.charAt(i12)) != -1;
    }

    public static String e(String str, int i10, int i11, int i12) {
        int i13;
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        boolean z10 = (i12 & 4) == 0;
        kotlin.jvm.internal.n.f(str, "<this>");
        int iCharCount = i10;
        while (iCharCount < i11) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                lo.e eVar = new lo.e();
                eVar.u(i10, iCharCount, str);
                while (iCharCount < i11) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i13 = iCharCount + 2) < i11) {
                        int iQ = yn.a.q(str.charAt(iCharCount + 1));
                        int iQ2 = yn.a.q(str.charAt(i13));
                        if (iQ == -1 || iQ2 == -1) {
                            eVar.w(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            eVar.q((iQ << 4) + iQ2);
                            iCharCount = Character.charCount(iCodePointAt) + i13;
                        }
                    } else if (iCodePointAt == 43 && z10) {
                        eVar.q(32);
                        iCharCount++;
                    } else {
                        eVar.w(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return eVar.readUtf8();
            }
            iCharCount++;
        }
        String strSubstring = str.substring(i10, i11);
        kotlin.jvm.internal.n.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static ArrayList f(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 <= str.length()) {
            int iV0 = an.h.v0(str, '&', i10, 4);
            if (iV0 == -1) {
                iV0 = str.length();
            }
            int iV1 = an.h.v0(str, B5.U, i10, 4);
            if (iV1 == -1 || iV1 > iV0) {
                String strSubstring = str.substring(i10, iV0);
                kotlin.jvm.internal.n.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring);
                arrayList.add(null);
            } else {
                String strSubstring2 = str.substring(i10, iV1);
                kotlin.jvm.internal.n.e(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring2);
                String strSubstring3 = str.substring(iV1 + 1, iV0);
                kotlin.jvm.internal.n.e(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring3);
            }
            i10 = iV0 + 1;
        }
        return arrayList;
    }

    public synchronized h c(String javaName) {
        h hVar;
        String strConcat;
        try {
            kotlin.jvm.internal.n.f(javaName, "javaName");
            LinkedHashMap linkedHashMap = h.f53948d;
            hVar = (h) linkedHashMap.get(javaName);
            if (hVar == null) {
                if (an.p.p0(javaName, "TLS_", false)) {
                    String strSubstring = javaName.substring(4);
                    kotlin.jvm.internal.n.e(strSubstring, "this as java.lang.String).substring(startIndex)");
                    strConcat = "SSL_".concat(strSubstring);
                } else if (an.p.p0(javaName, "SSL_", false)) {
                    String strSubstring2 = javaName.substring(4);
                    kotlin.jvm.internal.n.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
                    strConcat = "TLS_".concat(strSubstring2);
                } else {
                    strConcat = javaName;
                }
                hVar = (h) linkedHashMap.get(strConcat);
                if (hVar == null) {
                    hVar = new h(javaName);
                }
                linkedHashMap.put(javaName, hVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return hVar;
    }
}
