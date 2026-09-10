package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfef implements zzerf {
    private final Context zza;
    private final Executor zzb;
    private final zzclg zzc;
    private final zzeqp zzd;
    private final zzeqt zze;
    private final ViewGroup zzf;
    private zzbhf zzg;
    private final zzddl zzh;
    private final zzfnr zzi;
    private final zzdfq zzj;
    private final zzfij zzk;
    private ListenableFuture zzl;
    private boolean zzm;
    private com.google.android.gms.ads.internal.client.zze zzn;
    private zzere zzo;

    public zzfef(Context context, Executor executor, com.google.android.gms.ads.internal.client.zzr zzrVar, zzclg zzclgVar, zzeqp zzeqpVar, zzeqt zzeqtVar, zzfij zzfijVar, zzdfq zzdfqVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzclgVar;
        this.zzd = zzeqpVar;
        this.zze = zzeqtVar;
        this.zzk = zzfijVar;
        this.zzh = zzclgVar.zzd();
        this.zzi = zzclgVar.zzx();
        this.zzf = new FrameLayout(context);
        this.zzj = zzdfqVar;
        zzfijVar.zzc(zzrVar);
        this.zzm = true;
        this.zzn = null;
        this.zzo = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzt, reason: merged with bridge method [inline-methods] */
    public final void zzn() {
        this.zzl = null;
        final com.google.android.gms.ads.internal.client.zze zzeVar = this.zzn;
        this.zzn = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzjr)).booleanValue() && zzeVar != null) {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfec
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzm(zzeVar);
                }
            });
        }
        zzere zzereVar = this.zzo;
        if (zzereVar != null) {
            zzereVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzerf
    public final boolean zza(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzerd zzerdVar, zzere zzereVar) throws RemoteException {
        zzcuh zzcuhVarZza;
        if (str == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad unit ID should not be null for banner ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfed
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzl();
                }
            });
            return false;
        }
        if (!zzb()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcX)).booleanValue()) {
                com.google.android.gms.ads.internal.client.zzbb.zzc();
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkl)).booleanValue() && zzmVar.zzf) {
                this.zzc.zzw().zzc(true);
            }
            Bundle bundleZza = zzdwo.zza(new Pair(zzdwm.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar.zzz)), new Pair(zzdwm.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis())));
            zzfij zzfijVar = this.zzk;
            zzfijVar.zzg(str);
            zzfijVar.zza(zzmVar);
            zzfijVar.zzv(bundleZza);
            Context context = this.zza;
            zzfik zzfikVarZzA = zzfijVar.zzA();
            zzfne zzfneVarZzo = zzfne.zzo(context, zzfnn.zzg(zzfikVarZzA), 3, zzmVar);
            zzfno zzfnoVarZze = null;
            if (!((Boolean) zzbiq.zze.zze()).booleanValue() || !zzfijVar.zzf().zzk) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzjr)).booleanValue()) {
                    zzcug zzcugVarZzi = this.zzc.zzi();
                    zzczs zzczsVar = new zzczs();
                    zzczsVar.zza(context);
                    zzczsVar.zzb(zzfikVarZzA);
                    zzcugVarZzi.zzl(zzczsVar.zze());
                    zzdgj zzdgjVar = new zzdgj();
                    zzeqp zzeqpVar = this.zzd;
                    Executor executor = this.zzb;
                    zzdgjVar.zzm(zzeqpVar, executor);
                    zzdgjVar.zze(zzeqpVar, executor);
                    zzcugVarZzi.zzm(zzdgjVar.zzn());
                    zzcugVarZzi.zzk(new zzeow(this.zzg));
                    zzcugVarZzi.zzd(new zzdlq(zzdnw.zza, null));
                    zzcugVarZzi.zzg(new zzcvc(this.zzh, this.zzj));
                    zzcugVarZzi.zze(new zzcsz(this.zzf));
                    zzcuhVarZza = zzcugVarZzi.zzh();
                } else {
                    zzcug zzcugVarZzi2 = this.zzc.zzi();
                    zzczs zzczsVar2 = new zzczs();
                    zzczsVar2.zza(context);
                    zzczsVar2.zzb(zzfikVarZzA);
                    zzcugVarZzi2.zzl(zzczsVar2.zze());
                    zzdgj zzdgjVar2 = new zzdgj();
                    zzeqp zzeqpVar2 = this.zzd;
                    Executor executor2 = this.zzb;
                    zzdgjVar2.zzm(zzeqpVar2, executor2);
                    zzdgjVar2.zzf(zzeqpVar2, executor2);
                    zzdgjVar2.zzf(this.zze, executor2);
                    zzdgjVar2.zzg(zzeqpVar2, executor2);
                    zzdgjVar2.zzh(zzeqpVar2, executor2);
                    zzdgjVar2.zza(zzeqpVar2, executor2);
                    zzdgjVar2.zzb(zzeqpVar2, executor2);
                    zzdgjVar2.zzc(zzeqpVar2, executor2);
                    zzdgjVar2.zze(zzeqpVar2, executor2);
                    zzdgjVar2.zzk(zzeqpVar2, executor2);
                    zzcugVarZzi2.zzm(zzdgjVar2.zzn());
                    zzcugVarZzi2.zzk(new zzeow(this.zzg));
                    zzcugVarZzi2.zzd(new zzdlq(zzdnw.zza, null));
                    zzcugVarZzi2.zzg(new zzcvc(this.zzh, this.zzj));
                    zzcugVarZzi2.zze(new zzcsz(this.zzf));
                    zzcuhVarZza = zzcugVarZzi2.zzh();
                }
                if (((Boolean) zzbid.zzc.zze()).booleanValue()) {
                    zzfnoVarZze = zzcuhVarZza.zze();
                    zzfnoVarZze.zzi(3);
                    zzfnoVarZze.zzc(zzmVar.zzp);
                    zzfnoVarZze.zzd(zzmVar.zzm);
                }
                this.zzo = zzereVar;
                zzcwo zzcwoVarZzc = zzcuhVarZza.zzc();
                ListenableFuture listenableFutureZzc = zzcwoVarZzc.zzc(zzcwoVarZzc.zzb());
                this.zzl = listenableFutureZzc;
                zzgym.zzr(listenableFutureZzc, new zzfeb(this, zzfnoVarZze, zzfneVarZzo, zzcuhVarZza), this.zzb);
                return true;
            }
            zzeqp zzeqpVar3 = this.zzd;
            if (zzeqpVar3 != null) {
                zzeqpVar3.zzdI(zzfjm.zzd(7, null, null));
            }
        } else if (!this.zzk.zzB()) {
            this.zzm = true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzerf
    public final boolean zzb() {
        ListenableFuture listenableFuture = this.zzl;
        return (listenableFuture == null || listenableFuture.isDone()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzc() {
        synchronized (this) {
            try {
                ListenableFuture listenableFuture = this.zzl;
                if (listenableFuture != null && listenableFuture.isDone()) {
                    try {
                        zzctc zzctcVar = (zzctc) this.zzl.get();
                        this.zzl = null;
                        ViewGroup viewGroup = this.zzf;
                        viewGroup.removeAllViews();
                        zzctcVar.zza();
                        ViewParent parent = zzctcVar.zza().getParent();
                        if (parent instanceof ViewGroup) {
                            String strZze = zzctcVar.zzn() != null ? zzctcVar.zzn().zze() : "";
                            StringBuilder sb = new StringBuilder(String.valueOf(strZze).length() + 78);
                            sb.append("Banner view provided from ");
                            sb.append(strZze);
                            sb.append(" already has a parent view. Removing its old parent.");
                            String string = sb.toString();
                            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi(string);
                            ((ViewGroup) parent).removeView(zzctcVar.zza());
                        }
                        zzbgb zzbgbVar = zzbgk.zzjr;
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).booleanValue()) {
                            zzdea zzdeaVarZzq = zzctcVar.zzq();
                            zzdeaVarZzq.zza(this.zzd);
                            zzdeaVarZzq.zzb(this.zze);
                        }
                        viewGroup.addView(zzctcVar.zza());
                        zzere zzereVar = this.zzo;
                        if (zzereVar != null) {
                            zzereVar.zzb(zzctcVar);
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).booleanValue()) {
                            Executor executor = this.zzb;
                            final zzeqp zzeqpVar = this.zzd;
                            Objects.requireNonNull(zzeqpVar);
                            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfee
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    zzeqpVar.zzg();
                                }
                            });
                        }
                        if (zzctcVar.zzh() >= 0) {
                            this.zzm = false;
                            zzddl zzddlVar = this.zzh;
                            zzddlVar.zzd(zzctcVar.zzh());
                            zzddlVar.zze(zzctcVar.zzg());
                        } else {
                            this.zzm = true;
                            this.zzh.zzd(zzctcVar.zzg());
                        }
                    } catch (InterruptedException e2) {
                        e = e2;
                        zzn();
                        com.google.android.gms.ads.internal.util.zze.zzb("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.zzm = true;
                        this.zzh.zzc();
                    } catch (ExecutionException e3) {
                        e = e3;
                        zzn();
                        com.google.android.gms.ads.internal.util.zze.zzb("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.zzm = true;
                        this.zzh.zzc();
                    }
                } else if (this.zzl != null) {
                    com.google.android.gms.ads.internal.util.zze.zza("Show timer went off but there is an ongoing ad request.");
                    this.zzm = true;
                } else {
                    com.google.android.gms.ads.internal.util.zze.zza("No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad.");
                    this.zzm = true;
                    this.zzh.zzc();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ViewGroup zzd() {
        return this.zzf;
    }

    public final void zze(zzbhf zzbhfVar) {
        this.zzg = zzbhfVar;
    }

    public final void zzf(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zze.zza(zzbhVar);
    }

    public final zzfij zzg() {
        return this.zzk;
    }

    public final boolean zzh() {
        Object parent = this.zzf.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        com.google.android.gms.ads.internal.zzt.zzc();
        return com.google.android.gms.ads.internal.util.zzs.zzad(view, view.getContext());
    }

    public final void zzi(zzddg zzddgVar) {
        this.zzh.zzq(zzddgVar, this.zzb);
    }

    public final void zzj() {
        this.zzh.zzd(this.zzj.zzc());
    }

    public final void zzk() {
        this.zzh.zze(this.zzj.zzd());
    }

    public final /* synthetic */ void zzl() {
        this.zzd.zzdI(zzfjm.zzd(6, null, null));
    }

    public final /* synthetic */ void zzm(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzd.zzdI(zzeVar);
    }

    public final /* synthetic */ zzddl zzo() {
        return this.zzh;
    }

    public final /* synthetic */ zzfnr zzp() {
        return this.zzi;
    }

    public final /* synthetic */ zzdfq zzq() {
        return this.zzj;
    }

    public final /* synthetic */ boolean zzr() {
        return this.zzm;
    }

    public final /* synthetic */ void zzs(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzn = zzeVar;
    }
}
