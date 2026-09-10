package preprohormone;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.rotuma;

/* JADX INFO: compiled from: PersistentOrderedSetMutableIterator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\nR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lpreprohormone/marial;", "E", "Lpreprohormone/wireman;", "", "Lpreprohormone/dern;", "builder", "<init>", "(Lpreprohormone/dern;)V", "", "competently", "()V", "beachfront", "next", "()Ljava/lang/Object;", "remove", "polloi", "Lpreprohormone/dern;", "molybdenite", "Ljava/lang/Object;", "lastIteratedElement", "", "graveside", "Z", "nextWasInvoked", "", "adultoid", "I", "expectedModCount", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class marial<E> extends wireman<E> implements Iterator<E>, unready.attabal {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    public int expectedModCount;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public boolean nextWasInvoked;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public E lastIteratedElement;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final dern<E> builder;

    public marial(dern<E> dernVar) {
        super(dernVar.getFirstElement(), dernVar.wireman());
        this.builder = dernVar;
        this.expectedModCount = dernVar.wireman().getModCount();
    }

    private final void beachfront() {
        if (this.builder.wireman().getModCount() != this.expectedModCount) {
            throw new ConcurrentModificationException();
        }
    }

    private final void competently() {
        if (!this.nextWasInvoked) {
            throw new IllegalStateException();
        }
    }

    @Override // preprohormone.wireman, java.util.Iterator
    public E next() {
        beachfront();
        E e = (E) super.next();
        this.lastIteratedElement = e;
        this.nextWasInvoked = true;
        return e;
    }

    @Override // preprohormone.wireman, java.util.Iterator
    public void remove() {
        competently();
        rotuma.attabal(this.builder).remove(this.lastIteratedElement);
        this.lastIteratedElement = null;
        this.nextWasInvoked = false;
        this.expectedModCount = this.builder.wireman().getModCount();
        marial(getIndex() - 1);
    }
}
