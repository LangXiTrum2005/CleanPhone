package gold;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TaskQueue.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010!\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u0019R\"\u0010#\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001f\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\"R$\u0010)\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&\"\u0004\b'\u0010(R \u0010/\u001a\b\u0012\u0004\u0012\u00020\b0*8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\"\u00101\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010\u001f\u001a\u0004\b+\u0010\u0017\"\u0004\b0\u0010\"¨\u00062"}, d2 = {"Lgold/wireman;", "", "Lgold/marial;", "taskRunner", "", "name", "<init>", "(Lgold/marial;Ljava/lang/String;)V", "Lgold/attabal;", "task", "", "delayNanos", "", "taiyuan", "(Lgold/attabal;J)V", "", "recurrence", "apical", "(Lgold/attabal;JZ)Z", "attabal", "()V", "kowloon", "saneness", "()Z", "toString", "()Ljava/lang/String;", "Lgold/marial;", "impromptu", "()Lgold/marial;", "Ljava/lang/String;", "beachfront", "Z", "competently", "triweekly", "(Z)V", "shutdown", "dern", "Lgold/attabal;", "()Lgold/attabal;", "formularize", "(Lgold/attabal;)V", "activeTask", "", "wireman", "Ljava/util/List;", "marial", "()Ljava/util/List;", "futureTasks", "impassible", "cancelActiveTask", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final marial taskRunner;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public attabal activeTask;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public boolean cancelActiveTask;
    private final String name;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public boolean shutdown;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final List<attabal> futureTasks;

    public wireman(marial taskRunner, String name) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(name, "name");
        this.taskRunner = taskRunner;
        this.name = name;
        this.futureTasks = new ArrayList();
    }

    public static /* synthetic */ void cutely(wireman wiremanVar, attabal attabalVar, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        wiremanVar.taiyuan(attabalVar, j);
    }

    public final boolean apical(attabal task, long delayNanos, boolean recurrence) {
        Intrinsics.checkNotNullParameter(task, "task");
        task.marial(this);
        long jNanoTime = this.taskRunner.getBackend().nanoTime();
        long j = jNanoTime + delayNanos;
        int iIndexOf = this.futureTasks.indexOf(task);
        if (iIndexOf != -1) {
            if (task.getNextExecuteNanoTime() <= j) {
                if (marial.INSTANCE.attabal().isLoggable(Level.FINE)) {
                    saneness.dern(task, this, "already scheduled");
                }
                return false;
            }
            this.futureTasks.remove(iIndexOf);
        }
        task.competently(j);
        if (marial.INSTANCE.attabal().isLoggable(Level.FINE)) {
            saneness.dern(task, this, recurrence ? Intrinsics.arytenoidectomy("run again after ", saneness.saneness(j - jNanoTime)) : Intrinsics.arytenoidectomy("scheduled after ", saneness.saneness(j - jNanoTime)));
        }
        Iterator<attabal> it = this.futureTasks.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (it.next().getNextExecuteNanoTime() - jNanoTime > delayNanos) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.futureTasks.size();
        }
        this.futureTasks.add(size, task);
        return size == 0;
    }

    public final void attabal() {
        if (hereditist.wireman.f27721impromptu && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this.taskRunner) {
            try {
                if (saneness()) {
                    getTaskRunner().impromptu(this);
                }
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: beachfront, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: competently, reason: from getter */
    public final boolean getShutdown() {
        return this.shutdown;
    }

    /* JADX INFO: renamed from: dern, reason: from getter */
    public final attabal getActiveTask() {
        return this.activeTask;
    }

    public final void formularize(attabal attabalVar) {
        this.activeTask = attabalVar;
    }

    public final void impassible(boolean z) {
        this.cancelActiveTask = z;
    }

    /* JADX INFO: renamed from: impromptu, reason: from getter */
    public final marial getTaskRunner() {
        return this.taskRunner;
    }

    public final void kowloon() {
        if (hereditist.wireman.f27721impromptu && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this.taskRunner) {
            try {
                triweekly(true);
                if (saneness()) {
                    getTaskRunner().impromptu(this);
                }
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final List<attabal> marial() {
        return this.futureTasks;
    }

    public final boolean saneness() {
        attabal attabalVar = this.activeTask;
        if (attabalVar != null) {
            Intrinsics.beachfront(attabalVar);
            if (attabalVar.getCancelable()) {
                this.cancelActiveTask = true;
            }
        }
        int size = this.futureTasks.size() - 1;
        boolean z = false;
        if (size < 0) {
            return false;
        }
        while (true) {
            int i = size - 1;
            if (this.futureTasks.get(size).getCancelable()) {
                attabal attabalVar2 = this.futureTasks.get(size);
                if (marial.INSTANCE.attabal().isLoggable(Level.FINE)) {
                    saneness.dern(attabalVar2, this, "canceled");
                }
                this.futureTasks.remove(size);
                z = true;
            }
            if (i < 0) {
                return z;
            }
            size = i;
        }
    }

    public final void taiyuan(attabal task, long delayNanos) {
        Intrinsics.checkNotNullParameter(task, "task");
        synchronized (this.taskRunner) {
            if (!getShutdown()) {
                if (apical(task, delayNanos, false)) {
                    getTaskRunner().impromptu(this);
                }
                Unit unit = Unit.f29295attabal;
            } else if (task.getCancelable()) {
                if (marial.INSTANCE.attabal().isLoggable(Level.FINE)) {
                    saneness.dern(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (marial.INSTANCE.attabal().isLoggable(Level.FINE)) {
                    saneness.dern(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public String toString() {
        return this.name;
    }

    public final void triweekly(boolean z) {
        this.shutdown = z;
    }

    /* JADX INFO: renamed from: wireman, reason: from getter */
    public final boolean getCancelActiveTask() {
        return this.cancelActiveTask;
    }
}
