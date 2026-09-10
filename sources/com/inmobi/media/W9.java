package com.inmobi.media;

import A.RunnableC0883c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class W9 extends Fa {
    public final Object g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ScheduledFuture f23321h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W9(Pa dao, E3 listener, Ka networkHandler) {
        super(dao, listener, networkHandler);
        Intrinsics.f(dao, "dao");
        Intrinsics.f(listener, "listener");
        Intrinsics.f(networkHandler, "networkHandler");
        this.g = new Object();
    }

    public final void a() {
        synchronized (this.g) {
            ScheduledFuture scheduledFuture = this.f23321h;
            if (scheduledFuture == null || scheduledFuture.isDone()) {
                long normal = this.f.getInterval().getNormal();
                if (normal <= 0) {
                    return;
                }
                this.f23321h = ((ScheduledThreadPoolExecutor) AbstractC3332z4.f24144b.getX()).scheduleWithFixedDelay(new RunnableC0883c(this, 9), 0L, normal, TimeUnit.SECONDS);
            }
        }
    }

    public final void b() {
        synchronized (this.g) {
            try {
                ScheduledFuture scheduledFuture = this.f23321h;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
                this.f23321h = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void a(W9 this$0) {
        Intrinsics.f(this$0, "this$0");
        if (this$0.d != Ca.STOPPED) {
            int normal = this$0.f.getMaxBatchSize().getNormal();
            this$0.f22822a.a("time_created < ?", new String[]{String.valueOf(System.currentTimeMillis() - (((long) this$0.f.getExpiry().getNormal()) * 1000))});
            ArrayList arrayListU = CollectionsKt.u(T1.a(this$0.f22822a, "priority = ? AND retryAfter <= ?", new String[]{"normal", String.valueOf(System.currentTimeMillis())}, null, null, "time_created ASC", Integer.valueOf(normal), 12));
            if (arrayListU.isEmpty() && T1.a(this$0.f22822a, "priority = ?", new String[]{"normal"}, 12) == 0) {
                Ca ca = Ca.PAUSED;
                if (this$0.a(ca)) {
                    this$0.d = ca;
                }
                synchronized (this$0.g) {
                    try {
                        ScheduledFuture scheduledFuture = this$0.f23321h;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        this$0.f23321h = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            Iterator it = arrayListU.iterator();
            while (it.hasNext()) {
                this$0.a((C3338za) it.next(), (ScheduledThreadPoolExecutor) AbstractC3332z4.f24144b.getX(), new V9(this$0));
            }
        }
    }
}
