package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeun implements zzezx {
    private final zzgyw zza;

    public zzeun(zzgyw zzgywVar) {
        this.zza = zzgywVar;
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzeum
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzeuo(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzb());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return 55;
    }
}
