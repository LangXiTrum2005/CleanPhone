package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzekr implements zzdlh {
    final /* synthetic */ zzcdt zza;
    final /* synthetic */ zzfhr zzb;
    final /* synthetic */ zzekt zzc;

    public zzekr(zzekt zzektVar, zzcdt zzcdtVar, zzfhr zzfhrVar) {
        this.zza = zzcdtVar;
        this.zzb = zzfhrVar;
        Objects.requireNonNull(zzektVar);
        this.zzc = zzektVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdlh
    public final void zza(boolean z2, Context context, zzdax zzdaxVar) {
        try {
            com.google.android.gms.ads.internal.zzt.zzb();
            com.google.android.gms.ads.internal.overlay.zzn.zza(context, (AdOverlayInfoParcel) this.zza.get(), true, this.zzc.zzd());
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlh
    public final zzfhr zzb() {
        return this.zzb;
    }
}
