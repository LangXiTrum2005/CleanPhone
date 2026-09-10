package com.google.android.gms.internal.ads;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ce1 extends AbstractOwnableSynchronizer implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final de1 f13144a;

    public final /* synthetic */ void a(Thread thread) {
        setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.f13144a.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
