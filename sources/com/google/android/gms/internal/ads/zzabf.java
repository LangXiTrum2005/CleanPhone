package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public interface zzabf extends Executor {
    static zzabf zzb(Executor executor, zzdr zzdrVar) {
        return new zzabe(executor, zzdrVar);
    }

    void zza();
}
