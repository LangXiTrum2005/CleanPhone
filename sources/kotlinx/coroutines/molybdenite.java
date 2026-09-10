package kotlinx.coroutines;

import p002kotlin.Metadata;

/* JADX INFO: compiled from: CancellableContinuationImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/molybdenite;", "Lkotlinx/coroutines/unconsolidated;", "Lkotlinx/coroutines/kowloon;", "child", "<init>", "(Lkotlinx/coroutines/kowloon;)V", "", "cause", "", "gintrap", "(Ljava/lang/Throwable;)V", "molybdenite", "Lkotlinx/coroutines/kowloon;", "", "dovishness", "()Z", "onCancelling", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class molybdenite extends unconsolidated {

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public final kowloon<?> child;

    public molybdenite(kowloon<?> kowloonVar) {
        this.child = kowloonVar;
    }

    @Override // kotlinx.coroutines.unconsolidated
    public boolean dovishness() {
        return true;
    }

    @Override // kotlinx.coroutines.unconsolidated
    public void gintrap(Throwable cause) {
        kowloon<?> kowloonVar = this.child;
        kowloonVar.saran(kowloonVar.preprohormone(adultoid()));
    }
}
