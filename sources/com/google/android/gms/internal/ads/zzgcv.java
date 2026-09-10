package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzgcv implements zzgxu {
    final /* synthetic */ zzgda zza;

    public zzgcv(zzgda zzgdaVar) {
        Objects.requireNonNull(zzgdaVar);
        this.zza = zzgdaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxu
    public final /* bridge */ /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        zzgct zzgctVar = (zzgct) obj;
        if (zzgctVar != null) {
            return zzgym.zza(zzgctVar);
        }
        zzgda zzgdaVar = this.zza;
        zzgdaVar.zza().zzb(51);
        return zzgdaVar.zzd(2);
    }
}
