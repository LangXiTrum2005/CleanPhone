package preprohormone;

import p002kotlin.Metadata;

/* JADX INFO: compiled from: PersistentOrderedSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006B\u0013\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\f\u0010\nR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0015\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0017"}, d2 = {"Lpreprohormone/attabal;", "", "previous", "next", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "()V", "(Ljava/lang/Object;)V", "newNext", "marial", "(Ljava/lang/Object;)Lpreprohormone/attabal;", "newPrevious", "beachfront", "attabal", "Ljava/lang/Object;", "wireman", "()Ljava/lang/Object;", "saneness", "dern", "", "()Z", "hasNext", "hasPrevious", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Object previous;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final Object next;

    public attabal(Object obj, Object obj2) {
        this.previous = obj;
        this.next = obj2;
    }

    public final boolean attabal() {
        return this.next != cord.dern.f24045attabal;
    }

    public final attabal beachfront(Object newPrevious) {
        return new attabal(newPrevious, this.next);
    }

    /* JADX INFO: renamed from: dern, reason: from getter */
    public final Object getNext() {
        return this.next;
    }

    public final attabal marial(Object newNext) {
        return new attabal(this.previous, newNext);
    }

    public final boolean saneness() {
        return this.previous != cord.dern.f24045attabal;
    }

    /* JADX INFO: renamed from: wireman, reason: from getter */
    public final Object getPrevious() {
        return this.previous;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public attabal() {
        cord.dern dernVar = cord.dern.f24045attabal;
        this(dernVar, dernVar);
    }

    public attabal(Object obj) {
        this(obj, cord.dern.f24045attabal);
    }
}
