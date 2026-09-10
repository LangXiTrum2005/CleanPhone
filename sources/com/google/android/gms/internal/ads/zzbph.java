package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbph implements zzgxu {
    final /* synthetic */ zzboz zza;

    public zzbph(zzbpl zzbplVar, zzboz zzbozVar) {
        this.zza = zzbozVar;
        Objects.requireNonNull(zzbplVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgxu
    public final /* bridge */ /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        zzcdt zzcdtVar = new zzcdt();
        ((zzbpf) obj).zze(this.zza, new zzbpg(this, zzcdtVar));
        return zzcdtVar;
    }
}
