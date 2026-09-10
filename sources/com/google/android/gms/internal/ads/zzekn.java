package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.umeng.ccg.a;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zzekn implements AppEventListener, zzcyq, zzcxh, zzcvw, zzcwn, com.google.android.gms.ads.internal.client.zza, zzcvt, zzcye, zzcwj, zzdds {

    @Nullable
    final zzdrw zza;
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicBoolean zzh = new AtomicBoolean(true);
    private final AtomicBoolean zzi = new AtomicBoolean(false);
    private final AtomicBoolean zzj = new AtomicBoolean(false);

    @VisibleForTesting
    final BlockingQueue zzb = new ArrayBlockingQueue(((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziK)).intValue());

    public zzekn(@Nullable zzdrw zzdrwVar) {
        this.zza = zzdrwVar;
    }

    private final void zzo() {
        if (this.zzi.get() && this.zzj.get()) {
            for (final Pair pair : this.zzb) {
                zzeyt.zza(this.zzd, new zzeys() { // from class: com.google.android.gms.internal.ads.zzejy
                    @Override // com.google.android.gms.internal.ads.zzeys
                    public final void zza(Object obj) throws RemoteException {
                        Pair pair2 = pair;
                        ((com.google.android.gms.ads.internal.client.zzcm) obj).zzc((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            this.zzb.clear();
            this.zzh.set(false);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkE)).booleanValue()) {
            return;
        }
        zzeyt.zza(this.zzc, new zzekl());
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final synchronized void onAppEvent(final String str, final String str2) {
        if (!this.zzh.get()) {
            zzeyt.zza(this.zzd, new zzeys() { // from class: com.google.android.gms.internal.ads.zzekf
                @Override // com.google.android.gms.internal.ads.zzeys
                public final void zza(Object obj) throws RemoteException {
                    ((com.google.android.gms.ads.internal.client.zzcm) obj).zzc(str, str2);
                }
            });
            return;
        }
        if (!this.zzb.offer(new Pair(str, str2))) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("The queue for app events is full, dropping the new event.");
            zzdrw zzdrwVar = this.zza;
            if (zzdrwVar != null) {
                zzdrv zzdrvVarZza = zzdrwVar.zza();
                zzdrvVarZza.zzb(a.w, "dae_action");
                zzdrvVarZza.zzb("dae_name", str);
                zzdrvVarZza.zzb("dae_data", str2);
                zzdrvVarZza.zzg();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zza() {
        zzeyt.zza(this.zzc, new zzeys() { // from class: com.google.android.gms.internal.ads.zzejv
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbl) obj).zzd();
            }
        });
        zzeyt.zza(this.zzg, new zzeys() { // from class: com.google.android.gms.internal.ads.zzejw
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzct) obj).zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzb() {
        zzeyt.zza(this.zzc, new zzeys() { // from class: com.google.android.gms.internal.ads.zzekg
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbl) obj).zzh();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzc() {
        zzeyt.zza(this.zzc, new zzeys() { // from class: com.google.android.gms.internal.ads.zzeki
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbl) obj).zzj();
            }
        });
        zzeyt.zza(this.zzg, new zzeys() { // from class: com.google.android.gms.internal.ads.zzekj
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzct) obj).zzf();
            }
        });
        zzeyt.zza(this.zzg, new zzeys() { // from class: com.google.android.gms.internal.ads.zzekk
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzct) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzdd() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkE)).booleanValue()) {
            zzeyt.zza(this.zzc, new zzekl());
        }
        zzeyt.zza(this.zzg, new zzeys() { // from class: com.google.android.gms.internal.ads.zzejx
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzct) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdl(zzbvk zzbvkVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdm(zzfca zzfcaVar) {
        this.zzh.set(true);
        this.zzj.set(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzdq(zzbvw zzbvwVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void zzdz(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzeyt.zza(this.zzc, new zzeys() { // from class: com.google.android.gms.internal.ads.zzejz
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbl) obj).zzf(zzeVar);
            }
        });
        zzeyt.zza(this.zzc, new zzeys() { // from class: com.google.android.gms.internal.ads.zzeka
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbl) obj).zze(zzeVar.zza);
            }
        });
        zzeyt.zza(this.zzf, new zzeys() { // from class: com.google.android.gms.internal.ads.zzekb
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbo) obj).zzb(zzeVar);
            }
        });
        this.zzh.set(false);
        this.zzb.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzf() {
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzbl zzg() {
        return (com.google.android.gms.ads.internal.client.zzbl) this.zzc.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcye
    public final void zzh(@NonNull final com.google.android.gms.ads.internal.client.zzu zzuVar) {
        zzeyt.zza(this.zze, new zzeys() { // from class: com.google.android.gms.internal.ads.zzekm
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzdr) obj).zze(zzuVar);
            }
        });
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzcm zzi() {
        return (com.google.android.gms.ads.internal.client.zzcm) this.zzd.get();
    }

    public final void zzj(com.google.android.gms.ads.internal.client.zzbl zzblVar) {
        this.zzc.set(zzblVar);
    }

    public final void zzk(com.google.android.gms.ads.internal.client.zzbo zzboVar) {
        this.zzf.set(zzboVar);
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzdr zzdrVar) {
        this.zze.set(zzdrVar);
    }

    public final void zzm(com.google.android.gms.ads.internal.client.zzcm zzcmVar) {
        this.zzd.set(zzcmVar);
        this.zzi.set(true);
        zzo();
    }

    public final void zzn(com.google.android.gms.ads.internal.client.zzct zzctVar) {
        this.zzg.set(zzctVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcwj
    public final void zzq(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzeyt.zza(this.zzg, new zzeys() { // from class: com.google.android.gms.internal.ads.zzeke
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzct) obj).zzd(zzeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zzr() {
        zzeyt.zza(this.zzc, new zzeys() { // from class: com.google.android.gms.internal.ads.zzeju
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbl) obj).zzg();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final synchronized void zzs() {
        zzeyt.zza(this.zzc, new zzeys() { // from class: com.google.android.gms.internal.ads.zzekc
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbl) obj).zzi();
            }
        });
        zzeyt.zza(this.zzf, new zzeys() { // from class: com.google.android.gms.internal.ads.zzekd
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbo) obj).zzc();
            }
        });
        this.zzj.set(true);
        zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzu() {
        zzeyt.zza(this.zzc, new zzeys() { // from class: com.google.android.gms.internal.ads.zzekh
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbl) obj).zzk();
            }
        });
    }
}
