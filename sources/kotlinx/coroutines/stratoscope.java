package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: CompletionState.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u000b\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/stratoscope;", "", "", "cause", "", "handled", "<init>", "(Ljava/lang/Throwable;Z)V", "dern", "()Z", "", "toString", "()Ljava/lang/String;", "attabal", "Ljava/lang/Throwable;", "Lkotlinx/atomicfu/AtomicBoolean;", "_handled", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class stratoscope {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f32449saneness = AtomicIntegerFieldUpdater.newUpdater(stratoscope.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Throwable cause;

    public stratoscope(Throwable th, boolean z) {
        this.cause = th;
        this._handled$volatile = z ? 1 : 0;
    }

    public final boolean attabal() {
        return f32449saneness.get(this) == 1;
    }

    public final boolean dern() {
        return f32449saneness.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return creditor.attabal(this) + '[' + this.cause + ']';
    }

    public /* synthetic */ stratoscope(Throwable th, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i & 2) != 0 ? false : z);
    }
}
