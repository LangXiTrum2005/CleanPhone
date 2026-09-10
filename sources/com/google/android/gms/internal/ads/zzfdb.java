package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzfdb implements zzerf {
    protected final zzclg zza;
    private final Context zzb;
    private final Executor zzc;
    private final zzfdr zzd;
    private final zzffj zze;
    private final VersionInfoParcel zzf;
    private final ViewGroup zzg;
    private final zzfnr zzh;
    private final zzfij zzi;

    @Nullable
    private ListenableFuture zzj;

    public zzfdb(Context context, Executor executor, zzclg zzclgVar, zzffj zzffjVar, zzfdr zzfdrVar, zzfij zzfijVar, VersionInfoParcel versionInfoParcel) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzclgVar;
        this.zze = zzffjVar;
        this.zzd = zzfdrVar;
        this.zzi = zzfijVar;
        this.zzf = versionInfoParcel;
        this.zzg = new FrameLayout(context);
        this.zzh = zzclgVar.zzx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzm, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized zzczq zzg(zzffh zzffhVar) {
        zzfcy zzfcyVar = (zzfcy) zzffhVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzjs)).booleanValue()) {
            zzcsz zzcszVar = new zzcsz(this.zzg);
            zzczs zzczsVar = new zzczs();
            zzczsVar.zza(this.zzb);
            zzczsVar.zzb(zzfcyVar.zza);
            zzczt zzcztVarZze = zzczsVar.zze();
            zzdgj zzdgjVar = new zzdgj();
            zzfdr zzfdrVar = this.zzd;
            Executor executor = this.zzc;
            zzdgjVar.zzd(zzfdrVar, executor);
            zzdgjVar.zzg(zzfdrVar, executor);
            return zzc(zzcszVar, zzcztVarZze, zzdgjVar.zzn());
        }
        zzfdr zzfdrVarZzn = zzfdr.zzn(this.zzd);
        zzdgj zzdgjVar2 = new zzdgj();
        Executor executor2 = this.zzc;
        zzdgjVar2.zzc(zzfdrVarZzn, executor2);
        zzdgjVar2.zzi(zzfdrVarZzn, executor2);
        zzdgjVar2.zzj(zzfdrVarZzn, executor2);
        zzdgjVar2.zzk(zzfdrVarZzn, executor2);
        zzdgjVar2.zzd(zzfdrVarZzn, executor2);
        zzdgjVar2.zzg(zzfdrVarZzn, executor2);
        zzdgjVar2.zzl(zzfdrVarZzn);
        zzcsz zzcszVar2 = new zzcsz(this.zzg);
        zzczs zzczsVar2 = new zzczs();
        zzczsVar2.zza(this.zzb);
        zzczsVar2.zzb(zzfcyVar.zza);
        return zzc(zzcszVar2, zzczsVar2.zze(), zzdgjVar2.zzn());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    @Override // com.google.android.gms.internal.ads.zzerf
    public final synchronized boolean zza(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzerd zzerdVar, zzere zzereVar) throws Throwable {
        Throwable th;
        boolean z2;
        zzfno zzfnoVar;
        zzcsm zzcsmVar;
        try {
            try {
                if (!zzmVar.zzb()) {
                    if (((Boolean) zzbii.zzd.zze()).booleanValue()) {
                        try {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmA)).booleanValue()) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else {
                        z2 = false;
                    }
                    if (this.zzf.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmB)).intValue() || !z2) {
                        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
                    }
                }
                if (str == null) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad unit ID should not be null for app open ad.");
                    this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfda
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zze();
                        }
                    });
                    return false;
                }
                if (this.zzj != null) {
                    return false;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcX)).booleanValue()) {
                    com.google.android.gms.ads.internal.client.zzbb.zzc();
                }
                if (!((Boolean) zzbid.zzc.zze()).booleanValue() || (zzcsmVar = (zzcsm) this.zze.zzd()) == null) {
                    zzfnoVar = null;
                } else {
                    zzfno zzfnoVarZzd = zzcsmVar.zzd();
                    zzfnoVarZzd.zzi(7);
                    zzfnoVarZzd.zzc(zzmVar.zzp);
                    zzfnoVarZzd.zzd(zzmVar.zzm);
                    zzfnoVar = zzfnoVarZzd;
                }
                Context context = this.zzb;
                boolean z3 = zzmVar.zzf;
                zzfjh.zzb(context, z3);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkl)).booleanValue() && z3) {
                    this.zza.zzw().zzc(true);
                }
                Bundle bundleZza = zzdwo.zza(new Pair(zzdwm.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar.zzz)), new Pair(zzdwm.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis())));
                zzfij zzfijVar = this.zzi;
                zzfijVar.zzg(str);
                zzfijVar.zzc(com.google.android.gms.ads.internal.client.zzr.zzd());
                zzfijVar.zza(zzmVar);
                zzfijVar.zzv(bundleZza);
                zzfik zzfikVarZzA = zzfijVar.zzA();
                zzfne zzfneVarZzo = zzfne.zzo(context, zzfnn.zzg(zzfikVarZzA), 7, zzmVar);
                zzfcy zzfcyVar = new zzfcy(null);
                zzfcyVar.zza = zzfikVarZzA;
                ListenableFuture listenableFutureZzc = this.zze.zzc(new zzffk(zzfcyVar, null), new zzffi() { // from class: com.google.android.gms.internal.ads.zzfcz
                    @Override // com.google.android.gms.internal.ads.zzffi
                    public final /* synthetic */ zzczq zza(zzffh zzffhVar) {
                        return this.zza.zzf(zzffhVar);
                    }
                }, null);
                this.zzj = listenableFutureZzc;
                zzgym.zzr(listenableFutureZzc, new zzfcx(this, zzereVar, zzfnoVar, zzfneVarZzo, zzfcyVar), this.zzc);
                return true;
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
        }
        throw th;
    }

    @Override // com.google.android.gms.internal.ads.zzerf
    public final boolean zzb() {
        ListenableFuture listenableFuture = this.zzj;
        return (listenableFuture == null || listenableFuture.isDone()) ? false : true;
    }

    public abstract zzczq zzc(zzcsz zzcszVar, zzczt zzcztVar, zzdgk zzdgkVar);

    public final void zzd(com.google.android.gms.ads.internal.client.zzx zzxVar) {
        this.zzi.zzp(zzxVar);
    }

    public final /* synthetic */ void zze() {
        this.zzd.zzdI(zzfjm.zzd(6, null, null));
    }

    public final /* synthetic */ Executor zzh() {
        return this.zzc;
    }

    public final /* synthetic */ zzfdr zzi() {
        return this.zzd;
    }

    public final /* synthetic */ zzffj zzj() {
        return this.zze;
    }

    public final /* synthetic */ zzfnr zzk() {
        return this.zzh;
    }

    public final /* synthetic */ void zzl(ListenableFuture listenableFuture) {
        this.zzj = null;
    }
}
