package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class si extends yi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppOpenAd.AppOpenAdLoadCallback f19975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19976b;

    public si(AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback, String str) {
        this.f19975a = appOpenAdLoadCallback;
        this.f19976b = str;
    }

    @Override // com.google.android.gms.internal.ads.zi
    public final void r0(wi wiVar) {
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.f19975a;
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAdLoaded(new ti(wiVar, this.f19976b));
        }
    }

    @Override // com.google.android.gms.internal.ads.zi
    public final void zzd(zze zzeVar) {
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.f19975a;
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zi
    public final void zzc(int i10) {
    }
}
