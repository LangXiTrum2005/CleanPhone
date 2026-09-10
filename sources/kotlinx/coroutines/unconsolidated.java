package kotlinx.coroutines;

import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lkotlinx/coroutines/unconsolidated;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/milliradian;", "Lkotlinx/coroutines/gusty;", "<init>", "()V", "", "attabal", "", "toString", "()Ljava/lang/String;", "", "cause", "gintrap", "(Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/JobSupport;", "polloi", "Lkotlinx/coroutines/JobSupport;", "adultoid", "()Lkotlinx/coroutines/JobSupport;", "rotuma", "(Lkotlinx/coroutines/JobSupport;)V", "job", "", "dovishness", "()Z", "onCancelling", "isActive", "Lkotlinx/coroutines/outmarry;", "saneness", "()Lkotlinx/coroutines/outmarry;", "list", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class unconsolidated extends LockFreeLinkedListNode implements milliradian, gusty {

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public JobSupport job;

    public final JobSupport adultoid() {
        JobSupport jobSupport = this.job;
        if (jobSupport != null) {
            return jobSupport;
        }
        Intrinsics.preprohormone("job");
        return null;
    }

    @Override // kotlinx.coroutines.milliradian
    public void attabal() {
        adultoid().herdbook(this);
    }

    public abstract boolean dovishness();

    public abstract void gintrap(Throwable cause);

    @Override // kotlinx.coroutines.gusty
    /* JADX INFO: renamed from: isActive */
    public boolean getIsActive() {
        return true;
    }

    public final void rotuma(JobSupport jobSupport) {
        this.job = jobSupport;
    }

    @Override // kotlinx.coroutines.gusty
    /* JADX INFO: renamed from: saneness */
    public outmarry getList() {
        return null;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public String toString() {
        return creditor.attabal(this) + '@' + creditor.saneness(this) + "[job@" + creditor.saneness(adultoid()) + ']';
    }
}
