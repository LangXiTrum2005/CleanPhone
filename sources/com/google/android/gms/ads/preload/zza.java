package com.google.android.gms.ads.preload;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zza extends zzcd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PreloadCallbackV2 f11555a;

    public zza(zzb zzbVar, PreloadCallbackV2 preloadCallbackV2) {
        this.f11555a = preloadCallbackV2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final void zze(String str, @Nullable zzdx zzdxVar) {
        this.f11555a.onAdPreloaded(str, ResponseInfo.zzb(zzdxVar));
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final void zzf(String str) {
        this.f11555a.onAdsExhausted(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final void zzg(String str, zze zzeVar) {
        this.f11555a.onAdFailedToPreload(str, zzeVar.zzb());
    }
}
