package com.applovin.shadow.okhttp3.internal.concurrent;

import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.google.android.gms.ads.RequestConfiguration;
import com.unity3d.services.UnityAdsConstants;
import defpackage.e;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Arrays;
import java.util.logging.Level;
import jk.a;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\u001a1\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0080\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a7\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/concurrent/Task;", "task", "Lcom/applovin/shadow/okhttp3/internal/concurrent/TaskQueue;", "queue", "Lkotlin/Function0;", "", "messageBlock", "Lwj/r;", "taskLog", "(Lcom/applovin/shadow/okhttp3/internal/concurrent/Task;Lcom/applovin/shadow/okhttp3/internal/concurrent/TaskQueue;Ljk/a;)V", "message", "log", "(Lcom/applovin/shadow/okhttp3/internal/concurrent/Task;Lcom/applovin/shadow/okhttp3/internal/concurrent/TaskQueue;Ljava/lang/String;)V", "", "ns", "formatDuration", "(J)Ljava/lang/String;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "block", "logElapsed", "(Lao/a;Lao/c;Ljk/a;)Ljava/lang/Object;", "okhttp"}, k = 2, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class TaskLoggerKt {
    public static final String formatDuration(long j10) {
        String strR;
        if (j10 <= -999500000) {
            strR = e.r(new StringBuilder(), (j10 - ((long) 500000000)) / ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS), " s ");
        } else if (j10 <= -999500) {
            strR = e.r(new StringBuilder(), (j10 - ((long) 500000)) / ((long) 1000000), " ms");
        } else if (j10 <= 0) {
            strR = e.r(new StringBuilder(), (j10 - ((long) UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE)) / ((long) 1000), " µs");
        } else if (j10 < 999500) {
            strR = e.r(new StringBuilder(), (j10 + ((long) UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE)) / ((long) 1000), " µs");
        } else {
            strR = j10 < 999500000 ? e.r(new StringBuilder(), (j10 + ((long) 500000)) / ((long) 1000000), " ms") : e.r(new StringBuilder(), (j10 + ((long) 500000000)) / ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS), " s ");
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{strR}, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void log(Task task, TaskQueue taskQueue, String str) {
        TaskRunner.INSTANCE.getLogger().fine(taskQueue.getName() + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + task.getName());
    }

    public static final <T> T logElapsed(Task task, TaskQueue queue, a block) {
        long jNanoTime;
        n.f(task, "task");
        n.f(queue, "queue");
        n.f(block, "block");
        boolean zIsLoggable = TaskRunner.INSTANCE.getLogger().isLoggable(Level.FINE);
        if (zIsLoggable) {
            jNanoTime = queue.getTaskRunner().getBackend().nanoTime();
            log(task, queue, "starting");
        } else {
            jNanoTime = -1;
        }
        try {
            T t10 = (T) block.invoke();
            if (zIsLoggable) {
                long jNanoTime2 = queue.getTaskRunner().getBackend().nanoTime() - jNanoTime;
                StringBuilder sb2 = new StringBuilder("finished run in ");
            }
            return t10;
        } finally {
            if (zIsLoggable) {
                log(task, queue, "failed a run in " + formatDuration(queue.getTaskRunner().getBackend().nanoTime() - jNanoTime));
            }
        }
    }

    public static final void taskLog(Task task, TaskQueue queue, a messageBlock) {
        n.f(task, "task");
        n.f(queue, "queue");
        n.f(messageBlock, "messageBlock");
        if (TaskRunner.INSTANCE.getLogger().isLoggable(Level.FINE)) {
            log(task, queue, (String) messageBlock.invoke());
        }
    }
}
