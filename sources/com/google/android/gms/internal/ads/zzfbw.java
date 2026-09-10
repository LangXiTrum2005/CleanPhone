package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfbw implements zzezx {
    final zzgyw zza;
    final List zzb;

    public zzfbw(zzbfu zzbfuVar, zzgyw zzgywVar, List list) {
        this.zza = zzgywVar;
        this.zzb = list;
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfbv
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzfbx(this.zza.zzb);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return 48;
    }
}
