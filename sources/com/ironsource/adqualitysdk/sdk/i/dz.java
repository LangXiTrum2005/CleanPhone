package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class dz {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f1862 = 1;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1863 = 0;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static long f1864 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f1865 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static long f1866 = -6254109003083881072L;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static char f1867 = 51722;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f1868;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private int f1869 = -1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String[] f1870;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private gb f1871;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final dz f1872;

    public dz(String str, String str2, String str3, JSONObject jSONObject, dz dzVar) {
        this.f1868 = eb.m2127(str3);
        this.f1872 = dzVar;
        List listM2866 = kj.m2866(jSONObject.optJSONArray(m2110("쇽앍\uf21b䓼솜₯㥜\uf43f", Drawable.resolveOpacity(0, 0)).intern()), new kj.e<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.dz.3
            @Override // com.ironsource.adqualitysdk.sdk.i.kj.e
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ String mo542(JSONArray jSONArray, int i10) {
                return eb.m2127(jSONArray.optString(i10));
            }
        });
        String[] strArr = new String[listM2866.size()];
        this.f1870 = strArr;
        listM2866.toArray(strArr);
        try {
            this.f1871 = new dx().m2098(dv.m2050(str, str3, jSONObject.optString(m2110("蛝沰ã䲴蚿襏쮧ﱽ", (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern())));
        } catch (ed e10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2110("\udd10ƀ\u0ec7琌\udd55\ue462얕쓓䬢穰濗㊝\uf1e2Ꮳ癩ꥒᾷ꧰荊ܙ葤㽸⪈緘㉰핷", TextUtils.indexOf("", "", 0, 0)).intern());
            sb2.append(this.f1868);
            sb2.append(m2110("\ue97fﶩ噝片\ue958᠙鴜슃缟蘕㝔㓙얚\uef99", ViewConfiguration.getScrollBarFadeDuration() >> 16).intern());
            sb2.append(e10.m2144() + m2112());
            sb2.append(m2110("␥㠾鷈\udefc␟\udd8e", ExpandableListView.getPackedPositionChild(0L) + 1).intern());
            sb2.append(e10.getMessage());
            new Cdo(str, str2, str3, m2112(), sb2.toString(), e10).m2034(str);
        } catch (Throwable th2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m2110("\udd10ƀ\u0ec7琌\udd55\ue462얕쓓䬢穰濗㊝\uf1e2Ꮳ癩ꥒᾷ꧰荊ܙ葤㽸⪈緘㉰핷", ViewConfiguration.getPressedStateDuration() >> 16).intern());
            sb3.append(this.f1868);
            sb3.append(m2108((char) (57368 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), "\u0000\u0000\u0000\u0000", "羖\ue1fbᢍꓠ", "\ueb41\uea2d\uda4a", (-1914569857) - Color.argb(0, 0, 0, 0)).intern());
            sb3.append(th2.getMessage());
            String string = sb3.toString();
            cn.m1710(str, string, th2, new Cdo(str, str2, str3, m2112(), string));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0085, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0086, code lost:
    
        r5 = new java.util.HashMap();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0090, code lost:
    
        if (r6 >= r7.size()) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0092, code lost:
    
        r0 = com.ironsource.adqualitysdk.sdk.i.dz.f1863 + 79;
        com.ironsource.adqualitysdk.sdk.i.dz.f1862 = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009c, code lost:
    
        if ((r0 % 2) != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009e, code lost:
    
        r5.put(r8.get(r6), r7.get(r6));
        r6 = r6 + 125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ac, code lost:
    
        r5.put(r8.get(r6), r7.get(r6));
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ba, code lost:
    
        r6 = com.ironsource.adqualitysdk.sdk.i.dz.f1862 + 75;
        com.ironsource.adqualitysdk.sdk.i.dz.f1863 = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c4, code lost:
    
        if ((r6 % 2) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c6, code lost:
    
        r6 = 63 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c9, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r7.size() != r8.size()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r7.size() != r8.size()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        r6 = r6.m1643();
        r0 = new java.lang.StringBuilder();
        r0.append(r5.f1868);
        r0.append(m2108((char) (android.graphics.Color.argb(0, 0, 0, 0) + 14233), "\u0000\u0000\u0000\u0000", "᭮߇餷ķ", "彺㗸㱞\ueeb3镯\ue587⮝叹ᩍ㒹ጆ\uf87d䈳逻ᫀ약\ueebc", 923256603 - android.view.KeyEvent.normalizeMetaState(0)).intern());
        r0.append(r8.size());
        r0.append(m2108((char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), "\u0000\u0000\u0000\u0000", "箶䤵ﻥ搗", "\ude1d䁁븲熈ɸ䟕멡웩㶹獫鍝Ү\uf75a敡꫞ᎎ샴锯\uf85d椏쫊髹屠㿷", android.view.ViewConfiguration.getTouchSlop() >> 8).intern());
        r0.append(r7.size());
        com.ironsource.adqualitysdk.sdk.i.cn.m1706(r6, r0.toString());
     */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.Map<java.lang.String, java.lang.Object> m2109(com.ironsource.adqualitysdk.sdk.i.cl r6, java.util.List<java.lang.Object> r7, java.util.List<java.lang.String> r8) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dz.m2109(com.ironsource.adqualitysdk.sdk.i.cl, java.util.List, java.util.List):java.util.Map");
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private int m2111() {
        gb gbVar = this.f1871;
        if (gbVar != null) {
            f1863 = (f1862 + 95) % 128;
            return gbVar.mo2218();
        }
        f1862 = (f1863 + 61) % 128;
        return 1;
    }

    public String toString() {
        String strIntern;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2110("癓ጃ\ue4dc殛瘵\uf6e6⾒\udb48\ue067梺藓ⴅ嫳", KeyEvent.keyCodeFromString("")).intern());
        sb2.append(this.f1868);
        sb2.append(m2110("櫢튺\u0557傞櫊", ViewConfiguration.getScrollBarSize() >> 8).intern());
        sb2.append(String.join(m2108((char) (53965 - KeyEvent.getDeadChar(0, 0)), "\u0000\u0000\u0000\u0000", "亃탽췁巒", "೪迨", Color.argb(0, 0, 0, 0)).intern(), this.f1870));
        sb2.append(m2108((char) (TextUtils.lastIndexOf("", '0') + 8250), "\u0000\u0000\u0000\u0000", "塵谯㥓䀠", "眕任", ViewConfiguration.getMaximumFlingVelocity() >> 16).intern());
        gb gbVar = this.f1871;
        if (gbVar != null) {
            f1862 = (f1863 + InterfaceC0435l1.d.b.f29107d) % 128;
            strIntern = gbVar.toString();
            f1863 = (f1862 + 1) % 128;
        } else {
            strIntern = m2110("Ꮦ邨掔쥓Ꭽ甘\ua8c9", KeyEvent.normalizeMetaState(0)).intern();
        }
        sb2.append(strIntern);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final ea m2113(ee eeVar, cl clVar, List<Object> list) {
        ee eeVar2 = new ee(m2109(clVar, list, Arrays.asList(this.f1870)), eeVar.m2151(), this, eeVar);
        gb gbVar = this.f1871;
        if (gbVar != null) {
            f1863 = (f1862 + 37) % 128;
            return gbVar.m2232(eeVar2, clVar);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2110("\u2db7\u0cd4憵땈ⷲ\ue936ꫧ֗뮅眤¼\uf3d6Łẫ陾树\uef19ꓣ\uec75왕瓒㈰䗽벗슓\ud824\udbf2", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1).intern());
        sb2.append(this.f1868);
        new dr(clVar, eeVar2, f2.m(sb2, m2108((char) View.getDefaultSize(0, 0), "\u0000\u0000\u0000\u0000", "탯淛픧日", "㽜뻁笱謨蟕燐폭骀᰿羈\uf339톄쌕᧱릖聁岖匴쒓쀵뗲㣿Ǿ", 661511121 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))))).m2034(clVar.m1643());
        f1862 = (f1863 + 87) % 128;
        return null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m2114() {
        int i10 = f1863;
        String str = this.f1868;
        f1862 = (i10 + 25) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final int m2112() {
        if (this.f1869 == -1) {
            f1863 = (f1862 + 77) % 128;
            dz dzVar = this.f1872;
            if (dzVar == null) {
                this.f1869 = 1;
            } else {
                this.f1869 = dzVar.m2112() + this.f1872.m2111() + 1;
            }
        }
        int i10 = this.f1869;
        int i11 = f1863 + InterfaceC0435l1.d.b.f29112i;
        f1862 = i11 % 128;
        if (i11 % 2 != 0) {
            return i10;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2110(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2127) {
            try {
                char[] cArrM2229 = g.m2229(f1866, cArr, i10);
                g.f2129 = 4;
                while (true) {
                    int i11 = g.f2129;
                    if (i11 < cArrM2229.length) {
                        int i12 = i11 - 4;
                        g.f2128 = i12;
                        cArrM2229[i11] = (char) (((long) (cArrM2229[i11] ^ cArrM2229[i11 % 4])) ^ (((long) i12) * f1866));
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

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2108(char c4, String str, String str2, String str3, int i10) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (f.f2016) {
            try {
                char[] cArr4 = (char[]) cArr2.clone();
                char[] cArr5 = (char[]) cArr3.clone();
                cArr4[0] = (char) (c4 ^ cArr4[0]);
                cArr5[2] = (char) (cArr5[2] + ((char) i10));
                int length = cArr.length;
                char[] cArr6 = new char[length];
                f.f2015 = 0;
                while (true) {
                    int i11 = f.f2015;
                    if (i11 < length) {
                        int i12 = (i11 + 2) % 4;
                        int i13 = (i11 + 3) % 4;
                        int i14 = cArr4[i11 % 4] * 32718;
                        char c5 = cArr5[i12];
                        char c10 = (char) ((i14 + c5) % Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        f.f2017 = c10;
                        cArr5[i13] = (char) d5.u.d(cArr4[i13], 32718, c5, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        cArr4[i13] = c10;
                        int i15 = f.f2015;
                        cArr6[i15] = (char) (((((long) (c10 ^ cArr[i15])) ^ f1864) ^ ((long) f1865)) ^ ((long) f1867));
                        f.f2015 = i15 + 1;
                    } else {
                        str4 = new String(cArr6);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str4;
    }
}
