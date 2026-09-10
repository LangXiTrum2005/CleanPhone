package com.google.android.gms.internal.ads;

import com.applovin.impl.Z;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzdqc implements zzgyj {
    final /* synthetic */ zzdwm zza;
    final /* synthetic */ zzdqf zzb;

    public zzdqc(zzdqf zzdqfVar, zzdwm zzdwmVar) {
        this.zza = zzdwmVar;
        Objects.requireNonNull(zzdqfVar);
        this.zzb = zzdqfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zzb(Object obj) {
        Z.t(this.zzb.zzd().zze(), this.zza.zza());
    }
}
