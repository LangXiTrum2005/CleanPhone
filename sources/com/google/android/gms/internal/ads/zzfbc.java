package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfbc implements zzezx {
    private final Executor zza;
    private final String zzb;

    public zzfbc(zzccs zzccsVar, Executor executor, String str, PackageInfo packageInfo, int i2) {
        this.zza = executor;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        ListenableFuture listenableFutureZza = zzgym.zza(this.zzb);
        zzfbb zzfbbVar = zzfbb.zza;
        Executor executor = this.zza;
        return zzgym.zzh(zzgym.zzk(listenableFutureZza, zzfbbVar, executor), Throwable.class, new zzgxu() { // from class: com.google.android.gms.internal.ads.zzfba
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc((Throwable) obj);
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return 41;
    }

    public final /* synthetic */ ListenableFuture zzc(Throwable th) {
        return zzgym.zza(new zzfbd(this.zzb));
    }
}
