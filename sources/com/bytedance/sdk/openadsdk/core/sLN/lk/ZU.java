package com.bytedance.sdk.openadsdk.core.sLN.lk;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ZU {
    public static final List<String> Lxb = Arrays.asList(MimeTypes.VIDEO_MP4, MimeTypes.VIDEO_H263);

    public static double Lxb(int i, double d, int i2, int i3, int i4, @Nullable String str) {
        double dLxb = Lxb(i, d, i2, i3);
        return (1.0d / ((dLxb + 1.0d) + Lxb(i4))) * Lxb(str);
    }

    private static double Lxb(int i, double d, int i2, int i3) {
        return (d > 0.0d ? Math.abs(d - (i3 > 0 ? ((double) i2) / ((double) i3) : 0.0d)) : 0.0d) + (i > 0 ? Math.abs((i - i2) / i) : 0.0d);
    }

    private static double Lxb(int i) {
        int iMax = Math.max(i, 0);
        if (700 > iMax || iMax > 1500) {
            return Math.min(Math.abs(700 - iMax) / 700.0f, Math.abs(1500 - iMax) / 1500.0f);
        }
        return 0.0d;
    }

    private static double Lxb(String str) {
        if (str == null) {
            str = "";
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -1664118616) {
            return (iHashCode == 1331848029 && str.equals(MimeTypes.VIDEO_MP4)) ? 1.5d : 1.0d;
        }
        str.equals(MimeTypes.VIDEO_H263);
        return 1.0d;
    }
}
