package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingCollection<E> extends ForwardingObject implements Collection<E> {
    public boolean add(Object obj) {
        return x().add(obj);
    }

    public boolean addAll(Collection collection) {
        return x().addAll(collection);
    }

    public void clear() {
        x().clear();
    }

    public boolean contains(Object obj) {
        return x().contains(obj);
    }

    public boolean containsAll(Collection collection) {
        return x().containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return x().isEmpty();
    }

    public Iterator iterator() {
        return x().iterator();
    }

    public boolean remove(Object obj) {
        return x().remove(obj);
    }

    public boolean removeAll(Collection collection) {
        return x().removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        return x().retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return x().size();
    }

    public Object[] toArray() {
        return x().toArray();
    }

    @Override // com.google.common.collect.ForwardingObject
    public abstract Collection x();

    public final Object[] y() {
        return toArray(new Object[size()]);
    }

    public final String z() {
        int size = size();
        CollectPreconditions.b(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        boolean z2 = true;
        for (E e2 : this) {
            if (!z2) {
                sb.append(", ");
            }
            if (e2 == this) {
                sb.append("(this Collection)");
            } else {
                sb.append(e2);
            }
            z2 = false;
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    public Object[] toArray(Object[] objArr) {
        return x().toArray(objArr);
    }
}
