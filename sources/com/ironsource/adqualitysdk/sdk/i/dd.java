package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0435l1;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class dd extends cw implements ch {

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    private static int f1660 = 1;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static int f1664 = 0;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static boolean f1666 = true;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1668 = 198;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static boolean f1669 = true;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f1671;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f1672;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private hs f1674;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f1675;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static char[] f1667 = {301, 299, 314, 263, 298, 316, 312, 303, 313, 271, 282, 319, 310, 266, 283, 306, 268, 308, 295, 281, 309, 315, 297, 302, 300, 272, 267, 230, 318, 307, 237};

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static char f1663 = 13209;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static char f1665 = 21660;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static char f1662 = 6230;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static char f1661 = 46934;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final JSONObject f1673 = new JSONObject();

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private final List<String> f1670 = new ArrayList();

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private JSONObject m1879() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f1672;
            if (str != null) {
                int i10 = (f1664 + 95) % 128;
                f1660 = i10;
                if (this.f1674 != null) {
                    int i11 = i10 + 63;
                    f1664 = i11 % 128;
                    if (i11 % 2 != 0) {
                        jSONObject.putOpt(is.f2598, str);
                        jSONObject.putOpt(is.f2602, Integer.valueOf(this.f1674.m2298()));
                        int i12 = 73 / 0;
                    } else {
                        jSONObject.putOpt(is.f2598, str);
                        jSONObject.putOpt(is.f2602, Integer.valueOf(this.f1674.m2298()));
                    }
                }
            }
            jSONObject.putOpt(is.f2596, this.f1675);
            jSONObject.putOpt(is.f2595, this.f1671);
            if (this.f1670.size() > 0) {
                jSONObject.putOpt(is.f2592, new JSONArray((Collection) this.f1670));
            }
            if (this.f1673.length() > 0) {
                f1664 = (f1660 + 77) % 128;
                jSONObject.putOpt(is.f2601, this.f1673.toString());
            }
            f1660 = (f1664 + InterfaceC0435l1.d.b.f29107d) % 128;
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private Object m1880() {
        boolean z10;
        if (TextUtils.isEmpty(this.f1672) && TextUtils.isEmpty(this.f1675)) {
            f1664 = (f1660 + 107) % 128;
            if (!TextUtils.isEmpty(this.f1671) || this.f1670.size() > 0) {
                f1664 = (f1660 + 45) % 128;
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            f1664 = (f1660 + 45) % 128;
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private String m1881() {
        int i10 = f1664 + InterfaceC0435l1.d.b.f29105b;
        f1660 = i10 % 128;
        int i11 = i10 % 2;
        JSONObject jSONObject = this.f1673;
        if (i11 != 0) {
            return jSONObject.optString(is.f2596);
        }
        jSONObject.optString(is.f2596);
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private String m1883() {
        int i10 = f1660 + 121;
        f1664 = i10 % 128;
        int i11 = i10 % 2;
        JSONObject jSONObject = this.f1673;
        if (i11 != 0) {
            jSONObject.optString(is.f2592);
            throw null;
        }
        String strOptString = jSONObject.optString(is.f2592);
        int i12 = f1664 + 11;
        f1660 = i12 % 128;
        if (i12 % 2 != 0) {
            return strOptString;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private Object m1884() {
        int i10 = f1660 + 53;
        f1664 = i10 % 128;
        int i11 = i10 % 2;
        JSONObject jSONObject = this.f1673;
        if (i11 != 0) {
            jSONObject.optString(is.f2595);
            throw null;
        }
        String strOptString = jSONObject.optString(is.f2595);
        int i12 = f1660 + 9;
        f1664 = i12 % 128;
        if (i12 % 2 == 0) {
            return strOptString;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private JSONObject m1886() {
        int i10 = f1664;
        int i11 = i10 + 1;
        f1660 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        JSONObject jSONObject = this.f1673;
        f1660 = (i10 + 49) % 128;
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private String m1887() {
        f1660 = (f1664 + 15) % 128;
        String strOptString = this.f1673.optString(is.f2598);
        f1664 = (f1660 + 49) % 128;
        return strOptString;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String m1889() {
        int i10 = f1664 + 119;
        f1660 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f1672;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String m1893() {
        int i10 = f1660 + 61;
        f1664 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f1675;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private hs m1897() {
        int i10 = (f1664 + 59) % 128;
        f1660 = i10;
        hs hsVar = this.f1674;
        f1664 = (i10 + 45) % 128;
        return hsVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String m1899() {
        int i10 = f1664 + 39;
        f1660 = i10 % 128;
        int i11 = i10 % 2;
        String str = this.f1671;
        if (i11 == 0) {
            int i12 = 56 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private List<String> m1901() {
        int i10 = f1660 + 123;
        f1664 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f1670;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private void m1882(String str) {
        int i10 = f1664 + 65;
        f1660 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                this.f1673.put(is.f2592, str);
            } else {
                this.f1673.put(is.f2592, str);
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private void m1885(String str) {
        int i10 = f1660 + 85;
        f1664 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                this.f1673.put(is.f2595, str);
            } else {
                this.f1673.put(is.f2595, str);
                int i11 = 65 / 0;
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private void m1888(String str) {
        int i10 = f1660 + 45;
        f1664 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                this.f1673.put(is.f2596, str);
                throw null;
            }
            this.f1673.put(is.f2596, str);
            int i11 = f1664 + 29;
            f1660 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m1892(String str) {
        int i10 = f1660 + 13;
        f1664 = i10 % 128;
        int i11 = i10 % 2;
        this.f1672 = str;
        if (i11 != 0) {
            int i12 = 73 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m1895(String str) {
        int i10 = f1664 + 27;
        f1660 = i10 % 128;
        int i11 = i10 % 2;
        this.f1675 = str;
        if (i11 == 0) {
            int i12 = 79 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m1898(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f1660 = (f1664 + 121) % 128;
        if (this.f1670.contains(str)) {
            return;
        }
        f1664 = (f1660 + 43) % 128;
        this.f1670.add(str);
        f1660 = (f1664 + 97) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m1900(String str) {
        int i10 = f1664 + 35;
        int i11 = i10 % 128;
        f1660 = i11;
        int i12 = i10 % 2;
        this.f1671 = str;
        if (i12 == 0) {
            throw null;
        }
        int i13 = i11 + 37;
        f1664 = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m1902(String str) {
        int i10 = f1664 + 5;
        f1660 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                this.f1673.put(is.f2598, str);
                int i11 = 92 / 0;
            } else {
                this.f1673.put(is.f2598, str);
            }
            f1660 = (f1664 + 97) % 128;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m1891(hs hsVar) {
        int i10 = f1660;
        int i11 = i10 + 9;
        f1664 = i11 % 128;
        int i12 = i11 % 2;
        this.f1674 = hsVar;
        if (i12 != 0) {
            int i13 = 79 / 0;
        }
        f1664 = (i10 + 21) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m1896(List<String> list) {
        int i10 = f1660 + 67;
        f1664 = i10 % 128;
        if (i10 % 2 == 0) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                int i11 = f1660 + 65;
                f1664 = i11 % 128;
                if (i11 % 2 != 0) {
                    m1898(it.next());
                    int i12 = 18 / 0;
                } else {
                    m1898(it.next());
                }
                f1660 = (f1664 + 81) % 128;
            }
            return;
        }
        list.iterator();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1890(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (k.f2932) {
            try {
                char[] cArr2 = f1667;
                int i11 = f1668;
                if (f1669) {
                    int length = bArr.length;
                    k.f2931 = length;
                    char[] cArr3 = new char[length];
                    k.f2933 = 0;
                    while (k.f2933 < k.f2931) {
                        int i12 = k.f2933;
                        int i13 = k.f2931 - 1;
                        int i14 = k.f2933;
                        cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                        k.f2933 = i14 + 1;
                    }
                    return new String(cArr3);
                }
                if (f1666) {
                    int length2 = cArr.length;
                    k.f2931 = length2;
                    char[] cArr4 = new char[length2];
                    k.f2933 = 0;
                    while (k.f2933 < k.f2931) {
                        int i15 = k.f2933;
                        int i16 = k.f2931 - 1;
                        int i17 = k.f2933;
                        cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                        k.f2933 = i17 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                k.f2931 = length3;
                char[] cArr5 = new char[length3];
                k.f2933 = 0;
                while (k.f2933 < k.f2931) {
                    int i18 = k.f2933;
                    int i19 = k.f2931 - 1;
                    int i20 = k.f2933;
                    cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                    k.f2933 = i20 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:103:0x0325 A[Catch: Exception -> 0x003c, TRY_LEAVE, TryCatch #0 {Exception -> 0x003c, blocks: (B:3:0x0006, B:7:0x0013, B:10:0x0031, B:13:0x003f, B:15:0x0055, B:17:0x005a, B:19:0x0070, B:21:0x0075, B:24:0x0093, B:26:0x0098, B:28:0x00ae, B:29:0x00b9, B:32:0x00d9, B:33:0x00e4, B:35:0x00fa, B:37:0x0100, B:40:0x010e, B:42:0x0124, B:43:0x012f, B:45:0x0145, B:46:0x0150, B:49:0x016e, B:51:0x0173, B:56:0x0199, B:58:0x019e, B:60:0x01b4, B:62:0x01b9, B:64:0x01d1, B:65:0x01e6, B:67:0x01fe, B:69:0x0203, B:72:0x0223, B:73:0x0230, B:76:0x0250, B:77:0x025b, B:79:0x0273, B:81:0x0278, B:86:0x029c, B:87:0x02a7, B:89:0x02bf, B:91:0x02c4, B:93:0x02da, B:95:0x02df, B:97:0x02f5, B:98:0x0300, B:101:0x0320, B:103:0x0325), top: B:107:0x0006 }] */
    @Override // com.ironsource.adqualitysdk.sdk.i.ch
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo821(cl clVar, String str, List<Object> list, ck ckVar, ee eeVar) {
        try {
            switch (str.hashCode()) {
                case -2118395364:
                    if (str.equals(m1890(null, 127 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), null, "\u0085\u008a\u0087\u0082\u0089\u0088\u0083\u0087\u0082\u0086\u0085\u0084\u0083\u0082\u0081").intern())) {
                        f1660 = (f1664 + 69) % 128;
                        return m1889();
                    }
                    new ds(clVar, eeVar, m1894("騤㇎\uf53bᦊ㉇忍䨕겺䃕૭ꚑ\ue112醃\uea32", (-16777202) - Color.rgb(0, 0, 0)).intern(), str).m2034(clVar.m1643());
                    return null;
                case -1836320845:
                    if (str.equals(m1894("凳늗㛽蓹竔\u0088埘\uf1fb㛦ᣵ石䢣", 12 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern())) {
                        m1898((String) cw.m1805(list, 0, String.class));
                    } else {
                        new ds(clVar, eeVar, m1894("騤㇎\uf53bᦊ㉇忍䨕겺䃕૭ꚑ\ue112醃\uea32", (-16777202) - Color.rgb(0, 0, 0)).intern(), str).m2034(clVar.m1643());
                    }
                    return null;
                case -1700761801:
                    if (str.equals(m1890(null, 126 - TextUtils.indexOf((CharSequence) "", '0'), null, "\u0090\u0087\u008f\u0083\u0089\u0082\u008e\u0083\u0082\u0081").intern())) {
                        return m1893();
                    }
                    new ds(clVar, eeVar, m1894("騤㇎\uf53bᦊ㉇忍䨕겺䃕૭ꚑ\ue112醃\uea32", (-16777202) - Color.rgb(0, 0, 0)).intern(), str).m2034(clVar.m1643());
                    return null;
                case -1409157227:
                    if (str.equals(m1890(null, (ViewConfiguration.getJumpTapTimeout() >> 16) + 127, null, "\u0089\u0090\u0087\u008f\u0082\u0097\u0087\u0096\u0095\u0094\u0083\u0082\u0081").intern())) {
                        return m1901();
                    }
                    new ds(clVar, eeVar, m1894("騤㇎\uf53bᦊ㉇忍䨕겺䃕૭ꚑ\ue112醃\uea32", (-16777202) - Color.rgb(0, 0, 0)).intern(), str).m2034(clVar.m1643());
                    return null;
                case -1296571754:
                    if (str.equals(m1890(null, 126 - Process.getGidForName(""), null, "\u0082\u0097\u0087\u0096\u0095\u0094\u0090\u0087\u008f\u0090\u0093\u0092\u0088\u0091\u0083\u0082\u0089").intern())) {
                        int i10 = f1660 + 3;
                        f1664 = i10 % 128;
                        if (i10 % 2 == 0) {
                            m1885((String) cw.m1805(list, 0, String.class));
                        } else {
                            new ds(clVar, eeVar, m1894("騤㇎\uf53bᦊ㉇忍䨕겺䃕૭ꚑ\ue112醃\uea32", (-16777202) - Color.rgb(0, 0, 0)).intern(), str).m2034(clVar.m1643());
                        }
                    } else {
                        new ds(clVar, eeVar, m1894("騤㇎\uf53bᦊ㉇忍䨕겺䃕૭ꚑ\ue112醃\uea32", (-16777202) - Color.rgb(0, 0, 0)).intern(), str).m2034(clVar.m1643());
                    }
                    return null;
                case -1247838300:
                    if (str.equals(m1894("벘䷓맹鑁⬯\ue9fc䃕૭\uec3d朇த呉꒤\ue044竔\u0088埘\uf1fb\ue475매ٹ迍慴⨦", 23 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern())) {
                        return m1886();
                    }
                    new ds(clVar, eeVar, m1894("騤㇎\uf53bᦊ㉇忍䨕겺䃕૭ꚑ\ue112醃\uea32", (-16777202) - Color.rgb(0, 0, 0)).intern(), str).m2034(clVar.m1643());
                    return null;
                case -1207642840:
                    if (str.equals(m1890(null, 127 - (KeyEvent.getMaxKeyCode() >> 16), null, "\u0085\u008a\u0087\u0082\u0089\u0088\u0083\u0087\u0082\u0086\u0085\u0084\u0083\u0082\u0089").intern())) {
                        f1664 = (f1660 + InterfaceC0435l1.d.b.f29107d) % 128;
                        m1892((String) cw.m1805(list, 0, String.class));
                    } else {
                        new ds(clVar, eeVar, m1894("騤㇎\uf53bᦊ㉇忍䨕겺䃕૭ꚑ\ue112醃\uea32", (-16777202) - Color.rgb(0, 0, 0)).intern(), str).m2034(clVar.m1643());
                    }
                    return null;
                case -1091371232:
                    if (str.equals(m1890(null, (KeyEvent.getMaxKeyCode() >> 16) + 127, null, "\u0089\u0090\u0087\u008f\u0082\u0097\u0087\u0096\u0095\u0094\u0085\u0085\u0093").intern())) {
                        f1664 = (f1660 + 45) % 128;
                        m1896((List<String>) cw.m1805(list, 0, List.class));
                    } else {
                        new ds(clVar, eeVar, m1894("騤㇎\uf53bᦊ㉇忍䨕겺䃕૭ꚑ\ue112醃\uea32", (-16777202) - Color.rgb(0, 0, 0)).intern(), str).m2034(clVar.m1643());
                    }
                    return null;
                case -869156349:
                    if (str.equals(m1890(null, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, null, "\u0092\u0095\u0089\u009a\u0095\u0083").intern())) {
                        return m1879();
                    }
                    new ds(clVar, eeVar, m1894("騤㇎\uf53bᦊ㉇忍䨕겺䃕૭ꚑ\ue112醃\uea32", (-16777202) - Color.rgb(0, 0, 0)).intern(), str).m2034(clVar.m1643());
                    return null;
                case -772930430:
                    if (str.equals(m1890(null, 127 - (KeyEvent.getMaxKeyCode() >> 16), null, "\u0082\u008d\u008c\u008b\u0085\u008a\u0087\u0082\u0089\u0088\u0083\u0087\u0082\u0086\u0085\u0084\u0083\u0082\u0089").intern())) {
                        m1891(hs.m2295(((Integer) cw.m1805(list, 0, Integer.class)).intValue()));
                    } else {
                        new ds(clVar, eeVar, m1894("騤㇎\uf53bᦊ㉇忍䨕겺䃕૭ꚑ\ue112醃\uea32", (-16777202) - Color.rgb(0, 0, 0)).intern(), str).m2034(clVar.m1643());
                    }
                    return null;
                case -407028174:
                    if (str.equals(m1894("벘䷓\ue290䰶묳먈⛫꺭石䢣\udc03\uf1f5㙸괢⮼ᢛ", ExpandableListView.getPackedPositionType(0L) + 16).intern())) {
                        return m1881();
                    }
                    new ds(clVar, eeVar, m1894("騤㇎\uf53bᦊ㉇忍䨕겺䃕૭ꚑ\ue112醃\uea32", (-16777202) - Color.rgb(0, 0, 0)).intern(), str).m2034(clVar.m1643());
                    return null;
                case -356418934:
                    if (str.equals(m1894("벘䷓謗韥皵إ\u242bؒ㺂뛭饿걙竔\u0088埘\uf1fb\ue425ꕋ", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 16).intern())) {
                        int i11 = f1660 + 73;
                        f1664 = i11 % 128;
                        if (i11 % 2 == 0) {
                            return m1884();
                        }
                    }
                    new ds(clVar, eeVar, m1894("騤㇎\uf53bᦊ㉇忍䨕겺䃕૭ꚑ\ue112醃\uea32", (-16777202) - Color.rgb(0, 0, 0)).intern(), str).m2034(clVar.m1643());
                    return null;
                case -140869031:
                    if (str.equals(m1890(null, AndroidCharacter.getMirror('0') + 'O', null, "\u0082\u0097\u0087\u0096\u0095\u0094\u0090\u0087\u008f\u0082\u0097\u0087\u0096\u0095\u0094\u0083\u0082\u0081").intern())) {
                        f1660 = (f1664 + 125) % 128;
                        return m1883();
                    }
                    new ds(clVar, eeVar, m1894("騤㇎\uf53bᦊ㉇忍䨕겺䃕૭ꚑ\ue112醃\uea32", (-16777202) - Color.rgb(0, 0, 0)).intern(), str).m2034(clVar.m1643());
                    return null;
                case 205499235:
                    if (str.equals(m1890(null, Drawable.resolveOpacity(0, 0) + 127, null, "\u0082\u0097\u0087\u0096\u0095\u0094\u0085\u008a\u0087\u0082\u0089\u0088\u0083\u0087\u0082\u0086\u0085\u0084\u0083\u0082\u0089").intern())) {
                        m1902((String) cw.m1805(list, 0, String.class));
                    } else {
                        new ds(clVar, eeVar, m1894("騤㇎\uf53bᦊ㉇忍䨕겺䃕૭ꚑ\ue112醃\uea32", (-16777202) - Color.rgb(0, 0, 0)).intern(), str).m2034(clVar.m1643());
                    }
                    return null;
                case 236043435:
                    if (str.equals(m1890(null, 126 - Process.getGidForName(""), null, "\u0090\u0087\u008f\u0083\u0089\u0082\u008e\u0083\u0082\u0089").intern())) {
                        m1895((String) cw.m1805(list, 0, String.class));
                    } else {
                        new ds(clVar, eeVar, m1894("騤㇎\uf53bᦊ㉇忍䨕겺䃕૭ꚑ\ue112醃\uea32", (-16777202) - Color.rgb(0, 0, 0)).intern(), str).m2034(clVar.m1643());
                    }
                    return null;
                case 770797430:
                    if (str.equals(m1890(null, 127 - TextUtils.getTrimmedLength(""), null, "\u0082\u008d\u008c\u008b\u0085\u008a\u0087\u0082\u0089\u0088\u0083\u0087\u0082\u0086\u0085\u0084\u0083\u0082\u0081").intern())) {
                        if (m1897() != null) {
                            return Integer.valueOf(m1897().m2298());
                        }
                        return null;
                    }
                    new ds(clVar, eeVar, m1894("騤㇎\uf53bᦊ㉇忍䨕겺䃕૭ꚑ\ue112醃\uea32", (-16777202) - Color.rgb(0, 0, 0)).intern(), str).m2034(clVar.m1643());
                    return null;
                case 779164621:
                    if (str.equals(m1890(null, 127 - (ViewConfiguration.getWindowTouchSlop() >> 8), null, "\u0082\u0097\u0087\u0096\u0095\u0094\u0090\u0087\u008f\u0082\u0097\u0087\u0096\u0095\u0094\u0083\u0082\u0089").intern())) {
                        f1660 = (f1664 + 63) % 128;
                        m1882((String) cw.m1805(list, 0, String.class));
                    } else {
                        new ds(clVar, eeVar, m1894("騤㇎\uf53bᦊ㉇忍䨕겺䃕૭ꚑ\ue112醃\uea32", (-16777202) - Color.rgb(0, 0, 0)).intern(), str).m2034(clVar.m1643());
                    }
                    return null;
                case 1308044955:
                    if (str.equals(m1894("த呉謗韥皵إ\u242bؒ㺂뛭ꪫ\udf49", TextUtils.indexOf((CharSequence) "", '0', 0) + 12).intern())) {
                        m1900((String) cw.m1805(list, 0, String.class));
                    } else {
                        new ds(clVar, eeVar, m1894("騤㇎\uf53bᦊ㉇忍䨕겺䃕૭ꚑ\ue112醃\uea32", (-16777202) - Color.rgb(0, 0, 0)).intern(), str).m2034(clVar.m1643());
                    }
                    return null;
                case 1396624783:
                    if (str.equals(m1890(null, Color.green(0) + 127, null, "\u0090\u0087\u008f\u0090\u0093\u0092\u0088\u0091\u0083\u0082\u0081").intern())) {
                        f1660 = (f1664 + 87) % 128;
                        return m1899();
                    }
                    new ds(clVar, eeVar, m1894("騤㇎\uf53bᦊ㉇忍䨕겺䃕૭ꚑ\ue112醃\uea32", (-16777202) - Color.rgb(0, 0, 0)).intern(), str).m2034(clVar.m1643());
                    return null;
                case 1924460979:
                    if (str.equals(m1890(null, 127 - View.MeasureSpec.getSize(0), null, "\u0095\u0099\u0092\u008a\u0087\u0082\u0089\u0088\u0083\u0087\u0082\u0086\u0085\u0084\u0089\u0093\u0098").intern())) {
                        return m1880();
                    }
                    new ds(clVar, eeVar, m1894("騤㇎\uf53bᦊ㉇忍䨕겺䃕૭ꚑ\ue112醃\uea32", (-16777202) - Color.rgb(0, 0, 0)).intern(), str).m2034(clVar.m1643());
                    return null;
                case 1964255575:
                    if (str.equals(m1890(null, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 128, null, "\u0082\u0097\u0087\u0096\u0095\u0094\u0085\u008a\u0087\u0082\u0089\u0088\u0083\u0087\u0082\u0086\u0085\u0084\u0083\u0082\u0081").intern())) {
                        return m1887();
                    }
                    new ds(clVar, eeVar, m1894("騤㇎\uf53bᦊ㉇忍䨕겺䃕૭ꚑ\ue112醃\uea32", (-16777202) - Color.rgb(0, 0, 0)).intern(), str).m2034(clVar.m1643());
                    return null;
                case 2056496294:
                    if (str.equals(m1890(null, KeyEvent.keyCodeFromString("") + 127, null, "\u0082\u0097\u0087\u0096\u0095\u0094\u0090\u0087\u008f\u0083\u0089\u0082\u008e\u0083\u0082\u0089").intern())) {
                        f1664 = (f1660 + 91) % 128;
                        m1888((String) cw.m1805(list, 0, String.class));
                    } else {
                        new ds(clVar, eeVar, m1894("騤㇎\uf53bᦊ㉇忍䨕겺䃕૭ꚑ\ue112醃\uea32", (-16777202) - Color.rgb(0, 0, 0)).intern(), str).m2034(clVar.m1643());
                    }
                    return null;
                default:
                    new ds(clVar, eeVar, m1894("騤㇎\uf53bᦊ㉇忍䨕겺䃕૭ꚑ\ue112醃\uea32", (-16777202) - Color.rgb(0, 0, 0)).intern(), str).m2034(clVar.m1643());
                    return null;
            }
        } catch (Exception e10) {
            String strM1643 = clVar.m1643();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m1890(null, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 127, null, "\u009f\u009c\u0085\u0095\u0098\u0083\u0082\u009e\u009c\u0082\u0086\u0088\u0083\u0093\u0092\u009c\u0095\u0099\u0092\u008a\u0087\u0082\u0089\u0088\u0083\u0087\u0082\u0086\u0085\u0084\u009c\u0081\u0092\u0088\u0083\u0096\u0097\u0082\u009d\u0082\u009c\u0087\u0095\u0087\u0087\u009b").intern());
            sb2.append(str);
            sb2.append(m1890(null, TextUtils.indexOf((CharSequence) "", '0', 0) + 128, null, "\u009f").intern());
            cn.m1708(strM1643, sb2.toString(), e10);
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1894(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (o.f3076) {
            try {
                char[] cArr2 = new char[cArr.length];
                o.f3077 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i11 = o.f3077;
                    if (i11 < cArr.length) {
                        cArr3[0] = cArr[i11];
                        cArr3[1] = cArr[i11 + 1];
                        int i12 = 58224;
                        for (int i13 = 0; i13 < 16; i13++) {
                            char c4 = cArr3[1];
                            char c5 = cArr3[0];
                            char c10 = (char) (c4 - (((c5 + i12) ^ ((c5 << 4) + f1663)) ^ ((c5 >>> 5) + f1662)));
                            cArr3[1] = c10;
                            cArr3[0] = (char) (c5 - (((c10 >>> 5) + f1665) ^ ((c10 + i12) ^ ((c10 << 4) + f1661))));
                            i12 -= 40503;
                        }
                        int i14 = o.f3077;
                        cArr2[i14] = cArr3[0];
                        cArr2[i14 + 1] = cArr3[1];
                        o.f3077 = i14 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
