package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class hy0 extends ps1 implements Queue, Collection {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final LinkedList f15425u;

    public hy0() {
        super(27);
        this.f15425u = new LinkedList();
    }

    @Override // java.util.Queue, java.util.Collection
    public final boolean add(Object obj) {
        cy0 cy0Var = (cy0) obj;
        int i10 = cy0Var.f13310f;
        LinkedList linkedList = this.f15425u;
        if (i10 != 3) {
            linkedList.add(cy0Var);
            return true;
        }
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            cy0 cy0Var2 = (cy0) listIterator.next();
            if (cy0Var2.f13310f == 3) {
                double d10 = cy0Var2.f13309e;
                double d11 = cy0Var.f13309e;
                if (d10 < d11 || (d10 == d11 && cy0Var2.a() > cy0Var.a())) {
                    listIterator.set(cy0Var);
                    cy0Var = cy0Var2;
                }
            }
        }
        linkedList.add(cy0Var);
        return true;
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        return this.f15425u.addAll(collection);
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f15425u.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f15425u.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f15425u.containsAll(collection);
    }

    @Override // java.util.Queue
    public final Object element() {
        return this.f15425u.element();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f15425u.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f15425u.iterator();
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        return this.f15425u.offer(obj);
    }

    @Override // java.util.Queue
    public final Object peek() {
        return this.f15425u.peek();
    }

    @Override // java.util.Queue
    public final Object poll() {
        return this.f15425u.poll();
    }

    @Override // java.util.Queue
    public final Object remove() {
        return this.f15425u.remove();
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f15425u.removeAll(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f15425u.retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f15425u.size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return this.f15425u.toArray();
    }

    @Override // com.google.android.gms.internal.ads.ps1
    public final /* synthetic */ Object z() {
        return this.f15425u;
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return this.f15425u.remove(obj);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f15425u.toArray(objArr);
    }
}
