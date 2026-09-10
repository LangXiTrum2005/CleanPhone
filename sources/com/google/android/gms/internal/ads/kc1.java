package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class kc1 extends mc1 {
    @Override // com.google.android.gms.internal.ads.mc1
    public final /* synthetic */ void s(Object obj) {
        l((ListenableFuture) obj);
    }

    @Override // com.google.android.gms.internal.ads.mc1
    public final Object t(Object obj, Throwable th2) {
        od1 od1Var = (od1) obj;
        ListenableFuture listenableFutureZza = od1Var.zza(th2);
        if (listenableFutureZza != null) {
            return listenableFutureZza;
        }
        throw new NullPointerException(dv.B("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", od1Var));
    }
}
