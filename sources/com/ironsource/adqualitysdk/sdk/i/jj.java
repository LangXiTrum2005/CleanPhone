package com.ironsource.adqualitysdk.sdk.i;

import android.annotation.TargetApi;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.ironsource.InterfaceC0435l1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class jj {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int[] f2713 = {152805258, 1083603431, -1688174579, -1810382133, 173385578, 1701427532, 332872348, -1658482986, 338892128, -711813355, -1819274943, -938195943, -1941513997, -902256295, -327963027, -1564881536, -1755269125, 1010982692};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2714 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2715;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final jg f2716;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean f2717 = false;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface a {
        /* JADX INFO: renamed from: ﾒ */
        jd mo2631();
    }

    public jj(Context context) {
        this.f2716 = new jg(context.getApplicationContext());
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m2625(jj jjVar, ji jiVar, a aVar) {
        int i10 = f2714 + 25;
        f2715 = i10 % 128;
        int i11 = i10 % 2;
        jjVar.m2624(jiVar, aVar);
        if (i11 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ jg m2626(jj jjVar) {
        int i10 = f2715;
        f2714 = (i10 + 37) % 128;
        jg jgVar = jjVar.f2716;
        int i11 = i10 + 107;
        f2714 = i11 % 128;
        if (i11 % 2 != 0) {
            return jgVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final jg m2628() {
        int i10 = f2715 + 39;
        f2714 = i10 % 128;
        int i11 = i10 % 2;
        jg jgVar = this.f2716;
        if (i11 == 0) {
            int i12 = 31 / 0;
        }
        return jgVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m2629() {
        int i10 = f2714 + 81;
        f2715 = i10 % 128;
        int i11 = i10 % 2;
        this.f2716.m2605();
        this.f2717 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.ke.m2799(new com.ironsource.adqualitysdk.sdk.i.jj.AnonymousClass2(r3));
        r3 = com.ironsource.adqualitysdk.sdk.i.jj.f2715 + 47;
        com.ironsource.adqualitysdk.sdk.i.jj.f2714 = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        if ((r3 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r3.f2717 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r3.f2717 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.m.m2972(m2627(new int[]{-1370706817, 1829880847, 705616932, 426646819, -1647606509, -2078463221, 2124998195, 884916705}, 14 - (android.os.Process.myPid() >> 22)).intern(), m2627(new int[]{-218561969, -1726415466, -2115630913, -1948082808, 2132187580, 1956854740, -519368911, 998001218, 804929055, -1926007260, -1222030987, -321602038, -843488621, 925521992, -412300803, 623630580, -407461321, 467213452, -1370706817, 1829880847, 705616932, 426646819, -1647606509, -2078463221, 1300267611, -1115487813, -150568476, -760631457, 633722901, -1056687297, -1257262344, 1565034230}, 63 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)).intern());
     */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m2624(final com.ironsource.adqualitysdk.sdk.i.ji r4, final com.ironsource.adqualitysdk.sdk.i.jj.a r5) {
        /*
            r3 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.jj.f2715
            int r0 = r0 + 55
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.jj.f2714 = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L15
            boolean r0 = r3.f2717
            r2 = 62
            int r2 = r2 / r1
            if (r0 == 0) goto L49
            goto L19
        L15:
            boolean r0 = r3.f2717
            if (r0 == 0) goto L49
        L19:
            r3 = 8
            int[] r3 = new int[r3]
            r3 = {x0060: FILL_ARRAY_DATA , data: [-1370706817, 1829880847, 705616932, 426646819, -1647606509, -2078463221, 2124998195, 884916705} // fill-array
            int r4 = android.os.Process.myPid()
            int r4 = r4 >> 22
            int r4 = 14 - r4
            java.lang.String r3 = m2627(r3, r4)
            java.lang.String r3 = r3.intern()
            r4 = 32
            int[] r4 = new int[r4]
            r4 = {x0074: FILL_ARRAY_DATA , data: [-218561969, -1726415466, -2115630913, -1948082808, 2132187580, 1956854740, -519368911, 998001218, 804929055, -1926007260, -1222030987, -321602038, -843488621, 925521992, -412300803, 623630580, -407461321, 467213452, -1370706817, 1829880847, 705616932, 426646819, -1647606509, -2078463221, 1300267611, -1115487813, -150568476, -760631457, 633722901, -1056687297, -1257262344, 1565034230} // fill-array
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r1)
            int r5 = 63 - r5
            java.lang.String r4 = m2627(r4, r5)
            java.lang.String r4 = r4.intern()
            com.ironsource.adqualitysdk.sdk.i.m.m2972(r3, r4)
            return
        L49:
            com.ironsource.adqualitysdk.sdk.i.jj$2 r0 = new com.ironsource.adqualitysdk.sdk.i.jj$2
            r0.<init>()
            com.ironsource.adqualitysdk.sdk.i.ke.m2799(r0)
            int r3 = com.ironsource.adqualitysdk.sdk.i.jj.f2715
            int r3 = r3 + 47
            int r4 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.jj.f2714 = r4
            int r3 = r3 % 2
            if (r3 == 0) goto L5e
            return
        L5e:
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.jj.m2624(com.ironsource.adqualitysdk.sdk.i.ji, com.ironsource.adqualitysdk.sdk.i.jj$a):void");
    }

    @TargetApi(3)
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m2630(final String str, final JSONObject jSONObject, ji jiVar) {
        String strIntern;
        String strM2627;
        if (!TextUtils.isEmpty(str)) {
            m2624(jiVar, new a() { // from class: com.ironsource.adqualitysdk.sdk.i.jj.1
                @Override // com.ironsource.adqualitysdk.sdk.i.jj.a
                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                public final jd mo2631() {
                    return jf.m2581(jSONObject, str);
                }
            });
            return;
        }
        int i10 = f2714 + InterfaceC0435l1.d.b.f29105b;
        f2715 = i10 % 128;
        if (i10 % 2 != 0) {
            strIntern = m2627(new int[]{-1370706817, 1829880847, 705616932, 426646819, -1647606509, -2078463221, 2124998195, 884916705}, 68 % View.getDefaultSize(1, 0)).intern();
            strM2627 = m2627(new int[]{-197046752, 690282354, -1084880868, -1976525755, -48341775, -218830675, -1295962599, -309692173, -1814621462, -765006245, -138410433, -1223045738, 1090664149, -2046199326, -1509240222, 900545158, 2141654512, -1860045339, 988092674, 293043076, 958077684, 1449222222, -1987805850, -2013279271, 2129821917, 1716880685, 1998295820, -87576369, -1417634323, 1284200575, -909978493, -536717264, 1813545178, -1776430591, -630769496, -1049350335, 1447149647, 282752702, -912687106, -1280156183}, 3 >> TextUtils.getCapsMode("", 1, 1));
        } else {
            strIntern = m2627(new int[]{-1370706817, 1829880847, 705616932, 426646819, -1647606509, -2078463221, 2124998195, 884916705}, 14 - View.getDefaultSize(0, 0)).intern();
            strM2627 = m2627(new int[]{-197046752, 690282354, -1084880868, -1976525755, -48341775, -218830675, -1295962599, -309692173, -1814621462, -765006245, -138410433, -1223045738, 1090664149, -2046199326, -1509240222, 900545158, 2141654512, -1860045339, 988092674, 293043076, 958077684, 1449222222, -1987805850, -2013279271, 2129821917, 1716880685, 1998295820, -87576369, -1417634323, 1284200575, -909978493, -536717264, 1813545178, -1776430591, -630769496, -1049350335, 1447149647, 282752702, -912687106, -1280156183}, TextUtils.getCapsMode("", 0, 0) + 77);
        }
        m.m2965(strIntern, strM2627.intern());
        int i11 = f2715 + 61;
        f2714 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 85 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2627(int[] iArr, int i10) {
        String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.a.f61) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2713.clone();
                com.ironsource.adqualitysdk.sdk.i.a.f58 = 0;
                while (true) {
                    int i11 = com.ironsource.adqualitysdk.sdk.i.a.f58;
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
                        com.ironsource.adqualitysdk.sdk.i.a.f59 = (c4 << 16) + c5;
                        com.ironsource.adqualitysdk.sdk.i.a.f60 = (c10 << 16) + c11;
                        com.ironsource.adqualitysdk.sdk.i.a.m199(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = com.ironsource.adqualitysdk.sdk.i.a.f59 ^ iArr2[i13];
                            com.ironsource.adqualitysdk.sdk.i.a.f59 = i14;
                            int iM200 = com.ironsource.adqualitysdk.sdk.i.a.m200(i14) ^ com.ironsource.adqualitysdk.sdk.i.a.f60;
                            int i15 = com.ironsource.adqualitysdk.sdk.i.a.f59;
                            com.ironsource.adqualitysdk.sdk.i.a.f59 = iM200;
                            com.ironsource.adqualitysdk.sdk.i.a.f60 = i15;
                        }
                        int i16 = com.ironsource.adqualitysdk.sdk.i.a.f59;
                        int i17 = com.ironsource.adqualitysdk.sdk.i.a.f60;
                        com.ironsource.adqualitysdk.sdk.i.a.f59 = i17;
                        com.ironsource.adqualitysdk.sdk.i.a.f60 = i16;
                        int i18 = i16 ^ iArr2[16];
                        com.ironsource.adqualitysdk.sdk.i.a.f60 = i18;
                        int i19 = i17 ^ iArr2[17];
                        com.ironsource.adqualitysdk.sdk.i.a.f59 = i19;
                        cArr[0] = (char) (i19 >>> 16);
                        cArr[1] = (char) i19;
                        cArr[2] = (char) (i18 >>> 16);
                        cArr[3] = (char) i18;
                        com.ironsource.adqualitysdk.sdk.i.a.m199(iArr2);
                        int i20 = com.ironsource.adqualitysdk.sdk.i.a.f58;
                        cArr2[i20 << 1] = cArr[0];
                        cArr2[(i20 << 1) + 1] = cArr[1];
                        cArr2[(i20 << 1) + 2] = cArr[2];
                        cArr2[(i20 << 1) + 3] = cArr[3];
                        com.ironsource.adqualitysdk.sdk.i.a.f58 = i20 + 2;
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
}
