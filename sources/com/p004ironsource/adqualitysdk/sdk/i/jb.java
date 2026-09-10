package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.support.v4.media.a;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* JADX INFO: loaded from: classes5.dex */
public class jb {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2606 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2607 = 27;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2608 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f2609;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f2610;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f2611;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f2612;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean f2613;

    public static class b extends jb {

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static char[] f2615 = {'c', 55795, 45910, 36018, 'j', 55791, 45911, 36026, 26206, 16489, 6598, 62247};

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static long f2614 = 8586098408368626076L;

        public b(String str, String str2) {
            super(str, m2533(4 - (ViewConfiguration.getEdgeSlop() >> 16), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1, (char) View.resolveSize(0, 0)).intern(), str2, m2533(TextUtils.lastIndexOf("", '0', 0, 0) + 9, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4, (char) (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), (byte) 0);
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m2533(int i2, int i3, char c2) {
            String str;
            synchronized (a.f68) {
                try {
                    char[] cArr = new char[i2];
                    a.f69 = 0;
                    while (true) {
                        int i4 = a.f69;
                        if (i4 < i2) {
                            cArr[i4] = (char) ((((long) f2615[i3 + i4]) ^ (((long) i4) * f2614)) ^ ((long) c2));
                            a.f69 = i4 + 1;
                        } else {
                            str = new String(cArr);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str;
        }
    }

    public static class e extends jb {

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static long f2616 = 699219486559424016L;

        public e(String str, String str2) {
            super(str, m2534("칳︪껔庁", (ViewConfiguration.getScrollBarSize() >> 8) + 12373).intern(), str2, m2534("칺ゴ㏑㋻㕢㑆㝴㦒", (Process.myTid() >> 22) + 65239).intern(), (byte) 0);
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m2534(String str, int i2) {
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
                            cArr2[i3] = (char) (((long) (cArr[i3] ^ (g.f2056 * i3))) ^ f2616);
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
    }

    public /* synthetic */ jb(String str, String str2, String str3, String str4, byte b2) {
        this(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static String m2526() {
        f2608 = (f2606 + 101) % 128;
        String strMo482 = as.m467().mo482();
        f2606 = (f2608 + 3) % 128;
        return strMo482;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final String m2528() {
        f2608 = (f2606 + 81) % 128;
        String strReplace = m2532().replace(m2527(-TextUtils.lastIndexOf("", '0', 0), -TextUtils.indexOf((CharSequence) "", '0', 0, 0), Color.argb(0, 0, 0, 0) + 74, "\u0000", false).intern(), m2527(TextUtils.indexOf("", "") + 1, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 73, "\u0000", false).intern());
        int i2 = f2608 + 123;
        f2606 = i2 % 128;
        if (i2 % 2 == 0) {
            return strReplace;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m2529() {
        int i2 = (f2606 + 83) % 128;
        f2608 = i2;
        String str = this.f2611;
        int i3 = i2 + 95;
        f2606 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 78 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m2530() {
        int i2 = f2608 + 49;
        f2606 = i2 % 128;
        this.f2613 = i2 % 2 != 0;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m2531() {
        int i2 = (f2608 + 95) % 128;
        f2606 = i2;
        String str = this.f2612;
        f2608 = (i2 + 57) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m2532() {
        f2608 = (f2606 + 5) % 128;
        String strIntern = m2527(8 - TextUtils.getOffsetAfter("", 0), 8 - TextUtils.lastIndexOf("", '0', 0, 0), 126 - (ViewConfiguration.getTouchSlop() >> 8), "\u0002\n\f\u0011\u0002\u0001\uffffￌ\u000f", false).intern();
        String strM2526 = m2526();
        if (!(!this.f2613)) {
            f2608 = (f2606 + 113) % 128;
            if (!TextUtils.isEmpty(strM2526)) {
                StringBuilder sbW = a.w(strIntern);
                sbW.append(m2527(ExpandableListView.getPackedPositionType(0L) + 4, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3, 121 - TextUtils.getOffsetBefore("", 0), "\uffd1\u0018\u0010\u0007", true).intern());
                sbW.append(strM2526);
                strIntern = com.google.firebase.crashlytics.internal.model.a.C(sbW, m2527(1 - (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1, 74 - (ViewConfiguration.getTouchSlop() >> 8), "\u0000", false));
            }
        }
        StringBuilder sbW2 = a.w(strIntern);
        sbW2.append(this.f2611);
        sbW2.append(m2527(1 - KeyEvent.keyCodeFromString(""), (ViewConfiguration.getLongPressTimeout() >> 16) + 1, 74 - Color.argb(0, 0, 0, 0), "\u0000", false).intern());
        sbW2.append(this.f2609);
        sbW2.append(m2527(2 - (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.indexOf("", "", 0, 0) + 5, Color.alpha(0) + 106, "\u0012\uffdf\uffdf\u0015\u001f", true).intern());
        sbW2.append(this.f2612);
        sbW2.append(m2527((ViewConfiguration.getEdgeSlop() >> 16) + 1, KeyEvent.keyCodeFromString("") + 1, TextUtils.lastIndexOf("", '0') + 74, "\u0000", false).intern());
        sbW2.append(this.f2610);
        String string = sbW2.toString();
        int i2 = f2606 + 123;
        f2608 = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        throw null;
    }

    private jb(String str, String str2, String str3, String str4) {
        this.f2611 = str;
        this.f2609 = str2;
        this.f2612 = str3;
        this.f2610 = str4;
        this.f2613 = true;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2527(int i2, int i3, int i4, String str, boolean z2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (com.p004ironsource.adqualitysdk.sdk.i.b.f672) {
            try {
                char[] cArr2 = new char[i3];
                com.p004ironsource.adqualitysdk.sdk.i.b.f673 = 0;
                while (true) {
                    int i5 = com.p004ironsource.adqualitysdk.sdk.i.b.f673;
                    if (i5 >= i3) {
                        break;
                    }
                    com.p004ironsource.adqualitysdk.sdk.i.b.f671 = cArr[i5];
                    cArr2[com.p004ironsource.adqualitysdk.sdk.i.b.f673] = (char) (com.p004ironsource.adqualitysdk.sdk.i.b.f671 + i4);
                    int i6 = com.p004ironsource.adqualitysdk.sdk.i.b.f673;
                    cArr2[i6] = (char) (cArr2[i6] - f2607);
                    com.p004ironsource.adqualitysdk.sdk.i.b.f673 = i6 + 1;
                }
                if (i2 > 0) {
                    com.p004ironsource.adqualitysdk.sdk.i.b.f674 = i2;
                    char[] cArr3 = new char[i3];
                    System.arraycopy(cArr2, 0, cArr3, 0, i3);
                    int i7 = com.p004ironsource.adqualitysdk.sdk.i.b.f674;
                    System.arraycopy(cArr3, 0, cArr2, i3 - i7, i7);
                    int i8 = com.p004ironsource.adqualitysdk.sdk.i.b.f674;
                    System.arraycopy(cArr3, i8, cArr2, 0, i3 - i8);
                }
                if (z2) {
                    char[] cArr4 = new char[i3];
                    com.p004ironsource.adqualitysdk.sdk.i.b.f673 = 0;
                    while (true) {
                        int i9 = com.p004ironsource.adqualitysdk.sdk.i.b.f673;
                        if (i9 >= i3) {
                            break;
                        }
                        cArr4[i9] = cArr2[(i3 - i9) - 1];
                        com.p004ironsource.adqualitysdk.sdk.i.b.f673 = i9 + 1;
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
}
