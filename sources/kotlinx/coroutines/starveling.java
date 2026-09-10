package kotlinx.coroutines;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import p002kotlin.Metadata;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DefaultExecutor.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0005J+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\n2\n\u0010\u0012\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0005J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001c\u0010\u0005J\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0007H\u0002¢\u0006\u0004\b#\u0010\u0005R\u0014\u0010&\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001e\u0010'\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b'\u0010(\u0012\u0004\b)\u0010\u0005R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020\u001d8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u001fR\u0014\u00100\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\"R\u0014\u00102\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\"¨\u00063"}, d2 = {"Lkotlinx/coroutines/starveling;", "Lkotlinx/coroutines/nosophobia;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "<init>", "()V", "task", "", "dhss", "(Ljava/lang/Runnable;)V", "", "now", "Lkotlinx/coroutines/nosophobia$dern;", "delayedTask", "claque", "(JLkotlinx/coroutines/nosophobia$dern;)V", "shutdown", "timeMillis", "block", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/milliradian;", "merc", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/milliradian;", "run", "", "toString", "()Ljava/lang/String;", "cosy", "Ljava/lang/Thread;", "osteal", "()Ljava/lang/Thread;", "", "fastrack", "()Z", "prefect", "gintrap", "J", "KEEP_ALIVE_NANOS", "_thread", "Ljava/lang/Thread;", "get_thread$annotations", "", "debugStatus", "I", "unconsolidated", "thread", "licking", "isShutDown", "microchemistry", "isShutdownRequested", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class starveling extends nosophobia implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public static final starveling f32447dovishness;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name and from kotlin metadata */
    public static final long KEEP_ALIVE_NANOS;

    static {
        Long l;
        starveling starvelingVar = new starveling();
        f32447dovishness = starvelingVar;
        lerp.picketboat(starvelingVar, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        KEEP_ALIVE_NANOS = timeUnit.toNanos(l.longValue());
    }

    @Override // kotlinx.coroutines.lotta
    public void claque(long now, nosophobia.dern delayedTask) {
        cosy();
    }

    public final void cosy() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // kotlinx.coroutines.nosophobia
    public void dhss(Runnable task) {
        if (licking()) {
            cosy();
        }
        super.dhss(task);
    }

    public final synchronized boolean fastrack() {
        if (microchemistry()) {
            return false;
        }
        debugStatus = 1;
        Intrinsics.competently(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    public final boolean licking() {
        return debugStatus == 4;
    }

    @Override // kotlinx.coroutines.nosophobia, kotlinx.coroutines.mathsort
    public milliradian merc(long timeMillis, Runnable block, CoroutineContext context) {
        return immediately(timeMillis, block);
    }

    public final boolean microchemistry() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    public final synchronized Thread osteal() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setContextClassLoader(f32447dovishness.getClass().getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    public final synchronized void prefect() {
        if (microchemistry()) {
            debugStatus = 3;
            deadwork();
            Intrinsics.competently(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zLampshade;
        basify.f32112attabal.wireman(this);
        dern.attabal();
        try {
            if (!fastrack()) {
                if (zLampshade) {
                    return;
                } else {
                    return;
                }
            }
            long j = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jMonroe = monroe();
                if (jMonroe == Long.MAX_VALUE) {
                    dern.attabal();
                    long jNanoTime = System.nanoTime();
                    if (j == Long.MAX_VALUE) {
                        j = KEEP_ALIVE_NANOS + jNanoTime;
                    }
                    long j2 = j - jNanoTime;
                    if (j2 <= 0) {
                        if (zLampshade) {
                            return;
                        } else {
                            return;
                        }
                    }
                    jMonroe = p002kotlin.ranges.wireman.impromptu(jMonroe, j2);
                } else {
                    j = Long.MAX_VALUE;
                }
                if (jMonroe > 0) {
                    if (microchemistry()) {
                        if (zLampshade) {
                            return;
                        } else {
                            return;
                        }
                    } else {
                        dern.attabal();
                        LockSupport.parkNanos(this, jMonroe);
                    }
                }
            }
        } finally {
            _thread = null;
            prefect();
            dern.attabal();
            if (!lampshade()) {
                getThread();
            }
        }
    }

    @Override // kotlinx.coroutines.nosophobia, kotlinx.coroutines.lerp
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // kotlinx.coroutines.merc
    /* JADX INFO: renamed from: toString */
    public String getName() {
        return "DefaultExecutor";
    }

    @Override // kotlinx.coroutines.lotta
    /* JADX INFO: renamed from: unconsolidated */
    public Thread getThread() {
        Thread thread = _thread;
        return thread == null ? osteal() : thread;
    }
}
