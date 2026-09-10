package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgyl {
    private final boolean zza;
    private final zzgtd zzb;

    public /* synthetic */ zzgyl(boolean z2, zzgtd zzgtdVar, byte[] bArr) {
        this.zza = z2;
        this.zzb = zzgtdVar;
    }

    public final ListenableFuture zza(Callable callable, Executor executor) {
        return new zzgya(this.zzb, this.zza, executor, callable);
    }
}
