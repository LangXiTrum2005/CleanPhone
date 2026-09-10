package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class x<K, T> implements p<K, T> {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f3052 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f3055;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private p<K, T> f3059;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private p<K, T> f3060 = new p<K, T>() { // from class: com.ironsource.adqualitysdk.sdk.i.x.2
        @Override // com.p004ironsource.adqualitysdk.sdk.i.p
        /* JADX INFO: renamed from: ﻐ */
        public final void mo258(JSONObject jSONObject, K k, T t) {
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.p
        /* JADX INFO: renamed from: ﻛ */
        public final void mo1633(JSONObject jSONObject, K k, T t) {
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.p
        /* JADX INFO: renamed from: ｋ */
        public final void mo265(JSONObject jSONObject, K k, T t) {
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.p
        /* JADX INFO: renamed from: ﾇ */
        public final void mo1638(JSONObject jSONObject, K k, T t) {
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.p
        /* JADX INFO: renamed from: ﾒ */
        public final void mo1642(JSONObject jSONObject, K k, T t) {
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.p
        /* JADX INFO: renamed from: ｋ */
        public final void mo1635(JSONObject jSONObject, K k, Object obj, T t) {
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.p
        /* JADX INFO: renamed from: ﾇ */
        public final void mo1639(JSONObject jSONObject, K k, Object obj, T t) {
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.p
        /* JADX INFO: renamed from: ﾒ */
        public final void mo1643(JSONObject jSONObject, K k, Object obj, T t) {
        }
    };

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int[] f3057 = {1821354989, 977792672, 161182965, -1197872108, 1119705411, -1907422789, -834813515, -81941397, -20049129, 585569748, 1201322586, -1317719078, -1235753251, -1242666424, -2063751310, -226774, -180009001, -804157015};

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char f3053 = 65462;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f3056 = 22242;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static char f3054 = 53951;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f3058 = 29621;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private p<K, T> m3001() {
        int i2 = f3052;
        int i3 = i2 + 1;
        f3055 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        p<K, T> pVar = this.f3059;
        if (pVar != null) {
            return pVar;
        }
        p<K, T> pVar2 = this.f3060;
        f3055 = (i2 + 65) % 128;
        return pVar2;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.p
    /* JADX INFO: renamed from: ﻛ */
    public final void mo1633(JSONObject jSONObject, K k, T t) {
        f3055 = (f3052 + 29) % 128;
        JSONObject jSONObjectM3005 = m3005(jSONObject, t);
        m3002(m3004("王캃Э쐂ラ㘗咍낗\ud8e4な", ((Process.getThreadPriority(0) + 20) >> 6) + 9).intern(), jSONObjectM3005);
        m3001().mo1633(jSONObjectM3005, k, t);
        f3055 = (f3052 + 43) % 128;
    }

    /* JADX INFO: renamed from: ｋ */
    public abstract String mo261(T t);

    @Override // com.p004ironsource.adqualitysdk.sdk.i.p
    /* JADX INFO: renamed from: ｋ */
    public void mo265(JSONObject jSONObject, K k, T t) {
        f3052 = (f3055 + 117) % 128;
        JSONObject jSONObjectM3005 = m3005(jSONObject, t);
        m3002(m3003(new int[]{-355690244, 575201560, -1422199200, -54633889, -1326012990, -1938158944, 35782360, 123677469}, 13 - TextUtils.indexOf("", "")).intern(), jSONObjectM3005);
        m3001().mo265(jSONObjectM3005, k, t);
        f3055 = (f3052 + 31) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m3006(p<K, T> pVar) {
        int i2 = (f3052 + 39) % 128;
        f3055 = i2;
        this.f3059 = pVar;
        int i3 = i2 + 67;
        f3052 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 30 / 0;
        }
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.p
    /* JADX INFO: renamed from: ﾒ */
    public final void mo1643(JSONObject jSONObject, K k, Object obj, T t) {
        JSONObject jSONObjectM3005;
        String strM3003;
        int i2 = f3055 + 25;
        f3052 = i2 % 128;
        if (i2 % 2 == 0) {
            jSONObjectM3005 = m3005(jSONObject, t);
            strM3003 = m3003(new int[]{795643482, 1828768691, -143041691, -1041858202, -957566315, 1074401623}, 7 / (SystemClock.elapsedRealtime() > 1L ? 1 : (SystemClock.elapsedRealtime() == 1L ? 0 : -1)));
        } else {
            jSONObjectM3005 = m3005(jSONObject, t);
            strM3003 = m3003(new int[]{795643482, 1828768691, -143041691, -1041858202, -957566315, 1074401623}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 10);
        }
        m3002(strM3003.intern(), jSONObjectM3005);
        m3001().mo1643(jSONObjectM3005, k, obj, t);
        f3052 = (f3055 + 45) % 128;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.p
    /* JADX INFO: renamed from: ﾇ */
    public final void mo1639(JSONObject jSONObject, K k, Object obj, T t) {
        f3055 = (f3052 + 93) % 128;
        JSONObject jSONObjectM3005 = m3005(jSONObject, t);
        m3002(m3003(new int[]{-1812336080, -1653031124, -160148310, 1722438500, 703877969, 370300871}, 10 - (ViewConfiguration.getEdgeSlop() >> 16)).intern(), jSONObjectM3005);
        m3001().mo1639(jSONObjectM3005, k, obj, t);
        int i2 = f3055 + 55;
        f3052 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.p
    /* JADX INFO: renamed from: ﻐ */
    public void mo258(JSONObject jSONObject, K k, T t) {
        JSONObject jSONObjectM3005;
        String strM3003;
        int i2 = f3055 + 43;
        f3052 = i2 % 128;
        if (i2 % 2 == 0) {
            jSONObjectM3005 = m3005(jSONObject, t);
            strM3003 = m3003(new int[]{-355690244, 575201560, -1422199200, -54633889, -1326012990, -1938158944, -306656774, 1912328032, -243173556, 114591898}, Drawable.resolveOpacity(1, 0) + 20);
        } else {
            jSONObjectM3005 = m3005(jSONObject, t);
            strM3003 = m3003(new int[]{-355690244, 575201560, -1422199200, -54633889, -1326012990, -1938158944, -306656774, 1912328032, -243173556, 114591898}, 19 - Drawable.resolveOpacity(0, 0));
        }
        m3002(strM3003.intern(), jSONObjectM3005);
        m3001().mo258(jSONObjectM3005, k, t);
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.p
    /* JADX INFO: renamed from: ｋ */
    public final void mo1635(JSONObject jSONObject, K k, Object obj, T t) {
        f3055 = (f3052 + 21) % 128;
        JSONObject jSONObjectM3005 = m3005(jSONObject, t);
        m3002(m3004("王캃Э쐂ĺ隰튼浦듨ꗏ㺶碜皔躐\ueaf7刲\ue999\udbb1쳾繓", (KeyEvent.getMaxKeyCode() >> 16) + 19).intern(), jSONObjectM3005);
        m3001().mo1635(jSONObjectM3005, k, obj, t);
        int i2 = f3052 + 81;
        f3055 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.p
    /* JADX INFO: renamed from: ﾇ */
    public final void mo1638(JSONObject jSONObject, K k, T t) {
        JSONObject jSONObjectM3005;
        int iIndexOf;
        int i2 = f3052 + 125;
        f3055 = i2 % 128;
        if (i2 % 2 != 0) {
            jSONObjectM3005 = m3005(jSONObject, t);
            iIndexOf = 5 << TextUtils.indexOf((CharSequence) "", 'C', 0);
        } else {
            jSONObjectM3005 = m3005(jSONObject, t);
            iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 14;
        }
        m3002(m3004("Ꝅ览Ǆ輻㦑\udf5b跟ᰋჵ⋫툇ꏲ쳾繓", iIndexOf).intern(), jSONObjectM3005);
        m3001().mo1638(jSONObjectM3005, k, t);
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.p
    /* JADX INFO: renamed from: ﾒ */
    public final void mo1642(JSONObject jSONObject, K k, T t) {
        JSONObject jSONObjectM3005;
        int mode;
        int i2 = f3052 + 119;
        f3055 = i2 % 128;
        if (i2 % 2 != 0) {
            jSONObjectM3005 = m3005(jSONObject, t);
            mode = View.MeasureSpec.getMode(1) * 119;
        } else {
            jSONObjectM3005 = m3005(jSONObject, t);
            mode = 14 - View.MeasureSpec.getMode(0);
        }
        m3002(m3004("穪陿눦螔犠篼\ue1a4ツ輢\ue3ba\uf847嬪榢匳", mode).intern(), jSONObjectM3005);
        m3001().mo1642(jSONObjectM3005, k, t);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m3003(int[] iArr, int i2) {
        String str;
        synchronized (d.f1586) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f3057.clone();
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

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m3002(String str, JSONObject jSONObject) {
        String strIntern = m3004("王캃᭱ᙸ\udda9퉧庱莡战㉀皔躐怷Ⴔ", (ViewConfiguration.getLongPressTimeout() >> 16) + 14).intern();
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(m3004("胈䥗\uf1c3ꁨ", KeyEvent.normalizeMetaState(0) + 3).intern());
        sb.append(str);
        n.m2841(strIntern, sb.toString(), jSONObject);
        f3055 = (f3052 + 35) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private JSONObject m3005(JSONObject jSONObject, T t) {
        try {
            if (!jSONObject.has(ik.f2469)) {
                jSONObject.put(ik.f2469, mo261(t));
            }
            if (!jSONObject.has(ik.f2465)) {
                jSONObject.put(ik.f2465, ju.m2666());
            }
            f3052 = (f3055 + 91) % 128;
        } catch (JSONException e2) {
            n.m2832(m3004("王캃᭱ᙸ\udda9퉧庱莡战㉀皔躐怷Ⴔ", 14 - Color.green(0)).intern(), m3004("\ude26悆皔躐毆マ늕ԝⷛ\udd4d曎\ue8cc龈락跟ᰋჵ⋫툇ꏲϣ䠦栨\ue74d\u173f䖁", 25 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), e2);
        }
        int i2 = f3052 + 107;
        f3055 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 37 / 0;
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m3004(String str, int i2) {
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
                            char c4 = (char) (c2 - (((c3 + i4) ^ ((c3 << 4) + f3053)) ^ ((c3 >>> 5) + f3054)));
                            cArr3[1] = c4;
                            cArr3[0] = (char) (c3 - (((c4 >>> 5) + f3056) ^ ((c4 + i4) ^ ((c4 << 4) + f3058))));
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
