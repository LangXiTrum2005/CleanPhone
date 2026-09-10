package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzeeq implements zzgxu {
    static final /* synthetic */ zzeeq zza = new zzeeq();

    private /* synthetic */ zzeeq() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxu
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        Throwable cause = (ExecutionException) obj;
        if (cause.getCause() != null) {
            cause = cause.getCause();
        }
        return zzgym.zzc(cause);
    }
}
