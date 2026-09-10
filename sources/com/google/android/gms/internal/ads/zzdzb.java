package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzdzb extends zzcah {
    final /* synthetic */ zzdzc zza;

    public zzdzb(zzdzc zzdzcVar) {
        Objects.requireNonNull(zzdzcVar);
        this.zza = zzdzcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zze() throws RemoteException {
        zzdzc zzdzcVar = this.zza;
        zzdzcVar.zze().zzm(zzdzcVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zzf() throws RemoteException {
        zzdzc zzdzcVar = this.zza;
        zzdzcVar.zze().zzo(zzdzcVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zzg(zzcac zzcacVar) throws RemoteException {
        zzdzc zzdzcVar = this.zza;
        zzdzcVar.zze().zzp(zzdzcVar.zzd(), zzcacVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zzh(int i2) throws RemoteException {
        zzdzc zzdzcVar = this.zza;
        zzdzcVar.zze().zzn(zzdzcVar.zzd(), i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zzi(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzdzc zzdzcVar = this.zza;
        zzdzcVar.zze().zzn(zzdzcVar.zzd(), zzeVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zzj() throws RemoteException {
        zzdzc zzdzcVar = this.zza;
        zzdzcVar.zze().zzq(zzdzcVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zzk() throws RemoteException {
        zzdzc zzdzcVar = this.zza;
        zzdzcVar.zze().zzr(zzdzcVar.zzd());
    }
}
