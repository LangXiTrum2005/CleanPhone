package com.google.android.gms.ads.internal.client;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.FullScreenContentCallback;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbb extends zzcr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FullScreenContentCallback f10790a;

    public zzbb(@Nullable FullScreenContentCallback fullScreenContentCallback) {
        this.f10790a = fullScreenContentCallback;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void zzb(zze zzeVar) {
        FullScreenContentCallback fullScreenContentCallback = this.f10790a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(zzeVar.zza());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void zzc() {
        FullScreenContentCallback fullScreenContentCallback = this.f10790a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void zzd() {
        FullScreenContentCallback fullScreenContentCallback = this.f10790a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void zze() {
        FullScreenContentCallback fullScreenContentCallback = this.f10790a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdImpression();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void zzf() {
        FullScreenContentCallback fullScreenContentCallback = this.f10790a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdClicked();
        }
    }
}
