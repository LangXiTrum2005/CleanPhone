package com.google.android.gms.ads.admanager;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.dn;
import com.google.android.gms.internal.ads.hs;
import com.google.android.gms.internal.ads.zw;
import k9.c0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AdManagerInterstitialAd extends InterstitialAd {
    public static void load(@NonNull final Context context, @NonNull final String str, @NonNull final AdManagerAdRequest adManagerAdRequest, @NonNull final AdManagerInterstitialAdLoadCallback adManagerInterstitialAdLoadCallback) {
        c0.i(context, "Context cannot be null.");
        c0.i(str, "AdUnitId cannot be null.");
        c0.i(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        c0.i(adManagerInterstitialAdLoadCallback, "LoadCallback cannot be null.");
        c0.d("#008 Must be called on the main UI thread.");
        am.a(context);
        if (((Boolean) dn.f13597i.o()).booleanValue()) {
            if (((Boolean) zzba.zzc().a(am.Oc)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.admanager.zzb
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        AdManagerInterstitialAdLoadCallback adManagerInterstitialAdLoadCallback2 = adManagerInterstitialAdLoadCallback;
                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        Context context2 = context;
                        try {
                            new hs(context2, str).a(adManagerAdRequest2.zza(), adManagerInterstitialAdLoadCallback2);
                        } catch (IllegalStateException e10) {
                            zw.c(context2).a("AdManagerInterstitialAd.load", e10);
                        }
                    }
                });
                return;
            }
        }
        new hs(context, str).a(adManagerAdRequest.zza(), adManagerInterstitialAdLoadCallback);
    }

    @Nullable
    public abstract AppEventListener getAppEventListener();

    public abstract void setAppEventListener(@Nullable AppEventListener appEventListener);
}
