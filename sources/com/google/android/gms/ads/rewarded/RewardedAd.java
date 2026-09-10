package com.google.android.gms.ads.rewarded;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.dn;
import com.google.android.gms.internal.ads.iy;
import com.google.android.gms.internal.ads.ry;
import com.google.android.gms.internal.ads.zw;
import k9.c0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class RewardedAd {
    @Deprecated
    public static boolean isAdAvailable(@NonNull Context context, @NonNull String str) {
        c0.i(context, "Context cannot be null.");
        c0.i(str, "AdUnitId cannot be null.");
        try {
            return com.google.android.gms.ads.zzb.zza(context).zzf(str);
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
            return false;
        }
    }

    public static void load(@NonNull final Context context, @NonNull final String str, @NonNull final AdRequest adRequest, @NonNull final RewardedAdLoadCallback rewardedAdLoadCallback) {
        c0.i(context, "Context cannot be null.");
        c0.i(str, "AdUnitId cannot be null.");
        c0.i(adRequest, "AdRequest cannot be null.");
        c0.i(rewardedAdLoadCallback, "LoadCallback cannot be null.");
        c0.d("#008 Must be called on the main UI thread.");
        am.a(context);
        if (((Boolean) dn.f13599k.o()).booleanValue()) {
            if (((Boolean) zzba.zzc().a(am.Oc)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.rewarded.zzc
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        RewardedAdLoadCallback rewardedAdLoadCallback2 = rewardedAdLoadCallback;
                        AdRequest adRequest2 = adRequest;
                        Context context2 = context;
                        try {
                            new ry(context2, str).a(adRequest2.zza(), rewardedAdLoadCallback2);
                        } catch (IllegalStateException e10) {
                            zw.c(context2).a("RewardedAd.load", e10);
                        }
                    }
                });
                return;
            }
        }
        zzo.zzd("Loading on UI thread");
        new ry(context, str).a(adRequest.zza(), rewardedAdLoadCallback);
    }

    @Nullable
    @Deprecated
    public static RewardedAd pollAd(@NonNull Context context, @NonNull String str) {
        c0.i(context, "Context cannot be null.");
        c0.i(str, "AdUnitId cannot be null.");
        try {
            iy iyVarZzg = com.google.android.gms.ads.zzb.zza(context).zzg(str);
            if (iyVarZzg != null) {
                return new ry(context, str, iyVarZzg);
            }
            zzo.zzl("Failed to obtain a Rewarded Ad from the preloader.", null);
            return null;
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
            return null;
        }
    }

    @NonNull
    public abstract Bundle getAdMetadata();

    @NonNull
    public abstract String getAdUnitId();

    @Nullable
    public abstract FullScreenContentCallback getFullScreenContentCallback();

    @Nullable
    public abstract OnAdMetadataChangedListener getOnAdMetadataChangedListener();

    @Nullable
    public abstract OnPaidEventListener getOnPaidEventListener();

    public abstract long getPlacementId();

    @NonNull
    public abstract ResponseInfo getResponseInfo();

    @NonNull
    public abstract RewardItem getRewardItem();

    public abstract void setFullScreenContentCallback(@Nullable FullScreenContentCallback fullScreenContentCallback);

    public abstract void setImmersiveMode(boolean z10);

    public abstract void setOnAdMetadataChangedListener(@Nullable OnAdMetadataChangedListener onAdMetadataChangedListener);

    public abstract void setOnPaidEventListener(@Nullable OnPaidEventListener onPaidEventListener);

    public abstract void setPlacementId(long j10);

    public abstract void setServerSideVerificationOptions(@Nullable ServerSideVerificationOptions serverSideVerificationOptions);

    public abstract void show(@NonNull Activity activity, @NonNull OnUserEarnedRewardListener onUserEarnedRewardListener);

    public static void load(@NonNull final Context context, @NonNull final String str, @NonNull final AdManagerAdRequest adManagerAdRequest, @NonNull final RewardedAdLoadCallback rewardedAdLoadCallback) {
        c0.i(context, "Context cannot be null.");
        c0.i(str, "AdUnitId cannot be null.");
        c0.i(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        c0.i(rewardedAdLoadCallback, "LoadCallback cannot be null.");
        c0.d("#008 Must be called on the main UI thread.");
        am.a(context);
        if (((Boolean) dn.f13599k.o()).booleanValue()) {
            if (((Boolean) zzba.zzc().a(am.Oc)).booleanValue()) {
                zzo.zzd("Loading on background thread");
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.rewarded.zzb
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        RewardedAdLoadCallback rewardedAdLoadCallback2 = rewardedAdLoadCallback;
                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        Context context2 = context;
                        try {
                            new ry(context2, str).a(adManagerAdRequest2.zza(), rewardedAdLoadCallback2);
                        } catch (IllegalStateException e10) {
                            zw.c(context2).a("RewardedAd.loadAdManager", e10);
                        }
                    }
                });
                return;
            }
        }
        zzo.zzd("Loading on UI thread");
        new ry(context, str).a(adManagerAdRequest.zza(), rewardedAdLoadCallback);
    }
}
