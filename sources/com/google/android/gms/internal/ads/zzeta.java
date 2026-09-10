package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeta implements zzezx {
    private final zzgyw zza;
    private final zzfik zzb;
    private final zzcdf zzc;

    public zzeta(zzgyw zzgywVar, zzfik zzfikVar, zzcdf zzcdfVar) {
        this.zza = zzgywVar;
        this.zzb = zzfikVar;
        this.zzc = zzcdfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzesz
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return 9;
    }

    public final /* synthetic */ zzetb zzc() {
        return new zzetb(this.zzb.zzk, this.zzc.zzl());
    }
}
