package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfgv implements OnAdMetadataChangedListener, zzdby, zzdan, zzdak, zzdba, zzddb, zzffg, zzdir {
    private final zzfjv zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicReference zzh = new AtomicReference();
    private zzfgv zzi = null;

    public zzfgv(zzfjv zzfjvVar) {
        this.zza = zzfjvVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzfgv zzfgvVar = this.zzi;
        if (zzfgvVar != null) {
            zzfgvVar.onAdMetadataChanged();
        } else {
            zzfey.zza(this.zzb, zzfgu.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final void zzd(final zzbzm zzbzmVar, final String str, final String str2) {
        zzfgv zzfgvVar = this.zzi;
        if (zzfgvVar != null) {
            zzfgvVar.zzd(zzbzmVar, str, str2);
            return;
        }
        zzfey.zza(this.zzd, new zzfex() { // from class: com.google.android.gms.internal.ads.zzfgb
            @Override // com.google.android.gms.internal.ads.zzfex
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                zzbzm zzbzmVar2 = zzbzmVar;
                ((zzcai) obj).zzg(new zzcaw(zzbzmVar2.zzb(), zzbzmVar2.zzc()));
            }
        });
        zzfey.zza(this.zzf, new zzfex() { // from class: com.google.android.gms.internal.ads.zzfgc
            @Override // com.google.android.gms.internal.ads.zzfex
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                zzbzm zzbzmVar2 = zzbzmVar;
                ((zzcan) obj).zze(new zzcaw(zzbzmVar2.zzb(), zzbzmVar2.zzc()), str, str2);
            }
        });
        zzfey.zza(this.zze, new zzfex() { // from class: com.google.android.gms.internal.ads.zzfgd
            @Override // com.google.android.gms.internal.ads.zzfex
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzbzs) obj).zzi(zzbzmVar);
            }
        });
        zzfey.zza(this.zzg, new zzfex() { // from class: com.google.android.gms.internal.ads.zzfge
            @Override // com.google.android.gms.internal.ads.zzfex
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzbzn) obj).zze(zzbzmVar, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdan
    public final void zzdI(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfgv zzfgvVar = this.zzi;
        if (zzfgvVar != null) {
            zzfgvVar.zzdI(zzeVar);
            return;
        }
        final int i2 = zzeVar.zza;
        AtomicReference atomicReference = this.zzc;
        zzfey.zza(atomicReference, new zzfex() { // from class: com.google.android.gms.internal.ads.zzfgi
            @Override // com.google.android.gms.internal.ads.zzfex
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzcam) obj).zzg(zzeVar);
            }
        });
        zzfey.zza(atomicReference, new zzfex() { // from class: com.google.android.gms.internal.ads.zzffz
            @Override // com.google.android.gms.internal.ads.zzfex
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzcam) obj).zzf(i2);
            }
        });
        zzfey.zza(this.zze, new zzfex() { // from class: com.google.android.gms.internal.ads.zzfga
            @Override // com.google.android.gms.internal.ads.zzfex
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzbzs) obj).zzk(i2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final void zzdJ() {
        zzfgv zzfgvVar = this.zzi;
        if (zzfgvVar != null) {
            zzfgvVar.zzdJ();
        } else {
            zzfey.zza(this.zze, zzfgq.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final void zzdQ() {
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final void zzds() {
        zzfgv zzfgvVar = this.zzi;
        if (zzfgvVar != null) {
            zzfgvVar.zzds();
            return;
        }
        this.zza.zzb();
        zzfey.zza(this.zzd, zzfgk.zza);
        zzfey.zza(this.zze, zzfgp.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final void zzdt() {
        zzfgv zzfgvVar = this.zzi;
        if (zzfgvVar != null) {
            zzfgvVar.zzdt();
            return;
        }
        AtomicReference atomicReference = this.zzd;
        zzfey.zza(atomicReference, zzfgm.zza);
        zzfey.zza(this.zze, zzfgo.zza);
        zzfey.zza(atomicReference, zzfgj.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final void zzdu() {
        zzfgv zzfgvVar = this.zzi;
        if (zzfgvVar != null) {
            zzfgvVar.zzdu();
        } else {
            zzfey.zza(this.zzd, zzfgl.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final void zze() {
        zzfgv zzfgvVar = this.zzi;
        if (zzfgvVar != null) {
            zzfgvVar.zze();
        } else {
            zzfey.zza(this.zze, zzfgr.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final void zzf() {
        zzfgv zzfgvVar = this.zzi;
        if (zzfgvVar != null) {
            zzfgvVar.zzf();
        } else {
            zzfey.zza(this.zze, zzfgs.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdby
    public final void zzg() {
        zzfgv zzfgvVar = this.zzi;
        if (zzfgvVar != null) {
            zzfgvVar.zzg();
        } else {
            zzfey.zza(this.zzc, zzfgn.zza);
            zzfey.zza(this.zze, zzfgt.zza);
        }
    }

    public final void zzh(zzcam zzcamVar) {
        this.zzc.set(zzcamVar);
    }

    public final void zzi(zzcai zzcaiVar) {
        this.zzd.set(zzcaiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdba
    public final void zzj(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfgv zzfgvVar = this.zzi;
        if (zzfgvVar != null) {
            zzfgvVar.zzj(zzeVar);
            return;
        }
        AtomicReference atomicReference = this.zzd;
        zzfey.zza(atomicReference, new zzfex() { // from class: com.google.android.gms.internal.ads.zzfgf
            @Override // com.google.android.gms.internal.ads.zzfex
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzcai) obj).zzi(zzeVar);
            }
        });
        zzfey.zza(atomicReference, new zzfex() { // from class: com.google.android.gms.internal.ads.zzfgg
            @Override // com.google.android.gms.internal.ads.zzfex
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzcai) obj).zzh(zzeVar.zza);
            }
        });
    }

    public final void zzk(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.zzb.set(onAdMetadataChangedListener);
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        this.zzh.set(zzdtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zzm(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzfgv zzfgvVar = this.zzi;
        if (zzfgvVar != null) {
            zzfgvVar.zzm(zztVar);
        } else {
            zzfey.zza(this.zzh, new zzfex() { // from class: com.google.android.gms.internal.ads.zzfgh
                @Override // com.google.android.gms.internal.ads.zzfex
                public final /* synthetic */ void zza(Object obj) throws RemoteException {
                    ((com.google.android.gms.ads.internal.client.zzdt) obj).zze(zztVar);
                }
            });
        }
    }

    @Deprecated
    public final void zzn(zzbzs zzbzsVar) {
        this.zze.set(zzbzsVar);
    }

    public final void zzo(zzcan zzcanVar) {
        this.zzf.set(zzcanVar);
    }

    @Deprecated
    public final void zzp(zzbzn zzbznVar) {
        this.zzg.set(zzbznVar);
    }

    @Override // com.google.android.gms.internal.ads.zzffg
    public final void zzu(zzffg zzffgVar) {
        this.zzi = (zzfgv) zzffgVar;
    }
}
