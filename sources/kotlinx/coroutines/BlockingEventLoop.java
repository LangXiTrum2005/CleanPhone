package kotlinx.coroutines;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/BlockingEventLoop;", "Lkotlinx/coroutines/EventLoopImplBase;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BlockingEventLoop extends EventLoopImplBase {
    public final Thread j0;

    public BlockingEventLoop(Thread thread) {
        this.j0 = thread;
    }

    @Override // kotlinx.coroutines.EventLoopImplPlatform
    /* JADX INFO: renamed from: u0, reason: from getter */
    public final Thread getJ0() {
        return this.j0;
    }
}
