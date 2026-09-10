package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
abstract class AbstractProtobufList<E> extends AbstractList<E> implements Internal.ProtobufList<E> {
    public boolean X;

    public AbstractProtobufList(boolean z2) {
        this.X = z2;
    }

    public final void a() {
        if (!this.X) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        a();
        return super.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        a();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        a();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i2 = 0; i2 < size; i2++) {
            if (!get(i2).equals(list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i2 = 0; i2 < size; i2++) {
            iHashCode = (iHashCode * 31) + get(i2).hashCode();
        }
        return iHashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList
    public boolean isModifiable() {
        return this.X;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList
    public final void makeImmutable() {
        if (this.X) {
            this.X = false;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i2) {
        a();
        return super.remove(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        a();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection collection) {
        a();
        return super.retainAll(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractList, java.util.List
    public Object set(int i2, Object obj) {
        a();
        return super.set(i2, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractList, java.util.List
    public void add(int i2, Object obj) {
        a();
        super.add(i2, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i2, Collection collection) {
        a();
        return super.addAll(i2, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        a();
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }
}
