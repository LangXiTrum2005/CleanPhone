package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes5.dex */
public final class jp {

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2742 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int[] f2743 = {481618742, -1992493149, -1543981164, 2137764664, 909590099, -159416780, -1952219431, -892850102, 511220144, -1578360094, -666249927, 1908781044, -1479897535, -1760740347, 466408711, -2043762378, -1458578909, 2141109333};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2744;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static dl f2745;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final boolean f2746;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final String f2747;

    public jp(String str, boolean z2) {
        this.f2747 = str;
        this.f2746 = z2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String m2632() {
        String strReplace;
        String strIntern;
        String strM1945;
        f2744 = (f2742 + 69) % 128;
        String strM1944 = f2745.m1944();
        try {
            String strReplace2 = strM1944.replace(m2636(new int[]{-1391708161, 1543160593, 1542168729, 1469155789, 414217413, 370187654, -424331145, 1391160371, 459907415, 1858228775}, 20 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), m2637()).replace(m2636(new int[]{-1703012173, 437792301, 1353744754, -827507533, -532477314, 396514407, 575067373, 1871828301}, 13 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), f2745.m1946());
            if (this.f2746) {
                int i2 = f2744 + 21;
                f2742 = i2 % 128;
                if (i2 % 2 == 0) {
                    strIntern = m2636(new int[]{-459371356, 1131659677, -1044885616, 879201657, -1351254707, 560875220}, 103 >> TextUtils.indexOf((CharSequence) "", 'G')).intern();
                    strM1945 = f2745.m1945();
                } else {
                    strIntern = m2636(new int[]{-459371356, 1131659677, -1044885616, 879201657, -1351254707, 560875220}, TextUtils.indexOf((CharSequence) "", '0') + 13).intern();
                    strM1945 = f2745.m1945();
                }
                strReplace = strReplace2.replace(strIntern, strM1945);
            } else {
                strReplace = strReplace2.replace(m2636(new int[]{-459371356, 1131659677, -1044885616, 879201657, -1351254707, 560875220}, 12 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), "");
            }
            strM1944 = strReplace;
            String strReplace3 = strM1944.replace(m2636(new int[]{-1703012173, 437792301, 1618068520, 83758290, -122614866, -2006595252, -1351254707, 560875220}, 15 - ImageFormat.getBitsPerPixel(0)).intern(), this.f2747);
            f2744 = (f2742 + 15) % 128;
            return strReplace3;
        } catch (Throwable th) {
            String strIntern2 = m2636(new int[]{1730225077, -1054717173, 166300695, -948343902, 716255996, 470723579, -1553951824, 1374230367, 1920944411, -1717524408}, 18 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m2636(new int[]{2106615906, -1664464282, -56817269, 1493860791, -1946981590, 634445952, -1479632753, -259144010, 1208914898, 2008353439, -1868778903, -612075272}, Process.getGidForName("") + 25).intern());
            sb.append(th.getLocalizedMessage());
            n.m2835(strIntern2, sb.toString());
            return strM1944;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m2633(jp jpVar) {
        f2744 = (f2742 + 119) % 128;
        String strM2635 = jpVar.m2635();
        int i2 = f2742 + 93;
        f2744 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 21 / 0;
        }
        return strM2635;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String m2635() {
        f2744 = (f2742 + 49) % 128;
        String strM2397 = ic.m2397(m2632().getBytes());
        int i2 = f2744 + 23;
        f2742 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 79 / 0;
        }
        return strM2397;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m2638(final WebView webView) {
        try {
            s.m2917(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.jp.4
                @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                /* JADX INFO: renamed from: ﾒ */
                public final void mo276() {
                    final String strM2633 = jp.m2633(jp.this);
                    s.m2922(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.jp.4.2
                        @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo276() {
                            kh.m2811(webView, strM2633);
                        }
                    });
                }
            });
            f2742 = (f2744 + 31) % 128;
        } catch (Exception e2) {
            String strIntern = m2636(new int[]{1730225077, -1054717173, 166300695, -948343902, 716255996, 470723579, -1553951824, 1374230367, 1920944411, -1717524408}, 17 - (ViewConfiguration.getEdgeSlop() >> 16)).intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m2636(new int[]{2106615906, -1664464282, -56817269, 1493860791, 1191023041, 1135828305, -1975227241, -1923634356, 20172812, 1460068266, -148649119, 1014286643, 1228306089, 2132832352, 923780387, 342093958}, 31 - Color.red(0)).intern());
            sb.append(e2.getLocalizedMessage());
            n.m2835(strIntern, sb.toString());
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2634(dl dlVar) {
        int i2 = (f2742 + 47) % 128;
        f2744 = i2;
        f2745 = dlVar;
        f2742 = (i2 + 43) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2637() {
        int i2 = f2744 + 25;
        f2742 = i2 % 128;
        if (i2 % 2 != 0) {
            return as.m467().mo478().m454();
        }
        as.m467().mo478().m454();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2636(int[] iArr, int i2) {
        String str;
        synchronized (d.f1586) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2743.clone();
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
}
