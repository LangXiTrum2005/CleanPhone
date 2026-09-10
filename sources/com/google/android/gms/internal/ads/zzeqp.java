package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeqp implements AppEventListener, zzddq, zzdby, zzdan, zzdbe, com.google.android.gms.ads.internal.client.zza, zzdak, zzddb, zzdba, zzdir {
    final zzdxe zza;
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicBoolean zzh = new AtomicBoolean(true);
    private final AtomicBoolean zzi = new AtomicBoolean(false);
    private final AtomicBoolean zzj = new AtomicBoolean(false);
    final BlockingQueue zzb = new ArrayBlockingQueue(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzki)).intValue());

    public zzeqp(zzdxe zzdxeVar) {
        this.zza = zzdxeVar;
    }

    private final void zzr() {
        if (this.zzi.get() && this.zzj.get()) {
            BlockingQueue<Pair> blockingQueue = this.zzb;
            for (final Pair pair : blockingQueue) {
                zzfey.zza(this.zzd, new zzfex() { // from class: com.google.android.gms.internal.ads.zzeqa
                    @Override // com.google.android.gms.internal.ads.zzfex
                    public final /* synthetic */ void zza(Object obj) throws RemoteException {
                        Pair pair2 = pair;
                        ((com.google.android.gms.ads.internal.client.zzco) obj).zzb((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            blockingQueue.clear();
            this.zzh.set(false);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzme)).booleanValue()) {
            return;
        }
        zzfey.zza(this.zzc, zzeqf.zza);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final synchronized void onAppEvent(final String str, final String str2) {
        if (!this.zzh.get()) {
            zzfey.zza(this.zzd, new zzfex() { // from class: com.google.android.gms.internal.ads.zzepy
                @Override // com.google.android.gms.internal.ads.zzfex
                public final /* synthetic */ void zza(Object obj) throws RemoteException {
                    ((com.google.android.gms.ads.internal.client.zzco) obj).zzb(str, str2);
                }
            });
            return;
        }
        if (!this.zzb.offer(new Pair(str, str2))) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("The queue for app events is full, dropping the new event.");
            zzdxe zzdxeVar = this.zza;
            if (zzdxeVar != null) {
                zzdxd zzdxdVarZza = zzdxeVar.zza();
                zzdxdVarZza.zzc("action", "dae_action");
                zzdxdVarZza.zzc("dae_name", str);
                zzdxdVarZza.zzc("dae_data", str2);
                zzdxdVarZza.zzd();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final void zzd(zzbzm zzbzmVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdan
    public final void zzdI(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfex zzfexVar = new zzfex() { // from class: com.google.android.gms.internal.ads.zzeqb
            @Override // com.google.android.gms.internal.ads.zzfex
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).zzd(zzeVar);
            }
        };
        AtomicReference atomicReference = this.zzc;
        zzfey.zza(atomicReference, zzfexVar);
        zzfey.zza(atomicReference, new zzfex() { // from class: com.google.android.gms.internal.ads.zzepv
            @Override // com.google.android.gms.internal.ads.zzfex
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).zzc(zzeVar.zza);
            }
        });
        zzfey.zza(this.zzf, new zzfex() { // from class: com.google.android.gms.internal.ads.zzepw
            @Override // com.google.android.gms.internal.ads.zzfex
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbn) obj).zzc(zzeVar);
            }
        });
        this.zzh.set(false);
        this.zzb.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final void zzdJ() {
        zzfey.zza(this.zzc, zzeqc.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzdO(zzbza zzbzaVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzdP(zzfic zzficVar) {
        this.zzh.set(true);
        this.zzj.set(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final void zzdQ() {
        zzfey.zza(this.zzc, zzeqg.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdbe
    public final void zzdr() {
        zzfey.zza(this.zzc, zzeqi.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final void zzds() {
        zzfey.zza(this.zzc, zzeqj.zza);
        zzfey.zza(this.zzg, zzeqo.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final void zzdt() {
        zzfey.zza(this.zzc, zzeqe.zza);
        AtomicReference atomicReference = this.zzg;
        zzfey.zza(atomicReference, zzeql.zza);
        zzfey.zza(atomicReference, zzeqm.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final void zzdu() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzme)).booleanValue()) {
            zzfey.zza(this.zzc, zzeqh.zza);
        }
        zzfey.zza(this.zzg, zzeqn.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdby
    public final synchronized void zzg() {
        zzfey.zza(this.zzc, zzeqd.zza);
        zzfey.zza(this.zzf, zzeqk.zza);
        this.zzj.set(true);
        zzr();
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzbk zzi() {
        return (com.google.android.gms.ads.internal.client.zzbk) this.zzc.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdba
    public final void zzj(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfey.zza(this.zzg, new zzfex() { // from class: com.google.android.gms.internal.ads.zzepz
            @Override // com.google.android.gms.internal.ads.zzfex
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzcv) obj).zzb(zzeVar);
            }
        });
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzco zzk() {
        return (com.google.android.gms.ads.internal.client.zzco) this.zzd.get();
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        this.zzc.set(zzbkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zzm(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzfey.zza(this.zze, new zzfex() { // from class: com.google.android.gms.internal.ads.zzepx
            @Override // com.google.android.gms.internal.ads.zzfex
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzdt) obj).zze(zztVar);
            }
        });
    }

    public final void zzn(com.google.android.gms.ads.internal.client.zzco zzcoVar) {
        this.zzd.set(zzcoVar);
        this.zzi.set(true);
        zzr();
    }

    public final void zzo(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        this.zze.set(zzdtVar);
    }

    public final void zzp(com.google.android.gms.ads.internal.client.zzbn zzbnVar) {
        this.zzf.set(zzbnVar);
    }

    public final void zzq(com.google.android.gms.ads.internal.client.zzcv zzcvVar) {
        this.zzg.set(zzcvVar);
    }
}
