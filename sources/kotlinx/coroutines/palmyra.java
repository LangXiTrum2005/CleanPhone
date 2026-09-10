package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bR&\u0010\u0006\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000b\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/palmyra;", "Lkotlinx/coroutines/unconsolidated;", "Lkotlin/Function1;", "", "", "Lkotlinx/coroutines/CompletionHandler;", "handler", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "cause", "gintrap", "(Ljava/lang/Throwable;)V", "molybdenite", "Lkotlin/jvm/functions/Function1;", "", "dovishness", "()Z", "onCancelling", "Lkotlinx/atomicfu/AtomicBoolean;", "_invoked", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class palmyra extends unconsolidated {

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f32375graveside = AtomicIntegerFieldUpdater.newUpdater(palmyra.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public final Function1<Throwable, Unit> handler;

    /* JADX WARN: Multi-variable type inference failed */
    public palmyra(Function1<? super Throwable, Unit> function1) {
        this.handler = function1;
    }

    @Override // kotlinx.coroutines.unconsolidated
    public boolean dovishness() {
        return true;
    }

    @Override // kotlinx.coroutines.unconsolidated
    public void gintrap(Throwable cause) {
        if (f32375graveside.compareAndSet(this, 0, 1)) {
            this.handler.invoke(cause);
        }
    }
}
