package hydrosulfurous;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: WorkQueue.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0017\u001a\u00020\u00162\n\u0010\n\u001a\u00060\bj\u0002`\t2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u001f*\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\"\u0010\u001eJ!\u0010$\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\r¢\u0006\u0004\b$\u0010%J)\u0010&\u001a\u00020\u00162\n\u0010\n\u001a\u00060\bj\u0002`\t2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014¢\u0006\u0004\b&\u0010\u0018J\u000f\u0010'\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b'\u0010\u001eJ\u0015\u0010)\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u0019¢\u0006\u0004\b)\u0010*R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010,R\u0014\u00100\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b1\u0010/R\u0013\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004038\u0002X\u0082\u0004R\u000b\u00106\u001a\u0002058\u0002X\u0082\u0004R\u000b\u00107\u001a\u0002058\u0002X\u0082\u0004R\u000b\u00108\u001a\u0002058\u0002X\u0082\u0004¨\u00069"}, d2 = {"Lhydrosulfurous/apical;", "", "<init>", "()V", "Lhydrosulfurous/competently;", "task", "saneness", "(Lhydrosulfurous/competently;)Lhydrosulfurous/competently;", "", "Lkotlinx/coroutines/scheduling/StealingMode;", "stealingMode", "arytenoidectomy", "(I)Lhydrosulfurous/competently;", "", "onlyBlocking", "kowloon", "(Z)Lhydrosulfurous/competently;", "index", "monoploid", "(IZ)Lhydrosulfurous/competently;", "Lkotlin/jvm/internal/Ref$ObjectRef;", "stolenTaskRef", "", "molybdenite", "(ILkotlin/jvm/internal/Ref$ObjectRef;)J", "Lhydrosulfurous/dern;", "queue", "triweekly", "(Lhydrosulfurous/dern;)Z", "impassible", "()Lhydrosulfurous/competently;", "", "dern", "(Lhydrosulfurous/competently;)V", "apical", "fair", "attabal", "(Lhydrosulfurous/competently;Z)Lhydrosulfurous/competently;", "polloi", "formularize", "globalQueue", "cutely", "(Lhydrosulfurous/dern;)V", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "buffer", "marial", "()I", "bufferSize", "taiyuan", "size", "Lkotlinx/atomicfu/AtomicRef;", "lastScheduledTask", "Lkotlinx/atomicfu/AtomicInt;", "producerIndex", "consumerIndex", "blockingTasksInBuffer", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class apical {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final AtomicReferenceArray<competently> buffer = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f28319saneness = AtomicReferenceFieldUpdater.newUpdater(apical.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f28317dern = AtomicIntegerFieldUpdater.newUpdater(apical.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f28320wireman = AtomicIntegerFieldUpdater.newUpdater(apical.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f28318marial = AtomicIntegerFieldUpdater.newUpdater(apical.class, "blockingTasksInBuffer$volatile");

    public final competently apical() {
        competently competentlyVar = (competently) f28319saneness.getAndSet(this, null);
        return competentlyVar == null ? impassible() : competentlyVar;
    }

    public final competently arytenoidectomy(int stealingMode) {
        int i = f28320wireman.get(this);
        int i2 = f28317dern.get(this);
        boolean z = stealingMode == 1;
        while (i != i2) {
            if (z && f28318marial.get(this) == 0) {
                return null;
            }
            int i3 = i + 1;
            competently competentlyVarMonoploid = monoploid(i, z);
            if (competentlyVarMonoploid != null) {
                return competentlyVarMonoploid;
            }
            i = i3;
        }
        return null;
    }

    public final competently attabal(competently task, boolean fair) {
        if (fair) {
            return saneness(task);
        }
        competently competentlyVar = (competently) f28319saneness.getAndSet(this, task);
        if (competentlyVar == null) {
            return null;
        }
        return saneness(competentlyVar);
    }

    public final void cutely(dern globalQueue) {
        competently competentlyVar = (competently) f28319saneness.getAndSet(this, null);
        if (competentlyVar != null) {
            globalQueue.attabal(competentlyVar);
        }
        while (triweekly(globalQueue)) {
        }
    }

    public final void dern(competently competentlyVar) {
        if (competentlyVar == null || !competentlyVar.taskContext) {
            return;
        }
        f28318marial.decrementAndGet(this);
    }

    public final competently formularize() {
        return kowloon(true);
    }

    public final competently impassible() {
        competently andSet;
        while (true) {
            int i = f28320wireman.get(this);
            if (i - f28317dern.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (f28320wireman.compareAndSet(this, i, i + 1) && (andSet = this.buffer.getAndSet(i2, null)) != null) {
                dern(andSet);
                return andSet;
            }
        }
    }

    public final competently kowloon(boolean onlyBlocking) {
        competently competentlyVar;
        do {
            competentlyVar = (competently) f28319saneness.get(this);
            if (competentlyVar == null || competentlyVar.taskContext != onlyBlocking) {
                int i = f28320wireman.get(this);
                int i2 = f28317dern.get(this);
                while (i != i2) {
                    if (onlyBlocking && f28318marial.get(this) == 0) {
                        return null;
                    }
                    i2--;
                    competently competentlyVarMonoploid = monoploid(i2, onlyBlocking);
                    if (competentlyVarMonoploid != null) {
                        return competentlyVarMonoploid;
                    }
                }
                return null;
            }
        } while (!androidx.concurrent.futures.attabal.attabal(f28319saneness, this, competentlyVar, null));
        return competentlyVar;
    }

    public final int marial() {
        return f28317dern.get(this) - f28320wireman.get(this);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, hydrosulfurous.competently, java.lang.Object] */
    public final long molybdenite(int stealingMode, Ref$ObjectRef<competently> stolenTaskRef) {
        ?? r0;
        do {
            r0 = (competently) f28319saneness.get(this);
            if (r0 == 0) {
                return -2L;
            }
            if (((r0.taskContext ? 1 : 2) & stealingMode) == 0) {
                return -2L;
            }
            long jAttabal = taiyuan.f28335beachfront.attabal() - r0.submissionTime;
            long j = taiyuan.f28338saneness;
            if (jAttabal < j) {
                return j - jAttabal;
            }
        } while (!androidx.concurrent.futures.attabal.attabal(f28319saneness, this, r0, null));
        stolenTaskRef.element = r0;
        return -1L;
    }

    public final competently monoploid(int index, boolean onlyBlocking) {
        int i = index & 127;
        competently competentlyVar = this.buffer.get(i);
        if (competentlyVar == null || competentlyVar.taskContext != onlyBlocking || !kotlinx.coroutines.channels.taiyuan.attabal(this.buffer, i, competentlyVar, null)) {
            return null;
        }
        if (onlyBlocking) {
            f28318marial.decrementAndGet(this);
        }
        return competentlyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long polloi(int stealingMode, Ref$ObjectRef<competently> stolenTaskRef) {
        competently competentlyVarArytenoidectomy;
        T t;
        competently competentlyVarImpassible;
        if (stealingMode == 3) {
            competentlyVarImpassible = impassible();
        } else {
            competentlyVarArytenoidectomy = arytenoidectomy(stealingMode);
        }
        if (t == 0) {
            t = competentlyVarArytenoidectomy;
            t = competentlyVarImpassible;
            return molybdenite(stealingMode, stolenTaskRef);
        }
        t = competentlyVarArytenoidectomy;
        t = competentlyVarImpassible;
        stolenTaskRef.element = t;
        return -1L;
    }

    public final competently saneness(competently task) {
        if (marial() == 127) {
            return task;
        }
        if (task.taskContext) {
            f28318marial.incrementAndGet(this);
        }
        int i = f28317dern.get(this) & 127;
        while (this.buffer.get(i) != null) {
            Thread.yield();
        }
        this.buffer.lazySet(i, task);
        f28317dern.incrementAndGet(this);
        return null;
    }

    public final int taiyuan() {
        return f28319saneness.get(this) != null ? marial() + 1 : marial();
    }

    public final boolean triweekly(dern queue) {
        competently competentlyVarImpassible = impassible();
        if (competentlyVarImpassible == null) {
            return false;
        }
        queue.attabal(competentlyVarImpassible);
        return true;
    }
}
