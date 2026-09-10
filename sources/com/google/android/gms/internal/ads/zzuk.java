package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.os.Build;
import androidx.core.view.accessibility.b;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class zzuk {
    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    public static int zza(MediaCodecInfo.VideoCapabilities videoCapabilities, int i2, int i3, double d) {
        List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            int iZzc = zzc(supportedPerformancePoints, b.e(i2, i3, (int) d));
            boolean z2 = true;
            if (iZzc == 1 && zzul.zza == null) {
                if (Build.VERSION.SDK_INT >= 35) {
                    z2 = false;
                } else {
                    int iZzb = zzb(false);
                    int iZzb2 = zzb(true);
                    if (iZzb != 0 && (iZzb2 != 0 ? !(iZzb != 2 || iZzb2 != 2) : iZzb == 2)) {
                        z2 = false;
                    }
                }
                zzul.zza = Boolean.valueOf(z2);
                if (zzul.zza.booleanValue()) {
                }
            }
            return iZzc;
        }
        return 0;
    }

    private static int zzb(boolean z2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List supportedPerformancePoints;
        try {
            zzt zztVar = new zzt();
            zztVar.zzm("video/avc");
            zzv zzvVarZzM = zztVar.zzM();
            if (zzvVarZzM.zzo != null) {
                List listZzc = zzvc.zzc(zzus.zzb, zzvVarZzM, z2, false);
                for (int i2 = 0; i2 < listZzc.size(); i2++) {
                    if (((zzuj) listZzc.get(i2)).zzd != null && (videoCapabilities = ((zzuj) listZzc.get(i2)).zzd.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        b.i();
                        return zzc(supportedPerformancePoints, b.d());
                    }
                }
            }
        } catch (zzuu unused) {
        }
        return 0;
    }

    private static int zzc(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (b.f(list.get(i2)).covers(performancePoint)) {
                return 2;
            }
        }
        return 1;
    }
}
