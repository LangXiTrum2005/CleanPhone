package com.google.android.gms.ads.appopen;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzel;
import com.google.android.gms.ads.internal.client.zzeu;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.preload.PreloadCallbackV2;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class AppOpenAdPreloader {
    public static zzel a() {
        zzel zzelVar = (zzel) zzeu.zzb().zza(AdFormat.APP_OPEN_AD);
        if (zzelVar == null) {
            zzo.zzi("Failed to get a preloader. Call MobileAds.initialize() prior to calling preload APIs.");
        }
        return zzelVar;
    }

    public static boolean destroy(@NonNull String str) {
        zzel zzelVarA = a();
        if (zzelVarA == null) {
            return false;
        }
        return zzelVarA.zzf(str);
    }

    public static void destroyAll() {
        zzel zzelVarA = a();
        if (zzelVarA != null) {
            zzelVarA.zzg();
        }
    }

    @Nullable
    public static PreloadConfiguration getConfiguration(@NonNull String str) {
        zzel zzelVarA = a();
        if (zzelVarA == null) {
            return null;
        }
        return zzelVarA.zzi(str);
    }

    @NonNull
    public static Map<String, PreloadConfiguration> getConfigurations() {
        zzel zzelVarA = a();
        return zzelVarA == null ? new HashMap() : zzelVarA.zzh();
    }

    public static int getNumAdsAvailable(@NonNull String str) {
        zzel zzelVarA = a();
        if (zzelVarA == null) {
            return 0;
        }
        return zzelVarA.zze(str);
    }

    public static boolean isAdAvailable(@NonNull String str) {
        zzel zzelVarA = a();
        if (zzelVarA == null) {
            return false;
        }
        return zzelVarA.zzd(str);
    }

    @Nullable
    public static AppOpenAd pollAd(@NonNull String str) {
        zzel zzelVarA = a();
        if (zzelVarA == null) {
            return null;
        }
        return zzelVarA.zza(str);
    }

    public static boolean start(@NonNull String str, @NonNull PreloadConfiguration preloadConfiguration) {
        zzel zzelVarA = a();
        if (zzelVarA == null) {
            return false;
        }
        return zzelVarA.zzc(str, preloadConfiguration);
    }

    public static boolean start(@NonNull String str, @NonNull PreloadConfiguration preloadConfiguration, @NonNull PreloadCallbackV2 preloadCallbackV2) {
        zzel zzelVarA = a();
        if (zzelVarA == null) {
            return false;
        }
        return zzelVarA.zzb(str, preloadConfiguration, preloadCallbackV2);
    }
}
