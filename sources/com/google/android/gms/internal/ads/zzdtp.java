package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzdtp implements com.google.android.gms.ads.internal.zzn {
    final /* synthetic */ zzdua zza;

    public zzdtp(zzdua zzduaVar) {
        Objects.requireNonNull(zzduaVar);
        this.zza = zzduaVar;
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final void zzdk() {
        this.zza.zzb().zza();
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final void zzdl() {
        this.zza.zzb().zzb();
    }
}
