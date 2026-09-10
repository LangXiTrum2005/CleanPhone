package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzepu extends com.google.android.gms.ads.internal.client.zzbw implements zzddg {
    private final Context zza;
    private final zzfef zzb;
    private final String zzc;
    private final zzeqp zzd;
    private com.google.android.gms.ads.internal.client.zzr zze;
    private final zzfij zzf;
    private final VersionInfoParcel zzg;
    private final zzdxe zzh;
    private zzctc zzi;

    public zzepu(Context context, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzfef zzfefVar, zzeqp zzeqpVar, VersionInfoParcel versionInfoParcel, zzdxe zzdxeVar) {
        this.zza = context;
        this.zzb = zzfefVar;
        this.zze = zzrVar;
        this.zzc = str;
        this.zzd = zzeqpVar;
        this.zzf = zzfefVar.zzg();
        this.zzg = versionInfoParcel;
        this.zzh = zzdxeVar;
        zzfefVar.zzi(this);
    }

    private final synchronized void zzO(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        zzfij zzfijVar = this.zzf;
        zzfijVar.zzc(zzrVar);
        zzfijVar.zze(this.zze.zzn);
    }

    private final synchronized boolean zzV(com.google.android.gms.ads.internal.client.zzm zzmVar) throws RemoteException {
        try {
            if (zzW()) {
                Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            Context context = this.zza;
            if (!com.google.android.gms.ads.internal.util.zzs.zzM(context) || zzmVar.zzs != null) {
                zzfjh.zzb(context, zzmVar.zzf);
                return this.zzb.zza(zzmVar, this.zzc, null, new zzept(this));
            }
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to load the ad because app ID is missing.");
            zzeqp zzeqpVar = this.zzd;
            if (zzeqpVar != null) {
                zzeqpVar.zzdI(zzfjm.zzd(4, null, null));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    private final boolean zzW() {
        boolean z2;
        if (((Boolean) zzbii.zzf.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmA)).booleanValue()) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        return this.zzg.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmB)).intValue() || !z2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized boolean zzA() {
        zzctc zzctcVar = this.zzi;
        return zzctcVar != null && zzctcVar.zzs();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized boolean zzB() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzC(zzbzs zzbzsVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzD(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzE(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized com.google.android.gms.ads.internal.client.zzed zzF() {
        Preconditions.checkMainThread("getVideoController must be called from the main thread.");
        zzctc zzctcVar = this.zzi;
        if (zzctcVar == null) {
            return null;
        }
        return zzctcVar.zzc();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzG(com.google.android.gms.ads.internal.client.zzga zzgaVar) {
        try {
            if (zzW()) {
                Preconditions.checkMainThread("setVideoOptions must be called on the main UI thread.");
            }
            this.zzf.zzi(zzgaVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzH(com.google.android.gms.ads.internal.client.zzeh zzehVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzI(com.google.android.gms.ads.internal.client.zzx zzxVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzJ(zzbeg zzbegVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzK(boolean z2) {
    }

    @Override // com.google.android.gms.internal.ads.zzddg
    public final synchronized void zzL() throws ExecutionException, InterruptedException {
        zzfef zzfefVar = this.zzb;
        if (zzfefVar.zzh()) {
            zzfefVar.zzc();
        } else {
            zzfefVar.zzk();
        }
    }

    public final /* synthetic */ zzctc zzM() {
        return this.zzi;
    }

    public final /* synthetic */ void zzN(zzctc zzctcVar) {
        this.zzi = zzctcVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzP(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        if (zzW()) {
            Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!zzdtVar.zzf()) {
                this.zzh.zzb();
            }
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Error in making CSI ping for reporting paid event callback", e2);
        }
        this.zzd.zzo(zzdtVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzQ(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.ads.internal.client.zzbn zzbnVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzR(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzS(com.google.android.gms.ads.internal.client.zzcv zzcvVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzT(long j) {
        this.zzf.zzx(j);
        zzctc zzctcVar = this.zzi;
        if (zzctcVar == null || zzctcVar.zzo() == null) {
            return;
        }
        zzctcVar.zzo().zzb(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized long zzU() {
        zzctc zzctcVar = this.zzi;
        if (zzctcVar == null || zzctcVar.zzo() == null) {
            return this.zzf.zzw();
        }
        return zzctcVar.zzo().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzY(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        Preconditions.checkMainThread("setCorrelationIdProvider must be called on the main UI thread");
        this.zzf.zzZ(zzcsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzddg
    public final synchronized void zza() {
        try {
            if (!this.zzb.zzh()) {
                this.zzb.zzj();
                return;
            }
            zzfij zzfijVar = this.zzf;
            com.google.android.gms.ads.internal.client.zzr zzrVarZzf = zzfijVar.zzf();
            if (this.zzi != null && zzfijVar.zzC()) {
                zzrVarZzf = zzfiq.zza(this.zza, Collections.singletonList(this.zzi.zzf()));
            }
            zzO(zzrVarZzf);
            zzfijVar.zzd(true);
            try {
                zzV(zzfijVar.zzb());
            } catch (RemoteException unused) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to refresh the banner ad.");
            }
            this.zzf.zzd(false);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final IObjectWrapper zzb() {
        if (zzW()) {
            Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        }
        return ObjectWrapper.wrap(this.zzb.zzd());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003f, B:15:0x0043, B:12:0x003a), top: B:22:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzc() {
        try {
            if (((Boolean) zzbii.zze.zze()).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmx)).booleanValue()) {
                    if (this.zzg.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmC)).intValue()) {
                        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
                    }
                } else {
                    Preconditions.checkMainThread("destroy must be called on the main UI thread.");
                }
            } else {
                Preconditions.checkMainThread("destroy must be called on the main UI thread.");
            }
            zzctc zzctcVar = this.zzi;
            if (zzctcVar != null) {
                zzctcVar.zzd();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean zzd() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzdR(com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        if (zzW()) {
            Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.zzd.zzl(zzbkVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized boolean zze(com.google.android.gms.ads.internal.client.zzm zzmVar) throws RemoteException {
        zzO(this.zze);
        return zzV(zzmVar);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003f, B:15:0x0043, B:12:0x003a), top: B:22:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzf() {
        try {
            if (((Boolean) zzbii.zzg.zze()).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmy)).booleanValue()) {
                    if (this.zzg.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmC)).intValue()) {
                        Preconditions.checkMainThread("pause must be called on the main UI thread.");
                    }
                } else {
                    Preconditions.checkMainThread("pause must be called on the main UI thread.");
                }
            } else {
                Preconditions.checkMainThread("pause must be called on the main UI thread.");
            }
            zzctc zzctcVar = this.zzi;
            if (zzctcVar != null) {
                zzctcVar.zzl().zza(null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003f, B:15:0x0043, B:12:0x003a), top: B:22:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzg() {
        try {
            if (((Boolean) zzbii.zzh.zze()).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmw)).booleanValue()) {
                    if (this.zzg.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmC)).intValue()) {
                        Preconditions.checkMainThread("resume must be called on the main UI thread.");
                    }
                } else {
                    Preconditions.checkMainThread("resume must be called on the main UI thread.");
                }
            } else {
                Preconditions.checkMainThread("resume must be called on the main UI thread.");
            }
            zzctc zzctcVar = this.zzi;
            if (zzctcVar != null) {
                zzctcVar.zzl().zzb(null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzi(com.google.android.gms.ads.internal.client.zzco zzcoVar) {
        if (zzW()) {
            Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        }
        this.zzd.zzn(zzcoVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzj(com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final Bundle zzk() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzl() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzm() {
        Preconditions.checkMainThread("recordManualImpression must be called on the main UI thread.");
        zzctc zzctcVar = this.zzi;
        if (zzctcVar != null) {
            zzctcVar.zzi();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized com.google.android.gms.ads.internal.client.zzr zzn() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        zzctc zzctcVar = this.zzi;
        if (zzctcVar != null) {
            return zzfiq.zza(this.zza, Collections.singletonList(zzctcVar.zze()));
        }
        return this.zzf.zzf();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzo(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        this.zzf.zzc(zzrVar);
        this.zze = zzrVar;
        zzctc zzctcVar = this.zzi;
        if (zzctcVar != null) {
            zzctcVar.zzb(this.zzb.zzd(), zzrVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzp(zzbxh zzbxhVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzq(zzbxk zzbxkVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized String zzr() {
        zzctc zzctcVar = this.zzi;
        if (zzctcVar == null || zzctcVar.zzn() == null) {
            return null;
        }
        return zzctcVar.zzn().zze();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized String zzs() {
        zzctc zzctcVar = this.zzi;
        if (zzctcVar == null || zzctcVar.zzn() == null) {
            return null;
        }
        return zzctcVar.zzn().zze();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized com.google.android.gms.ads.internal.client.zzea zzt() {
        zzctc zzctcVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhB)).booleanValue() && (zzctcVar = this.zzi) != null) {
            return zzctcVar.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized String zzu() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzco zzv() {
        return this.zzd.zzk();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final com.google.android.gms.ads.internal.client.zzbk zzw() {
        return this.zzd.zzi();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzx(zzbhf zzbhfVar) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzb.zze(zzbhfVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzy(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        if (zzW()) {
            Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.zzb.zzf(zzbhVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final synchronized void zzz(boolean z2) {
        try {
            if (zzW()) {
                Preconditions.checkMainThread("setManualImpressionsEnabled must be called from the main thread.");
            }
            this.zzf.zzk(z2);
        } catch (Throwable th) {
            throw th;
        }
    }
}
