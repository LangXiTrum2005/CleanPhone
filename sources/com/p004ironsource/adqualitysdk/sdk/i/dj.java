package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class dj {

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    private static char f1669 = 35261;

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private static int f1670 = 0;

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    private static int f1671 = 1;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static long f1672 = 4868865621034081255L;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static char f1673 = 29488;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static char f1674 = 61763;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static char f1675 = 17599;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private Map<String, dp> f1676;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private String f1677;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private String f1678;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private String f1679;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private dr f1680;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private dl f1681;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f1682;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private dr f1683;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f1684;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f1685;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private JSONObject f1686;

    public dj(String str, dr drVar) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f1686 = jSONObject;
            this.f1683 = drVar;
            this.f1682 = jSONObject.optString(m1913("ᮉ\udf1b銰噕", 50332 - TextUtils.lastIndexOf("", '0', 0, 0)).intern());
            this.f1685 = this.f1686.optString(m1915("䠺➠㎌觖\uf76eင嚽氺\uf60e鯫\uec7f㽬", Drawable.resolveOpacity(0, 0) + 11).intern());
            this.f1684 = this.f1686.optString(m1913("ᮑ舗⢿휫線\ue461苷", 39318 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern());
            this.f1677 = this.f1686.optString(m1913("ᮊ읉ꈇ跡梟呯", TextUtils.indexOf((CharSequence) "", '0', 0) + 56520).intern());
            this.f1679 = this.f1686.optString(m1915("◥缮ᯣᡔ䣫\ud91e", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 6).intern());
            if (this.f1686.has(m1915("鈉詷啊ໃ삯벍컰삾빉졗踿禸", 12 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern())) {
                m1914(this.f1686.optJSONObject(m1915("鈉詷啊ໃ삯벍컰삾빉졗踿禸", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 12).intern()));
            }
        } catch (Throwable th) {
            cq.m1676(this.f1682, m1915("㛽톻\ued5a畨⧲缠ᄌ뎂六\ue78f䠮껝\ueb57指ዘ㿒꾁꜅曲땴醺捨Ԕ넣ዘ㿒꾁꜅紙ట\udac3̜", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 31).intern(), th);
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m1914(JSONObject jSONObject) {
        f1671 = (f1670 + 47) % 128;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            this.f1683.m1981(next, jSONObject.opt(next));
            f1671 = (f1670 + 53) % 128;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1916(dj djVar) {
        int i2 = f1671;
        int i3 = i2 + 1;
        f1670 = i3 % 128;
        int i4 = i3 % 2;
        String str = djVar.f1682;
        if (i4 != 0) {
            throw null;
        }
        f1670 = (i2 + 51) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final Map<String, dp> m1917() {
        f1670 = (f1671 + 67) % 128;
        if (this.f1676 == null) {
            this.f1676 = kc.m2765(this.f1686.optJSONObject(m1915("´푔㤩䒿삲슏厐\ud8e9\uf612藇", 9 - View.getDefaultSize(0, 0)).intern()), new kc.c<dp>() { // from class: com.ironsource.adqualitysdk.sdk.i.dj.5
                @Override // com.ironsource.adqualitysdk.sdk.i.kc.c
                /* JADX INFO: renamed from: ﻛ */
                public final /* synthetic */ dp mo534(JSONObject jSONObject, String str) {
                    return new dp(dj.m1916(dj.this), str, jSONObject.optJSONObject(str));
                }
            });
            f1671 = (f1670 + 69) % 128;
        }
        Map<String, dp> map = this.f1676;
        int i2 = f1671 + 57;
        f1670 = i2 % 128;
        if (i2 % 2 == 0) {
            return map;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final dl m1918() {
        int i2 = f1670 + 39;
        f1671 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this.f1681 == null) {
            this.f1681 = new dl(this.f1686.optJSONObject(m1913("ᮐ较㎇Ʝ䮊ﾇ掖ឪ뮜", 37889 - (ViewConfiguration.getTapTimeout() >> 16)).intern()));
            f1671 = (f1670 + 41) % 128;
        }
        return this.f1681;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final dr m1919() {
        f1671 = (f1670 + 79) % 128;
        if (this.f1680 == null) {
            dr drVar = new dr(kc.m2765(this.f1686.optJSONObject(m1913("ᮄ䚹ꇫఇ潗쩡", (Process.myTid() >> 22) + 23857).intern()), new kc.c<Object>() { // from class: com.ironsource.adqualitysdk.sdk.i.dj.1

                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                private static int f1687 = 1;

                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                private static int f1688 = 0;

                /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                private static int f1689 = 125;

                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                private static String m1926(int i2, int i3, int i4, String str, boolean z2) {
                    String str2;
                    Object charArray = str;
                    if (str != null) {
                        charArray = str.toCharArray();
                    }
                    char[] cArr = (char[]) charArray;
                    synchronized (b.f672) {
                        try {
                            char[] cArr2 = new char[i3];
                            b.f673 = 0;
                            while (true) {
                                int i5 = b.f673;
                                if (i5 >= i3) {
                                    break;
                                }
                                b.f671 = cArr[i5];
                                cArr2[b.f673] = (char) (b.f671 + i4);
                                int i6 = b.f673;
                                cArr2[i6] = (char) (cArr2[i6] - f1689);
                                b.f673 = i6 + 1;
                            }
                            if (i2 > 0) {
                                b.f674 = i2;
                                char[] cArr3 = new char[i3];
                                System.arraycopy(cArr2, 0, cArr3, 0, i3);
                                int i7 = b.f674;
                                System.arraycopy(cArr3, 0, cArr2, i3 - i7, i7);
                                int i8 = b.f674;
                                System.arraycopy(cArr3, i8, cArr2, 0, i3 - i8);
                            }
                            if (z2) {
                                char[] cArr4 = new char[i3];
                                b.f673 = 0;
                                while (true) {
                                    int i9 = b.f673;
                                    if (i9 >= i3) {
                                        break;
                                    }
                                    cArr4[i9] = cArr2[(i3 - i9) - 1];
                                    b.f673 = i9 + 1;
                                }
                                cArr2 = cArr4;
                            }
                            str2 = new String(cArr2);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return str2;
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.kc.c
                /* JADX INFO: renamed from: ﻛ */
                public final Object mo534(JSONObject jSONObject, String str) {
                    f1688 = (f1687 + 39) % 128;
                    try {
                        String strOptString = jSONObject.optString(str);
                        if (jSONObject.opt(str) instanceof String) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(m1926(Color.argb(0, 0, 0, 0) + 1, 1 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 159 - View.resolveSize(0, 0), "\u0000", true).intern());
                            sb.append(strOptString);
                            sb.append(m1926((Process.myTid() >> 22) + 1, 1 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) + 159, "\u0000", true).intern());
                            strOptString = sb.toString();
                            f1688 = (f1687 + 59) % 128;
                        }
                        String strM1916 = dj.m1916(dj.this);
                        return new ds(strM1916, strOptString).m2028(dq.m1974(strM1916, strOptString, strOptString));
                    } catch (Throwable th) {
                        String strM1917 = dj.m1916(dj.this);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(m1926((ViewConfiguration.getPressedStateDuration() >> 16) + 3, 13 - ExpandableListView.getPackedPositionChild(0L), 219 - TextUtils.lastIndexOf("", '0', 0), "\u0013\u0013￦\uffc1\b\u000f\n\u0014\u0013\u0002\u0011\uffc1\u0013\u0010", true).intern());
                        sb2.append(str);
                        sb2.append(m1926(7 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 9 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 208 - TextUtils.lastIndexOf("", '0', 0, 0), " \u001f\u001a\u001b\u000fￌￌ￦", true).intern());
                        sb2.append(jSONObject.optString(str));
                        cq.m1676(strM1917, sb2.toString(), th);
                        return null;
                    }
                }
            }), this.f1683, true);
            this.f1680 = drVar;
            drVar.m1982(kc.m2764(this.f1686.optJSONArray(m1915("袢뿜斊᧰厐\ud8e9\uf612藇", 7 - (KeyEvent.getMaxKeyCode() >> 16)).intern()), new kc.b<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.dj.3
                @Override // com.ironsource.adqualitysdk.sdk.i.kc.b
                /* JADX INFO: renamed from: ｋ */
                public final /* synthetic */ String mo535(JSONArray jSONArray, int i2) {
                    return dw.m2051(jSONArray.optString(i2));
                }
            }));
        }
        dr drVar2 = this.f1680;
        f1670 = (f1671 + 33) % 128;
        return drVar2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final String m1920() {
        int i2 = f1671 + 95;
        f1670 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f1679;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m1922() {
        int i2 = f1670 + 71;
        f1671 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f1684;
        }
        int i3 = 20 / 0;
        return this.f1684;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m1925() {
        int i2 = f1670;
        String str = this.f1682;
        f1671 = (i2 + 115) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1913(String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2055) {
            try {
                g.f2056 = i2;
                char[] cArr2 = new char[cArr.length];
                g.f2054 = 0;
                while (true) {
                    int i3 = g.f2054;
                    if (i3 < cArr.length) {
                        cArr2[i3] = (char) (((long) (cArr[i3] ^ (g.f2056 * i3))) ^ f1672);
                        g.f2054++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m1923(String str) {
        int i2 = f1670;
        f1671 = (i2 + 75) % 128;
        if (this.f1678 == null) {
            f1671 = (i2 + 1) % 128;
            Map<String, String> mapM2772 = kc.m2772(this.f1686.optJSONObject(m1913("ᮔ᱀ᐊ\u0cfa҄㵩㔒\u2dd7░幈嘯代䚱罳眤濥枹顧", (ViewConfiguration.getScrollBarSize() >> 8) + 1987).intern()));
            if (mapM2772 != null) {
                ArrayList arrayList = new ArrayList(mapM2772.keySet());
                Collections.sort(arrayList, new Comparator<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.dj.2
                    @Override // java.util.Comparator
                    public final /* synthetic */ int compare(String str2, String str3) {
                        return kd.m2781(str2, str3);
                    }
                });
                Iterator it = arrayList.iterator();
                String str2 = null;
                while (!(!it.hasNext())) {
                    f1670 = (f1671 + 85) % 128;
                    String str3 = (String) it.next();
                    if (kd.m2781(str, str3) >= 0) {
                        str2 = mapM2772.get(str3);
                    }
                }
                this.f1678 = str2;
            }
        }
        return this.f1678;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m1924() {
        int i2 = f1671;
        int i3 = i2 + 123;
        f1670 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.f1677;
        f1670 = (i2 + 73) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m1921() {
        int i2 = f1670;
        String str = this.f1685;
        int i3 = i2 + 13;
        f1671 = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1915(String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (m.f2870) {
            try {
                char[] cArr2 = new char[cArr.length];
                m.f2869 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i3 = m.f2869;
                    if (i3 < cArr.length) {
                        cArr3[0] = cArr[i3];
                        cArr3[1] = cArr[i3 + 1];
                        int i4 = 58224;
                        for (int i5 = 0; i5 < 16; i5++) {
                            char c2 = cArr3[1];
                            char c3 = cArr3[0];
                            char c4 = (char) (c2 - (((c3 + i4) ^ ((c3 << 4) + f1675)) ^ ((c3 >>> 5) + f1669)));
                            cArr3[1] = c4;
                            cArr3[0] = (char) (c3 - (((c4 >>> 5) + f1674) ^ ((c4 + i4) ^ ((c4 << 4) + f1673))));
                            i4 -= 40503;
                        }
                        int i6 = m.f2869;
                        cArr2[i6] = cArr3[0];
                        cArr2[i6 + 1] = cArr3[1];
                        m.f2869 = i6 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}
