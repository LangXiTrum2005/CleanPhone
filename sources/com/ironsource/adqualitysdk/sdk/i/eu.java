package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class eu extends ev {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static byte[] f2002 = {0, 78, 6, -88, 8, -74, 17, -61, 118, 99, -68, -72, -73, -60, -79, -10, -68, 114, 75, 7};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2003 = 2018478604;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2004 = 15;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static short[] f2005 = null;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2006 = 1762381680;

    public eu(ef efVar, ef efVar2) {
        super(efVar, efVar2);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ev
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final boolean mo2195(Object obj, Object obj2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2194((short) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 101), (-2018478537) - KeyEvent.getDeadChar(0, 0), (-16) - Color.red(0), Color.red(0) - 1762381680, (byte) (81 - ExpandableListView.getPackedPositionChild(0L))).intern());
        sb2.append(obj);
        sb2.append(m2194((short) ((Process.myPid() >> 22) + 31), KeyEvent.getDeadChar(0, 0) - 2018478572, (-16) - (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.getOffsetAfter("", 0) - 1762381665, (byte) (Process.getGidForName("") + InterfaceC0435l1.d.b.f29108e)).intern());
        sb2.append(obj2);
        throw new RuntimeException(sb2.toString());
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ev
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final boolean mo2196(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2194((short) ((-102) - TextUtils.indexOf((CharSequence) "", '0', 0)), KeyEvent.getDeadChar(0, 0) - 2018478537, (-16) - KeyEvent.keyCodeFromString(""), (-1762381681) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (byte) (Color.rgb(0, 0, 0) + 16777298)).intern());
        sb2.append(str);
        throw new RuntimeException(f2.k(m2194((short) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 30), (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 2018478572, ExpandableListView.getPackedPositionType(0L) - 16, (-1762381665) - (ViewConfiguration.getLongPressTimeout() >> 16), (byte) (103 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))), str2, sb2));
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2194(short s10, int i10, int i11, int i12, byte b10) {
        String string;
        synchronized (n.f3070) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f2004;
                int i14 = i11 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f2002;
                    i14 = bArr != null ? (byte) (bArr[f2006 + i12] + i13) : (short) (f2005[f2006 + i12] + i13);
                }
                if (i14 > 0) {
                    n.f3072 = ((i12 + i14) - 2) + f2006 + i15;
                    n.f3073 = b10;
                    char c4 = (char) (i10 + f2003);
                    n.f3074 = c4;
                    sb2.append(c4);
                    n.f3075 = n.f3074;
                    n.f3071 = 1;
                    while (n.f3071 < i14) {
                        byte[] bArr2 = f2002;
                        if (bArr2 != null) {
                            int i16 = n.f3072;
                            n.f3072 = i16 - 1;
                            n.f3074 = (char) (n.f3075 + (((byte) (bArr2[i16] + s10)) ^ n.f3073));
                        } else {
                            short[] sArr = f2005;
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
