package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final class zzgxy extends zzgxz {
    final /* synthetic */ zzgya zza;
    private final Callable zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgxy(zzgya zzgyaVar, Callable callable, Executor executor) {
        super(zzgyaVar, executor);
        Objects.requireNonNull(zzgyaVar);
        this.zza = zzgyaVar;
        this.zzc = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final Object zza() throws Exception {
        return this.zzc.call();
    }

    @Override // com.google.android.gms.internal.ads.zzgxz
    public final void zzb(Object obj) {
        this.zza.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final String zzc() {
        return this.zzc.toString();
    }
}
