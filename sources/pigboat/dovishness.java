package pigboat;

import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: LockFreeLinkedList.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lpigboat/dovishness;", "", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "ref", "<init>", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "", "toString", "()Ljava/lang/String;", "attabal", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class dovishness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final LockFreeLinkedListNode ref;

    public dovishness(LockFreeLinkedListNode lockFreeLinkedListNode) {
        this.ref = lockFreeLinkedListNode;
    }

    public String toString() {
        return "Removed[" + this.ref + ']';
    }
}
