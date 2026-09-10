package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class dt {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static boolean f1795 = true;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f1796 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static boolean f1797 = true;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1798 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f1799 = {377, 394, 383, 395, 378, 391, 380, 401, 349, 312, 392, 385, 390, 389, 381, 396, 384, 357, 397, 388, 400, 379, 398};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1800 = 280;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String[] f1801;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f1802;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private fq f1803;

    public dt(String str, String str2, JSONObject jSONObject) {
        this.f1802 = dw.m2051(str2);
        List listM2764 = kc.m2764(jSONObject.optJSONArray(m2035(null, null, Color.alpha(0) + 127, "\u0084\u0083\u0082\u0081").intern()), new kc.b<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.dt.1
            @Override // com.ironsource.adqualitysdk.sdk.i.kc.b
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ String mo535(JSONArray jSONArray, int i2) {
                return dw.m2051(jSONArray.optString(i2));
            }
        });
        String[] strArr = new String[listM2764.size()];
        this.f1801 = strArr;
        listM2764.toArray(strArr);
        try {
            this.f1803 = new ds(str, str2).m2029(dq.m1974(str, str2, jSONObject.optString(m2035(null, null, 128 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "\u0088\u0087\u0086\u0085").intern())));
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder();
            sb.append(m2035(null, null, View.MeasureSpec.getMode(0) + 127, "\u008a\u0087\u0086\u0091\u0090\u008f\u008e\u008a\u0083\u008d\u008c\u0084\u0082\u0081\u008b\u008a\u0082\u0086\u0082\u0082\u0089").intern());
            sb.append(this.f1802);
            cq.m1676(str, sb.toString(), th);
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2035(String str, int[] iArr, int i2, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f1799;
                int i3 = f1800;
                if (f1797) {
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
                if (f1795) {
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

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Map<String, Object> m2036(cp cpVar, List<Object> list, List<String> list2) {
        if (list.size() == list2.size()) {
            HashMap map = new HashMap();
            f1796 = (f1798 + 81) % 128;
            for (int i2 = 0; i2 < list.size(); i2++) {
                f1796 = (f1798 + 123) % 128;
                map.put(list2.get(i2), list.get(i2));
            }
            return map;
        }
        String strM1616 = cpVar.m1616();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1802);
        sb.append(m2035(null, null, KeyEvent.getDeadChar(0, 0) + 127, "\u008a\u0087\u008f\u0090\u0096\u008f\u008b\u0095\u008f\u008a\u0087\u0086\u0091\u0090\u008f\u008e\u008a").intern());
        sb.append(list2.size());
        sb.append(m2035(null, null, 127 - View.MeasureSpec.getSize(0), "\u008a\u0087\u008f\u0097\u008c\u008f\u0096\u008f\u0082\u008a\u0090\u0093\u0085\u008a\u0084\u0090\u008d\u008f\u008e\u0093\u0083\u0082\u0081\u008a").intern());
        sb.append(list.size());
        cq.m1676(strM1616, sb.toString(), null);
        return null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m2038() {
        int i2 = f1798;
        int i3 = i2 + 25;
        f1796 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.f1802;
        f1796 = (i2 + 95) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final du m2037(dr drVar, cp cpVar, List<Object> list) {
        dr drVar2 = new dr(m2036(cpVar, list, Arrays.asList(this.f1801)), drVar.m1983());
        fq fqVar = this.f1803;
        if (fqVar != null) {
            f1798 = (f1796 + 39) % 128;
            du duVarMo2122 = fqVar.mo2122(drVar2, cpVar);
            f1796 = (f1798 + 57) % 128;
            return duVarMo2122;
        }
        String strM1616 = cpVar.m1616();
        StringBuilder sb = new StringBuilder();
        sb.append(m2035(null, null, (ViewConfiguration.getLongPressTimeout() >> 16) + 127, "\u008a\u0087\u0086\u0091\u0090\u008f\u0092").intern());
        sb.append(this.f1802);
        sb.append(m2035(null, null, MotionEvent.axisFromString("") + 128, "\u0088\u0087\u0086\u0085\u008a\u0094\u0094\u0093\u008d\u008a\u0084\u0081\u0091\u008a").intern());
        cq.m1676(strM1616, sb.toString(), null);
        return null;
    }
}
