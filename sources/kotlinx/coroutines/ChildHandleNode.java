package kotlinx.coroutines;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/ChildHandleNode;", "Lkotlinx/coroutines/JobNode;", "Lkotlinx/coroutines/ChildHandle;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ChildHandleNode extends JobNode implements ChildHandle {
    public final JobSupport f0;

    public ChildHandleNode(JobSupport jobSupport) {
        this.f0 = jobSupport;
    }

    @Override // kotlinx.coroutines.ChildHandle
    public final boolean a(Throwable th) {
        return j().M(th);
    }

    @Override // kotlinx.coroutines.JobNode
    public final boolean k() {
        return true;
    }

    @Override // kotlinx.coroutines.JobNode
    public final void l(Throwable th) {
        this.f0.E(j());
    }
}
