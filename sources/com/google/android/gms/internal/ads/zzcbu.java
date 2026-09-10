package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
final class zzcbu implements ThreadFactory {
    private final AtomicInteger zza;

    public zzcbu(zzcbw zzcbwVar) {
        Objects.requireNonNull(zzcbwVar);
        this.zza = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.zza.getAndIncrement();
        return new Thread(runnable, androidx.datastore.preferences.protobuf.a.g(andIncrement, "AdWorker(SCION_TASK_EXECUTOR) #", new StringBuilder(String.valueOf(andIncrement).length() + 31)));
    }
}
