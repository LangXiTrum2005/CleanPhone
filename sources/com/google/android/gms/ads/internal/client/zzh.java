package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdLoadCallback;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzh extends zzbj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdLoadCallback f10881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10882b;

    public zzh(AdLoadCallback adLoadCallback, Object obj) {
        this.f10881a = adLoadCallback;
        this.f10882b = obj;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzb() {
        Object obj;
        AdLoadCallback adLoadCallback = this.f10881a;
        if (adLoadCallback == null || (obj = this.f10882b) == null) {
            return;
        }
        adLoadCallback.onAdLoaded(obj);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzc(zze zzeVar) {
        AdLoadCallback adLoadCallback = this.f10881a;
        if (adLoadCallback != null) {
            adLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }
}
