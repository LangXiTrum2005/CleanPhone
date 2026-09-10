package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
final class zzul {
    private static Boolean zza;

    public static int zza(MediaCodecInfo.VideoCapabilities videoCapabilities, int i2, int i3, double d) {
        if (Build.VERSION.SDK_INT < 29) {
            return 0;
        }
        Boolean bool = zza;
        if (bool == null || !bool.booleanValue()) {
            return zzuk.zza(videoCapabilities, i2, i3, d);
        }
        return 0;
    }
}
