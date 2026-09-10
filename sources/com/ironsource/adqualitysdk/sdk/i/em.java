package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0435l1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class em extends ef {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static short[] f1961 = null;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static byte[] f1962 = {0};

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f1963 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1964 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1965 = 2;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1966 = -2108541867;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1967 = -1260101218;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final ef f1968;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final ef f1969;

    public em(ef efVar, ef efVar2) {
        this.f1969 = efVar;
        this.f1968 = efVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r2.equals(r6.f1969) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        if (r6.f1969 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
    
        r5 = r5.f1968;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        if (r5 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004b, code lost:
    
        return r5.equals(r6.f1968);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        if (r6.f1968 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r5 != r6) goto Lc
            int r5 = com.ironsource.adqualitysdk.sdk.i.em.f1963
            int r5 = r5 + 119
            int r5 = r5 % 128
            com.ironsource.adqualitysdk.sdk.i.em.f1964 = r5
            return r0
        Lc:
            r1 = 0
            if (r6 == 0) goto L51
            java.lang.Class r2 = r5.getClass()
            java.lang.Class r3 = r6.getClass()
            if (r2 == r3) goto L1a
            goto L51
        L1a:
            com.ironsource.adqualitysdk.sdk.i.em r6 = (com.ironsource.adqualitysdk.sdk.i.em) r6
            com.ironsource.adqualitysdk.sdk.i.ef r2 = r5.f1969
            if (r2 == 0) goto L3c
            int r3 = com.ironsource.adqualitysdk.sdk.i.em.f1963
            int r3 = r3 + 53
            int r4 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.em.f1964 = r4
            int r3 = r3 % 2
            if (r3 == 0) goto L35
            com.ironsource.adqualitysdk.sdk.i.ef r3 = r6.f1969
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L41
            goto L40
        L35:
            com.ironsource.adqualitysdk.sdk.i.ef r5 = r6.f1969
            r2.equals(r5)
            r5 = 0
            throw r5
        L3c:
            com.ironsource.adqualitysdk.sdk.i.ef r2 = r6.f1969
            if (r2 == 0) goto L41
        L40:
            return r1
        L41:
            com.ironsource.adqualitysdk.sdk.i.ef r5 = r5.f1968
            if (r5 == 0) goto L4c
            com.ironsource.adqualitysdk.sdk.i.ef r6 = r6.f1968
            boolean r5 = r5.equals(r6)
            return r5
        L4c:
            com.ironsource.adqualitysdk.sdk.i.ef r5 = r6.f1968
            if (r5 != 0) goto L51
            return r0
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.em.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ef efVar = this.f1969;
        int iHashCode = 0;
        int iHashCode2 = (efVar != null ? efVar.hashCode() : 0) * 31;
        ef efVar2 = this.f1968;
        if (efVar2 != null) {
            int i10 = f1964 + 31;
            f1963 = i10 % 128;
            if (i10 % 2 != 0) {
                efVar2.hashCode();
                throw null;
            }
            iHashCode = efVar2.hashCode();
        } else {
            f1964 = (f1963 + 27) % 128;
        }
        int i11 = iHashCode2 + iHashCode;
        f1963 = (f1964 + 1) % 128;
        return i11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1969);
        sb2.append(m2176((short) (ViewConfiguration.getMinimumFlingVelocity() >> 16), View.getDefaultSize(0, 0) + 2108541899, (-1) - (ViewConfiguration.getJumpTapTimeout() >> 16), 1260101218 - ExpandableListView.getPackedPositionGroup(0L), (byte) TextUtils.indexOf("", "", 0)).intern());
        sb2.append(mo2179());
        sb2.append(m2176((short) ((-1) - MotionEvent.axisFromString("")), 2108541899 - ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getKeyRepeatDelay() >> 16) - 1, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1260101218, (byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 1)).intern());
        sb2.append(this.f1968);
        String string = sb2.toString();
        int i10 = f1964 + InterfaceC0435l1.d.b.f29105b;
        f1963 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 13 / 0;
        }
        return string;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final ef m2177() {
        int i10 = f1963;
        int i11 = i10 + 51;
        f1964 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        ef efVar = this.f1969;
        int i12 = i10 + 41;
        f1964 = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 93 / 0;
        }
        return efVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final ef m2178() {
        int i10 = f1963 + 125;
        f1964 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f1968;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public abstract String mo2179();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2176(short s10, int i10, int i11, int i12, byte b10) {
        String string;
        synchronized (n.f3070) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f1965;
                int i14 = i11 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f1962;
                    i14 = bArr != null ? (byte) (bArr[f1967 + i12] + i13) : (short) (f1961[f1967 + i12] + i13);
                }
                if (i14 > 0) {
                    n.f3072 = ((i12 + i14) - 2) + f1967 + i15;
                    n.f3073 = b10;
                    char c4 = (char) (i10 + f1966);
                    n.f3074 = c4;
                    sb2.append(c4);
                    n.f3075 = n.f3074;
                    n.f3071 = 1;
                    while (n.f3071 < i14) {
                        byte[] bArr2 = f1962;
                        if (bArr2 != null) {
                            int i16 = n.f3072;
                            n.f3072 = i16 - 1;
                            n.f3074 = (char) (n.f3075 + (((byte) (bArr2[i16] + s10)) ^ n.f3073));
                        } else {
                            short[] sArr = f1961;
                            int i17 = n.f3072;
                            n.f3072 = i17 - 1;
                            n.f3074 = (char) (n.f3075 + (((short) (sArr[i17] + s10)) ^ n.f3073));
                        }
                        sb2.append(n.f3074);
                        n.f3075 = n.f3074;
                        n.f3071++;
                    }
                }
                string = sb2.toString();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return string;
    }
}
