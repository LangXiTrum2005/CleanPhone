package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final class zzabe implements zzabf {
    final /* synthetic */ Executor zza;
    final /* synthetic */ zzdr zzb;

    public zzabe(Executor executor, zzdr zzdrVar) {
        this.zza = executor;
        this.zzb = zzdrVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.execute(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzabf
    public final void zza() {
        this.zzb.zza(this.zza);
    }
}
