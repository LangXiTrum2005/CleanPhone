package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdsp {
    private final com.google.android.gms.ads.internal.zza zzb;
    private final Context zzc;
    private final zzdxe zzd;
    private final Executor zze;
    private final zzayq zzf;
    private final VersionInfoParcel zzg;
    private final zzehu zzi;
    private final zzfpi zzj;
    private final zzeif zzk;
    private final zzfio zzl;
    private ListenableFuture zzm;
    private final zzdsd zza = new zzdsd();
    private final zzboe zzh = new zzboe();

    public zzdsp(zzdsn zzdsnVar) {
        this.zzc = zzdsnVar.zzb();
        this.zze = zzdsnVar.zze();
        this.zzf = zzdsnVar.zzf();
        this.zzg = zzdsnVar.zzg();
        this.zzb = zzdsnVar.zza();
        this.zzi = zzdsnVar.zzd();
        this.zzj = zzdsnVar.zzh();
        this.zzd = zzdsnVar.zzc();
        this.zzk = zzdsnVar.zzi();
        this.zzl = zzdsnVar.zzj();
    }

    public final synchronized void zza() {
        String str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzeC);
        zzayq zzayqVar = this.zzf;
        com.google.android.gms.ads.internal.zza zzaVar = this.zzb;
        zzeif zzeifVar = this.zzk;
        ListenableFuture listenableFutureZzk = zzgym.zzk(zzcjh.zzb(this.zzc, this.zzg, str, zzayqVar, zzaVar, zzeifVar, this.zzl, this.zzd), new zzgpr() { // from class: com.google.android.gms.internal.ads.zzdsm
            @Override // com.google.android.gms.internal.ads.zzgpr
            public final /* synthetic */ Object apply(Object obj) {
                zzcir zzcirVar = (zzcir) obj;
                this.zza.zzi(zzcirVar);
                return zzcirVar;
            }
        }, this.zze);
        this.zzm = listenableFutureZzk;
        zzcdr.zza(listenableFutureZzk, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void zzb() {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return;
        }
        zzgym.zzr(listenableFuture, new zzdse(this), this.zze);
        this.zzm = null;
    }

    public final synchronized ListenableFuture zzc(final String str, final JSONObject jSONObject) {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return zzgym.zza(null);
        }
        return zzgym.zzj(listenableFuture, new zzgxu() { // from class: com.google.android.gms.internal.ads.zzdsl
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzj(str, jSONObject, (zzcir) obj);
            }
        }, this.zze);
    }

    public final synchronized void zzd(String str, zzbnn zzbnnVar) {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return;
        }
        zzgym.zzr(listenableFuture, new zzdsf(this, str, zzbnnVar), this.zze);
    }

    public final synchronized void zze(String str, zzbnn zzbnnVar) {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return;
        }
        zzgym.zzr(listenableFuture, new zzdsg(this, str, zzbnnVar), this.zze);
    }

    public final synchronized void zzf(String str, Map map) {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return;
        }
        zzgym.zzr(listenableFuture, new zzdsh(this, "sendMessageToNativeJs", map), this.zze);
    }

    public final synchronized void zzg(zzfhr zzfhrVar, zzfhu zzfhuVar, zzcra zzcraVar) {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return;
        }
        zzgym.zzr(listenableFuture, new zzdsi(this, zzfhrVar, zzfhuVar, zzcraVar), this.zze);
    }

    public final void zzh(WeakReference weakReference, String str, zzbnn zzbnnVar) {
        zzd(str, new zzdso(this, weakReference, str, zzbnnVar, null));
    }

    public final /* synthetic */ zzcir zzi(zzcir zzcirVar) {
        zzcirVar.zzab("/result", this.zzh);
        zzckp zzckpVarZzP = zzcirVar.zzP();
        com.google.android.gms.ads.internal.zzb zzbVar = new com.google.android.gms.ads.internal.zzb(this.zzc, null, null);
        zzehu zzehuVar = this.zzi;
        zzfpi zzfpiVar = this.zzj;
        zzdxe zzdxeVar = this.zzd;
        zzdsd zzdsdVar = this.zza;
        zzckpVarZzP.zzab(null, zzdsdVar, zzdsdVar, zzdsdVar, zzdsdVar, false, null, zzbVar, null, null, zzehuVar, zzfpiVar, zzdxeVar, null, null, null, null, null, null, null, null, null);
        return zzcirVar;
    }

    public final /* synthetic */ ListenableFuture zzj(String str, JSONObject jSONObject, zzcir zzcirVar) {
        return this.zzh.zzc(zzcirVar, str, jSONObject);
    }

    public final /* synthetic */ zzdsd zzk() {
        return this.zza;
    }

    public final /* synthetic */ zzdxe zzl() {
        return this.zzd;
    }

    public final /* synthetic */ zzehu zzm() {
        return this.zzi;
    }

    public final /* synthetic */ zzfpi zzn() {
        return this.zzj;
    }
}
