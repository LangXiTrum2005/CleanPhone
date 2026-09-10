package com.google.android.gms.ads.interstitial;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzem;
import com.google.android.gms.ads.internal.client.zzeu;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.preload.PreloadCallbackV2;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class InterstitialAdPreloader {
    public static zzem a() {
        zzem zzemVar = (zzem) zzeu.zzb().zza(AdFormat.INTERSTITIAL);
        if (zzemVar == null) {
            zzo.zzi("Failed to get a preloader. Call MobileAds.initialize() prior to calling preload APIs.");
        }
        return zzemVar;
    }

    public static boolean destroy(@NonNull String str) {
        zzem zzemVarA = a();
        if (zzemVarA == null) {
            return false;
        }
        return zzemVarA.zzf(str);
    }

    public static void destroyAll() {
        zzem zzemVarA = a();
        if (zzemVarA != null) {
            zzemVarA.zzg();
        }
    }

    @Nullable
    public static PreloadConfiguration getConfiguration(@NonNull String str) {
        zzem zzemVarA = a();
        if (zzemVarA == null) {
            return null;
        }
        return zzemVarA.zzi(str);
    }

    @NonNull
    public static Map<String, PreloadConfiguration> getConfigurations() {
        zzem zzemVarA = a();
        return zzemVarA == null ? new HashMap() : zzemVarA.zzh();
    }

    public static int getNumAdsAvailable(@NonNull String str) {
        zzem zzemVarA = a();
        if (zzemVarA == null) {
            return 0;
        }
        return zzemVarA.zze(str);
    }

    public static boolean isAdAvailable(@NonNull String str) {
        zzem zzemVarA = a();
        if (zzemVarA == null) {
            return false;
        }
        return zzemVarA.zzd(str);
    }

    @Nullable
    public static InterstitialAd pollAd(@NonNull String str) {
        zzem zzemVarA = a();
        if (zzemVarA == null) {
            return null;
        }
        return zzemVarA.zza(str);
    }

    public static boolean start(@NonNull String str, @NonNull PreloadConfiguration preloadConfiguration) {
        zzem zzemVarA = a();
        if (zzemVarA == null) {
            return false;
        }
        return zzemVarA.zzc(str, preloadConfiguration);
    }

    public static boolean start(@NonNull String str, @NonNull PreloadConfiguration preloadConfiguration, @NonNull PreloadCallbackV2 preloadCallbackV2) {
        zzem zzemVarA = a();
        if (zzemVarA == null) {
            return false;
        }
        return zzemVarA.zzb(str, preloadConfiguration, preloadCallbackV2);
    }
}
