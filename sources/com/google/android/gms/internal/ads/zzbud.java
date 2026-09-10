package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbud extends zzbte {
    private final Adapter zza;
    private final zzbzx zzb;

    public zzbud(Adapter adapter, zzbzx zzbzxVar) {
        this.zza = adapter;
        this.zzb = zzbzxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zze() throws RemoteException {
        zzbzx zzbzxVar = this.zzb;
        if (zzbzxVar != null) {
            zzbzxVar.zzl(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzf() throws RemoteException {
        zzbzx zzbzxVar = this.zzb;
        if (zzbzxVar != null) {
            zzbzxVar.zzj(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzg(int i2) throws RemoteException {
        zzbzx zzbzxVar = this.zzb;
        if (zzbzxVar != null) {
            zzbzxVar.zzm(ObjectWrapper.wrap(this.zza), i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzh() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzi() throws RemoteException {
        zzbzx zzbzxVar = this.zzb;
        if (zzbzxVar != null) {
            zzbzxVar.zzh(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzj() throws RemoteException {
        zzbzx zzbzxVar = this.zzb;
        if (zzbzxVar != null) {
            zzbzxVar.zzg(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzk() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzl(String str, String str2) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzm(zzbks zzbksVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzn() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzo() throws RemoteException {
        zzbzx zzbzxVar = this.zzb;
        if (zzbzxVar != null) {
            zzbzxVar.zzi(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzp(zzbzy zzbzyVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzq() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzr(zzcac zzcacVar) throws RemoteException {
        zzbzx zzbzxVar = this.zzb;
        if (zzbzxVar != null) {
            zzbzxVar.zzk(ObjectWrapper.wrap(this.zza), new zzbzy(zzcacVar.zze(), zzcacVar.zzf()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzs(int i2) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzt() throws RemoteException {
        zzbzx zzbzxVar = this.zzb;
        if (zzbzxVar != null) {
            zzbzxVar.zzo(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzu() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzv(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzw(int i2, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzx(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzy(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzz() throws RemoteException {
        zzbzx zzbzxVar = this.zzb;
        if (zzbzxVar != null) {
            zzbzxVar.zzp(ObjectWrapper.wrap(this.zza));
        }
    }
}
