package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzekv extends zzbte implements zzdbu {
    private zzbtf zza;
    private zzdbt zzb;

    @Override // com.google.android.gms.internal.ads.zzdbu
    public final synchronized void zza(zzdbt zzdbtVar) {
        this.zzb = zzdbtVar;
    }

    public final synchronized void zzc(zzbtf zzbtfVar) {
        this.zza = zzbtfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final synchronized void zze() throws RemoteException {
        zzbtf zzbtfVar = this.zza;
        if (zzbtfVar != null) {
            zzbtfVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final synchronized void zzf() throws RemoteException {
        zzbtf zzbtfVar = this.zza;
        if (zzbtfVar != null) {
            zzbtfVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final synchronized void zzg(int i2) throws RemoteException {
        zzdbt zzdbtVar = this.zzb;
        if (zzdbtVar != null) {
            zzdbtVar.zzb(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final synchronized void zzh() throws RemoteException {
        zzbtf zzbtfVar = this.zza;
        if (zzbtfVar != null) {
            zzbtfVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final synchronized void zzi() throws RemoteException {
        zzbtf zzbtfVar = this.zza;
        if (zzbtfVar != null) {
            zzbtfVar.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final synchronized void zzj() throws RemoteException {
        try {
            zzbtf zzbtfVar = this.zza;
            if (zzbtfVar != null) {
                zzbtfVar.zzj();
            }
            zzdbt zzdbtVar = this.zzb;
            if (zzdbtVar != null) {
                zzdbtVar.zza();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final synchronized void zzk() throws RemoteException {
        zzbtf zzbtfVar = this.zza;
        if (zzbtfVar != null) {
            zzbtfVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final synchronized void zzl(String str, String str2) throws RemoteException {
        zzbtf zzbtfVar = this.zza;
        if (zzbtfVar != null) {
            zzbtfVar.zzl(str, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final synchronized void zzm(zzbks zzbksVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final synchronized void zzn() throws RemoteException {
        zzbtf zzbtfVar = this.zza;
        if (zzbtfVar != null) {
            zzbtfVar.zzn();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final synchronized void zzo() throws RemoteException {
        zzbtf zzbtfVar = this.zza;
        if (zzbtfVar != null) {
            zzbtfVar.zzo();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final synchronized void zzp(zzbzy zzbzyVar) throws RemoteException {
        zzbtf zzbtfVar = this.zza;
        if (zzbtfVar != null) {
            zzbtfVar.zzp(zzbzyVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final synchronized void zzq() throws RemoteException {
        zzbtf zzbtfVar = this.zza;
        if (zzbtfVar != null) {
            zzbtfVar.zzq();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final synchronized void zzr(zzcac zzcacVar) throws RemoteException {
        zzbtf zzbtfVar = this.zza;
        if (zzbtfVar != null) {
            zzbtfVar.zzr(zzcacVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final synchronized void zzs(int i2) throws RemoteException {
        zzbtf zzbtfVar = this.zza;
        if (zzbtfVar != null) {
            zzbtfVar.zzs(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final synchronized void zzt() throws RemoteException {
        zzbtf zzbtfVar = this.zza;
        if (zzbtfVar != null) {
            zzbtfVar.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final synchronized void zzu() throws RemoteException {
        zzbtf zzbtfVar = this.zza;
        if (zzbtfVar != null) {
            zzbtfVar.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final synchronized void zzv(String str) throws RemoteException {
        zzbtf zzbtfVar = this.zza;
        if (zzbtfVar != null) {
            zzbtfVar.zzv(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final synchronized void zzw(int i2, String str) throws RemoteException {
        zzdbt zzdbtVar = this.zzb;
        if (zzdbtVar != null) {
            zzdbtVar.zzc(i2, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final synchronized void zzx(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzdbt zzdbtVar = this.zzb;
        if (zzdbtVar != null) {
            zzdbtVar.zzd(zzeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final synchronized void zzy(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzbtf zzbtfVar = this.zza;
        if (zzbtfVar != null) {
            zzbtfVar.zzy(zzeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final synchronized void zzz() throws RemoteException {
        zzbtf zzbtfVar = this.zza;
        if (zzbtfVar != null) {
            zzbtfVar.zzz();
        }
    }
}
