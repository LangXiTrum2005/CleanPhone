package com.google.android.gms.ads.rewarded;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzeu;
import com.google.android.gms.ads.internal.client.zzey;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.preload.PreloadCallbackV2;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class RewardedAdPreloader {
    public static zzey a() {
        zzey zzeyVar = (zzey) zzeu.zzb().zza(AdFormat.REWARDED);
        if (zzeyVar == null) {
            zzo.zzl("Failed to get a preloader. Call MobileAds.initialize() prior to calling preload APIs.", null);
        }
        return zzeyVar;
    }

    public static boolean destroy(@NonNull String str) {
        zzey zzeyVarA = a();
        if (zzeyVarA == null) {
            return false;
        }
        return zzeyVarA.zzf(str);
    }

    public static void destroyAll() {
        zzey zzeyVarA = a();
        if (zzeyVarA != null) {
            zzeyVarA.zzg();
        }
    }

    @Nullable
    public static PreloadConfiguration getConfiguration(@NonNull String str) {
        zzey zzeyVarA = a();
        if (zzeyVarA == null) {
            return null;
        }
        return zzeyVarA.zzi(str);
    }

    @NonNull
    public static Map<String, PreloadConfiguration> getConfigurations() {
        zzey zzeyVarA = a();
        return zzeyVarA == null ? new HashMap() : zzeyVarA.zzh();
    }

    public static int getNumAdsAvailable(@NonNull String str) {
        zzey zzeyVarA = a();
        if (zzeyVarA == null) {
            return 0;
        }
        return zzeyVarA.zze(str);
    }

    public static boolean isAdAvailable(@NonNull String str) {
        zzey zzeyVarA = a();
        if (zzeyVarA == null) {
            return false;
        }
        return zzeyVarA.zzd(str);
    }

    @Nullable
    public static RewardedAd pollAd(@NonNull String str) {
        zzey zzeyVarA = a();
        if (zzeyVarA == null) {
            return null;
        }
        return zzeyVarA.zza(str);
    }

    public static boolean start(@NonNull String str, @NonNull PreloadConfiguration preloadConfiguration) {
        zzey zzeyVarA = a();
        if (zzeyVarA == null) {
            return false;
        }
        return zzeyVarA.zzc(str, preloadConfiguration);
    }

    public static boolean start(@NonNull String str, @NonNull PreloadConfiguration preloadConfiguration, @NonNull PreloadCallbackV2 preloadCallbackV2) {
        zzey zzeyVarA = a();
        if (zzeyVarA == null) {
            return false;
        }
        return zzeyVarA.zzb(str, preloadConfiguration, preloadCallbackV2);
    }
}
