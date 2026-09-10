package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzeda implements zzgyj {
    final /* synthetic */ zzedg zza;

    public zzeda(zzedg zzedgVar) {
        Objects.requireNonNull(zzedgVar);
        this.zza = zzedgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfic zzficVar = (zzfic) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcN)).booleanValue()) {
            this.zza.zzf().zzdP(zzficVar);
        }
    }
}
