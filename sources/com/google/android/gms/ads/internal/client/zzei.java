package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zzei extends zzaz {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzek f10822c;

    public zzei(zzek zzekVar) {
        this.f10822c = zzekVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzaz, com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        zzek zzekVar = this.f10822c;
        zzekVar.f10828d.zza(zzekVar.zzz());
        super.onAdFailedToLoad(loadAdError);
    }

    @Override // com.google.android.gms.ads.internal.client.zzaz, com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        zzek zzekVar = this.f10822c;
        zzekVar.f10828d.zza(zzekVar.zzz());
        super.onAdLoaded();
    }
}
