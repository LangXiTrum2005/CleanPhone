package preprohormone;

import dovishness.beachfront;
import java.util.Iterator;
import p002kotlin.Metadata;
import p002kotlin.collections.cutely;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PersistentOrderedSetBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010 \u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001bR&\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020$0#8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lpreprohormone/dern;", "E", "Lkotlin/collections/cutely;", "Ldovishness/beachfront$attabal;", "Lpreprohormone/saneness;", "set", "<init>", "(Lpreprohormone/saneness;)V", "Ldovishness/beachfront;", "build", "()Ldovishness/beachfront;", "element", "", "contains", "(Ljava/lang/Object;)Z", "add", "remove", "", "clear", "()V", "", "iterator", "()Ljava/util/Iterator;", "kowloon", "Lpreprohormone/saneness;", "", "arytenoidectomy", "Ljava/lang/Object;", "saneness", "()Ljava/lang/Object;", "setFirstElement$runtime", "(Ljava/lang/Object;)V", "firstElement", "monoploid", "lastElement", "Lrotuma/beachfront;", "Lpreprohormone/attabal;", "polloi", "Lrotuma/beachfront;", "wireman", "()Lrotuma/beachfront;", "hashMapBuilder", "", "getSize", "()I", "size", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class dern<E> extends cutely<E> implements beachfront.attabal<E> {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public Object firstElement;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public saneness<E> set;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public Object lastElement;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final rotuma.beachfront<E, attabal> hashMapBuilder;

    public dern(saneness<E> sanenessVar) {
        this.set = sanenessVar;
        this.firstElement = sanenessVar.getFirstElement();
        this.lastElement = this.set.getLastElement();
        this.hashMapBuilder = this.set.beachfront().builder();
    }

    @Override // p002kotlin.collections.cutely, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E element) {
        if (this.hashMapBuilder.containsKey(element)) {
            return false;
        }
        if (isEmpty()) {
            this.firstElement = element;
            this.lastElement = element;
            this.hashMapBuilder.put(element, new attabal());
            return true;
        }
        attabal attabalVar = this.hashMapBuilder.get(this.lastElement);
        Intrinsics.beachfront(attabalVar);
        this.hashMapBuilder.put((E) this.lastElement, attabalVar.marial(element));
        this.hashMapBuilder.put(element, new attabal(this.lastElement));
        this.lastElement = element;
        return true;
    }

    @Override // dovishness.beachfront.attabal
    public beachfront<E> build() {
        saneness<E> sanenessVar;
        rotuma.wireman<E, attabal> wiremanVarCompetently = this.hashMapBuilder.competently();
        if (wiremanVarCompetently == this.set.beachfront()) {
            cord.attabal.attabal(this.firstElement == this.set.getFirstElement());
            cord.attabal.attabal(this.lastElement == this.set.getLastElement());
            sanenessVar = this.set;
        } else {
            sanenessVar = new saneness<>(this.firstElement, this.lastElement, wiremanVarCompetently);
        }
        this.set = sanenessVar;
        return sanenessVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.hashMapBuilder.clear();
        cord.dern dernVar = cord.dern.f24045attabal;
        this.firstElement = dernVar;
        this.lastElement = dernVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object element) {
        return this.hashMapBuilder.containsKey(element);
    }

    @Override // p002kotlin.collections.cutely
    public int getSize() {
        return this.hashMapBuilder.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return new marial(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object element) {
        attabal attabalVarRemove = this.hashMapBuilder.remove(element);
        if (attabalVarRemove == null) {
            return false;
        }
        if (attabalVarRemove.saneness()) {
            attabal attabalVar = this.hashMapBuilder.get(attabalVarRemove.getPrevious());
            Intrinsics.beachfront(attabalVar);
            this.hashMapBuilder.put((E) attabalVarRemove.getPrevious(), attabalVar.marial(attabalVarRemove.getNext()));
        } else {
            this.firstElement = attabalVarRemove.getNext();
        }
        if (!attabalVarRemove.attabal()) {
            this.lastElement = attabalVarRemove.getPrevious();
            return true;
        }
        attabal attabalVar2 = this.hashMapBuilder.get(attabalVarRemove.getNext());
        Intrinsics.beachfront(attabalVar2);
        this.hashMapBuilder.put((E) attabalVarRemove.getNext(), attabalVar2.beachfront(attabalVarRemove.getPrevious()));
        return true;
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final Object getFirstElement() {
        return this.firstElement;
    }

    public final rotuma.beachfront<E, attabal> wireman() {
        return this.hashMapBuilder;
    }
}
