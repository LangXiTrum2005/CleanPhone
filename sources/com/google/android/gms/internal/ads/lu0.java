package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lu0 implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f17130b;

    public /* synthetic */ lu0(String str) {
        this.f17129a = 0;
        this.f17130b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i10 = this.f17129a;
        Object obj = this.f17130b;
        switch (i10) {
            case 0:
                String str = uu0.f20901a;
                return new Thread(runnable, (String) obj);
            default:
                Thread threadNewThread = ((ThreadFactory) obj).newThread(runnable);
                if (threadNewThread == null) {
                    throw new NullPointerException("Default ThreadFactory returned null thread");
                }
                threadNewThread.setName("punch".concat(String.valueOf(threadNewThread.getName())));
                return threadNewThread;
        }
    }

    public /* synthetic */ lu0() {
        this.f17129a = 1;
        this.f17130b = Executors.defaultThreadFactory();
    }
}
