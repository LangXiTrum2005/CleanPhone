package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzeff implements zzgyj {
    final /* synthetic */ zzbyj zza;
    final /* synthetic */ zzbys zzb;

    public zzeff(zzefw zzefwVar, zzbys zzbysVar, zzbyj zzbyjVar) {
        this.zzb = zzbysVar;
        this.zza = zzbyjVar;
        Objects.requireNonNull(zzefwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zza(Throwable th) {
        try {
            this.zzb.zzf(com.google.android.gms.ads.internal.util.zzba.zza(th));
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zzb.zze((String) obj, this.zza);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e2);
        }
    }
}
