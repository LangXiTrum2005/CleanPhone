package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzete implements zzezx {
    private final Executor zza;
    private final zzcda zzb;

    public zzete(Executor executor, zzcda zzcdaVar) {
        this.zza = executor;
        this.zzb = zzcdaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdH)).booleanValue()) {
            return zzgym.zza(new zzetf(null));
        }
        zzcda zzcdaVar = this.zzb;
        return zzgym.zzk(zzcdaVar.zzq(), zzetd.zza, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return 10;
    }
}
