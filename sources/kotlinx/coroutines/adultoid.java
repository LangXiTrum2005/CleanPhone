package kotlinx.coroutines;

import p002kotlin.Metadata;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/adultoid;", "Lkotlinx/coroutines/unconsolidated;", "Lkotlinx/coroutines/graveside;", "Lkotlinx/coroutines/dovishness;", "childJob", "<init>", "(Lkotlinx/coroutines/dovishness;)V", "", "cause", "", "gintrap", "(Ljava/lang/Throwable;)V", "", "dern", "(Ljava/lang/Throwable;)Z", "molybdenite", "Lkotlinx/coroutines/dovishness;", "Lkotlinx/coroutines/monroe;", "getParent", "()Lkotlinx/coroutines/monroe;", "parent", "dovishness", "()Z", "onCancelling", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class adultoid extends unconsolidated implements graveside {

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public final dovishness childJob;

    public adultoid(dovishness dovishnessVar) {
        this.childJob = dovishnessVar;
    }

    @Override // kotlinx.coroutines.graveside
    public boolean dern(Throwable cause) {
        return adultoid().hydrovane(cause);
    }

    @Override // kotlinx.coroutines.unconsolidated
    public boolean dovishness() {
        return true;
    }

    @Override // kotlinx.coroutines.graveside
    public monroe getParent() {
        return adultoid();
    }

    @Override // kotlinx.coroutines.unconsolidated
    public void gintrap(Throwable cause) {
        this.childJob.cuirassed(adultoid());
    }
}
