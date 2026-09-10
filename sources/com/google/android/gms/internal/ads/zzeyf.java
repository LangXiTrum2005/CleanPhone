package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeyf implements zzezx {
    private final zzgyw zza;
    private final zzdyh zzb;

    public zzeyf(zzgyw zzgywVar, zzdyh zzdyhVar) {
        this.zza = zzgywVar;
        this.zzb = zzdyhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeye
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return 62;
    }

    public final /* synthetic */ zzeyg zzc() {
        return new zzeyg(this.zzb.zzb());
    }
}
