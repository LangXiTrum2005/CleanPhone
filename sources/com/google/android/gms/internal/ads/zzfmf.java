package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfmf {
    public static final zzfml zza(ListenableFuture listenableFuture, Object obj, zzfmm zzfmmVar) {
        return new zzfml(zzfmmVar, obj, null, zzfmm.zza, Collections.EMPTY_LIST, listenableFuture, null);
    }

    public static final zzfml zzb(Callable callable, Object obj, zzfmm zzfmmVar) {
        return zzc(callable, zzfmmVar.zze(), obj, zzfmmVar);
    }

    public static final zzfml zzc(Callable callable, zzgyw zzgywVar, Object obj, zzfmm zzfmmVar) {
        return new zzfml(zzfmmVar, obj, null, zzfmm.zza, Collections.EMPTY_LIST, zzgywVar.submit(callable), null);
    }

    public static final zzfml zzd(final zzfma zzfmaVar, zzgyw zzgywVar, Object obj, zzfmm zzfmmVar) {
        return zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfme
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() throws Exception {
                zzfmaVar.zza();
                return null;
            }
        }, zzgywVar, obj, zzfmmVar);
    }
}
