package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeet extends zzbwg implements zzcxd {
    private zzbwh zza;
    private zzcxc zzb;
    private zzded zzc;

    @Override // com.google.android.gms.internal.ads.zzcxd
    public final synchronized void zza(zzcxc zzcxcVar) {
        this.zzb = zzcxcVar;
    }

    public final synchronized void zzc(zzbwh zzbwhVar) {
        this.zza = zzbwhVar;
    }

    public final synchronized void zzd(zzded zzdedVar) {
        this.zzc = zzdedVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final synchronized void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbwh zzbwhVar = this.zza;
        if (zzbwhVar != null) {
            ((zzehy) zzbwhVar).zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final synchronized void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbwh zzbwhVar = this.zza;
        if (zzbwhVar != null) {
            zzbwhVar.zzf(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final synchronized void zzg(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzcxc zzcxcVar = this.zzb;
        if (zzcxcVar != null) {
            zzcxcVar.zza(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final synchronized void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbwh zzbwhVar = this.zza;
        if (zzbwhVar != null) {
            ((zzehy) zzbwhVar).zzc.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcxc zzcxcVar = this.zzb;
        if (zzcxcVar != null) {
            zzcxcVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final synchronized void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbwh zzbwhVar = this.zza;
        if (zzbwhVar != null) {
            ((zzehy) zzbwhVar).zza.zzdp();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final synchronized void zzk(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzded zzdedVar = this.zzc;
        if (zzdedVar != null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to initialize adapter ".concat(String.valueOf(((zzehx) zzdedVar).zzc.zza)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final synchronized void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzded zzdedVar = this.zzc;
        if (zzdedVar != null) {
            Executor executor = ((zzehx) zzdedVar).zzd.zzb;
            final zzecz zzeczVar = ((zzehx) zzdedVar).zzc;
            final zzfbo zzfboVar = ((zzehx) zzdedVar).zzb;
            final zzfca zzfcaVar = ((zzehx) zzdedVar).zza;
            final zzehx zzehxVar = (zzehx) zzdedVar;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzehw
                @Override // java.lang.Runnable
                public final void run() {
                    zzehz zzehzVar = zzehxVar.zzd;
                    zzehz.zze(zzfcaVar, zzfboVar, zzeczVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final synchronized void zzm(IObjectWrapper iObjectWrapper, zzbwi zzbwiVar) throws RemoteException {
        zzbwh zzbwhVar = this.zza;
        if (zzbwhVar != null) {
            ((zzehy) zzbwhVar).zzd.zza(zzbwiVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final synchronized void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbwh zzbwhVar = this.zza;
        if (zzbwhVar != null) {
            ((zzehy) zzbwhVar).zzc.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final synchronized void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbwh zzbwhVar = this.zza;
        if (zzbwhVar != null) {
            ((zzehy) zzbwhVar).zzd.zzc();
        }
    }
}
