package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class zzemj extends zzemg {
    private final zzclg zza;
    private final zzczs zzb;
    private final zzeow zzc;
    private final zzdgk zzd;
    private final zzdlq zze;
    private final zzddl zzf;
    private final ViewGroup zzg;
    private final zzdfq zzh;
    private final zzemr zzi;
    private final zzejl zzj;

    public zzemj(zzclg zzclgVar, zzczs zzczsVar, zzeow zzeowVar, zzdgk zzdgkVar, zzdlq zzdlqVar, zzddl zzddlVar, ViewGroup viewGroup, zzdfq zzdfqVar, zzemr zzemrVar, zzejl zzejlVar) {
        this.zza = zzclgVar;
        this.zzb = zzczsVar;
        this.zzc = zzeowVar;
        this.zzd = zzdgkVar;
        this.zze = zzdlqVar;
        this.zzf = zzddlVar;
        this.zzg = viewGroup;
        this.zzh = zzdfqVar;
        this.zzi = zzemrVar;
        this.zzj = zzejlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final ListenableFuture zzc(zzfik zzfikVar, Bundle bundle, zzfhr zzfhrVar, zzfic zzficVar) {
        zzczs zzczsVar = this.zzb;
        zzczsVar.zzb(zzfikVar);
        zzczsVar.zzc(bundle);
        zzczsVar.zzd(new zzczl(zzficVar, zzfhrVar, this.zzi));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzet)).booleanValue()) {
            zzczsVar.zzg(this.zzj);
        }
        zzcug zzcugVarZzi = this.zza.zzi();
        zzcugVarZzi.zzl(zzczsVar.zze());
        zzcugVarZzi.zzm(this.zzd);
        zzcugVarZzi.zzk(this.zzc);
        zzcugVarZzi.zzd(this.zze);
        zzcugVarZzi.zzg(new zzcvc(this.zzf, this.zzh));
        zzcugVarZzi.zze(new zzcsz(this.zzg));
        zzcwo zzcwoVarZzc = zzcugVarZzi.zzh().zzc();
        return zzcwoVarZzc.zzc(zzcwoVarZzc.zzb());
    }
}
