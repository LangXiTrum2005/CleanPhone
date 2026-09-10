package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okio.Utf8;
import com.ironsource.mediationsdk.IronSource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class gw extends gt {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2243 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2244 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2245 = 562498145;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2246 = 603558937;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static byte[] f2247 = {2, -15, -3, 6, 28, -27, -1, -3, 41, 27, -61, 7, -15, 5, -1, 6, -11, 19, -8, 5, -1, -8, Utf8.REPLACEMENT_BYTE, -55, 2, -15, -3, 6, -4, 5, -1, -3, 9, 59, -63, -2, 12, 2, -15, -3, 6, -4, 5, -1, -3, 9, 0, 0};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static short[] f2248 = null;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2249 = 78;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2240() {
        short sBlue;
        int iCombineMeasuredStates;
        int bitsPerPixel;
        int i10;
        int iMakeMeasureSpec;
        int i11 = f2244 + 95;
        f2243 = i11 % 128;
        if (i11 % 2 == 0) {
            sBlue = (short) Color.blue(0);
            iCombineMeasuredStates = (-603558832) >>> View.combineMeasuredStates(0, 0);
            bitsPerPixel = 16 % ImageFormat.getBitsPerPixel(0);
            i10 = (-562498107) % (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 1);
        } else {
            sBlue = (short) Color.blue(0);
            iCombineMeasuredStates = (-603558832) - View.combineMeasuredStates(0, 0);
            bitsPerPixel = ImageFormat.getBitsPerPixel(0) - 67;
            i10 = (-562498107) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        return m2264(sBlue, iCombineMeasuredStates, bitsPerPixel, i10, (byte) iMakeMeasureSpec).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ｋ */
    public final be mo2241() {
        bs bsVar = new bs(mo2240());
        f2243 = (f2244 + 23) % 128;
        return bsVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2242() {
        f2244 = (f2243 + 79) % 128;
        String strIntern = m2264((short) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (-603558838) - Color.argb(0, 0, 0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 41, (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 562498145, (byte) (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern();
        int i10 = f2244 + 33;
        f2243 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 55 / 0;
        }
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo2243() {
        int i10 = f2244 + 11;
        f2243 = i10 % 128;
        if (i10 % 2 != 0) {
            return IronSource.class;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2264(short s10, int i10, int i11, int i12, byte b10) {
        String string;
        synchronized (n.f3070) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f2249;
                int i14 = i11 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f2247;
                    i14 = bArr != null ? (byte) (bArr[f2245 + i12] + i13) : (short) (f2248[f2245 + i12] + i13);
                }
                if (i14 > 0) {
                    n.f3072 = ((i12 + i14) - 2) + f2245 + i15;
                    n.f3073 = b10;
                    char c4 = (char) (i10 + f2246);
                    n.f3074 = c4;
                    sb2.append(c4);
                    n.f3075 = n.f3074;
                    n.f3071 = 1;
                    while (n.f3071 < i14) {
                        byte[] bArr2 = f2247;
                        if (bArr2 != null) {
                            int i16 = n.f3072;
                            n.f3072 = i16 - 1;
                            n.f3074 = (char) (n.f3075 + (((byte) (bArr2[i16] + s10)) ^ n.f3073));
                        } else {
                            short[] sArr = f2248;
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
