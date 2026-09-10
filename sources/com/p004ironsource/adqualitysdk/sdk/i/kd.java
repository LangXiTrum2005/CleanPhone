package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewConfiguration;
import com.applovin.shadow.okio.Segment;
import com.google.firebase.crashlytics.internal.model.a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes5.dex */
public final class kd {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int[] f2852 = {1132528989, 2100046207, 772621006, -1676773601, -1716838290, -2080332474, 853767237, 751506620, -426276183, -1502417308, 514087459, -18383282, -1766603228, -1108171582, 1414490676, -1944048013, -1066531493, 1796500921};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2853 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2854 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static String m2774(String str) {
        if (str == null || s.m2927() || !m2780(str)) {
            f2854 = (f2853 + 123) % 128;
            return null;
        }
        int i2 = 0;
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 0));
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            new ByteArrayOutputStream();
            byte[] bArr = new byte[Segment.SIZE];
            f2853 = (f2854 + 7) % 128;
            while (true) {
                int i3 = gZIPInputStream.read(bArr, i2, 8192 - i2);
                if (i3 == -1) {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return new String(bArr, m2779(new int[]{560130318, -1453844843, -1639978930, 1598181672}, 5 - (ViewConfiguration.getTapTimeout() >> 16)).intern());
                }
                i2 += i3;
                f2854 = (f2853 + 19) % 128;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static List<String> m2775(String str, String str2) {
        f2853 = (f2854 + 51) % 128;
        List<String> listM2776 = m2776(str, str2, false);
        f2853 = (f2854 + 87) % 128;
        return listM2776;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static String m2778(String str, String str2) {
        f2854 = (f2853 + 21) % 128;
        String strSubstring = str.substring(0, str.length() - str2.length());
        int i2 = f2853 + 1;
        f2854 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 30 / 0;
        }
        return strSubstring;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static int m2781(String str, String str2) {
        int i2 = 0;
        String[] strArrSplit = str.replaceAll(m2779(new int[]{985409169, -359610529, 2060529772, 1743535469}, 7 - View.MeasureSpec.getMode(0)).intern(), "").split(m2779(new int[]{-228065143, 445564217}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2).intern());
        String[] strArrSplit2 = str2.replaceAll(m2779(new int[]{985409169, -359610529, 2060529772, 1743535469}, View.MeasureSpec.makeMeasureSpec(0, 0) + 7).intern(), "").split(m2779(new int[]{-228065143, 445564217}, 1 - Process.getGidForName("")).intern());
        while (i2 < strArrSplit.length) {
            f2853 = (f2854 + 117) % 128;
            if (i2 >= strArrSplit2.length || !strArrSplit[i2].equals(strArrSplit2[i2])) {
                break;
            }
            int i3 = (f2853 + 25) % 128;
            f2854 = i3;
            i2++;
            f2853 = (i3 + 11) % 128;
        }
        if (i2 < strArrSplit.length && i2 < strArrSplit2.length) {
            f2853 = (f2854 + 55) % 128;
            return Integer.signum(Integer.valueOf(strArrSplit[i2]).compareTo(Integer.valueOf(strArrSplit2[i2])));
        }
        int iSignum = Integer.signum(strArrSplit.length - strArrSplit2.length);
        int i4 = f2854 + 31;
        f2853 = i4 % 128;
        if (i4 % 2 == 0) {
            return iSignum;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m2786(String str) {
        f2853 = (f2854 + 71) % 128;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        boolean zMatches = str.matches(m2779(new int[]{-1656398929, 1521400588, -1725874605, 1404441267, 1359639015, -641560657, 1095001018, -1965658872}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 14).intern());
        f2854 = (f2853 + 55) % 128;
        return zMatches;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static List<String> m2776(String str, String str2, boolean z2) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = Pattern.compile(str2).matcher(str);
        loop0: while (matcher.find()) {
            if (matcher.groupCount() == 0) {
                int i2 = f2853 + 63;
                f2854 = i2 % 128;
                if (i2 % 2 == 0) {
                    arrayList.add(matcher.group());
                    throw null;
                }
                arrayList.add(matcher.group());
                if (z2) {
                    break;
                }
            } else {
                for (int i3 = 1; i3 <= matcher.groupCount(); i3++) {
                    f2853 = (f2854 + 5) % 128;
                    arrayList.add(matcher.group(i3));
                    if (z2) {
                        break loop0;
                    }
                }
                f2853 = (f2854 + 89) % 128;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static boolean m2780(String str) {
        if (!s.m2927()) {
            try {
                new GZIPInputStream(new ByteArrayInputStream(Base64.decode(str, 0)));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
        int i2 = (f2854 + 33) % 128;
        f2853 = i2;
        f2854 = (i2 + 85) % 128;
        return false;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2779(int[] iArr, int i2) {
        String str;
        synchronized (d.f1586) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2852.clone();
                d.f1584 = 0;
                while (true) {
                    int i3 = d.f1584;
                    if (i3 < iArr.length) {
                        int i4 = iArr[i3];
                        char c2 = (char) (i4 >> 16);
                        cArr[0] = c2;
                        char c3 = (char) i4;
                        cArr[1] = c3;
                        char c4 = (char) (iArr[i3 + 1] >> 16);
                        cArr[2] = c4;
                        char c5 = (char) iArr[i3 + 1];
                        cArr[3] = c5;
                        d.f1587 = (c2 << 16) + c3;
                        d.f1585 = (c4 << 16) + c5;
                        d.m1788(iArr2);
                        for (int i5 = 0; i5 < 16; i5++) {
                            int i6 = d.f1587 ^ iArr2[i5];
                            d.f1587 = i6;
                            int iM1787 = d.m1787(i6) ^ d.f1585;
                            int i7 = d.f1587;
                            d.f1587 = iM1787;
                            d.f1585 = i7;
                        }
                        int i8 = d.f1587;
                        int i9 = d.f1585;
                        d.f1587 = i9;
                        d.f1585 = i8;
                        int i10 = i8 ^ iArr2[16];
                        d.f1585 = i10;
                        int i11 = i9 ^ iArr2[17];
                        d.f1587 = i11;
                        cArr[0] = (char) (i11 >>> 16);
                        cArr[1] = (char) i11;
                        cArr[2] = (char) (i10 >>> 16);
                        cArr[3] = (char) i10;
                        d.m1788(iArr2);
                        int i12 = d.f1584;
                        cArr2[i12 << 1] = cArr[0];
                        cArr2[(i12 << 1) + 1] = cArr[1];
                        cArr2[(i12 << 1) + 2] = cArr[2];
                        cArr2[(i12 << 1) + 3] = cArr[3];
                        d.f1584 = i12 + 2;
                    } else {
                        str = new String(cArr2, 0, i2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static List<String> m2785(String str, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < jSONArray.length()) {
            int i3 = f2854 + 1;
            f2853 = i3 % 128;
            if (i3 % 2 != 0) {
                arrayList.addAll(m2776(str, jSONArray.optString(i2), false));
                i2 += 67;
            } else {
                arrayList.addAll(m2776(str, jSONArray.optString(i2), false));
                i2++;
            }
            f2854 = (f2853 + 95) % 128;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static boolean m2777(String str, int i2) {
        if (TextUtils.isEmpty(str) || str.length() <= 0 || str.length() > i2) {
            f2854 = (f2853 + 23) % 128;
            return false;
        }
        f2854 = (f2853 + 47) % 128;
        return true;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static String m2784(String str, JSONArray jSONArray, boolean z2) {
        f2853 = (f2854 + 73) % 128;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            int i3 = f2853 + 119;
            f2854 = i3 % 128;
            if (i3 % 2 != 0) {
                String strM2783 = m2783(str, jSONArray.optString(i2), z2);
                if (strM2783 != null) {
                    f2854 = (f2853 + 69) % 128;
                    return strM2783;
                }
            } else {
                m2783(str, jSONArray.optString(i2), z2);
                throw null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static String m2783(String str, String str2, boolean z2) {
        if (!(!z2)) {
            str2 = m2782(str2);
        }
        List<String> listM2776 = m2776(str, str2, true);
        if (listM2776.size() <= 0) {
            return null;
        }
        f2853 = (f2854 + 1) % 128;
        String str3 = listM2776.get(0);
        f2853 = (f2854 + 123) % 128;
        return str3;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2782(String str) {
        f2854 = (f2853 + 25) % 128;
        if (!TextUtils.isEmpty(str)) {
            if (!str.startsWith(m2779(new int[]{-868200626, -230600055}, View.resolveSize(0, 0) + 1).intern())) {
                str = a.n(new StringBuilder(), m2779(new int[]{-1503753903, -986068475, -1279442120, -436675457}, 8 - Color.argb(0, 0, 0, 0)), str);
            }
            if (!str.endsWith(m2779(new int[]{-696718996, 273500843}, View.resolveSize(0, 0) + 1).intern())) {
                str = a.C(android.support.v4.media.a.w(str), m2779(new int[]{-397471083, -2042626781, 368099735, -712857515}, 7 - TextUtils.indexOf("", "", 0, 0)));
                f2853 = (f2854 + 91) % 128;
            }
        }
        int i2 = f2853 + 123;
        f2854 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
