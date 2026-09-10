package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzeww implements zzeld {
    protected final zzcgx zza;
    private final Context zzb;
    private final Executor zzc;
    private final zzexm zzd;
    private final zzezf zze;
    private final VersionInfoParcel zzf;
    private final ViewGroup zzg;
    private final zzfhk zzh;
    private final zzfch zzi;

    @Nullable
    private AI zzj;

    public zzeww(Context context, Executor executor, zzcgx zzcgxVar, zzezf zzezfVar, zzexm zzexmVar, zzfch zzfchVar, VersionInfoParcel versionInfoParcel) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzcgxVar;
        this.zze = zzezfVar;
        this.zzd = zzexmVar;
        this.zzi = zzfchVar;
        this.zzf = versionInfoParcel;
        this.zzg = new FrameLayout(context);
        this.zzh = zzcgxVar.zzz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized zzcuy zzm(zzezd zzezdVar) {
        zzewu zzewuVar = (zzewu) zzezdVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzia)).booleanValue()) {
            zzcoj zzcojVar = new zzcoj(this.zzg);
            zzcva zzcvaVar = new zzcva();
            zzcvaVar.zzf(this.zzb);
            zzcvaVar.zzk(zzewuVar.zza);
            zzcvc zzcvcVarZzl = zzcvaVar.zzl();
            zzdbk zzdbkVar = new zzdbk();
            zzdbkVar.zzc(this.zzd, this.zzc);
            zzdbkVar.zzl(this.zzd, this.zzc);
            return zze(zzcojVar, zzcvcVarZzl, zzdbkVar.zzn());
        }
        zzexm zzexmVarZzi = zzexm.zzi(this.zzd);
        zzdbk zzdbkVar2 = new zzdbk();
        zzdbkVar2.zzb(zzexmVarZzi, this.zzc);
        zzdbkVar2.zzg(zzexmVarZzi, this.zzc);
        zzdbkVar2.zzh(zzexmVarZzi, this.zzc);
        zzdbkVar2.zzi(zzexmVarZzi, this.zzc);
        zzdbkVar2.zzc(zzexmVarZzi, this.zzc);
        zzdbkVar2.zzl(zzexmVarZzi, this.zzc);
        zzdbkVar2.zzm(zzexmVarZzi);
        zzcoj zzcojVar2 = new zzcoj(this.zzg);
        zzcva zzcvaVar2 = new zzcva();
        zzcvaVar2.zzf(this.zzb);
        zzcvaVar2.zzk(zzewuVar.zza);
        return zze(zzcojVar2, zzcvaVar2.zzl(), zzdbkVar2.zzn());
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final boolean zza() {
        AI ai = this.zzj;
        return (ai == null || ai.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final synchronized boolean zzb(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzelb zzelbVar, zzelc zzelcVar) throws RemoteException {
        zzfhh zzfhhVar;
        zzcnw zzcnwVar;
        try {
            if (!zzmVar.zzb()) {
                boolean z = ((Boolean) zzbej.zzd.zze()).booleanValue() && ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzla)).booleanValue();
                if (this.zzf.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzlb)).intValue() || !z) {
                    Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
                }
            }
            if (str == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Ad unit ID should not be null for app open ad.");
                this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzewq
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzk();
                    }
                });
                return false;
            }
            if (this.zzj != null) {
                return false;
            }
            if (!((Boolean) zzbee.zzc.zze()).booleanValue() || (zzcnwVar = (zzcnw) this.zze.zzd()) == null) {
                zzfhhVar = null;
            } else {
                zzfhh zzfhhVarZzh = zzcnwVar.zzh();
                zzfhhVarZzh.zzi(7);
                zzfhhVarZzh.zzb(zzmVar.zzp);
                zzfhhVarZzh.zzf(zzmVar.zzm);
                zzfhhVar = zzfhhVarZzh;
            }
            zzfdg.zza(this.zzb, zzmVar.zzf);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziN)).booleanValue() && zzmVar.zzf) {
                this.zza.zzl().zzo(true);
            }
            Bundle bundleZza = zzdrg.zza(new Pair(zzdre.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar.zzz)), new Pair(zzdre.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis())));
            zzfch zzfchVar = this.zzi;
            zzfchVar.zzt(str);
            zzfchVar.zzs(com.google.android.gms.ads.internal.client.zzs.zzb());
            zzfchVar.zzH(zzmVar);
            zzfchVar.zzA(bundleZza);
            Context context = this.zzb;
            zzfcj zzfcjVarZzJ = zzfchVar.zzJ();
            zzfgw zzfgwVarZzb = zzfgv.zzb(context, zzfhg.zzf(zzfcjVarZzJ), 7, zzmVar);
            zzewu zzewuVar = new zzewu(null);
            zzewuVar.zza = zzfcjVarZzJ;
            AI aiZzc = this.zze.zzc(new zzezg(zzewuVar, null), new zzeze() { // from class: com.google.android.gms.internal.ads.zzewr
                @Override // com.google.android.gms.internal.ads.zzeze
                public final zzcuy zza(zzezd zzezdVar) {
                    return this.zza.zzm(zzezdVar);
                }
            }, null);
            this.zzj = aiZzc;
            zzgch.zzr(aiZzc, new zzewt(this, zzelcVar, zzfhhVar, zzfgwVarZzb, zzewuVar), this.zzc);
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract zzcuy zze(zzcoj zzcojVar, zzcvc zzcvcVar, zzdbm zzdbmVar);

    public final /* synthetic */ void zzk() {
        this.zzd.zzdz(zzfdk.zzd(6, null, null));
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzy zzyVar) {
        this.zzi.zzu(zzyVar);
    }
}
