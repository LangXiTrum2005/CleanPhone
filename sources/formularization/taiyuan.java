package formularization;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p002kotlin.Metadata;
import p002kotlin.coroutines.CoroutineContext;
import pigboat.preprohormone;

/* JADX INFO: compiled from: Semaphore.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00178\u0006¨\u0006\u001a"}, d2 = {"Lformularization/taiyuan;", "Lpigboat/preprohormone;", "", "id", "prev", "", "pointers", "<init>", "(JLformularization/taiyuan;I)V", "index", "", "cause", "Lkotlin/coroutines/CoroutineContext;", "context", "", "molybdenite", "(ILjava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V", "", "toString", "()Ljava/lang/String;", "polloi", "()I", "numberOfSlots", "Lkotlinx/atomicfu/AtomicArray;", "", "acquirers", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class taiyuan extends preprohormone<taiyuan> {

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f26520molybdenite;

    public taiyuan(long j, taiyuan taiyuanVar, int i) {
        super(j, taiyuanVar, i);
        this.f26520molybdenite = new AtomicReferenceArray(impromptu.f26512beachfront);
    }

    /* JADX INFO: renamed from: dovishness, reason: from getter */
    public final /* synthetic */ AtomicReferenceArray getF26520molybdenite() {
        return this.f26520molybdenite;
    }

    @Override // pigboat.preprohormone
    public void molybdenite(int index, Throwable cause, CoroutineContext context) {
        getF26520molybdenite().set(index, impromptu.f26514marial);
        graveside();
    }

    @Override // pigboat.preprohormone
    public int polloi() {
        return impromptu.f26512beachfront;
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.id + ", hashCode=" + hashCode() + ']';
    }
}
