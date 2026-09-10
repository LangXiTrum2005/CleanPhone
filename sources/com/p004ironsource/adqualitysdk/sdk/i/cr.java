package com.p004ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import com.p004ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.p004ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class cr extends cz {

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1457 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f1458 = true;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f1459 = {'e', 136, AbstractJsonLexerKt.UNICODE_ESC, 153, 133, 144, 141, 152, 157, 'w', 'h', 'o'};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1460 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f1461 = true;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1462 = 36;

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    public static JSONObject m1680() {
        f1457 = (f1460 + 13) % 128;
        JSONObject jSONObjectM451 = as.m467().mo479().m451();
        int i2 = f1457 + 121;
        f1460 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 58 / 0;
        }
        return jSONObjectM451;
    }

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    private static ig m1681() {
        f1460 = (f1457 + 37) % 128;
        ig igVarM2589 = jg.m2576().m2589();
        int i2 = f1460 + 57;
        f1457 = i2 % 128;
        if (i2 % 2 != 0) {
            return igVarM2589;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public static String m1682() {
        int i2 = f1457 + 71;
        f1460 = i2 % 128;
        if (i2 % 2 != 0) {
            as.m467().mo479().m452();
            throw null;
        }
        String strM452 = as.m467().mo479().m452();
        int i3 = f1457 + 101;
        f1460 = i3 % 128;
        if (i3 % 2 == 0) {
            return strM452;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public static JSONObject m1683() {
        int i2 = f1457 + 51;
        f1460 = i2 % 128;
        if (i2 % 2 == 0) {
            return as.m467().mo479().m501();
        }
        as.m467().mo479().m501();
        throw null;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public static double m1684() {
        f1457 = (f1460 + 63) % 128;
        double dMo484 = as.m467().mo484();
        f1460 = (f1457 + 71) % 128;
        return dMo484;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public static boolean m1685() {
        f1457 = (f1460 + 13) % 128;
        boolean zMo483 = as.m467().mo483();
        int i2 = f1457 + 87;
        f1460 = i2 % 128;
        if (i2 % 2 == 0) {
            return zMo483;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public static boolean m1686() {
        f1460 = (f1457 + 41) % 128;
        boolean zMo490 = as.m467().mo490();
        int i2 = f1457 + 125;
        f1460 = i2 % 128;
        if (i2 % 2 == 0) {
            return zMo490;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static dk m1687() {
        dk dkVar = new dk();
        f1460 = (f1457 + 3) % 128;
        return dkVar;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static dg m1688() {
        dg dgVar = new dg();
        int i2 = f1457 + 25;
        f1460 = i2 % 128;
        if (i2 % 2 == 0) {
            return dgVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static String m1690() {
        int i2 = f1460 + 81;
        f1457 = i2 % 128;
        if (i2 % 2 == 0) {
            IronSourceAdQuality.getSDKVersion();
            throw null;
        }
        String sDKVersion = IronSourceAdQuality.getSDKVersion();
        int i3 = f1460 + 81;
        f1457 = i3 % 128;
        if (i3 % 2 != 0) {
            return sDKVersion;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static di m1692() {
        di diVar = new di();
        f1457 = (f1460 + 109) % 128;
        return diVar;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static JSONObject m1694() {
        int i2 = f1457 + 103;
        f1460 = i2 % 128;
        if (i2 % 2 != 0) {
            kc.m2767(as.m467().m501());
            throw null;
        }
        JSONObject jSONObjectM2767 = kc.m2767(as.m467().m501());
        f1460 = (f1457 + 43) % 128;
        return jSONObjectM2767;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Activity m1695() {
        int i2 = f1457 + 45;
        f1460 = i2 % 128;
        if (i2 % 2 == 0) {
            return ji.m2594().mo2600();
        }
        ji.m2594().mo2600();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static JSONObject m1700() {
        int i2 = f1460 + 9;
        f1457 = i2 % 128;
        if (i2 % 2 == 0) {
            ig igVarM1681 = m1681();
            kc.m2766(igVarM1681.m2413(), igVarM1681.m2410(), igVarM1681.m2412(), igVarM1681.m2411());
            throw null;
        }
        ig igVarM1682 = m1681();
        JSONObject jSONObjectM2766 = kc.m2766(igVarM1682.m2413(), igVarM1682.m2410(), igVarM1682.m2412(), igVarM1682.m2411());
        int i3 = f1460 + 21;
        f1457 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 24 / 0;
        }
        return jSONObjectM2766;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Object m1703(cp cpVar, List<Object> list) {
        f1460 = (f1457 + 61) % 128;
        cpVar.m1625((String) cz.m1785(list, 0, String.class), (JSONObject) cz.m1785(list, 1, JSONObject.class));
        f1457 = (f1460 + 29) % 128;
        return null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static Object m1706(cp cpVar) {
        f1460 = (f1457 + 125) % 128;
        cn cnVarM1618 = cpVar.m1618();
        int i2 = f1457 + 79;
        f1460 = i2 % 128;
        if (i2 % 2 == 0) {
            return cnVarM1618;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final Object m1711(final cp cpVar, List<Object> list, final dr drVar) {
        final dt dtVar = (dt) cz.m1785(list, 0, dt.class);
        if (dtVar != null) {
            cpVar.m1619(new in() { // from class: com.ironsource.adqualitysdk.sdk.i.cr.2
                @Override // com.p004ironsource.adqualitysdk.sdk.i.in
                /* JADX INFO: renamed from: ﻛ */
                public final JSONObject mo636(String str, JSONObject jSONObject) {
                    return (JSONObject) dtVar.m2037(drVar, cpVar, Arrays.asList(str, jSONObject)).m2043();
                }
            });
            f1457 = (f1460 + 107) % 128;
        }
        f1457 = (f1460 + 87) % 128;
        return null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static String m1689(cp cpVar) {
        f1460 = (f1457 + 59) % 128;
        String strM2256 = cpVar.m1626().m2256();
        f1457 = (f1460 + 17) % 128;
        return strM2256;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static String m1691(cp cpVar) {
        f1460 = (f1457 + 55) % 128;
        String strM1552 = cpVar.m1618().m1552();
        f1457 = (f1460 + 65) % 128;
        return strM1552;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static String m1693(cp cpVar) {
        int i2 = f1460 + 3;
        f1457 = i2 % 128;
        int i3 = i2 % 2;
        cn cnVarM1618 = cpVar.m1618();
        if (i3 == 0) {
            cnVarM1618.m1557();
            throw null;
        }
        String strM1557 = cnVarM1618.m1557();
        int i4 = f1457 + 93;
        f1460 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 73 / 0;
        }
        return strM1557;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static JSONObject m1697(cp cpVar) {
        f1460 = (f1457 + 79) % 128;
        JSONObject jSONObjectM1617 = cpVar.m1617();
        int i2 = f1457 + 75;
        f1460 = i2 % 128;
        if (i2 % 2 == 0) {
            return jSONObjectM1617;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static long m1705() {
        f1460 = (f1457 + 121) % 128;
        long jM2412 = m1681().m2412();
        f1457 = (f1460 + 85) % 128;
        return jM2412;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Object m1696(List<Object> list) {
        f1457 = (f1460 + 1) % 128;
        n.m2830(m1699(null, null, Color.blue(0) + 127, "\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), (String) cz.m1785(list, 0, String.class));
        f1457 = (f1460 + 85) % 128;
        return null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static dh m1707() {
        dh dhVar = new dh();
        f1460 = (f1457 + 107) % 128;
        return dhVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static String m1698(cp cpVar) {
        f1457 = (f1460 + 51) % 128;
        String strM1547 = cpVar.m1618().m1547();
        f1460 = (f1457 + 61) % 128;
        return strM1547;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Object m1702(cp cpVar) {
        f1457 = (f1460 + 121) % 128;
        Context contextM1622 = cpVar.m1622();
        f1457 = (f1460 + 71) % 128;
        return contextM1622;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String m1708(cp cpVar) {
        f1460 = (f1457 + 125) % 128;
        String strM1550 = cpVar.m1618().m1550();
        int i2 = f1460 + 121;
        f1457 = i2 % 128;
        if (i2 % 2 != 0) {
            return strM1550;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static long m1701() {
        f1460 = (f1457 + 109) % 128;
        long jM2666 = ju.m2666();
        f1460 = (f1457 + 53) % 128;
        return jM2666;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String m1709(List<Object> list) {
        int i2 = f1457 + 117;
        f1460 = i2 % 128;
        int i3 = i2 % 2;
        return ISAdQualityAdType.fromInt(((Integer) cz.m1785(list, 0, Integer.class)).intValue()).name().toLowerCase();
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final Object m1710(List<Object> list) {
        String str;
        List<Object> listM1786;
        ax axVarM2903;
        int i2 = f1457 + 55;
        f1460 = i2 % 128;
        if (i2 % 2 != 0) {
            str = (String) cz.m1785(list, 1, String.class);
            listM1786 = cz.m1786(list, 0);
            axVarM2903 = r.m2874().m2903();
            if (axVarM2903 == null) {
                return null;
            }
        } else {
            str = (String) cz.m1785(list, 0, String.class);
            listM1786 = cz.m1786(list, 1);
            axVarM2903 = r.m2874().m2903();
            if (axVarM2903 == null) {
                return null;
            }
        }
        axVarM2903.m630(str, listM1786);
        f1457 = (f1460 + 25) % 128;
        return null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Object m1704(List<Object> list) {
        int i2 = f1460 + 125;
        f1457 = i2 % 128;
        int i3 = i2 % 2;
        return as.m467().mo479().m450((String) cz.m1785(list, 0, String.class));
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1699(String str, int[] iArr, int i2, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes(CharEncoding.ISO_8859_1);
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (o.f2877) {
            try {
                char[] cArr2 = f1459;
                int i3 = f1462;
                if (f1461) {
                    int length = bArr.length;
                    o.f2878 = length;
                    char[] cArr3 = new char[length];
                    o.f2879 = 0;
                    while (o.f2879 < o.f2878) {
                        int i4 = o.f2879;
                        int i5 = o.f2878 - 1;
                        int i6 = o.f2879;
                        cArr3[i4] = (char) (cArr2[bArr[i5 - i6] + i2] - i3);
                        o.f2879 = i6 + 1;
                    }
                    return new String(cArr3);
                }
                if (f1458) {
                    int length2 = cArr.length;
                    o.f2878 = length2;
                    char[] cArr4 = new char[length2];
                    o.f2879 = 0;
                    while (o.f2879 < o.f2878) {
                        int i7 = o.f2879;
                        int i8 = o.f2878 - 1;
                        int i9 = o.f2879;
                        cArr4[i7] = (char) (cArr2[cArr[i8 - i9] - i2] - i3);
                        o.f2879 = i9 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                o.f2878 = length3;
                char[] cArr5 = new char[length3];
                o.f2879 = 0;
                while (o.f2879 < o.f2878) {
                    int i10 = o.f2879;
                    int i11 = o.f2878 - 1;
                    int i12 = o.f2879;
                    cArr5[i10] = (char) (cArr2[iArr[i11 - i12] - i2] - i3);
                    o.f2879 = i12 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
