package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.p004ironsource.adqualitysdk.sdk.IronSourceAdQuality;

/* JADX INFO: loaded from: classes5.dex */
public final class fy extends gi {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2048 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2049;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2047 = {'c', 61908, 58139, 54559, 50821, 47317, 43533, 40051, 36267, 32764, 28987, 25467, 21671, 17946, 14356, 10644, 7124, 3354, 65363, 61568, 58096, 54334, 50790, 47028, 43515, 39719, 35989, 32407, 28679, 25163, 21377, 17803, 14121, 10601, 6841, 3327, 65055, 61544, 57783, 54031, 50523, 46742, 43247, 39437, 35957, 32170, 28667, 24889, 21369, 17599, 14079, 17900, 46162, 42634, 37071, 33545, 64843, 61341, 55797, 51249, 14964, 13488};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f2050 = -6121103182133792325L;

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2138() {
        f2049 = (f2048 + 121) % 128;
        String strIntern = m2144((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 51, Color.green(0), (char) ((-1) - ImageFormat.getBitsPerPixel(0))).intern();
        f2048 = (f2049 + 65) % 128;
        return strIntern;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2139() {
        f2048 = (f2049 + 101) % 128;
        String strIntern = m2144(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 12, 50 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 17804)).intern();
        f2048 = (f2049 + 81) % 128;
        return strIntern;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2140() {
        int i2 = f2048 + 25;
        f2049 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 45 / 0;
        }
        return IronSourceAdQuality.class;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﾇ */
    public final bg mo2141() {
        be beVar = new be(mo2139());
        int i2 = f2048 + 45;
        f2049 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 88 / 0;
        }
        return beVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2144(int i2, int i3, char c2) {
        String str;
        synchronized (a.f68) {
            try {
                char[] cArr = new char[i2];
                a.f69 = 0;
                while (true) {
                    int i4 = a.f69;
                    if (i4 < i2) {
                        cArr[i4] = (char) ((((long) f2047[i3 + i4]) ^ (((long) i4) * f2050)) ^ ((long) c2));
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
