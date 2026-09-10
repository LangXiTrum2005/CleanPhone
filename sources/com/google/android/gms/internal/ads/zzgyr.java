package com.google.android.gms.internal.ads;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* JADX INFO: loaded from: classes4.dex */
final class zzgyr extends AbstractOwnableSynchronizer implements Runnable {
    private final zzgyt zza;

    @Override // java.lang.Runnable
    public final void run() {
    }

    public final String toString() {
        return this.zza.toString();
    }

    public final /* synthetic */ void zza(Thread thread) {
        setExclusiveOwnerThread(thread);
    }
}
