package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeml extends zzemg {
    private final zzclg zza;
    private final zzczs zzb;
    private final zzeow zzc;
    private final zzdgk zzd;
    private final zzemr zze;
    private final zzejl zzf;

    public zzeml(zzclg zzclgVar, zzczs zzczsVar, zzeow zzeowVar, zzdgk zzdgkVar, zzemr zzemrVar, zzejl zzejlVar) {
        this.zza = zzclgVar;
        this.zzb = zzczsVar;
        this.zzc = zzeowVar;
        this.zzd = zzdgkVar;
        this.zze = zzemrVar;
        this.zzf = zzejlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final ListenableFuture zzc(zzfik zzfikVar, Bundle bundle, zzfhr zzfhrVar, zzfic zzficVar) {
        zzczs zzczsVar = this.zzb;
        zzczsVar.zzb(zzfikVar);
        zzczsVar.zzc(bundle);
        zzczsVar.zzd(new zzczl(zzficVar, zzfhrVar, this.zze));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzet)).booleanValue()) {
            zzczsVar.zzg(this.zzf);
        }
        zzdky zzdkyVarZzm = this.zza.zzm();
        zzdkyVarZzm.zze(zzczsVar.zze());
        zzdkyVarZzm.zzf(this.zzd);
        zzdkyVarZzm.zzd(this.zzc);
        zzcwo zzcwoVarZzb = zzdkyVarZzm.zzh().zzb();
        return zzcwoVarZzb.zzc(zzcwoVarZzb.zzb());
    }
}
