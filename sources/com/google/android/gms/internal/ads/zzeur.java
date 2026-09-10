package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeur implements zzezx {
    private final zzgyw zza;
    private final zzduz zzb;
    private final String zzc;
    private final zzfik zzd;

    public zzeur(zzgyw zzgywVar, zzduz zzduzVar, zzfik zzfikVar, String str) {
        this.zza = zzgywVar;
        this.zzb = zzduzVar;
        this.zzd = zzfikVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeuq
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return 17;
    }

    public final /* synthetic */ zzeus zzc() {
        zzfik zzfikVar = this.zzd;
        zzduz zzduzVar = this.zzb;
        return new zzeus(zzduzVar.zzb(zzfikVar.zzg, this.zzc), zzduzVar.zzc());
    }
}
