package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzemn extends zzemg {
    private final zzclg zza;
    private final zzczs zzb;
    private final zzdgk zzc;
    private final zzemr zzd;

    @Nullable
    private final zzfid zze;
    private final zzejl zzf;

    public zzemn(zzclg zzclgVar, zzczs zzczsVar, zzdgk zzdgkVar, @Nullable zzfid zzfidVar, zzemr zzemrVar, zzejl zzejlVar) {
        this.zza = zzclgVar;
        this.zzb = zzczsVar;
        this.zzc = zzdgkVar;
        this.zze = zzfidVar;
        this.zzd = zzemrVar;
        this.zzf = zzejlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemg
    public final ListenableFuture zzc(zzfik zzfikVar, Bundle bundle, zzfhr zzfhrVar, zzfic zzficVar) {
        zzfid zzfidVar;
        zzczs zzczsVar = this.zzb;
        zzczsVar.zzb(zzfikVar);
        zzczsVar.zzc(bundle);
        zzczsVar.zzd(new zzczl(zzficVar, zzfhrVar, this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzes)).booleanValue() && (zzfidVar = this.zze) != null) {
            zzczsVar.zzf(zzfidVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzet)).booleanValue()) {
            zzczsVar.zzg(this.zzf);
        }
        zzdti zzdtiVarZzp = this.zza.zzp();
        zzdtiVarZzp.zzd(zzczsVar.zze());
        zzdtiVarZzp.zze(this.zzc);
        zzcwo zzcwoVarZza = zzdtiVarZzp.zzh().zza();
        return zzcwoVarZza.zzc(zzcwoVarZza.zzb());
    }
}
