package com.vungle.ads.internal.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NamedThreadFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\n \u000e*\u0004\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/vungle/ads/internal/executor/dern;", "Ljava/util/concurrent/ThreadFactory;", "", "name", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/Runnable;", "r", "Ljava/lang/Thread;", "newThread", "(Ljava/lang/Runnable;)Ljava/lang/Thread;", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "kotlin.jvm.PlatformType", "threadFactory", "Ljava/util/concurrent/ThreadFactory;", "Ljava/util/concurrent/atomic/AtomicInteger;", "atomicInteger", "Ljava/util/concurrent/atomic/AtomicInteger;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class dern implements ThreadFactory {
    private final AtomicInteger atomicInteger;
    private final String name;
    private final ThreadFactory threadFactory;

    public dern(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.threadFactory = Executors.defaultThreadFactory();
        this.atomicInteger = new AtomicInteger(0);
    }

    public final String getName() {
        return this.name;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable r) {
        Intrinsics.checkNotNullParameter(r, "r");
        Thread t = this.threadFactory.newThread(r);
        t.setName(this.name + "-th-" + this.atomicInteger.incrementAndGet());
        Intrinsics.checkNotNullExpressionValue(t, "t");
        return t;
    }
}
