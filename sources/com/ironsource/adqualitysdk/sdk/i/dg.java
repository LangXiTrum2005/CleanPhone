package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0435l1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class dg {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f1676 = 1;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f1678;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private Map<String, dl> f1680;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private ee f1681;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private String f1682;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private String f1683;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private dp f1684;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private String f1685;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f1686;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f1687;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f1688;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private JSONObject f1689;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private ee f1690;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int[] f1677 = {-422912509, -1290888684, 1458034471, -35608610, 1456982448, -1211883451, -2047688405, -35421485, 1665232274, 114797535, -765780059, 1544186063, 1926685076, -1268380982, -987056562, 370104852, 299298522, -600893503};

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static long f1679 = 9193046620942889821L;

    public dg(String str, ee eeVar) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f1689 = jSONObject;
            this.f1690 = eeVar;
            this.f1687 = jSONObject.optString(m1916(new int[]{43372467, -77124090}, View.getDefaultSize(0, 0) + 4).intern());
            this.f1686 = this.f1689.optString(m1916(new int[]{1709687171, -816869603, 878528559, 1750968025, 2019826997, 898220020}, MotionEvent.axisFromString("") + 12).intern());
            this.f1688 = this.f1689.optString(m1913("ᗲᖄ萔՟\udd82眬\ue397ߦ\ud8ef䒪넟", 1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern());
            this.f1683 = this.f1689.optString(m1913("鷮鶃ꩍﵪꒃ她ᮾ织僾櫷", 1 - TextUtils.getCapsMode("", 0, 0)).intern());
            this.f1685 = this.f1689.optString(m1913("쨂쩯鏶톾\ue429惊㝼㹭ܒ卌", 1 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern());
            if (this.f1689.has(m1916(new int[]{1007677873, 711957935, 445411583, -1797405368, -770883293, -421803077}, 12 - (Process.myPid() >> 22)).intern())) {
                m1917(this.f1689.optJSONObject(m1916(new int[]{1007677873, 711957935, 445411583, -1797405368, -770883293, -421803077}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 12).intern()));
            }
        } catch (Throwable th2) {
            cn.m1708(this.f1687, m1913("\uea2f\uea6a\u0adf\uf35e駾藺ᖖ䎆✩쨮䜓㸇炢蓻犈\ued68舝儁뱨\u10bb90⎜\uefba陼\ue908ﰊ\u1acf䓗㪷캩䑃㍟瑥鬿矟", 1 - TextUtils.indexOf("", "", 0, 0)).intern(), th2);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m1915(dg dgVar) {
        int i10 = (f1678 + 117) % 128;
        f1676 = i10;
        String str = dgVar.f1687;
        f1678 = (i10 + 107) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final dp m1918() {
        f1676 = (f1678 + 125) % 128;
        if (this.f1684 == null) {
            this.f1684 = new dp(this.f1689.optJSONObject(m1913("蚐蛧䰩䫤媺뼑갼胻䮍貝ﺽﵻᰋ", -MotionEvent.axisFromString("")).intern()));
        }
        dp dpVar = this.f1684;
        int i10 = f1676 + 71;
        f1678 = i10 % 128;
        if (i10 % 2 == 0) {
            return dpVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final ee m1919() {
        f1678 = (f1676 + 41) % 128;
        if (this.f1681 == null) {
            ee eeVar = new ee(kj.m2860(this.f1689.optJSONObject(m1913("湇渤帨窑\ue3ca괚鱅㦮ꍇ麊", KeyEvent.normalizeMetaState(0) + 1).intern()), new kj.a<Object>() { // from class: com.ironsource.adqualitysdk.sdk.i.dg.3

                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                private static int f1692 = 0;

                /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                private static int f1693 = 1;

                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                private static int[] f1694 = {659205437, 560191056, 2017656382, 178766946, 639343202, -1415064690, 562999288, -235066060, 1400637773, -1406106528, 2146955173, 950498675, 584990467, 1403111893, 1858124064, -1578880964, -2112822686, 1096100110};

                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                private static String m1927(int[] iArr, int i10) {
                    String str;
                    synchronized (a.f61) {
                        try {
                            char[] cArr = new char[4];
                            char[] cArr2 = new char[iArr.length << 1];
                            int[] iArr2 = (int[]) f1694.clone();
                            a.f58 = 0;
                            while (true) {
                                int i11 = a.f58;
                                if (i11 < iArr.length) {
                                    int i12 = iArr[i11];
                                    char c4 = (char) (i12 >> 16);
                                    cArr[0] = c4;
                                    char c5 = (char) i12;
                                    cArr[1] = c5;
                                    char c10 = (char) (iArr[i11 + 1] >> 16);
                                    cArr[2] = c10;
                                    char c11 = (char) iArr[i11 + 1];
                                    cArr[3] = c11;
                                    a.f59 = (c4 << 16) + c5;
                                    a.f60 = (c10 << 16) + c11;
                                    a.m199(iArr2);
                                    for (int i13 = 0; i13 < 16; i13++) {
                                        int i14 = a.f59 ^ iArr2[i13];
                                        a.f59 = i14;
                                        int iM200 = a.m200(i14) ^ a.f60;
                                        int i15 = a.f59;
                                        a.f59 = iM200;
                                        a.f60 = i15;
                                    }
                                    int i16 = a.f59;
                                    int i17 = a.f60;
                                    a.f59 = i17;
                                    a.f60 = i16;
                                    int i18 = i16 ^ iArr2[16];
                                    a.f60 = i18;
                                    int i19 = i17 ^ iArr2[17];
                                    a.f59 = i19;
                                    cArr[0] = (char) (i19 >>> 16);
                                    cArr[1] = (char) i19;
                                    cArr[2] = (char) (i18 >>> 16);
                                    cArr[3] = (char) i18;
                                    a.m199(iArr2);
                                    int i20 = a.f58;
                                    cArr2[i20 << 1] = cArr[0];
                                    cArr2[(i20 << 1) + 1] = cArr[1];
                                    cArr2[(i20 << 1) + 2] = cArr[2];
                                    cArr2[(i20 << 1) + 3] = cArr[3];
                                    a.f58 = i20 + 2;
                                } else {
                                    str = new String(cArr2, 0, i10);
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return str;
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.kj.a
                /* JADX INFO: renamed from: ｋ */
                public final Object mo541(JSONObject jSONObject, String str) {
                    int i10 = f1693 + 9;
                    f1692 = i10 % 128;
                    try {
                        if (i10 % 2 != 0) {
                            jSONObject.optString(str);
                            jSONObject.opt(str);
                            throw null;
                        }
                        String strOptString = jSONObject.optString(str);
                        if (jSONObject.opt(str) instanceof String) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(m1927(new int[]{-2091271667, -669131752}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern());
                            sb2.append(strOptString);
                            sb2.append(m1927(new int[]{-2091271667, -669131752}, -ExpandableListView.getPackedPositionChild(0L)).intern());
                            strOptString = sb2.toString();
                        }
                        ef efVarM2099 = new dx().m2099(dv.m2050(dg.m1915(dg.this), strOptString, strOptString));
                        int i11 = f1692 + 47;
                        f1693 = i11 % 128;
                        if (i11 % 2 != 0) {
                            return efVarM2099;
                        }
                        throw null;
                    } catch (Throwable th2) {
                        String strM1915 = dg.m1915(dg.this);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(m1927(new int[]{2077364327, -136366831, 1981161830, -1723167285, 1916011722, 343318407, 1159548129, -250824140}, 14 - KeyEvent.keyCodeFromString("")).intern());
                        sb3.append(str);
                        sb3.append(m1927(new int[]{1105779561, -995860232, 638393935, 481795143}, TextUtils.indexOf((CharSequence) "", '0') + 9).intern());
                        sb3.append(jSONObject.optString(str));
                        cn.m1708(strM1915, sb3.toString(), th2);
                        return null;
                    }
                }
            }), this.f1690, true);
            this.f1681 = eeVar;
            eeVar.m2156(kj.m2866(this.f1689.optJSONArray(m1913("쥋줦蛬ੋ똼痔\uec9c汉њ䙏븖", -TextUtils.lastIndexOf("", '0')).intern()), new kj.e<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.dg.1
                @Override // com.ironsource.adqualitysdk.sdk.i.kj.e
                /* JADX INFO: renamed from: ﾒ */
                public final /* synthetic */ String mo542(JSONArray jSONArray, int i10) {
                    return eb.m2127(jSONArray.optString(i10));
                }
            }));
            f1676 = (f1678 + 39) % 128;
        }
        return this.f1681;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final Map<String, dl> m1920() {
        f1678 = (f1676 + 71) % 128;
        Map<String, dl> mapM1914 = m1914(m1913("プセᩉꜢ\uddbf\ue97d䇫ߜﷆ\udaf6፩穆ꩌ", 1 - Color.red(0)).intern());
        f1676 = (f1678 + 37) % 128;
        return mapM1914;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final String m1921() {
        int i10 = f1678 + 91;
        int i11 = i10 % 128;
        f1676 = i11;
        int i12 = i10 % 2;
        String str = this.f1683;
        if (i12 == 0) {
            int i13 = 17 / 0;
        }
        f1678 = (i11 + 33) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m1923() {
        int i10 = f1678 + 53;
        f1676 = i10 % 128;
        int i11 = i10 % 2;
        String str = this.f1687;
        if (i11 == 0) {
            int i12 = 4 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m1924() {
        int i10 = (f1678 + 93) % 128;
        f1676 = i10;
        String str = this.f1685;
        int i11 = i10 + 9;
        f1678 = i11 % 128;
        if (i11 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m1925() {
        int i10 = f1678;
        int i11 = i10 + 21;
        f1676 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        String str = this.f1688;
        f1676 = (i10 + InterfaceC0435l1.d.b.f29114k) % 128;
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Map<String, dl> m1914(String str) {
        int i10 = f1678 + 39;
        f1676 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 0 / 0;
            if (this.f1680 == null) {
                this.f1680 = kj.m2860(this.f1689.optJSONObject(str), new kj.a<dl>() { // from class: com.ironsource.adqualitysdk.sdk.i.dg.2
                    @Override // com.ironsource.adqualitysdk.sdk.i.kj.a
                    /* JADX INFO: renamed from: ｋ */
                    public final /* synthetic */ dl mo541(JSONObject jSONObject, String str2) {
                        return new dl(dg.m1915(dg.this), str2, jSONObject.optJSONObject(str2));
                    }
                });
                f1676 = (f1678 + 27) % 128;
            }
        } else if (this.f1680 == null) {
            this.f1680 = kj.m2860(this.f1689.optJSONObject(str), new kj.a<dl>() { // from class: com.ironsource.adqualitysdk.sdk.i.dg.2
                @Override // com.ironsource.adqualitysdk.sdk.i.kj.a
                /* JADX INFO: renamed from: ｋ */
                public final /* synthetic */ dl mo541(JSONObject jSONObject, String str2) {
                    return new dl(dg.m1915(dg.this), str2, jSONObject.optJSONObject(str2));
                }
            });
            f1676 = (f1678 + 27) % 128;
        }
        return this.f1680;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m1917(JSONObject jSONObject) {
        int i10 = f1678 + 81;
        f1676 = i10 % 128;
        if (i10 % 2 == 0) {
            jSONObject.keys();
            throw null;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            this.f1690.m2152(next, jSONObject.opt(next));
            f1676 = (f1678 + 29) % 128;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final String m1922(String str) {
        if (this.f1682 == null) {
            f1678 = (f1676 + 9) % 128;
            Map<String, String> mapM2859 = kj.m2859(this.f1689.optJSONObject(m1916(new int[]{576701129, 12098579, 923657867, 2123823930, 1251495557, -60250548, -519649701, 244576693, 1905287450, 66135048}, Color.alpha(0) + 18).intern()));
            if (mapM2859 != null) {
                ArrayList<String> arrayList = new ArrayList(mapM2859.keySet());
                Collections.sort(arrayList, new Comparator<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.dg.4
                    @Override // java.util.Comparator
                    public final /* synthetic */ int compare(String str2, String str3) {
                        return kn.m2912(str2, str3);
                    }
                });
                String str2 = null;
                for (String str3 : arrayList) {
                    f1676 = (f1678 + 107) % 128;
                    if (kn.m2912(str, str3) >= 0) {
                        str2 = mapM2859.get(str3);
                    }
                    f1676 = (f1678 + 15) % 128;
                }
                this.f1682 = str2;
            }
        }
        return this.f1682;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m1926() {
        int i10 = f1676 + 15;
        int i11 = i10 % 128;
        f1678 = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        String str = this.f1686;
        int i12 = i11 + 25;
        f1676 = i12 % 128;
        if (i12 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1916(int[] iArr, int i10) {
        String str;
        synchronized (a.f61) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f1677.clone();
                a.f58 = 0;
                while (true) {
                    int i11 = a.f58;
                    if (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        char c4 = (char) (i12 >> 16);
                        cArr[0] = c4;
                        char c5 = (char) i12;
                        cArr[1] = c5;
                        char c10 = (char) (iArr[i11 + 1] >> 16);
                        cArr[2] = c10;
                        char c11 = (char) iArr[i11 + 1];
                        cArr[3] = c11;
                        a.f59 = (c4 << 16) + c5;
                        a.f60 = (c10 << 16) + c11;
                        a.m199(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = a.f59 ^ iArr2[i13];
                            a.f59 = i14;
                            int iM200 = a.m200(i14) ^ a.f60;
                            int i15 = a.f59;
                            a.f59 = iM200;
                            a.f60 = i15;
                        }
                        int i16 = a.f59;
                        int i17 = a.f60;
                        a.f59 = i17;
                        a.f60 = i16;
                        int i18 = i16 ^ iArr2[16];
                        a.f60 = i18;
                        int i19 = i17 ^ iArr2[17];
                        a.f59 = i19;
                        cArr[0] = (char) (i19 >>> 16);
                        cArr[1] = (char) i19;
                        cArr[2] = (char) (i18 >>> 16);
                        cArr[3] = (char) i18;
                        a.m199(iArr2);
                        int i20 = a.f58;
                        cArr2[i20 << 1] = cArr[0];
                        cArr2[(i20 << 1) + 1] = cArr[1];
                        cArr2[(i20 << 1) + 2] = cArr[2];
                        cArr2[(i20 << 1) + 3] = cArr[3];
                        a.f58 = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1913(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2127) {
            try {
                char[] cArrM2229 = g.m2229(f1679, cArr, i10);
                g.f2129 = 4;
                while (true) {
                    int i11 = g.f2129;
                    if (i11 < cArrM2229.length) {
                        int i12 = i11 - 4;
                        g.f2128 = i12;
                        cArrM2229[i11] = (char) (((long) (cArrM2229[i11] ^ cArrM2229[i11 % 4])) ^ (((long) i12) * f1679));
                        g.f2129 = i11 + 1;
                    } else {
                        str2 = new String(cArrM2229, 4, cArrM2229.length - 4);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
