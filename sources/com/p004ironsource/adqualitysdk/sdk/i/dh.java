package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.firebase.crashlytics.internal.model.a;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.p004ironsource.dc;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class dh extends cz implements ck {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f1637 = 0;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f1638 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char f1641 = 5;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private hn f1642;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private hn f1643;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char[] f1640 = {'g', 'e', 't', 'S', 'o', AbstractJsonLexerKt.UNICODE_ESC, 'r', 'c', 'U', 'l', 's', 'E', 'n', 'd', 'C', 'a', 'i', 'v', 'T', 'y', 'p', 'I', 'm', 'V', 'J'};

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static char[] f1639 = {'q', 225, 231, 217, 214, 226, 223, 225, 216, 222, 234, 234, '>', 'x', 'x', 'l', 'k', 's', 'm', 'o', 'h', 'n', AbstractJsonLexerKt.UNICODE_ESC, 'o', '2', 'f', 'm', 'o', 'o', 'c', 'a', 'n', 'i', 'V', '^', 'Q', 168, 178, 164, 154, 171, 173, 172, 168, 161, 169, 152, 153, 170, 164, '8', 'r', 't', 'd', 'i', 'y', 'c', 'b', 'y', AbstractJsonLexerKt.BEGIN_OBJ, 'l', 's', 127, '2', 'f', 'h', 'a', 'c', 'j', 'h', 'n', 'f', 'g', 's', 'A', 129, 135, 144, 143, '~', '|', 140, 128, 'z', 131, 129, 132, 'x', AbstractJsonLexerKt.BEGIN_OBJ, 137, 137, '2', 'd', 'j', 's', 'r', 'a', '_', 'o', 'c', 'b', 'j', 'd', 'f', '_', 'e', 'l', 'l', '9', 'l', 'l', '^', 'V', 'i', 'n', 'a', 'c', 'o', '_', 'a', 'r', 's', 'j', 'd', '2', 'd', 'j', 's', 'r', 'a', '_', 'o', 'c', 'a', 'n', 'i', 'V', '^', 'l', 'f', '6', '_', 'a', 'r', 's', 'j', 'd', 'f', 'f', 'l', '\\', 'Y', 'i', 'S', 'R', 'i', 'k', '\\', 'c', 132, 273, 277, 278, 276, 259, 264, 281, 282, 273, 267, 254, 261, 280, 277, 273, 269, 275, 258, 257, 274, 'H', 143, 137, 132, 138, 'z', dc.T, 145, 167, 167, 162, 162, 'o', 213, 207, 214, 213, 213, 198, 194, 216, 218, 217, 213, 206, 214, 197};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final List<String> f1645 = new ArrayList();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final List<String> f1648 = new ArrayList();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final List<String> f1647 = new ArrayList();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final List<String> f1649 = new ArrayList();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final List<String> f1646 = new ArrayList();

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private JSONObject f1644 = new JSONObject();

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    private JSONObject m1847() {
        JSONObject jSONObject = new JSONObject();
        try {
            hn hnVar = this.f1643;
            if (hnVar != null) {
                jSONObject.put(ik.f2454, hnVar.m2209());
            }
            hn hnVar2 = this.f1642;
            if (hnVar2 != null) {
                jSONObject.put(ik.f2451, hnVar2.m2209());
            }
            if (this.f1645.size() > 0) {
                jSONObject.put(ik.f2452, new JSONArray((Collection) this.f1645));
                f1638 = (f1637 + 51) % 128;
            }
            if (this.f1648.size() > 0) {
                jSONObject.put(ik.f2447, new JSONArray((Collection) this.f1648));
            }
            if (this.f1647.size() > 0) {
                jSONObject.put(ik.f2445, new JSONArray((Collection) this.f1647));
            }
            if (this.f1649.size() > 0) {
                jSONObject.put(ik.f2450, new JSONArray((Collection) this.f1649));
            }
            if (this.f1646.size() > 0) {
                jSONObject.put(ik.f2449, new JSONArray((Collection) this.f1646));
            }
            if (this.f1644.length() > 0) {
                jSONObject.putOpt(ik.f2453, this.f1644.toString());
                f1638 = (f1637 + 99) % 128;
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private JSONObject m1848() {
        int i2 = f1638 + 39;
        f1637 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f1644;
        }
        int i3 = 26 / 0;
        return this.f1644;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private String m1849() {
        f1638 = (f1637 + 123) % 128;
        String strOptString = this.f1644.optString(ik.f2445);
        f1637 = (f1638 + 97) % 128;
        return strOptString;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private String m1850() {
        f1637 = (f1638 + 77) % 128;
        String strOptString = this.f1644.optString(ik.f2450);
        int i2 = f1638 + 21;
        f1637 = i2 % 128;
        if (i2 % 2 == 0) {
            return strOptString;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private void m1852(String str) {
        int i2 = f1638 + 53;
        f1637 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                this.f1644.put(ik.f2442, str);
                throw null;
            }
            this.f1644.put(ik.f2442, str);
            int i3 = f1638 + 101;
            f1637 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private Object m1853() {
        int i2 = f1637 + 55;
        f1638 = i2 % 128;
        if (i2 % 2 == 0) {
            this.f1645.size();
            throw null;
        }
        Boolean boolValueOf = Boolean.valueOf(this.f1645.size() > 0 || this.f1648.size() > 0 || this.f1646.size() > 0);
        int i3 = f1637 + 107;
        f1638 = i3 % 128;
        if (i3 % 2 != 0) {
            return boolValueOf;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private void m1855(String str) {
        int i2 = f1637 + 21;
        f1638 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f1644.put(ik.f2452, str);
                throw null;
            }
            this.f1644.put(ik.f2452, str);
            f1637 = (f1638 + 115) % 128;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private String m1856() {
        int i2 = f1638 + 61;
        f1637 = i2 % 128;
        if (i2 % 2 != 0) {
            this.f1644.optString(ik.f2447);
            throw null;
        }
        String strOptString = this.f1644.optString(ik.f2447);
        f1638 = (f1637 + 83) % 128;
        return strOptString;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private String m1858() {
        int i2 = f1637 + 41;
        f1638 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f1644.optString(ik.f2452);
        }
        this.f1644.optString(ik.f2452);
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private hn m1860() {
        int i2 = f1637;
        hn hnVar = this.f1643;
        int i3 = i2 + 107;
        f1638 = i3 % 128;
        if (i3 % 2 != 0) {
            return hnVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private hn m1862() {
        int i2 = f1637;
        hn hnVar = this.f1642;
        int i3 = i2 + 31;
        f1638 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 63 / 0;
        }
        return hnVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private List<String> m1864() {
        int i2 = f1637;
        List<String> list = this.f1647;
        int i3 = i2 + 59;
        f1638 = i3 % 128;
        if (i3 % 2 != 0) {
            return list;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private List<String> m1867() {
        int i2 = f1638 + 95;
        f1637 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f1646;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private List<String> m1873() {
        int i2 = f1637 + 1;
        f1638 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f1649;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private List<String> m1878() {
        int i2 = (f1638 + 93) % 128;
        f1637 = i2;
        List<String> list = this.f1648;
        int i3 = i2 + 95;
        f1638 = i3 % 128;
        if (i3 % 2 != 0) {
            return list;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private List<String> m1883() {
        int i2 = (f1638 + 43) % 128;
        f1637 = i2;
        List<String> list = this.f1645;
        int i3 = i2 + 103;
        f1638 = i3 % 128;
        if (i3 % 2 != 0) {
            return list;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private void m1857(String str) {
        int i2 = f1637 + 31;
        f1638 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                this.f1644.put(ik.f2450, str);
            } else {
                this.f1644.put(ik.f2450, str);
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private void m1859(String str) {
        f1637 = (f1638 + 25) % 128;
        try {
            this.f1644.put(ik.f2449, str);
            f1637 = (f1638 + 67) % 128;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private void m1861(String str) {
        int i2 = f1637 + 21;
        f1638 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f1644.put(ik.f2447, str);
                throw null;
            }
            this.f1644.put(ik.f2447, str);
            int i3 = f1637 + 35;
            f1638 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private void m1863(String str) {
        int i2 = f1638 + 71;
        f1637 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f1644.put(ik.f2445, str);
            } else {
                this.f1644.put(ik.f2445, str);
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m1865(String str) {
        f1638 = (f1637 + 57) % 128;
        m1876(str, this.f1645);
        int i2 = f1637 + 17;
        f1638 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m1868(String str) {
        f1638 = (f1637 + 43) % 128;
        m1876(str, this.f1648);
        int i2 = f1637 + 11;
        f1638 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m1875(String str) {
        f1637 = (f1638 + 61) % 128;
        m1876(str, this.f1649);
        int i2 = f1637 + 9;
        f1638 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 75 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m1881(List<String> list) {
        f1637 = (f1638 + 3) % 128;
        m1870(list, this.f1649);
        int i2 = f1637 + 125;
        f1638 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m1884(String str) {
        int i2 = f1638 + 19;
        f1637 = i2 % 128;
        if (i2 % 2 == 0) {
            m1876(str, this.f1647);
        } else {
            m1876(str, this.f1647);
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m1866(List<String> list) {
        f1638 = (f1637 + 19) % 128;
        m1870(list, this.f1645);
        int i2 = f1638 + 89;
        f1637 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 84 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m1869(List<String> list) {
        f1638 = (f1637 + 77) % 128;
        m1870(list, this.f1648);
        int i2 = f1637 + 47;
        f1638 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m1877(List<String> list) {
        f1637 = (f1638 + 5) % 128;
        m1870(list, this.f1646);
        f1638 = (f1637 + 117) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m1880(String str) {
        f1638 = (f1637 + 115) % 128;
        m1876(str, this.f1646);
        f1638 = (f1637 + 63) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m1885(List<String> list) {
        int i2 = f1638 + 29;
        f1637 = i2 % 128;
        if (i2 % 2 == 0) {
            m1870(list, this.f1647);
        } else {
            m1870(list, this.f1647);
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m1871(JSONObject jSONObject) {
        int i2 = f1637 + 31;
        f1638 = i2 % 128;
        int i3 = i2 % 2;
        this.f1644 = kc.m2767(jSONObject);
        if (i3 == 0) {
            int i4 = 62 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m1874(hn hnVar) {
        int i2 = f1637 + 9;
        int i3 = i2 % 128;
        f1638 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (hnVar != null) {
            int i4 = i3 + 53;
            f1637 = i4 % 128;
            int i5 = i4 % 2;
            this.f1642 = hnVar;
            if (i5 != 0) {
                throw null;
            }
        }
        f1637 = (i3 + 93) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m1879(hn hnVar) {
        if (hnVar != null) {
            int i2 = f1638 + 39;
            f1637 = i2 % 128;
            int i3 = i2 % 2;
            this.f1643 = hnVar;
            if (i3 != 0) {
                throw null;
            }
        }
        f1638 = (f1637 + 101) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1882(byte b2, String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (i.f2343) {
            try {
                char[] cArr2 = f1640;
                char c2 = f1641;
                char[] cArr3 = new char[i2];
                if (i2 % 2 != 0) {
                    i2--;
                    cArr3[i2] = (char) (cArr[i2] - b2);
                }
                if (i2 > 1) {
                    i.f2348 = 0;
                    while (true) {
                        int i3 = i.f2348;
                        if (i3 >= i2) {
                            break;
                        }
                        i.f2347 = cArr[i3];
                        i.f2345 = cArr[i.f2348 + 1];
                        if (i.f2347 == i.f2345) {
                            cArr3[i.f2348] = (char) (i.f2347 - b2);
                            cArr3[i.f2348 + 1] = (char) (i.f2345 - b2);
                        } else {
                            i.f2346 = i.f2347 / c2;
                            i.f2342 = i.f2347 % c2;
                            i.f2344 = i.f2345 / c2;
                            i.f2341 = i.f2345 % c2;
                            if (i.f2342 == i.f2341) {
                                i.f2346 = a.b(i.f2346, c2, 1, c2);
                                i.f2344 = a.b(i.f2344, c2, 1, c2);
                                int i4 = (i.f2346 * c2) + i.f2342;
                                int i5 = (i.f2344 * c2) + i.f2341;
                                int i6 = i.f2348;
                                cArr3[i6] = cArr2[i4];
                                cArr3[i6 + 1] = cArr2[i5];
                            } else if (i.f2346 == i.f2344) {
                                i.f2342 = a.b(i.f2342, c2, 1, c2);
                                i.f2341 = a.b(i.f2341, c2, 1, c2);
                                int i7 = (i.f2346 * c2) + i.f2342;
                                int i8 = (i.f2344 * c2) + i.f2341;
                                int i9 = i.f2348;
                                cArr3[i9] = cArr2[i7];
                                cArr3[i9 + 1] = cArr2[i8];
                            } else {
                                int i10 = (i.f2346 * c2) + i.f2341;
                                int i11 = (i.f2344 * c2) + i.f2342;
                                int i12 = i.f2348;
                                cArr3[i12] = cArr2[i10];
                                cArr3[i12 + 1] = cArr2[i11];
                            }
                        }
                        i.f2348 += 2;
                    }
                }
                str2 = new String(cArr3);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private String m1851() {
        int i2 = f1638 + 17;
        f1637 = i2 % 128;
        if (i2 % 2 != 0) {
            this.f1644.optString(ik.f2442);
            throw null;
        }
        String strOptString = this.f1644.optString(ik.f2442);
        int i3 = f1637 + 113;
        f1638 = i3 % 128;
        if (i3 % 2 != 0) {
            return strOptString;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private String m1854() {
        String strOptString;
        int i2 = f1638 + 33;
        f1637 = i2 % 128;
        if (i2 % 2 != 0) {
            strOptString = this.f1644.optString(ik.f2449);
            int i3 = 70 / 0;
        } else {
            strOptString = this.f1644.optString(ik.f2449);
        }
        f1637 = (f1638 + 75) % 128;
        return strOptString;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m1870(List<String> list, List<String> list2) {
        int i2 = f1638 + 67;
        f1637 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                int i3 = f1638 + 81;
                f1637 = i3 % 128;
                if (i3 % 2 != 0) {
                    m1876(it.next(), list2);
                    int i4 = 57 / 0;
                } else {
                    m1876(it.next(), list2);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:126:0x04de  */
    /* JADX WARN: Code duplicated, block: B:7:0x004f  */
    @Override // com.p004ironsource.adqualitysdk.sdk.i.ck
    /* JADX INFO: renamed from: ﾇ */
    public final Object mo792(String str, List<Object> list, ch chVar) {
        byte b2;
        switch (str.hashCode()) {
            case -1836320845:
                if (!str.equals(m1882((byte) (TextUtils.lastIndexOf("", '0') + 116), "\u0012\n\u0012\b\u0000\t\u0007\b\u0003\u0006\u0007\u0005", TextUtils.getOffsetAfter("", 0) + 12).intern())) {
                    b2 = -1;
                } else {
                    b2 = 7;
                }
                break;
            case -1833890347:
                if (!str.equals(m1882((byte) (49 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), "\u0012\n\u000b\u0017\u0014\u0011\u0001\u0002\t\u0007\u009d", 11 - View.resolveSize(0, 0)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 9;
                }
                break;
            case -1803337567:
                if (!str.equals(m1882((byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 63), "\u000b\u0000\u0001\f\r\u000e\n\u0013\b\u000b\t\u0007\b\u0004\u0000\t\u0007\b¥", (ViewConfiguration.getPressedStateDuration() >> 16) + 19).intern())) {
                    b2 = -1;
                } else {
                    int i2 = f1637 + 77;
                    f1638 = i2 % 128;
                    b2 = i2 % 2 != 0 ? (byte) 27 : (byte) 43;
                }
                break;
            case -1712168770:
                if (!str.equals(m1882((byte) ((Process.myPid() >> 22) + 38), "\u0012\n\u000b\u0017\t\u0002\r\u0007\u0007\u0005\u0099", (ViewConfiguration.getTouchSlop() >> 8) + 11).intern())) {
                    b2 = -1;
                } else {
                    f1638 = (f1637 + 39) % 128;
                    b2 = 14;
                }
                break;
            case -1409157227:
                if (!str.equals(m1882((byte) (54 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), "\u0001\u0002\u0003\u0004\u0000\t\u0007\b\u0003\u0006\u0007\u0005¨", Color.rgb(0, 0, 0) + 16777229).intern())) {
                    b2 = -1;
                } else {
                    f1638 = (f1637 + 5) % 128;
                    b2 = 0;
                }
                break;
            case -1362450249:
                if (!str.equals(m1872(true, new int[]{PsExtractor.AUDIO_STREAM, 15, 107, 3}, "\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001").intern())) {
                    b2 = -1;
                } else {
                    b2 = 33;
                }
                break;
            case -1273813711:
                if (!str.equals(m1872(true, new int[]{91, 17, 0, 0}, "\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000").intern())) {
                    b2 = -1;
                } else {
                    b2 = 23;
                }
                break;
            case -1249364341:
                if (!str.equals(m1872(false, new int[]{180, 6, 30, 2}, "\u0001\u0001\u0001\u0000\u0001\u0000").intern())) {
                    b2 = -1;
                } else {
                    int i3 = f1638 + 33;
                    f1637 = i3 % 128;
                    b2 = i3 % 2 == 0 ? (byte) 31 : (byte) 60;
                }
                break;
            case -1245993915:
                if (!str.equals(m1882((byte) (124 - (ViewConfiguration.getTapTimeout() >> 16)), "\u0001\u0002\u0001\u0016\u0014\u0011\u0001\u0002\t\u0007\b\u0004\u0000\t\u0007\bá", 18 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern())) {
                    b2 = -1;
                } else {
                    b2 = 22;
                }
                break;
            case -1190960472:
                if (!str.equals(m1872(false, new int[]{159, 21, 167, 15}, "\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001").intern())) {
                    b2 = -1;
                } else {
                    b2 = 29;
                }
                break;
            case -1099149698:
                if (!str.equals(m1882((byte) ((Process.myPid() >> 22) + 53), "\u0001\u0002\u0001\f\r\u000e\n\u0013\b\u000b\u000b\t\u0000\u0010\u0001\u0011\u0010\u0002\u0013\u000f\u0015\u0000", 22 - (Process.myTid() >> 22)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 6;
                }
                break;
            case -1091371232:
                if (!str.equals(m1882((byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 33), "\u0012\n\u0012\b\u0000\t\u0007\b\u0003\u0006\u0007\u0005\u0094", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 13).intern())) {
                    b2 = -1;
                } else {
                    b2 = 8;
                }
                break;
            case -1016025794:
                if (!str.equals(m1882((byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 125), "\u0012\n\u000b\u0017\u0014\u0011\u0001\u0002\t\u0007\u0005\u000e", TextUtils.getCapsMode("", 0, 0) + 12).intern())) {
                    b2 = -1;
                } else {
                    b2 = 10;
                }
                break;
            case -924327250:
                if (!str.equals(m1882((byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 88), "\u0012\n\u000e\f\r\u000e\n\u0013\b\u000b\t\u0007\u0005\u000e", 14 - View.getDefaultSize(0, 0)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 12;
                }
                break;
            case -905814529:
                if (!str.equals(m1872(false, new int[]{186, 6, 54, 3}, "\u0000\u0001\u0001\u0001\u0000\u0001").intern())) {
                    b2 = -1;
                } else {
                    b2 = 32;
                }
                break;
            case -890333697:
                if (!str.equals(m1872(true, new int[]{35, 15, 62, 0}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000").intern())) {
                    b2 = -1;
                } else {
                    b2 = 5;
                }
                break;
            case -887729623:
                if (!str.equals(m1872(false, new int[]{0, 12, 123, 0}, "\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001").intern())) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
                break;
            case -869156349:
                if (!str.equals(m1882((byte) (KeyEvent.normalizeMetaState(0) + 119), "\u0003\u0000\u0014\u000e\u0002\u000e", 5 - TextUtils.lastIndexOf("", '0', 0, 0)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 34;
                }
                break;
            case -747967915:
                if (!str.equals(m1882((byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 125), "\u0012\n\u000b\u0017\t\u0002\r\u0007\u0007\u0005", 10 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern())) {
                    b2 = -1;
                } else {
                    b2 = 13;
                }
                break;
            case -333660891:
                if (!str.equals(m1882((byte) (33 - (ViewConfiguration.getTouchSlop() >> 8)), "\u0001\u0002\u0003\u0016\u0012\u000b\u0002\u0000\t\u0007\b\u0004\u0000\t\u0007\b\u0086", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 17).intern())) {
                    b2 = -1;
                } else {
                    f1638 = (f1637 + 105) % 128;
                    b2 = 24;
                }
                break;
            case -259609707:
                if (!str.equals(m1872(false, new int[]{140, 19, 0, 7}, "\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001").intern())) {
                    b2 = -1;
                } else {
                    b2 = 28;
                }
                break;
            case -140869031:
                if (!str.equals(m1882((byte) (Drawable.resolveOpacity(0, 0) + 83), "\u0001\u0002\u0003\u0004\u0000\t\u0007\b\u0003\u0006\u0007\u0005\u0004\u0000\u0006\u0007\u0006\u0002", (ViewConfiguration.getTouchSlop() >> 8) + 18).intern())) {
                    b2 = -1;
                } else {
                    b2 = 20;
                }
                break;
            case 20418827:
                if (!str.equals(m1882((byte) (87 - View.combineMeasuredStates(0, 0)), "\u000b\u0000\u0004\f\u000b\u0006\u0011\u0000\u0011\u0012\u0003\u0010\u000f\u0018¼", (ViewConfiguration.getFadingEdgeLength() >> 16) + 15).intern())) {
                    b2 = -1;
                } else {
                    b2 = 17;
                }
                break;
            case 108267695:
                if (!str.equals(m1872(false, new int[]{108, 16, 0, 0}, "\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000").intern())) {
                    b2 = -1;
                } else {
                    b2 = 25;
                }
                break;
            case 177098421:
                if (!str.equals(m1872(false, new int[]{63, 11, 4, 0}, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000").intern())) {
                    b2 = -1;
                } else {
                    b2 = 15;
                }
                break;
            case 213978610:
                if (!str.equals(m1882((byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 86), "\u000b\u0000\u0001\f\r\u000e\n\u0013\b\u000b\u000b\t\u0000\u0010\u0001\u0011\u0010\u0002\u0013\u000f\u0015\u0000", 22 - View.MeasureSpec.getSize(0)).intern())) {
                    b2 = -1;
                } else {
                    int i4 = f1638 + 111;
                    f1637 = i4 % 128;
                    b2 = i4 % 2 == 0 ? (byte) 18 : (byte) 47;
                }
                break;
            case 779164621:
                if (!str.equals(m1882((byte) (84 - Color.argb(0, 0, 0, 0)), "\u000b\u0000\u0003\u0004\u0000\t\u0007\b\u0003\u0006\u0007\u0005\u0004\u0000\u0006\u0007\u0006\u0002", ((Process.getThreadPriority(0) + 20) >> 6) + 18).intern())) {
                    b2 = -1;
                } else {
                    int i5 = f1637 + 123;
                    f1638 = i5 % 128;
                    b2 = i5 % 2 != 0 ? (byte) 19 : (byte) 81;
                }
                break;
            case 801466981:
                if (!str.equals(m1872(false, new int[]{50, 13, 16, 0}, "\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000").intern())) {
                    b2 = -1;
                } else {
                    b2 = 11;
                }
                break;
            case 1195083870:
                if (!str.equals(m1882((byte) (104 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), "\u0012\n\u0012\u0003\u0012\u000b\u0002\u0000\t\u0007\u0005\u000e", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12).intern())) {
                    b2 = -1;
                } else {
                    b2 = 16;
                }
                break;
            case 1323380041:
                if (!str.equals(m1872(true, new int[]{12, 12, 9, 0}, "\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000").intern())) {
                    b2 = -1;
                } else {
                    b2 = 2;
                }
                break;
            case 1340011123:
                if (!str.equals(m1872(true, new int[]{24, 11, 0, 2}, "\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001").intern())) {
                    b2 = -1;
                } else {
                    int i6 = f1638 + 75;
                    f1637 = i6 % 128;
                    if (i6 % 2 == 0) {
                        b2 = 3;
                    } else {
                        b2 = 4;
                    }
                }
                break;
            case 1345250484:
                if (!str.equals(m1882((byte) (56 - View.combineMeasuredStates(0, 0)), "\u000b\u0000\u0004\f\u000b\u0006\u0011\u0000\u0011\u0012\u0002\u0004\u0000\t\u0007\b\u0004\u0015\u000e\u0000¦", 21 - View.getDefaultSize(0, 0)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 30;
                }
                break;
            case 1939710523:
                if (!str.equals(m1872(true, new int[]{124, 16, 0, 0}, "\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000").intern())) {
                    b2 = -1;
                } else {
                    b2 = 26;
                }
                break;
            case 2108820561:
                if (!str.equals(m1872(true, new int[]{74, 17, 29, 0}, "\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000").intern())) {
                    b2 = -1;
                } else {
                    b2 = 21;
                }
                break;
            case 2109208793:
                if (!str.equals(m1882((byte) (73 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), "\u0001\u0002\u0001\f\r\u000e\n\u0013\b\u000b\t\u0007\u0005\u000e", 14 - (Process.myTid() >> 22)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 4;
                }
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                return m1883();
            case 1:
                return m1878();
            case 2:
                return m1867();
            case 3:
                return m1873();
            case 4:
                List<String> listM1864 = m1864();
                int i7 = f1637 + 91;
                f1638 = i7 % 128;
                if (i7 % 2 != 0) {
                    return listM1864;
                }
                throw null;
            case 5:
                return Integer.valueOf(m1860().m2209());
            case 6:
                return Integer.valueOf(m1862().m2209());
            case 7:
                m1865((String) cz.m1785(list, 0, String.class));
                return null;
            case 8:
                m1866((List<String>) cz.m1785(list, 0, List.class));
                return null;
            case 9:
                m1868((String) cz.m1785(list, 0, String.class));
                return null;
            case 10:
                m1869((List<String>) cz.m1785(list, 0, List.class));
                return null;
            case 11:
                m1884((String) cz.m1785(list, 0, String.class));
                return null;
            case 12:
                m1885((List<String>) cz.m1785(list, 0, List.class));
                return null;
            case 13:
                m1875((String) cz.m1785(list, 0, String.class));
                return null;
            case 14:
                m1881((List<String>) cz.m1785(list, 0, List.class));
                return null;
            case 15:
                m1880((String) cz.m1785(list, 0, String.class));
                return null;
            case 16:
                m1877((List<String>) cz.m1785(list, 0, List.class));
                return null;
            case 17:
                m1879(hn.m2208(((Integer) cz.m1785(list, 0, Integer.class)).intValue()));
                return null;
            case 18:
                m1874(hn.m2208(((Integer) cz.m1785(list, 0, Integer.class)).intValue()));
                return null;
            case 19:
                m1855((String) cz.m1785(list, 0, String.class));
                return null;
            case 20:
                String strM1858 = m1858();
                f1637 = (f1638 + 97) % 128;
                return strM1858;
            case 21:
                m1861((String) cz.m1785(list, 0, String.class));
                return null;
            case 22:
                return m1856();
            case 23:
                m1859((String) cz.m1785(list, 0, String.class));
                return null;
            case 24:
                return m1854();
            case 25:
                m1857((String) cz.m1785(list, 0, String.class));
                return null;
            case 26:
                return m1850();
            case 27:
                m1863((String) cz.m1785(list, 0, String.class));
                return null;
            case 28:
                return m1849();
            case 29:
                return m1848();
            case 30:
                m1871((JSONObject) cz.m1785(list, 0, JSONObject.class));
                return null;
            case 31:
                return m1851();
            case 32:
                m1852((String) cz.m1785(list, 0, String.class));
                return null;
            case 33:
                return m1853();
            case 34:
                return m1847();
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m1876(String str, List<String> list) {
        int i2 = f1638 + 73;
        f1637 = i2 % 128;
        if (i2 % 2 == 0) {
            if (list == null || TextUtils.isEmpty(str)) {
                return;
            }
            f1637 = (f1638 + 91) % 128;
            if (list.contains(str)) {
                return;
            }
            list.add(str);
            return;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1872(boolean z2, int[] iArr, String str) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes(CharEncoding.ISO_8859_1);
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (h.f2186) {
            try {
                int i2 = iArr[0];
                int i3 = iArr[1];
                int i4 = iArr[2];
                int i5 = iArr[3];
                char[] cArr = new char[i3];
                System.arraycopy(f1639, i2, cArr, 0, i3);
                if (bArr != null) {
                    char[] cArr2 = new char[i3];
                    h.f2185 = 0;
                    char c2 = 0;
                    while (true) {
                        int i6 = h.f2185;
                        if (i6 >= i3) {
                            break;
                        }
                        if (bArr[i6] == 1) {
                            cArr2[i6] = (char) (((cArr[i6] << 1) + 1) - c2);
                        } else {
                            cArr2[i6] = (char) ((cArr[i6] << 1) - c2);
                        }
                        c2 = cArr2[i6];
                        h.f2185 = i6 + 1;
                    }
                    cArr = cArr2;
                }
                if (i5 > 0) {
                    char[] cArr3 = new char[i3];
                    System.arraycopy(cArr, 0, cArr3, 0, i3);
                    int i7 = i3 - i5;
                    System.arraycopy(cArr3, 0, cArr, i7, i5);
                    System.arraycopy(cArr3, i5, cArr, 0, i7);
                }
                if (z2) {
                    char[] cArr4 = new char[i3];
                    h.f2185 = 0;
                    while (true) {
                        int i8 = h.f2185;
                        if (i8 >= i3) {
                            break;
                        }
                        cArr4[i8] = cArr[(i3 - i8) - 1];
                        h.f2185 = i8 + 1;
                    }
                    cArr = cArr4;
                }
                if (i4 > 0) {
                    h.f2185 = 0;
                    while (true) {
                        int i9 = h.f2185;
                        if (i9 >= i3) {
                            break;
                        }
                        cArr[i9] = (char) (cArr[i9] - iArr[2]);
                        h.f2185 = i9 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}
