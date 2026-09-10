package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfbs implements zzezx {
    public zzfbs(zzccp zzccpVar, zzgyw zzgywVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        final ListenableFuture listenableFutureZza = zzgym.zza(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgI)).booleanValue()) {
            listenableFutureZza = zzgym.zza(null);
        }
        final ListenableFuture listenableFutureZza2 = zzgym.zza(null);
        return zzgym.zzo(listenableFutureZza, listenableFutureZza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfbr
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzfbt((String) listenableFutureZza.get(), (String) listenableFutureZza2.get());
            }
        }, zzcdo.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return 47;
    }
}
