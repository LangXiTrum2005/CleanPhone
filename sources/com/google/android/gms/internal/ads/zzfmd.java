package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfmd {
    final /* synthetic */ zzfmm zza;
    private final Object zzb;
    private final List zzc;

    public /* synthetic */ zzfmd(zzfmm zzfmmVar, Object obj, List list, byte[] bArr) {
        Objects.requireNonNull(zzfmmVar);
        this.zza = zzfmmVar;
        this.zzb = obj;
        this.zzc = list;
    }

    public final zzfml zza(Callable callable) {
        List list = this.zzc;
        zzgyl zzgylVarZzp = zzgym.zzp(list);
        ListenableFuture listenableFutureZza = zzgylVarZzp.zza(zzfmc.zza, zzcdo.zzg);
        zzfmm zzfmmVar = this.zza;
        return new zzfml(zzfmmVar, this.zzb, null, listenableFutureZza, list, zzgylVarZzp.zza(callable, zzfmmVar.zze()), null);
    }
}
