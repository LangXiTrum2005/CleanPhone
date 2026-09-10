package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class zzemh extends zzemg {
    private final zzclg zza;
    private final zzczs zzb;
    private final zzdgk zzc;
    private final zzemr zzd;
    private final zzejl zze;

    public zzemh(zzclg zzclgVar, zzczs zzczsVar, zzdgk zzdgkVar, zzemr zzemrVar, zzejl zzejlVar) {
        this.zza = zzclgVar;
        this.zzb = zzczsVar;
        this.zzc = zzdgkVar;
        this.zzd = zzemrVar;
        this.zze = zzejlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final ListenableFuture zzc(zzfik zzfikVar, Bundle bundle, zzfhr zzfhrVar, zzfic zzficVar) {
        zzczs zzczsVar = this.zzb;
        zzczsVar.zzb(zzfikVar);
        zzczsVar.zzc(bundle);
        zzczsVar.zzd(new zzczl(zzficVar, zzfhrVar, this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzet)).booleanValue()) {
            zzczsVar.zzg(this.zze);
        }
        zzcsp zzcspVarZzk = this.zza.zzk();
        zzcspVarZzk.zzd(zzczsVar.zze());
        zzcspVarZzk.zze(this.zzc);
        zzcwo zzcwoVarZza = zzcspVarZzk.zzh().zza();
        return zzcwoVarZza.zzc(zzcwoVarZza.zzb());
    }
}
