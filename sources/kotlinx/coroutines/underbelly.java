package kotlinx.coroutines;

import com.ironsource.C3414a2;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J5\u0010'\u001a\b\u0012\u0002\b\u0003\u0018\u00010&*\u00020%2\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"Lkotlinx/coroutines/underbelly;", "Lkotlinx/coroutines/sensatory;", "Lkotlinx/coroutines/mathsort;", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "itchy", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "", "timeMillis", "Lkotlinx/coroutines/impassible;", "continuation", "monoploid", "(JLkotlinx/coroutines/impassible;)V", "Lkotlinx/coroutines/milliradian;", "merc", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/milliradian;", "close", "()V", "", "toString", "()Ljava/lang/String;", "", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/util/concurrent/ScheduledFuture;", "preterite", "(Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;J)Ljava/util/concurrent/ScheduledFuture;", "Ljava/util/concurrent/RejectedExecutionException;", "exception", "underbelly", "(Lkotlin/coroutines/CoroutineContext;Ljava/util/concurrent/RejectedExecutionException;)V", "Ljava/util/concurrent/Executor;", "czestochowa", "()Ljava/util/concurrent/Executor;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class underbelly extends sensatory implements mathsort {

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final Executor executor;

    public underbelly(Executor executor) {
        this.executor = executor;
        if (getExecutor() instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) getExecutor()).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executor = getExecutor();
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // kotlinx.coroutines.sensatory
    /* JADX INFO: renamed from: czestochowa, reason: from getter */
    public Executor getExecutor() {
        return this.executor;
    }

    public boolean equals(Object other) {
        return (other instanceof underbelly) && ((underbelly) other).getExecutor() == getExecutor();
    }

    public int hashCode() {
        return System.identityHashCode(getExecutor());
    }

    @Override // kotlinx.coroutines.merc
    public void itchy(CoroutineContext context, Runnable block) {
        try {
            Executor executor = getExecutor();
            dern.attabal();
            executor.execute(block);
        } catch (RejectedExecutionException e) {
            dern.attabal();
            underbelly(context, e);
            premeiotic.saneness().itchy(context, block);
        }
    }

    @Override // kotlinx.coroutines.mathsort
    public milliradian merc(long timeMillis, Runnable block, CoroutineContext context) {
        long j;
        Runnable runnable;
        CoroutineContext coroutineContext;
        Executor executor = getExecutor();
        ScheduledFuture<?> scheduledFuturePreterite = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            j = timeMillis;
            runnable = block;
            coroutineContext = context;
            scheduledFuturePreterite = preterite(scheduledExecutorService, runnable, coroutineContext, j);
        } else {
            j = timeMillis;
            runnable = block;
            coroutineContext = context;
        }
        return scheduledFuturePreterite != null ? new timberyard(scheduledFuturePreterite) : starveling.f32447dovishness.merc(j, runnable, coroutineContext);
    }

    @Override // kotlinx.coroutines.mathsort
    public void monoploid(long timeMillis, impassible<? super Unit> continuation) {
        long j;
        Executor executor = getExecutor();
        ScheduledFuture<?> scheduledFuturePreterite = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            j = timeMillis;
            scheduledFuturePreterite = preterite(scheduledExecutorService, new lampshade(this, continuation), continuation.getContext(), j);
        } else {
            j = timeMillis;
        }
        if (scheduledFuturePreterite != null) {
            monoploid.dern(continuation, new apical(scheduledFuturePreterite));
        } else {
            starveling.f32447dovishness.monoploid(j, continuation);
        }
    }

    public final ScheduledFuture<?> preterite(ScheduledExecutorService scheduledExecutorService, Runnable runnable, CoroutineContext coroutineContext, long j) {
        try {
            return scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            underbelly(coroutineContext, e);
            return null;
        }
    }

    @Override // kotlinx.coroutines.merc
    /* JADX INFO: renamed from: toString */
    public String getName() {
        return getExecutor().toString();
    }

    public final void underbelly(CoroutineContext context, RejectedExecutionException exception) {
        achondroplasia.dern(context, coi.attabal("The task was rejected", exception));
    }
}
