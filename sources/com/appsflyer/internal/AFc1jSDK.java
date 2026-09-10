package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/appsflyer/internal/AFc1jSDK;", "Ljava/util/concurrent/ThreadPoolExecutor;", "", "p0", "p1", "", "p2", "Ljava/util/concurrent/TimeUnit;", "p3", "Ljava/util/concurrent/BlockingQueue;", "Ljava/lang/Runnable;", "p4", "Ljava/util/Queue;", "p5", "<init>", "(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/Queue;)V", "", "", "afterExecute", "(Ljava/lang/Runnable;Ljava/lang/Throwable;)V", "getCurrencyIso4217Code", "()V", "getMonetizationNetwork", "Ljava/util/Queue;", "getMediationNetwork"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFc1jSDK extends ThreadPoolExecutor implements AutoCloseable {

    /* JADX INFO: renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    private final Queue<Runnable> getMediationNetwork;

    public /* synthetic */ AFc1jSDK(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue blockingQueue, Queue queue, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, j, timeUnit, blockingQueue, (i3 & 32) != 0 ? new ConcurrentLinkedQueue() : queue);
    }

    private final void getCurrencyIso4217Code() {
        synchronized (this) {
            try {
                int size = this.getMediationNetwork.size();
                for (int i = 0; i < size; i++) {
                    Runnable runnablePoll = this.getMediationNetwork.poll();
                    if (runnablePoll == null) {
                        break;
                    }
                    execute(runnablePoll);
                }
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(Queue queue, Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        Intrinsics.checkNotNullParameter(queue, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        Intrinsics.checkNotNullParameter(threadPoolExecutor, "");
        queue.add(runnable);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable p0, Throwable p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        super.afterExecute(p0, p1);
        Intrinsics.checkNotNullParameter(p0, "");
        if (p1 == null) {
            try {
                getCurrencyIso4217Code();
                return;
            } catch (Throwable th) {
                AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.AF_EXECUTOR, "Error while executing rejected tasks", th, true, true, true, false, 64, null);
                return;
            }
        }
        AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.AF_EXECUTOR, "Error while executing task: " + p0, p1, true, true, true, false, 64, null);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        demilitarize.impromptu.attabal(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFc1jSDK(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, final Queue<Runnable> queue) {
        super(i, i2, j, timeUnit, blockingQueue, new RejectedExecutionHandler() { // from class: com.appsflyer.internal.kowloon
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                AFc1jSDK.getMonetizationNetwork(queue, runnable, threadPoolExecutor);
            }
        });
        Intrinsics.checkNotNullParameter(timeUnit, "");
        Intrinsics.checkNotNullParameter(blockingQueue, "");
        Intrinsics.checkNotNullParameter(queue, "");
        this.getMediationNetwork = queue;
    }
}
