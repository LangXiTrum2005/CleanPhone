package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class jl {

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f2775 = 1;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2776 = 0;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char f2777 = 10475;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static char f2778 = 1283;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char f2779 = 18853;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static char f2780 = 52072;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f2781;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f2782;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f2783;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f2784;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean f2785;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a extends e {

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private final String f2786;

        public a(String str, String str2, String str3) {
            super(str, str2);
            this.f2786 = str3;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jl
        /* JADX INFO: renamed from: ﻐ */
        public final String mo2658() {
            return m2660(this.f2786);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class c extends d {

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private final String f2787;

        public c(String str, String str2, String str3) {
            super(str, str2);
            this.f2787 = str3;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jl
        /* JADX INFO: renamed from: ﻐ */
        public final String mo2658() {
            return m2660(this.f2787);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class d extends jl {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static int[] f2788 = {530061880, -335673200, 21653685, 1653824071, 1760661792, -1447298334, -1700822279, 994988710, 1133022968, 1328671023, 1940484627, -1660375146, 559079514, -971097174, -1786809555, 385336916, -672805507, -1533997673};

        public d(String str, String str2) {
            super(str, m2664(new int[]{1455454134, -1271769495}, 3 - Process.getGidForName("")).intern(), str2, m2664(new int[]{-2030285738, 363103292, 746324191, 1553107644}, 8 - (Process.myTid() >> 22)).intern(), (byte) 0);
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m2664(int[] iArr, int i10) {
            String str;
            synchronized (com.ironsource.adqualitysdk.sdk.i.a.f61) {
                try {
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length << 1];
                    int[] iArr2 = (int[]) f2788.clone();
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

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class e extends jl {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static char[] f2789 = {'1', 'i', 'n', 'n', 'M', 160, 161, 129, 134, 166, 169, 166};

        public e(String str, String str2) {
            super(str, m2665("\u0001\u0000\u0001\u0000", new int[]{0, 4, 0, 4}, false).intern(), str2, m2665("\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001", new int[]{4, 8, 56, 0}, true).intern(), (byte) 0);
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static String m2665(String str, int[] iArr, boolean z10) throws UnsupportedEncodingException {
            String str2;
            Object bytes = str;
            if (str != null) {
                bytes = str.getBytes("ISO-8859-1");
            }
            byte[] bArr = (byte[]) bytes;
            synchronized (h.f2261) {
                try {
                    int i10 = iArr[0];
                    int i11 = iArr[1];
                    int i12 = iArr[2];
                    int i13 = iArr[3];
                    char[] cArr = new char[i11];
                    System.arraycopy(f2789, i10, cArr, 0, i11);
                    if (bArr != null) {
                        char[] cArr2 = new char[i11];
                        h.f2262 = 0;
                        char c4 = 0;
                        while (true) {
                            int i14 = h.f2262;
                            if (i14 >= i11) {
                                break;
                            }
                            if (bArr[i14] == 1) {
                                cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c4);
                            } else {
                                cArr2[i14] = (char) ((cArr[i14] << 1) - c4);
                            }
                            c4 = cArr2[i14];
                            h.f2262 = i14 + 1;
                        }
                        cArr = cArr2;
                    }
                    if (i13 > 0) {
                        char[] cArr3 = new char[i11];
                        System.arraycopy(cArr, 0, cArr3, 0, i11);
                        int i15 = i11 - i13;
                        System.arraycopy(cArr3, 0, cArr, i15, i13);
                        System.arraycopy(cArr3, i13, cArr, 0, i15);
                    }
                    if (z10) {
                        char[] cArr4 = new char[i11];
                        h.f2262 = 0;
                        while (true) {
                            int i16 = h.f2262;
                            if (i16 >= i11) {
                                break;
                            }
                            cArr4[i16] = cArr[(i11 - i16) - 1];
                            h.f2262 = i16 + 1;
                        }
                        cArr = cArr4;
                    }
                    if (i12 > 0) {
                        h.f2262 = 0;
                        while (true) {
                            int i17 = h.f2262;
                            if (i17 >= i11) {
                                break;
                            }
                            cArr[i17] = (char) (cArr[i17] - iArr[2]);
                            h.f2262 = i17 + 1;
                        }
                    }
                    str2 = new String(cArr);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }
    }

    public /* synthetic */ jl(String str, String str2, String str3, String str4, byte b10) {
        this(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static String m2653() {
        int i10 = f2776 + 83;
        f2775 = i10 % 128;
        if (i10 % 2 == 0) {
            ar.m468().mo485();
            throw null;
        }
        String strMo485 = ar.m468().mo485();
        f2775 = (f2776 + 11) % 128;
        return strMo485;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private String m2654() {
        int i10 = f2776 + 69;
        int i11 = i10 % 128;
        f2775 = i11;
        int i12 = i10 % 2;
        String str = this.f2782;
        if (i12 == 0) {
            int i13 = 46 / 0;
        }
        int i14 = i11 + 75;
        f2776 = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 56 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private String m2655() {
        int i10 = f2775 + 47;
        f2776 = i10 % 128;
        int i11 = i10 % 2;
        String str = this.f2783;
        if (i11 != 0) {
            int i12 = 34 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private String m2656() {
        String strIntern;
        String strM2653;
        int i10 = f2775 + 65;
        f2776 = i10 % 128;
        if (i10 % 2 == 0) {
            strIntern = m2657("ҳ斺芥黱纹⇭ךּ磓Ս豉", Color.red(0) + 9).intern();
            strM2653 = m2653();
            if (this.f2785) {
            }
            return strIntern;
        }
        strIntern = m2657("ҳ斺芥黱纹⇭ךּ磓Ս豉", 21 / Color.red(1)).intern();
        strM2653 = m2653();
        if (!this.f2785) {
            return strIntern;
        }
        if (!TextUtils.isEmpty(strM2653)) {
            StringBuilder sbI = d5.u.i(strIntern);
            sbI.append(m2657("믚Ȝ궾鬗", 3 - TextUtils.lastIndexOf("", '0', 0)).intern());
            sbI.append(strM2653);
            String strM = f2.m(sbI, m2657("Ս豉", 1 - Color.green(0)));
            f2776 = (f2775 + 5) % 128;
            return strM;
        }
        return strIntern;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public String mo2658() {
        StringBuilder sbI = d5.u.i(m2656());
        sbI.append(this.f2784);
        sbI.append(m2657("Ս豉", Color.blue(0) + 1).intern());
        sbI.append(this.f2783);
        sbI.append(m2657("窜謽", (ViewConfiguration.getLongPressTimeout() >> 16) + 1).intern());
        sbI.append(m2657("燽贪ᣯ齶", (ViewConfiguration.getScrollBarSize() >> 8) + 3).intern());
        sbI.append(m2657("窜謽", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern());
        sbI.append(this.f2781);
        sbI.append(m2657("窜謽", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1).intern());
        sbI.append(this.f2782);
        String string = sbI.toString();
        int i10 = f2776 + 71;
        f2775 = i10 % 128;
        if (i10 % 2 != 0) {
            return string;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m2660(String str) {
        StringBuilder sbI = d5.u.i(m2656());
        sbI.append(m2663());
        sbI.append(m2657("Ս豉", 1 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern());
        sbI.append(m2657("燽贪ᣯ齶", 3 - (Process.myPid() >> 22)).intern());
        sbI.append(m2657("Ս豉", Color.green(0) + 1).intern());
        sbI.append(str);
        sbI.append(m2657("Ս豉", -MotionEvent.axisFromString("")).intern());
        sbI.append(m2655());
        sbI.append(m2657("窜謽", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1).intern());
        sbI.append(m2657("燽贪ᣯ齶", 3 - View.resolveSize(0, 0)).intern());
        sbI.append(m2657("窜謽", (ViewConfiguration.getJumpTapTimeout() >> 16) + 1).intern());
        sbI.append(m2662());
        sbI.append(m2657("窜謽", 1 - Color.alpha(0)).intern());
        sbI.append(m2654());
        String string = sbI.toString();
        f2775 = (f2776 + 11) % 128;
        return string;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m2661() {
        int i10 = f2776;
        this.f2785 = false;
        f2775 = (i10 + 7) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m2662() {
        int i10 = f2776;
        int i11 = i10 + 69;
        f2775 = i11 % 128;
        int i12 = i11 % 2;
        String str = this.f2781;
        if (i12 == 0) {
            int i13 = 27 / 0;
        }
        int i14 = i10 + 43;
        f2775 = i14 % 128;
        if (i14 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m2663() {
        int i10 = f2776;
        String str = this.f2784;
        int i11 = i10 + 119;
        f2775 = i11 % 128;
        if (i11 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private jl(String str, String str2, String str3, String str4) {
        this.f2784 = str;
        this.f2783 = str2;
        this.f2781 = str3;
        this.f2782 = str4;
        this.f2785 = true;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m2659() {
        String strIntern;
        String strM2657;
        int i10 = f2775 + InterfaceC0435l1.d.b.f29112i;
        f2776 = i10 % 128;
        int i11 = i10 % 2;
        String strMo2658 = mo2658();
        if (i11 != 0) {
            strIntern = m2657("Ս豉", -TextUtils.lastIndexOf("", (char) 2, 1, 1)).intern();
            ViewConfiguration.getPressedStateDuration();
            strM2657 = m2657("窜謽", 0);
        } else {
            strIntern = m2657("Ս豉", -TextUtils.lastIndexOf("", '0', 0, 0)).intern();
            strM2657 = m2657("窜謽", 1 - (ViewConfiguration.getPressedStateDuration() >> 16));
        }
        String strReplace = strMo2658.replace(strIntern, strM2657.intern());
        f2776 = (f2775 + 85) % 128;
        return strReplace;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2657(String str, int i10) {
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
                            char c10 = (char) (c4 - (((c5 + i12) ^ ((c5 << 4) + f2779)) ^ ((c5 >>> 5) + f2777)));
                            cArr3[1] = c10;
                            cArr3[0] = (char) (c5 - (((c10 >>> 5) + f2778) ^ ((c10 + i12) ^ ((c10 << 4) + f2780))));
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
