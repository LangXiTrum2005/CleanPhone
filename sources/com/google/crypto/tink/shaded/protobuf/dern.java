package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: AbstractProtobufList.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class dern<E> extends AbstractList<E> implements rotuma.taiyuan<E> {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public boolean f22192kowloon;

    public dern(boolean z) {
        this.f22192kowloon = z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection2) {
        saneness();
        return super.addAll(collection2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        saneness();
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
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.rotuma.taiyuan
    public boolean isModifiable() {
        return this.f22192kowloon;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.rotuma.taiyuan
    public final void makeImmutable() {
        if (this.f22192kowloon) {
            this.f22192kowloon = false;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public abstract E remove(int i);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        saneness();
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection2) {
        saneness();
        return super.removeAll(collection2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> collection2) {
        saneness();
        return super.retainAll(collection2);
    }

    public void saneness() {
        if (!this.f22192kowloon) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends E> collection2) {
        saneness();
        return super.addAll(i, collection2);
    }
}
