package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: CompletionState.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B%\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u000b\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/polloi;", "Lkotlinx/coroutines/stratoscope;", "Lwretchedly/dern;", "continuation", "", "cause", "", "handled", "<init>", "(Lwretchedly/dern;Ljava/lang/Throwable;Z)V", "marial", "()Z", "Lkotlinx/atomicfu/AtomicBoolean;", "_resumed", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class polloi extends stratoscope {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f32380dern = AtomicIntegerFieldUpdater.newUpdater(polloi.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public polloi(wretchedly.dern<?> dernVar, Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + dernVar + " was cancelled normally");
        }
        super(th, z);
    }

    public final boolean marial() {
        return f32380dern.compareAndSet(this, 0, 1);
    }
}
