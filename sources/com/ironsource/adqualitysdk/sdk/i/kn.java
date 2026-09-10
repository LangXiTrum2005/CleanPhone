package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.util.Base64;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class kn {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f3046 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f3047 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f3048 = {'.', 'E', '3', '3', '.', 'G', '\\', '{', 224, 'r', 226, 228, 205, 217, 227, 189, 201, 203, 180, 185, 209, 201, 173, '/', 21, 'C', 'X', 'W', 'g', 'g', '[', '\\', 18, 129, 259, 271, 271, 255, 256, 235, 'L', 160, 167, 153, 133};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static int m2912(String str, String str2) {
        f3046 = (f3047 + 93) % 128;
        int i10 = 0;
        String[] strArrSplit = str.replaceAll(m2920("\u0001\u0001\u0001\u0000\u0001\u0000\u0001", new int[]{0, 7, 0, 0}, true).intern(), "").split(m2920("\u0001\u0000", new int[]{7, 2, 155, 2}, false).intern());
        String[] strArrSplit2 = str2.replaceAll(m2920("\u0001\u0001\u0001\u0000\u0001\u0000\u0001", new int[]{0, 7, 0, 0}, true).intern(), "").split(m2920("\u0001\u0000", new int[]{7, 2, 155, 2}, false).intern());
        while (i10 < strArrSplit.length) {
            int i11 = (f3047 + 11) % 128;
            f3046 = i11;
            if (i10 >= strArrSplit2.length) {
                break;
            }
            f3047 = (i11 + 35) % 128;
            if (!strArrSplit[i10].equals(strArrSplit2[i10])) {
                break;
            }
            i10++;
        }
        if (i10 >= strArrSplit.length || i10 >= strArrSplit2.length) {
            return Integer.signum(strArrSplit.length - strArrSplit2.length);
        }
        int i12 = f3046 + 11;
        f3047 = i12 % 128;
        if (i12 % 2 != 0) {
            return Integer.signum(Integer.valueOf(strArrSplit[i10]).compareTo(Integer.valueOf(strArrSplit2[i10])));
        }
        Integer.signum(Integer.valueOf(strArrSplit[i10]).compareTo(Integer.valueOf(strArrSplit2[i10])));
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static List<String> m2916(String str, String str2) {
        int i10 = f3047 + 31;
        f3046 = i10 % 128;
        return m2917(str, str2, i10 % 2 != 0);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static List<String> m2917(String str, String str2, boolean z10) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = Pattern.compile(str2).matcher(str);
        loop0: while (matcher.find()) {
            int i10 = f3046 + 61;
            f3047 = i10 % 128;
            if (i10 % 2 == 0) {
                matcher.groupCount();
                throw null;
            }
            if (matcher.groupCount() == 0) {
                arrayList.add(matcher.group());
                if (z10) {
                    int i11 = f3046;
                    int i12 = i11 + 73;
                    f3047 = i12 % 128;
                    if (i12 % 2 == 0) {
                        throw null;
                    }
                    f3047 = (i11 + 115) % 128;
                    return arrayList;
                }
            } else {
                for (int i13 = 1; i13 <= matcher.groupCount(); i13++) {
                    int i14 = f3046 + 99;
                    f3047 = i14 % 128;
                    if (i14 % 2 != 0) {
                        arrayList.add(matcher.group(i13));
                        if (z10) {
                            break loop0;
                        }
                    } else {
                        arrayList.add(matcher.group(i13));
                        int i15 = 38 / 0;
                        if (z10) {
                            return arrayList;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2920(String str, int[] iArr, boolean z10) throws UnsupportedEncodingException {
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
                System.arraycopy(f3048, i10, cArr, 0, i11);
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

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static List<String> m2923(String str, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < jSONArray.length()) {
            int i11 = f3047 + 119;
            f3046 = i11 % 128;
            if (i11 % 2 != 0) {
                arrayList.addAll(m2917(str, jSONArray.optString(i10), true));
                i10 += InterfaceC0435l1.d.b.f29109f;
            } else {
                arrayList.addAll(m2917(str, jSONArray.optString(i10), false));
                i10++;
            }
        }
        int i12 = f3047 + 49;
        f3046 = i12 % 128;
        if (i12 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static String m2915(String str, String str2, boolean z10) {
        int i10 = f3046 + InterfaceC0435l1.d.b.f29107d;
        f3047 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        if (z10) {
            str2 = m2913(str2);
        }
        List<String> listM2917 = m2917(str, str2, true);
        if (listM2917.size() > 0) {
            return listM2917.get(0);
        }
        f3046 = (f3047 + 121) % 128;
        return null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String m2922(String str, JSONArray jSONArray, boolean z10) {
        int i10 = f3046 + 59;
        f3047 = i10 % 128;
        for (int i11 = i10 % 2 == 0 ? 1 : 0; i11 < jSONArray.length(); i11++) {
            f3047 = (f3046 + 89) % 128;
            String strM2915 = m2915(str, jSONArray.optString(i11), z10);
            if (strM2915 != null) {
                return strM2915;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static String m2914(String str) {
        int i10 = f3046 + 91;
        f3047 = i10 % 128;
        if (i10 % 2 != 0) {
            if (str != null && !p.m2999() && m2918(str)) {
                int i11 = 0;
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 0));
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                    new ByteArrayOutputStream();
                    byte[] bArr = new byte[Segment.SIZE];
                    while (true) {
                        int i12 = gZIPInputStream.read(bArr, i11, 8192 - i11);
                        if (i12 != -1) {
                            i11 += i12;
                            f3047 = (f3046 + 53) % 128;
                        } else {
                            gZIPInputStream.close();
                            byteArrayInputStream.close();
                            return new String(bArr, m2920("\u0001\u0000\u0001\u0001\u0001", new int[]{40, 5, 83, 3}, true).intern());
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String m2921(String str, String str2) {
        int i10 = f3046 + 75;
        f3047 = i10 % 128;
        return i10 % 2 == 0 ? str.substring(1, str.length() >> str2.length()) : str.substring(0, str.length() - str2.length());
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m2924(String str) {
        f3046 = (f3047 + 11) % 128;
        if (TextUtils.isEmpty(str)) {
            f3047 = (f3046 + 49) % 128;
            return false;
        }
        return str.matches(m2920("\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000", new int[]{9, 14, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 0}, false).intern());
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2913(String str) {
        if (!TextUtils.isEmpty(str)) {
            f3046 = (f3047 + 87) % 128;
            if (!str.startsWith(m2920(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, new int[]{23, 1, 0, 1}, false).intern())) {
                str = f2.k(m2920("\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{24, 8, 0, 0}, true), str, new StringBuilder());
                f3047 = (f3046 + 125) % 128;
            }
            if (!str.endsWith(m2920(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, new int[]{32, 1, 0, 0}, true).intern())) {
                str = f2.m(d5.u.i(str), m2920("\u0001\u0001\u0001\u0001\u0001\u0000\u0001", new int[]{33, 7, 168, 0}, false));
            }
        }
        int i10 = f3047 + 35;
        f3046 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 72 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static boolean m2919(String str, int i10) {
        if (!TextUtils.isEmpty(str) && str.length() > 0) {
            f3046 = (f3047 + 123) % 128;
            if (str.length() <= i10) {
                int i11 = f3047 + 93;
                f3046 = i11 % 128;
                return i11 % 2 == 0;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static boolean m2918(String str) {
        int i10 = f3047 + 123;
        f3046 = i10 % 128;
        if (i10 % 2 == 0) {
            if (p.m2999()) {
                int i11 = f3047 + 9;
                f3046 = i11 % 128;
                if (i11 % 2 == 0) {
                    return false;
                }
                throw null;
            }
            try {
                new GZIPInputStream(new ByteArrayInputStream(Base64.decode(str, 0)));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
        p.m2999();
        throw null;
    }
}
