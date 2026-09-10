package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: EventLoop.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/lotta;", "Lkotlinx/coroutines/lerp;", "<init>", "()V", "", "hardpan", "", "now", "Lkotlinx/coroutines/nosophobia$dern;", "delayedTask", "claque", "(JLkotlinx/coroutines/nosophobia$dern;)V", "Ljava/lang/Thread;", "unconsolidated", "()Ljava/lang/Thread;", "thread", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class lotta extends lerp {
    public void claque(long now, nosophobia.dern delayedTask) {
        starveling.f32447dovishness.molet(now, delayedTask);
    }

    public final void hardpan() {
        Thread thread = getThread();
        if (Thread.currentThread() != thread) {
            dern.attabal();
            LockSupport.unpark(thread);
        }
    }

    /* JADX INFO: renamed from: unconsolidated */
    public abstract Thread getThread();
}
