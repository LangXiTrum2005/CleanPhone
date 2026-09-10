package gintrap;

import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: AbstractPersistentList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0003\b!\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\u00142\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lgintrap/dern;", "E", "Ldovishness/marial;", "Lkotlin/collections/wireman;", "<init>", "()V", "", "fromIndex", "toIndex", "Ldovishness/dern;", "subList", "(II)Ldovishness/dern;", "", "elements", "addAll", "(Ljava/util/Collection;)Ldovishness/marial;", "element", "remove", "(Ljava/lang/Object;)Ldovishness/marial;", "removeAll", "", "contains", "(Ljava/lang/Object;)Z", "containsAll", "(Ljava/util/Collection;)Z", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class dern<E> extends p002kotlin.collections.wireman<E> implements dovishness.marial<E> {
    public static final boolean marial(Collection collection2, Object obj) {
        return collection2.contains(obj);
    }

    @Override // java.util.Collection, java.util.List, dovishness.marial
    public dovishness.marial<E> addAll(Collection<? extends E> elements) {
        dovishness.marial.attabal<E> attabalVarBuilder = builder();
        attabalVarBuilder.addAll(elements);
        return attabalVarBuilder.build();
    }

    @Override // p002kotlin.collections.saneness, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return indexOf(element) != -1;
    }

    @Override // p002kotlin.collections.saneness, java.util.Collection, java.util.List
    public boolean containsAll(Collection<?> elements) {
        Collection<?> collection2 = elements;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // p002kotlin.collections.wireman, p002kotlin.collections.saneness, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator();
    }

    @Override // p002kotlin.collections.wireman, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List, dovishness.marial
    public dovishness.marial<E> remove(E element) {
        int iIndexOf = indexOf(element);
        return iIndexOf != -1 ? formularize(iIndexOf) : this;
    }

    @Override // java.util.Collection, java.util.List, dovishness.marial
    public dovishness.marial<E> removeAll(final Collection<? extends E> elements) {
        return timberyard(new Function1() { // from class: gintrap.saneness
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(dern.marial(elements, obj));
            }
        });
    }

    @Override // p002kotlin.collections.wireman, java.util.List, dovishness.dern
    public dovishness.dern<E> subList(int fromIndex, int toIndex) {
        return super.subList(fromIndex, toIndex);
    }
}
