package kotlinx.coroutines;

import p002kotlin.Metadata;

/* JADX INFO: compiled from: EventLoop.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/competently;", "Lkotlinx/coroutines/nosophobia;", "Ljava/lang/Thread;", "thread", "<init>", "(Ljava/lang/Thread;)V", "dovishness", "Ljava/lang/Thread;", "unconsolidated", "()Ljava/lang/Thread;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class competently extends nosophobia {

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
    public final Thread thread;

    public competently(Thread thread) {
        this.thread = thread;
    }

    @Override // kotlinx.coroutines.lotta
    /* JADX INFO: renamed from: unconsolidated, reason: from getter */
    public Thread getThread() {
        return this.thread;
    }
}
