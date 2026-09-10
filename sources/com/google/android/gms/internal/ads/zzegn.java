package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzegn {
    private final zzegj zza;
    private final zzgyw zzb;

    public zzegn(zzegj zzegjVar, zzgyw zzgywVar) {
        this.zza = zzegjVar;
        this.zzb = zzgywVar;
    }

    public final void zza(zzflu zzfluVar) {
        final zzegj zzegjVar = this.zza;
        Objects.requireNonNull(zzegjVar);
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzegm
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzegjVar.getWritableDatabase();
            }
        };
        zzgyw zzgywVar = this.zzb;
        zzgym.zzr(zzgywVar.submit(callable), new zzegl(this, zzfluVar), zzgywVar);
    }
}
