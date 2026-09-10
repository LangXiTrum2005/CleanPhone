package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzewx implements zzezx {
    private final Context zza;
    private final zzgyw zzb;

    public zzewx(zzgyw zzgywVar, Context context) {
        this.zzb = zzgywVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        return this.zzb.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeww
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return 57;
    }

    public final /* synthetic */ zzewy zzc() {
        com.google.android.gms.ads.internal.zzt.zzc();
        return new zzewy(com.google.android.gms.ads.internal.util.zzs.zzw(this.zza));
    }
}
