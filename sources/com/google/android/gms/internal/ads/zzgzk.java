package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
final class zzgzk extends zzgyt {
    final /* synthetic */ zzgzl zza;
    private final Callable zzb;

    public zzgzk(zzgzl zzgzlVar, Callable callable) {
        Objects.requireNonNull(zzgzlVar);
        this.zza = zzgzlVar;
        callable.getClass();
        this.zzb = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final Object zza() throws Exception {
        return this.zzb.call();
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final String zzc() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final boolean zzd() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final void zzf(Object obj) {
        this.zza.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgyt
    public final void zzg(Throwable th) {
        this.zza.zzb(th);
    }
}
