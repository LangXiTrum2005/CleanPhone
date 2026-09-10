package com.google.android.gms.ads.interstitial;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.dn;
import com.google.android.gms.internal.ads.hs;
import com.google.android.gms.internal.ads.zw;
import k9.c0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class InterstitialAd {
    @Deprecated
    public static boolean isAdAvailable(@NonNull Context context, @NonNull String str) {
        try {
            return zzb.zza(context).zzj(str);
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
            return false;
        }
    }

    public static void load(@NonNull final Context context, @NonNull final String str, @NonNull final AdRequest adRequest, @NonNull final InterstitialAdLoadCallback interstitialAdLoadCallback) {
        c0.i(context, "Context cannot be null.");
        c0.i(str, "AdUnitId cannot be null.");
        c0.i(adRequest, "AdRequest cannot be null.");
        c0.i(interstitialAdLoadCallback, "LoadCallback cannot be null.");
        c0.d("#008 Must be called on the main UI thread.");
        am.a(context);
        if (((Boolean) dn.f13597i.o()).booleanValue()) {
            if (((Boolean) zzba.zzc().a(am.Oc)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.interstitial.zza
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        InterstitialAdLoadCallback interstitialAdLoadCallback2 = interstitialAdLoadCallback;
                        AdRequest adRequest2 = adRequest;
                        Context context2 = context;
                        try {
                            new hs(context2, str).a(adRequest2.zza(), interstitialAdLoadCallback2);
                        } catch (IllegalStateException e10) {
                            zw.c(context2).a("InterstitialAd.load", e10);
                        }
                    }
                });
                return;
            }
        }
        new hs(context, str).a(adRequest.zza(), interstitialAdLoadCallback);
    }

    @Nullable
    @Deprecated
    public static InterstitialAd pollAd(@NonNull Context context, @NonNull String str) {
        try {
            zzbu zzbuVarZzk = zzb.zza(context).zzk(str);
            if (zzbuVarZzk != null) {
                return new hs(context, str, zzbuVarZzk);
            }
            zzo.zzl("Failed to obtain an Interstitial Ad from the preloader.", null);
            return null;
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
            return null;
        }
    }

    @NonNull
    public abstract String getAdUnitId();

    @Nullable
    public abstract FullScreenContentCallback getFullScreenContentCallback();

    @Nullable
    public abstract OnPaidEventListener getOnPaidEventListener();

    public abstract long getPlacementId();

    @NonNull
    public abstract ResponseInfo getResponseInfo();

    public abstract void setFullScreenContentCallback(@Nullable FullScreenContentCallback fullScreenContentCallback);

    public abstract void setImmersiveMode(boolean z10);

    public abstract void setOnPaidEventListener(@Nullable OnPaidEventListener onPaidEventListener);

    public abstract void setPlacementId(long j10);

    public abstract void show(@NonNull Activity activity);
}
