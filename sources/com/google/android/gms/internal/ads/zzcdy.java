package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzcdy implements zzgyj {
    final /* synthetic */ zzcea zza;

    public zzcdy(zzcea zzceaVar) {
        Objects.requireNonNull(zzceaVar);
        this.zza = zzceaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zza(Throwable th) {
        this.zza.zzj().set(-1);
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zzb(Object obj) {
        this.zza.zzj().set(1);
    }
}
