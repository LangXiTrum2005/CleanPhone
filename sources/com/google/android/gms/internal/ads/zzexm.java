package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzexm implements zzezx {
    private final zzgyw zza;
    private final zzeak zzb;

    public zzexm(zzgyw zzgywVar, zzeak zzeakVar) {
        this.zza = zzgywVar;
        this.zzb = zzeakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzexl
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return 23;
    }

    public final /* synthetic */ zzexn zzc() {
        zzeak zzeakVar = this.zzb;
        return new zzexn(zzeakVar.zzg(), zzeakVar.zzd(), com.google.android.gms.ads.internal.zzt.zzo().zzk(), zzeakVar.zzq(), zzeakVar.zzm());
    }
}
