package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public final class zzekw extends zzbzw implements zzdbu {
    private zzbzx zza;
    private zzdbt zzb;
    private zzdjc zzc;

    @Override // com.google.android.gms.internal.ads.zzdbu
    public final synchronized void zza(zzdbt zzdbtVar) {
        this.zzb = zzdbtVar;
    }

    public final synchronized void zzc(zzbzx zzbzxVar) {
        this.zza = zzbzxVar;
    }

    public final synchronized void zzd(zzdjc zzdjcVar) {
        this.zzc = zzdjcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final synchronized void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzdjc zzdjcVar = this.zzc;
        if (zzdjcVar != null) {
            final zzejj zzejjVar = ((zzenw) zzdjcVar).zzc;
            final zzfhr zzfhrVar = ((zzenw) zzdjcVar).zzb;
            final zzfic zzficVar = ((zzenw) zzdjcVar).zza;
            final zzenw zzenwVar = (zzenw) zzdjcVar;
            ((zzenw) zzdjcVar).zzd.zzc().execute(new Runnable(zzenwVar, zzficVar, zzfhrVar, zzejjVar) { // from class: com.google.android.gms.internal.ads.zzenv
                private final /* synthetic */ zzfic zza;
                private final /* synthetic */ zzfhr zzb;
                private final /* synthetic */ zzejj zzc;

                {
                    this.zza = zzficVar;
                    this.zzb = zzfhrVar;
                    this.zzc = zzejjVar;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzenz.zze(this.zza, this.zzb, this.zzc);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final synchronized void zzf(IObjectWrapper iObjectWrapper, int i2) throws RemoteException {
        zzdjc zzdjcVar = this.zzc;
        if (zzdjcVar != null) {
            String str = ((zzenw) zzdjcVar).zzc.zza;
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Fail to initialize adapter ".concat(String.valueOf(str)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final synchronized void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzdbt zzdbtVar = this.zzb;
        if (zzdbtVar != null) {
            zzdbtVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final synchronized void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbzx zzbzxVar = this.zza;
        if (zzbzxVar != null) {
            ((zzeny) zzbzxVar).zza.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbzx zzbzxVar = this.zza;
        if (zzbzxVar != null) {
            ((zzeny) zzbzxVar).zzd.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final synchronized void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbzx zzbzxVar = this.zza;
        if (zzbzxVar != null) {
            zzbzxVar.zzj(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final synchronized void zzk(IObjectWrapper iObjectWrapper, zzbzy zzbzyVar) throws RemoteException {
        zzbzx zzbzxVar = this.zza;
        if (zzbzxVar != null) {
            ((zzeny) zzbzxVar).zzd.zzb(zzbzyVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final synchronized void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbzx zzbzxVar = this.zza;
        if (zzbzxVar != null) {
            ((zzeny) zzbzxVar).zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final synchronized void zzm(IObjectWrapper iObjectWrapper, int i2) throws RemoteException {
        zzdbt zzdbtVar = this.zzb;
        if (zzdbtVar != null) {
            zzdbtVar.zzb(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final synchronized void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbzx zzbzxVar = this.zza;
        if (zzbzxVar != null) {
            ((zzeny) zzbzxVar).zzc.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final synchronized void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbzx zzbzxVar = this.zza;
        if (zzbzxVar != null) {
            ((zzeny) zzbzxVar).zzc.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final synchronized void zzp(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbzx zzbzxVar = this.zza;
        if (zzbzxVar != null) {
            ((zzeny) zzbzxVar).zzd.zzb(null);
        }
    }
}
