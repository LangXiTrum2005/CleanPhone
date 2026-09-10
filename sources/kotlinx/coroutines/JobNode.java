package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/JobNode;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/Incomplete;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class JobNode extends LockFreeLinkedListNode implements DisposableHandle, Incomplete {
    public JobSupport e0;

    @Override // kotlinx.coroutines.Incomplete
    /* JADX INFO: renamed from: b */
    public final NodeList getX() {
        return null;
    }

    @Override // kotlinx.coroutines.DisposableHandle
    public final void dispose() {
        JobSupport jobSupportJ = j();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = JobSupport.X;
            Object obj = atomicReferenceFieldUpdater.get(jobSupportJ);
            if (!(obj instanceof JobNode)) {
                if (!(obj instanceof Incomplete) || ((Incomplete) obj).getX() == null) {
                    return;
                }
                i();
                return;
            }
            if (obj != this) {
                return;
            }
            Empty empty = JobSupportKt.g;
            while (!atomicReferenceFieldUpdater.compareAndSet(jobSupportJ, obj, empty)) {
                if (atomicReferenceFieldUpdater.get(jobSupportJ) != obj) {
                }
            }
            return;
        }
    }

    public Job getParent() {
        return j();
    }

    @Override // kotlinx.coroutines.Incomplete
    /* JADX INFO: renamed from: isActive */
    public final boolean getX() {
        return true;
    }

    public final JobSupport j() {
        JobSupport jobSupport = this.e0;
        if (jobSupport != null) {
            return jobSupport;
        }
        Intrinsics.m("job");
        throw null;
    }

    public abstract boolean k();

    public abstract void l(Throwable th);

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public final String toString() {
        return getClass().getSimpleName() + '@' + DebugStringsKt.a(this) + "[job@" + DebugStringsKt.a(j()) + AbstractJsonLexerKt.END_LIST;
    }
}
