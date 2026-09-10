package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeme extends zzemg {
    private final zzclg zza;
    private final zzdlq zzb;
    private final zzczs zzc;
    private final zzdgk zzd;
    private final zzemr zze;
    private final zzejl zzf;

    public zzeme(zzclg zzclgVar, zzdlq zzdlqVar, zzczs zzczsVar, zzdgk zzdgkVar, zzemr zzemrVar, zzejl zzejlVar) {
        this.zza = zzclgVar;
        this.zzb = zzdlqVar;
        this.zzc = zzczsVar;
        this.zzd = zzdgkVar;
        this.zze = zzemrVar;
        this.zzf = zzejlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final ListenableFuture zzc(zzfik zzfikVar, Bundle bundle, zzfhr zzfhrVar, zzfic zzficVar) {
        zzczs zzczsVar = this.zzc;
        zzczsVar.zzb(zzfikVar);
        zzczsVar.zzc(bundle);
        zzczsVar.zzd(new zzczl(zzficVar, zzfhrVar, this.zze));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzet)).booleanValue()) {
            zzczsVar.zzg(this.zzf);
        }
        zzdlu zzdluVarZzo = this.zza.zzo();
        zzdluVarZzo.zzf(zzczsVar.zze());
        zzdluVarZzo.zzg(this.zzd);
        zzdluVarZzo.zze(this.zzb);
        zzdluVarZzo.zzd(new zzcsz(null));
        zzcwo zzcwoVarZza = zzdluVarZzo.zzh().zza();
        return zzcwoVarZza.zzc(zzcwoVarZza.zzb());
    }
}
