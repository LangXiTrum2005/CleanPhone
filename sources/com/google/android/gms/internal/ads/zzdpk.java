package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzdpk implements zzgyj {
    final /* synthetic */ zzdpm zza;

    public zzdpk(zzdpm zzdpmVar) {
        Objects.requireNonNull(zzdpmVar);
        this.zza = zzdpmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zza(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgm)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final void zzb(List list) {
        try {
            zzcir zzcirVar = (zzcir) list.get(0);
            if (zzcirVar != null) {
                this.zza.zza(zzcirVar);
            }
        } catch (ClassCastException | IndexOutOfBoundsException e2) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgm)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "omid native display exp");
            }
        }
    }
}
