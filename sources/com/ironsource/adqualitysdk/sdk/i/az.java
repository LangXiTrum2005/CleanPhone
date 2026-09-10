package com.ironsource.adqualitysdk.sdk.i;

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
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class az {

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f573 = 0;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static int f574 = 1;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static char f576 = 6;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private String f578;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f580;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f581;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f582;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f583;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f584;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static char[] f575 = {'E', 'N', 'A', 'B', 'L', 'D', 'I', 'S', '/', 'W', 'e', 'b', 'V', 'i', 'w', ' ', '-', 'K', 'v', 'r', 's', 'o', 'n', ':', 'F', 'a', 'l', 'd', 't', 'c', 'G', 'H', 'J', 'M', 'O', 'P'};

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int[] f572 = {1694579170, 466726624, 1209865885, 2014549593, 661124310, -909625227, -1740918106, -102678596, -81996465, -639074382, -685860641, -702137486, -1585789510, 113427635, -844101894, 975195765, 515822038, 1413667826};

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private a f579 = a.f593;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private b f577 = b.f602;

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.az$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static /* synthetic */ class AnonymousClass5 {

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        static final /* synthetic */ int[] f585;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        static final /* synthetic */ int[] f586;

        static {
            int[] iArr = new int[b.valuesCustom().length];
            f585 = iArr;
            try {
                iArr[b.f601.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f585[b.f604.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f585[b.f603.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f585[b.f606.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f585[b.f605.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[a.valuesCustom().length];
            f586 = iArr2;
            try {
                iArr2[a.f596.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f586[a.f592.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f586[a.f594.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f586[a.f590.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f586[a.f595.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum a {
        f593,
        f596,
        f592,
        f594,
        f595,
        f590;


        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f587 = 1;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static int f588;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f589;

        static {
            m699();
            f587 = (f589 + 115) % 128;
        }

        public static a valueOf(String str) {
            int i10 = f587 + 27;
            f589 = i10 % 128;
            int i11 = i10 % 2;
            a aVar = (a) Enum.valueOf(a.class, str);
            if (i11 != 0) {
                int i12 = 8 / 0;
            }
            f589 = (f587 + 5) % 128;
            return aVar;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            f589 = (f587 + 95) % 128;
            a[] aVarArr = (a[]) values().clone();
            f589 = (f587 + 123) % 128;
            return aVarArr;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public static void m699() {
            f588 = 51;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m700(int i10, boolean z10, int i11, String str, int i12) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (d.f1625) {
                try {
                    char[] cArr2 = new char[i10];
                    d.f1622 = 0;
                    while (true) {
                        int i13 = d.f1622;
                        if (i13 >= i10) {
                            break;
                        }
                        d.f1624 = cArr[i13];
                        cArr2[d.f1622] = (char) (d.f1624 + i11);
                        int i14 = d.f1622;
                        cArr2[i14] = (char) (cArr2[i14] - f588);
                        d.f1622 = i14 + 1;
                    }
                    if (i12 > 0) {
                        d.f1623 = i12;
                        char[] cArr3 = new char[i10];
                        System.arraycopy(cArr2, 0, cArr3, 0, i10);
                        int i15 = d.f1623;
                        System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                        int i16 = d.f1623;
                        System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
                    }
                    if (z10) {
                        char[] cArr4 = new char[i10];
                        d.f1622 = 0;
                        while (true) {
                            int i17 = d.f1622;
                            if (i17 >= i10) {
                                break;
                            }
                            cArr4[i17] = cArr2[(i10 - i17) - 1];
                            d.f1622 = i17 + 1;
                        }
                        cArr2 = cArr4;
                    }
                    str2 = new String(cArr2);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum b {
        f602,
        f604,
        f603,
        f606,
        f605,
        f601;


        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f597 = 1;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static int f598;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f599;

        static {
            m701();
            int i10 = f597 + 7;
            f598 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        }

        public static b valueOf(String str) {
            f598 = (f597 + 45) % 128;
            b bVar = (b) Enum.valueOf(b.class, str);
            int i10 = f598 + 41;
            f597 = i10 % 128;
            if (i10 % 2 != 0) {
                return bVar;
            }
            throw null;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            f598 = (f597 + 95) % 128;
            b[] bVarArr = (b[]) values().clone();
            int i10 = f597 + 29;
            f598 = i10 % 128;
            if (i10 % 2 == 0) {
                return bVarArr;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public static void m701() {
            f599 = ModuleDescriptor.MODULE_VERSION;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m702(int i10, boolean z10, int i11, String str, int i12) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (d.f1625) {
                try {
                    char[] cArr2 = new char[i10];
                    d.f1622 = 0;
                    while (true) {
                        int i13 = d.f1622;
                        if (i13 >= i10) {
                            break;
                        }
                        d.f1624 = cArr[i13];
                        cArr2[d.f1622] = (char) (d.f1624 + i11);
                        int i14 = d.f1622;
                        cArr2[i14] = (char) (cArr2[i14] - f599);
                        d.f1622 = i14 + 1;
                    }
                    if (i12 > 0) {
                        d.f1623 = i12;
                        char[] cArr3 = new char[i10];
                        System.arraycopy(cArr2, 0, cArr3, 0, i10);
                        int i15 = d.f1623;
                        System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                        int i16 = d.f1623;
                        System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
                    }
                    if (z10) {
                        char[] cArr4 = new char[i10];
                        d.f1622 = 0;
                        while (true) {
                            int i17 = d.f1622;
                            if (i17 >= i10) {
                                break;
                            }
                            cArr4[i17] = cArr2[(i10 - i17) - 1];
                            d.f1622 = i17 + 1;
                        }
                        cArr2 = cArr4;
                    }
                    str2 = new String(cArr2);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }
    }

    public az(String str) {
        this.f580 = str;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private String m686() {
        int i10 = f574 + 117;
        f573 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        if (this.f584 == null || this.f583 == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m690(new int[]{-263968391, -632901404, -2058307905, 44090165, -1878305405, -987349767, 266630127, 1045115234, -1286367475, -1028487940, 1411904364, -1726576057}, 24 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern());
        sb2.append(this.f584);
        sb2.append(m692((ViewConfiguration.getJumpTapTimeout() >> 16) + 3, "\u0010\u0011B", (byte) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 34)).intern());
        sb2.append(this.f583);
        String string = sb2.toString();
        int i11 = f574 + 99;
        f573 = i11 % 128;
        if (i11 % 2 == 0) {
            return string;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private String m687() {
        f573 = (f574 + 13) % 128;
        String strName = this.f579.name();
        f574 = (f573 + 97) % 128;
        return strName;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m688() {
        f573 = (f574 + 85) % 128;
        if (this.f580.equals(m692(7 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), "\n\u000b\u0006\u0011\u0010\u0007Î", (byte) (87 - ((Process.getThreadPriority(0) + 20) >> 6))).intern())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(m689());
        sb3.append(m690(new int[]{-201210307, -570775164}, 1 - KeyEvent.keyCodeFromString("")).intern());
        sb2.append(sb3.toString());
        String strM691 = m691();
        if (strM691 != null) {
            StringBuilder sbI = d5.u.i(strM691);
            sbI.append(m690(new int[]{-201210307, -570775164}, 1 - (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern());
            sb2.append(sbI.toString());
            f574 = (f573 + 83) % 128;
        }
        String strM686 = m686();
        if (strM686 != null) {
            StringBuilder sbI2 = d5.u.i(strM686);
            sbI2.append(m690(new int[]{-201210307, -570775164}, 1 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern());
            sb2.append(sbI2.toString());
            f574 = (f573 + 47) % 128;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(m690(new int[]{-1412589736, -686504711, -648139827, 316485556}, 8 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern());
        sb4.append(this.f579 == a.f590 ? m690(new int[]{-1050911826, -1657053879, 554801525, -1945867440}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 7).intern() : m687());
        sb4.append(m690(new int[]{-201210307, -570775164}, -TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern());
        sb2.append(sb4.toString());
        a aVar = this.f579;
        if (aVar == a.f594 || aVar == a.f595) {
            m.m2985(m690(new int[]{1073246853, 1077670759, -334041187, 364940594, -1930784340, -858681808}, Color.argb(0, 0, 0, 0) + 12).intern(), sb2.toString());
            return;
        }
        String strM693 = m693(this.f577);
        if (strM693 != null) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(m690(new int[]{2020506614, 1433249853, -832446525, -2110204297, 816343599, -21910032}, 9 - (ViewConfiguration.getEdgeSlop() >> 16)).intern());
            sb5.append(strM693);
            sb2.append(sb5.toString());
        }
        m.m2981(m690(new int[]{1073246853, 1077670759, -334041187, 364940594, -1930784340, -858681808}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 12).intern(), sb2.toString());
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String m689() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m690(new int[]{-2084700598, -2082129539, -2084700598, -2082129539, -2084700598, -2082129539, -969369194, -1517422812}, Color.alpha(0) + 15).intern());
        sb2.append(this.f580);
        String strM = f2.m(sb2, m690(new int[]{989749680, 862900096, 253294959, -736563596, -32996918, 243202975}, 12 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))));
        if (this.f581 != null) {
            StringBuilder sbI = d5.u.i(strM);
            sbI.append(this.f581);
            strM = f2.m(sbI, m692(-TextUtils.lastIndexOf("", '0', 0, 0), "W", (byte) (55 - (KeyEvent.getMaxKeyCode() >> 16))));
            f574 = (f573 + 17) % 128;
        }
        return f2.m(d5.u.i(strM), m692(14 - Color.blue(0), "RRRRRRRRRRRRRR", (byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 37)));
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final a m694() {
        int i10 = f574;
        a aVar = this.f579;
        f573 = (i10 + 53) % 128;
        return aVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m696(b bVar) {
        int i10 = f573 + InterfaceC0435l1.d.b.f29109f;
        f574 = i10 % 128;
        if (i10 % 2 == 0) {
            this.f577 = bVar;
            m697(a.f590);
            int i11 = 20 / 0;
        } else {
            this.f577 = bVar;
            m697(a.f590);
        }
        f574 = (f573 + 119) % 128;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x006a  */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m698(cp cpVar) {
        f574 = (f573 + 67) % 128;
        cpVar.m1737();
        this.f580 = cpVar.m1739();
        this.f581 = cpVar.m1738();
        this.f582 = cpVar.m1735();
        if (m692(7 - View.combineMeasuredStates(0, 0), "\u0001\u0002\u0003\u0004\u0005\u0001°", (byte) (108 - Drawable.resolveOpacity(0, 0))).intern().equals(this.f582)) {
            this.f582 = m692(3 - (ViewConfiguration.getTapTimeout() >> 16), "\u0002\u0007\u0090", (byte) (79 - KeyEvent.normalizeMetaState(0))).intern();
        } else {
            f574 = (f573 + 51) % 128;
            if (m692(9 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "\u0000\u000b\b\u0001\u0004\u0005\u0001\u0000", (byte) (96 - TextUtils.getTrimmedLength(""))).intern().equals(this.f582)) {
                this.f582 = m692(3 - (ViewConfiguration.getTapTimeout() >> 16), "\u0002\u0007\u0090", (byte) (79 - KeyEvent.normalizeMetaState(0))).intern();
            }
        }
        this.f584 = cpVar.m1733();
        this.f583 = cpVar.m1732();
        this.f578 = cpVar.m1731();
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m695() {
        int i10 = f573 + InterfaceC0435l1.d.b.f29110g;
        f574 = i10 % 128;
        if (i10 % 2 == 0) {
            m693(this.f577);
            throw null;
        }
        String strM693 = m693(this.f577);
        int i11 = f573 + 29;
        f574 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 6 / 0;
        }
        return strM693;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m697(a aVar) {
        int i10 = f573 + 83;
        f574 = i10 % 128;
        if (i10 % 2 == 0) {
            this.f579 = aVar;
            int i11 = 17 / 0;
            if (aVar != a.f590) {
                f573 = (f574 + 5) % 128;
                this.f577 = b.f602;
                f574 = (f573 + 45) % 128;
            }
        } else {
            this.f579 = aVar;
            if (aVar != a.f590) {
                f573 = (f574 + 5) % 128;
                this.f577 = b.f602;
                f574 = (f573 + 45) % 128;
            }
        }
        int i12 = AnonymousClass5.f586[this.f579.ordinal()];
        if (i12 == 3 || i12 == 4 || i12 == 5) {
            m688();
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String m691() {
        String strIntern;
        int i10 = (f573 + 5) % 128;
        f574 = i10;
        if (this.f580 == null || (strIntern = this.f582) == null) {
            return null;
        }
        int i11 = i10 + 49;
        f573 = i11 % 128;
        if (i11 % 2 == 0 ? strIntern.equals(m692(3 - (ViewConfiguration.getScrollDefaultDelay() >> 16), "\u0002\u0007\u0090", (byte) (Color.red(0) + 79)).intern()) : strIntern.equals(m692(2 % (ViewConfiguration.getScrollDefaultDelay() / 14), "\u0002\u0007\u0090", (byte) (106 - Color.red(0))).intern())) {
            if (this.f579 != a.f595) {
                strIntern = m690(new int[]{-1787969996, 885682204, 1000519093, 813767879, -1442051229, -1177556034}, 11 - View.combineMeasuredStates(0, 0)).intern();
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f580);
        String strK = f2.k(m692((ViewConfiguration.getLongPressTimeout() >> 16) + 14, "\r\t\u000b\u0017\f\u0015\u0007\u0016\u0013\u000e\u0016\u0017\u0015\u0011", (byte) (18 - (ViewConfiguration.getTouchSlop() >> 8))), strIntern, sb2);
        f573 = (f574 + 77) % 128;
        return strK;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m690(int[] iArr, int i10) {
        String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.a.f61) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f572.clone();
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

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String m693(b bVar) {
        if (bVar != null) {
            int i10 = f573 + 119;
            f574 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = AnonymousClass5.f585[bVar.ordinal()];
                if (i11 == 1) {
                    return m690(new int[]{1920330904, -810162721, -322958251, -1164817216, 1623780481, -1344288151, 1406513750, -1080652919, 1902517434, -871291513, 1611859305, -1151203275}, 22 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern();
                }
                if (i11 == 2) {
                    return String.format(m690(new int[]{-1581910059, -2051099077, 904656269, 691342388, 1753212518, -682257973, 9871459, 798540326, 801200485, -1195187505, -1569773862, 915300984, 245961683, 584920110, -519392186, 427122627, -1189741076, 838219772, -1355700641, -1711980924, 1490087708, 979723242, 1753212518, -682257973, 9871459, 798540326, -896250988, -2076763069, 670901477, 567131762, -1198448804, -67657726}, 62 - TextUtils.indexOf("", "", 0, 0)).intern(), this.f580, this.f582, this.f578);
                }
                if (i11 == 3) {
                    return String.format(m690(new int[]{681646080, 14808136, 1490087708, 979723242, 1753212518, -682257973, 9871459, 798540326, -678614871, -764342181, 103957503, -2077413177, 638527252, 1091456289, 266630127, 1045115234, -1286367475, -1028487940, -1837482641, -945234165, -2037030787, 1958074208, 1059709463, -266389808, -759158108, -1246854210, 99309397, 816847260}, 55 - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), this.f580, this.f582);
                }
                if (i11 == 4) {
                    return m690(new int[]{325596508, 1403841246, -1505446374, -691723468, 2031372390, -996280460, -1460022541, -863867324, 1135938243, -249499165, 989749680, 862900096, 253294959, -736563596, 874094955, 1394844081}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 30).intern();
                }
                if (i11 == 5) {
                    String strIntern = m692(26 - View.resolveSizeAndState(0, 0, 0), "\u0019\u001a\u000e\u0019\t\u001c\u0010\u001b\u001b\u0015\u0019\u0017\u0007\u001c\"\u0010\u0011\u001b\u0016\u0017\u001c\u0010\u0018\u001d\u0016\u0014", (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 91)).intern();
                    int i12 = f574 + 97;
                    f573 = i12 % 128;
                    if (i12 % 2 == 0) {
                        return strIntern;
                    }
                    throw null;
                }
            } else {
                int i13 = AnonymousClass5.f585[bVar.ordinal()];
                throw null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m692(int i10, String str, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (j.f2647) {
            try {
                char[] cArr2 = f575;
                char c4 = f576;
                char[] cArr3 = new char[i10];
                if (i10 % 2 != 0) {
                    i10--;
                    cArr3[i10] = (char) (cArr[i10] - b10);
                }
                if (i10 > 1) {
                    j.f2654 = 0;
                    while (true) {
                        int i11 = j.f2654;
                        if (i11 >= i10) {
                            break;
                        }
                        j.f2653 = cArr[i11];
                        j.f2650 = cArr[j.f2654 + 1];
                        if (j.f2653 == j.f2650) {
                            cArr3[j.f2654] = (char) (j.f2653 - b10);
                            cArr3[j.f2654 + 1] = (char) (j.f2650 - b10);
                        } else {
                            j.f2652 = j.f2653 / c4;
                            j.f2649 = j.f2653 % c4;
                            j.f2651 = j.f2650 / c4;
                            j.f2648 = j.f2650 % c4;
                            if (j.f2649 == j.f2648) {
                                j.f2652 = f2.A(j.f2652, c4, 1, c4);
                                j.f2651 = f2.A(j.f2651, c4, 1, c4);
                                int i12 = (j.f2652 * c4) + j.f2649;
                                int i13 = (j.f2651 * c4) + j.f2648;
                                int i14 = j.f2654;
                                cArr3[i14] = cArr2[i12];
                                cArr3[i14 + 1] = cArr2[i13];
                            } else if (j.f2652 == j.f2651) {
                                j.f2649 = f2.A(j.f2649, c4, 1, c4);
                                j.f2648 = f2.A(j.f2648, c4, 1, c4);
                                int i15 = (j.f2652 * c4) + j.f2649;
                                int i16 = (j.f2651 * c4) + j.f2648;
                                int i17 = j.f2654;
                                cArr3[i17] = cArr2[i15];
                                cArr3[i17 + 1] = cArr2[i16];
                            } else {
                                int i18 = (j.f2652 * c4) + j.f2648;
                                int i19 = (j.f2651 * c4) + j.f2649;
                                int i20 = j.f2654;
                                cArr3[i20] = cArr2[i18];
                                cArr3[i20 + 1] = cArr2[i19];
                            }
                        }
                        j.f2654 += 2;
                    }
                }
                str2 = new String(cArr3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
