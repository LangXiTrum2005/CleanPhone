package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.ads.preload.PreloadConfiguration;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zzen extends zzca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PreloadCallback f10841a;

    public zzen(zzeu zzeuVar, PreloadCallback preloadCallback) {
        this.f10841a = preloadCallback;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcb
    public final void zze(zzfp zzfpVar) {
        PreloadConfiguration preloadConfigurationZzt = com.google.android.gms.ads.internal.util.client.zzf.zzt(zzfpVar);
        if (preloadConfigurationZzt != null) {
            this.f10841a.onAdsAvailable(preloadConfigurationZzt);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcb
    public final void zzf(zzfp zzfpVar) {
        PreloadConfiguration preloadConfigurationZzt = com.google.android.gms.ads.internal.util.client.zzf.zzt(zzfpVar);
        if (preloadConfigurationZzt != null) {
            this.f10841a.onAdsExhausted(preloadConfigurationZzt);
        }
    }
}
