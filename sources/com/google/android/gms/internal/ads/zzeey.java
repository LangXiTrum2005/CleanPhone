package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzeey implements zzedk {
    final /* synthetic */ zzefb zza;

    public zzeey(zzefb zzefbVar) {
        Objects.requireNonNull(zzefbVar);
        this.zza = zzefbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedk
    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzpw)).booleanValue()) {
            zzdxd zzdxdVarZza = this.zza.zzd().zza();
            zzdxdVarZza.zzc("action", "ptard");
            zzdxdVarZza.zzc("ptard", "r");
            zzdxdVarZza.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzedk
    public final void zzb(RemoteException remoteException) {
        this.zza.zzc();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzpx)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(remoteException, "Preconnect Remote");
        }
    }
}
