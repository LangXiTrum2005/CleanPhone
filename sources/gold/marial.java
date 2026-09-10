package gold;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TaskRunner.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0003\u001a\u001f\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010#R\u0016\u0010&\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010%R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010(R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010(R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010,¨\u0006."}, d2 = {"Lgold/marial;", "", "Lgold/marial$attabal;", "backend", "<init>", "(Lgold/marial$attabal;)V", "Lgold/wireman;", "taskQueue", "", "impromptu", "(Lgold/wireman;)V", "Lgold/attabal;", "wireman", "()Lgold/attabal;", "taiyuan", "()Lgold/wireman;", "beachfront", "()V", "task", "marial", "(Lgold/attabal;)V", "cutely", "", "delayNanos", "dern", "(Lgold/attabal;J)V", "attabal", "Lgold/marial$attabal;", "competently", "()Lgold/marial$attabal;", "", "saneness", "I", "nextQueueName", "", "Z", "coordinatorWaiting", "J", "coordinatorWakeUpAt", "", "Ljava/util/List;", "busyQueues", "readyQueues", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "runnable", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class marial {

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static final Logger f27335cutely;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final marial f27337taiyuan = new marial(new dern(hereditist.wireman.saran(Intrinsics.arytenoidectomy(hereditist.wireman.f27724taiyuan, " TaskRunner"), true)));

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final attabal backend;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public final List<gold.wireman> readyQueues;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public final Runnable runnable;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public boolean coordinatorWaiting;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final List<gold.wireman> busyQueues;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public int nextQueueName;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public long coordinatorWakeUpAt;

    /* JADX INFO: compiled from: TaskRunner.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lgold/marial$attabal;", "", "", "nanoTime", "()J", "Lgold/marial;", "taskRunner", "", "saneness", "(Lgold/marial;)V", "nanos", "attabal", "(Lgold/marial;J)V", "Ljava/lang/Runnable;", "runnable", "execute", "(Ljava/lang/Runnable;)V", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface attabal {
        void attabal(marial taskRunner, long nanos);

        void execute(Runnable runnable);

        long nanoTime();

        void saneness(marial taskRunner);
    }

    /* JADX INFO: compiled from: TaskRunner.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016¨\u0006\u0018"}, d2 = {"Lgold/marial$dern;", "Lgold/marial$attabal;", "Ljava/util/concurrent/ThreadFactory;", "threadFactory", "<init>", "(Ljava/util/concurrent/ThreadFactory;)V", "", "nanoTime", "()J", "Lgold/marial;", "taskRunner", "", "saneness", "(Lgold/marial;)V", "nanos", "attabal", "(Lgold/marial;J)V", "Ljava/lang/Runnable;", "runnable", "execute", "(Ljava/lang/Runnable;)V", "Ljava/util/concurrent/ThreadPoolExecutor;", "Ljava/util/concurrent/ThreadPoolExecutor;", "executor", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class dern implements attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final ThreadPoolExecutor executor;

        public dern(ThreadFactory threadFactory) {
            Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
            this.executor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // gold.marial.attabal
        public void attabal(marial taskRunner, long nanos) throws InterruptedException {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            long j = nanos / 1000000;
            long j2 = nanos - (1000000 * j);
            if (j > 0 || nanos > 0) {
                taskRunner.wait(j, (int) j2);
            }
        }

        @Override // gold.marial.attabal
        public void execute(Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.executor.execute(runnable);
        }

        @Override // gold.marial.attabal
        public long nanoTime() {
            return System.nanoTime();
        }

        @Override // gold.marial.attabal
        public void saneness(marial taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            taskRunner.notify();
        }
    }

    /* JADX INFO: renamed from: gold.marial$saneness, reason: from kotlin metadata */
    /* JADX INFO: compiled from: TaskRunner.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lgold/marial$saneness;", "", "<init>", "()V", "Ljava/util/logging/Logger;", "logger", "Ljava/util/logging/Logger;", "attabal", "()Ljava/util/logging/Logger;", "Lgold/marial;", "INSTANCE", "Lgold/marial;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Logger attabal() {
            return marial.f27335cutely;
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: TaskRunner.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"gold/marial$wireman", "Ljava/lang/Runnable;", "", "run", "()V", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class wireman implements Runnable {
        public wireman() {
        }

        @Override // java.lang.Runnable
        public void run() {
            gold.attabal attabalVarWireman;
            long jNanoTime;
            while (true) {
                marial marialVar = marial.this;
                synchronized (marialVar) {
                    attabalVarWireman = marialVar.wireman();
                }
                if (attabalVarWireman == null) {
                    return;
                }
                gold.wireman queue = attabalVarWireman.getQueue();
                Intrinsics.beachfront(queue);
                marial marialVar2 = marial.this;
                boolean zIsLoggable = marial.INSTANCE.attabal().isLoggable(Level.FINE);
                if (zIsLoggable) {
                    jNanoTime = queue.getTaskRunner().getBackend().nanoTime();
                    saneness.dern(attabalVarWireman, queue, "starting");
                } else {
                    jNanoTime = -1;
                }
                try {
                    marialVar2.cutely(attabalVarWireman);
                    try {
                        Unit unit = Unit.f29295attabal;
                        if (zIsLoggable) {
                            saneness.dern(attabalVarWireman, queue, Intrinsics.arytenoidectomy("finished run in ", saneness.saneness(queue.getTaskRunner().getBackend().nanoTime() - jNanoTime)));
                        }
                    } catch (Throwable th) {
                        if (zIsLoggable) {
                            saneness.dern(attabalVarWireman, queue, Intrinsics.arytenoidectomy("failed a run in ", saneness.saneness(queue.getTaskRunner().getBackend().nanoTime() - jNanoTime)));
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    marialVar2.getBackend().execute(this);
                    throw th2;
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(marial.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(TaskRunner::class.java.name)");
        f27335cutely = logger;
    }

    public marial(attabal backend) {
        Intrinsics.checkNotNullParameter(backend, "backend");
        this.backend = backend;
        this.nextQueueName = 10000;
        this.busyQueues = new ArrayList();
        this.readyQueues = new ArrayList();
        this.runnable = new wireman();
    }

    public final void beachfront() {
        int size = this.busyQueues.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                this.busyQueues.get(size).saneness();
                if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
        int size2 = this.readyQueues.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i2 = size2 - 1;
            gold.wireman wiremanVar = this.readyQueues.get(size2);
            wiremanVar.saneness();
            if (wiremanVar.marial().isEmpty()) {
                this.readyQueues.remove(size2);
            }
            if (i2 < 0) {
                return;
            } else {
                size2 = i2;
            }
        }
    }

    /* JADX INFO: renamed from: competently, reason: from getter */
    public final attabal getBackend() {
        return this.backend;
    }

    public final void cutely(gold.attabal task) {
        if (hereditist.wireman.f27721impromptu && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(task.getName());
        try {
            long jBeachfront = task.beachfront();
            synchronized (this) {
                dern(task, jBeachfront);
                Unit unit = Unit.f29295attabal;
            }
        } finally {
            synchronized (this) {
                dern(task, -1L);
                Unit unit2 = Unit.f29295attabal;
                threadCurrentThread.setName(name);
            }
        }
    }

    public final void dern(gold.attabal task, long delayNanos) {
        if (hereditist.wireman.f27721impromptu && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        gold.wireman queue = task.getQueue();
        Intrinsics.beachfront(queue);
        if (queue.getActiveTask() != task) {
            throw new IllegalStateException("Check failed.");
        }
        boolean cancelActiveTask = queue.getCancelActiveTask();
        queue.impassible(false);
        queue.formularize(null);
        this.busyQueues.remove(queue);
        if (delayNanos != -1 && !cancelActiveTask && !queue.getShutdown()) {
            queue.apical(task, delayNanos, true);
        }
        if (queue.marial().isEmpty()) {
            return;
        }
        this.readyQueues.add(queue);
    }

    public final void impromptu(gold.wireman taskQueue) {
        Intrinsics.checkNotNullParameter(taskQueue, "taskQueue");
        if (hereditist.wireman.f27721impromptu && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        if (taskQueue.getActiveTask() == null) {
            if (taskQueue.marial().isEmpty()) {
                this.readyQueues.remove(taskQueue);
            } else {
                hereditist.wireman.dern(this.readyQueues, taskQueue);
            }
        }
        if (this.coordinatorWaiting) {
            this.backend.saneness(this);
        } else {
            this.backend.execute(this.runnable);
        }
    }

    public final void marial(gold.attabal task) {
        if (hereditist.wireman.f27721impromptu && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        task.competently(-1L);
        gold.wireman queue = task.getQueue();
        Intrinsics.beachfront(queue);
        queue.marial().remove(task);
        this.readyQueues.remove(queue);
        queue.formularize(task);
        this.busyQueues.add(queue);
    }

    public final gold.wireman taiyuan() {
        int i;
        synchronized (this) {
            i = this.nextQueueName;
            this.nextQueueName = i + 1;
        }
        return new gold.wireman(this, Intrinsics.arytenoidectomy("Q", Integer.valueOf(i)));
    }

    public final gold.attabal wireman() {
        boolean z;
        if (hereditist.wireman.f27721impromptu && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        while (!this.readyQueues.isEmpty()) {
            long jNanoTime = this.backend.nanoTime();
            Iterator<gold.wireman> it = this.readyQueues.iterator();
            long jMin = Long.MAX_VALUE;
            gold.attabal attabalVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                gold.attabal attabalVar2 = it.next().marial().get(0);
                long jMax = Math.max(0L, attabalVar2.getNextExecuteNanoTime() - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (attabalVar != null) {
                        z = true;
                        break;
                    }
                    attabalVar = attabalVar2;
                }
            }
            if (attabalVar != null) {
                marial(attabalVar);
                if (z || (!this.coordinatorWaiting && !this.readyQueues.isEmpty())) {
                    this.backend.execute(this.runnable);
                }
                return attabalVar;
            }
            if (this.coordinatorWaiting) {
                if (jMin < this.coordinatorWakeUpAt - jNanoTime) {
                    this.backend.saneness(this);
                }
                return null;
            }
            this.coordinatorWaiting = true;
            this.coordinatorWakeUpAt = jNanoTime + jMin;
            try {
                try {
                    this.backend.attabal(this, jMin);
                } catch (InterruptedException unused) {
                    beachfront();
                }
                this.coordinatorWaiting = false;
            } catch (Throwable th) {
                this.coordinatorWaiting = false;
                throw th;
            }
        }
        return null;
    }
}
