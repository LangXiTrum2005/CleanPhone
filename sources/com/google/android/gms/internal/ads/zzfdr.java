package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfdr implements zzdan, zzdcj, zzffg, com.google.android.gms.ads.internal.overlay.zzr, zzddb, zzdba, zzdir {
    private final zzfjv zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private zzfdr zzh = null;

    public zzfdr(zzfjv zzfjvVar) {
        this.zza = zzfjvVar;
    }

    public static zzfdr zzn(zzfdr zzfdrVar) {
        zzfdr zzfdrVar2 = new zzfdr(zzfdrVar.zza);
        zzfdrVar2.zzh = zzfdrVar;
        return zzfdrVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdan
    public final void zzdI(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfdr zzfdrVar = this.zzh;
        if (zzfdrVar != null) {
            zzfdrVar.zzdI(zzeVar);
            return;
        }
        AtomicReference atomicReference = this.zzb;
        zzfey.zza(atomicReference, new zzfex() { // from class: com.google.android.gms.internal.ads.zzfdh
            @Override // com.google.android.gms.internal.ads.zzfex
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzbeg) obj).zzd(zzeVar);
            }
        });
        zzfey.zza(atomicReference, new zzfex() { // from class: com.google.android.gms.internal.ads.zzfdi
            @Override // com.google.android.gms.internal.ads.zzfex
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzbeg) obj).zzc(zzeVar.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final void zzdQ() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdS() {
        zzfdr zzfdrVar = this.zzh;
        if (zzfdrVar != null) {
            zzfdrVar.zzdS();
        } else {
            zzfey.zza(this.zzf, zzfdd.zza);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdT(final int i2) {
        zzfdr zzfdrVar = this.zzh;
        if (zzfdrVar != null) {
            zzfdrVar.zzdT(i2);
        } else {
            zzfey.zza(this.zzf, new zzfex() { // from class: com.google.android.gms.internal.ads.zzfdj
                @Override // com.google.android.gms.internal.ads.zzfex
                public final /* synthetic */ void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzr) obj).zzdT(i2);
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final void zzdu() {
        zzfdr zzfdrVar = this.zzh;
        if (zzfdrVar != null) {
            zzfdrVar.zzdu();
        } else {
            zzfey.zza(this.zzd, zzfdp.zza);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
        zzfdr zzfdrVar = this.zzh;
        if (zzfdrVar != null) {
            zzfdrVar.zzdv();
        } else {
            zzfey.zza(this.zzf, zzfde.zza);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
        zzfdr zzfdrVar = this.zzh;
        if (zzfdrVar != null) {
            zzfdrVar.zzh();
            return;
        }
        zzfey.zza(this.zzf, zzfdf.zza);
        AtomicReference atomicReference = this.zzd;
        zzfey.zza(atomicReference, zzfdn.zza);
        zzfey.zza(atomicReference, zzfdo.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdba
    public final void zzj(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfdr zzfdrVar = this.zzh;
        if (zzfdrVar != null) {
            zzfdrVar.zzj(zzeVar);
        } else {
            zzfey.zza(this.zzd, new zzfex() { // from class: com.google.android.gms.internal.ads.zzfdk
                @Override // com.google.android.gms.internal.ads.zzfex
                public final /* synthetic */ void zza(Object obj) throws RemoteException {
                    ((zzbek) obj).zze(zzeVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcj
    public final void zzl() {
        zzfdr zzfdrVar = this.zzh;
        if (zzfdrVar != null) {
            zzfdrVar.zzl();
        } else {
            zzfey.zza(this.zze, zzfdc.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zzm(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzfdr zzfdrVar = this.zzh;
        if (zzfdrVar != null) {
            zzfdrVar.zzm(zztVar);
        } else {
            zzfey.zza(this.zzg, new zzfex() { // from class: com.google.android.gms.internal.ads.zzfdl
                @Override // com.google.android.gms.internal.ads.zzfex
                public final /* synthetic */ void zza(Object obj) throws RemoteException {
                    ((com.google.android.gms.ads.internal.client.zzdt) obj).zze(zztVar);
                }
            });
        }
    }

    public final void zzo(zzbeg zzbegVar) {
        this.zzb.set(zzbegVar);
    }

    public final void zzp(zzbek zzbekVar) {
        this.zzd.set(zzbekVar);
    }

    public final void zzq(com.google.android.gms.ads.internal.overlay.zzr zzrVar) {
        this.zzf.set(zzrVar);
    }

    public final void zzr(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        this.zzg.set(zzdtVar);
    }

    public final void zzs(final zzbed zzbedVar) {
        zzfdr zzfdrVar = this.zzh;
        if (zzfdrVar != null) {
            zzfdrVar.zzs(zzbedVar);
        } else {
            zzfey.zza(this.zzb, new zzfex() { // from class: com.google.android.gms.internal.ads.zzfdg
                @Override // com.google.android.gms.internal.ads.zzfex
                public final /* synthetic */ void zza(Object obj) throws RemoteException {
                    ((zzbeg) obj).zzb(zzbedVar);
                }
            });
        }
    }

    public final void zzt() {
        zzfdr zzfdrVar = this.zzh;
        if (zzfdrVar != null) {
            zzfdrVar.zzt();
            return;
        }
        this.zza.zzb();
        zzfey.zza(this.zzc, zzfdm.zza);
        zzfey.zza(this.zzd, zzfdq.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzffg
    public final void zzu(zzffg zzffgVar) {
        this.zzh = (zzfdr) zzffgVar;
    }
}
