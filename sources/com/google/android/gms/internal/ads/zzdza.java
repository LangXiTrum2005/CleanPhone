package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzdza extends zzcal {
    final /* synthetic */ zzdzc zza;

    public zzdza(zzdzc zzdzcVar) {
        Objects.requireNonNull(zzdzcVar);
        this.zza = zzdzcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcam
    public final void zze() throws RemoteException {
        zzdzc zzdzcVar = this.zza;
        zzdzcVar.zze().zzk(zzdzcVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzcam
    public final void zzf(int i2) throws RemoteException {
        zzdzc zzdzcVar = this.zza;
        zzdzcVar.zze().zzl(zzdzcVar.zzd(), i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcam
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzdzc zzdzcVar = this.zza;
        zzdzcVar.zze().zzl(zzdzcVar.zzd(), zzeVar.zza);
    }
}
