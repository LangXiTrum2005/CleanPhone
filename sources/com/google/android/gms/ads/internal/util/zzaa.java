package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.internal.ads.am;
import com.unity3d.services.UnityAdsConstants;
import p9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaa {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile float f11007c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile long f11008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f11009e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f11010a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f11011b = 1.0f;

    public static float zze(Context context) {
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.Qf)).booleanValue();
        float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (!zBooleanValue) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            return streamMaxVolume == 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : audioManager.getStreamVolume(3) / streamMaxVolume;
        }
        ((b) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.Rf)).intValue();
        if (f11007c != -1.0f && jCurrentTimeMillis - f11008d < jIntValue) {
            return f11007c;
        }
        synchronized (f11009e) {
            try {
                ((b) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (f11007c != -1.0f && jCurrentTimeMillis2 - f11008d < jIntValue) {
                    return f11007c;
                }
                AudioManager audioManager2 = (AudioManager) context.getSystemService("audio");
                if (audioManager2 == null) {
                    f11007c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    f11008d = jCurrentTimeMillis2;
                    return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                int streamMaxVolume2 = audioManager2.getStreamMaxVolume(3);
                int streamVolume = audioManager2.getStreamVolume(3);
                if (streamMaxVolume2 != 0) {
                    f10 = streamVolume / streamMaxVolume2;
                }
                f11007c = f10;
                f11008d = jCurrentTimeMillis2;
                return f11007c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void zza(float f10) {
        this.f11011b = f10;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0011 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0012 A[RETURN] */
    public final synchronized float zzb() {
        float f10;
        boolean z10;
        synchronized (this) {
            f10 = this.f11011b;
            z10 = f10 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (z10) {
            return f10;
        }
        return 1.0f;
        if (z10) {
            return f10;
        }
        return 1.0f;
    }

    public final synchronized void zzc(boolean z10) {
        this.f11010a = z10;
    }

    public final synchronized boolean zzd() {
        return this.f11010a;
    }
}
