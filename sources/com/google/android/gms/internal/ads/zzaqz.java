package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final class zzaqz implements Executor {
    final /* synthetic */ Handler zza;

    public zzaqz(zzarb zzarbVar, Handler handler) {
        this.zza = handler;
        Objects.requireNonNull(zzarbVar);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.post(runnable);
    }
}
