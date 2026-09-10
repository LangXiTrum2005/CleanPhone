package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class jz implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16220a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f16221b = new AtomicInteger(1);

    public jz() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f16220a) {
            case 0:
                int andIncrement = this.f16221b.getAndIncrement();
                return new Thread(runnable, l1.d.k(new StringBuilder(String.valueOf(andIncrement).length() + 31), "AdWorker(SCION_TASK_EXECUTOR) #", andIncrement));
            default:
                int andIncrement2 = this.f16221b.getAndIncrement();
                return new Thread(runnable, l1.d.k(new StringBuilder(String.valueOf(andIncrement2).length() + 14), "AdWorker(NG) #", andIncrement2));
        }
    }

    public jz(kz kzVar) {
    }
}
