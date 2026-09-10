package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class i91 extends AbstractCollection implements List {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15672a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Collection f15674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Collection f15675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractCollection f15676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Serializable f15677f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Serializable f15678g;

    public i91(ua1 ua1Var, Object obj, List list, i91 i91Var) {
        this.f15678g = ua1Var;
        this.f15677f = ua1Var;
        this.f15673b = obj;
        this.f15674c = list;
        this.f15676e = i91Var;
        this.f15675d = i91Var == null ? null : i91Var.f15674c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        switch (this.f15672a) {
            case 0:
                n();
                boolean zIsEmpty = this.f15674c.isEmpty();
                boolean zAdd = this.f15674c.add(obj);
                if (!zAdd) {
                    return zAdd;
                }
                ((ua1) this.f15677f).f20714e++;
                if (!zIsEmpty) {
                    return zAdd;
                }
                p();
                return true;
            default:
                h();
                boolean zIsEmpty2 = this.f15674c.isEmpty();
                boolean zAdd2 = this.f15674c.add(obj);
                if (zAdd2) {
                    ((oa.l) this.f15677f).f47271e++;
                    if (zIsEmpty2) {
                        b();
                    }
                }
                return zAdd2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        switch (this.f15672a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean zAddAll = this.f15674c.addAll(collection);
                if (zAddAll) {
                    int size2 = this.f15674c.size();
                    ((ua1) this.f15677f).f20714e += size2 - size;
                    if (size == 0) {
                        p();
                        return true;
                    }
                }
                return zAddAll;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                int size3 = size();
                boolean zAddAll2 = this.f15674c.addAll(collection);
                if (zAddAll2) {
                    int size4 = this.f15674c.size();
                    ((oa.l) this.f15677f).f47271e += size4 - size3;
                    if (size3 == 0) {
                        b();
                    }
                }
                return zAddAll2;
        }
    }

    public void b() {
        i91 i91Var = (i91) this.f15676e;
        if (i91Var != null) {
            i91Var.b();
        } else {
            ((oa.l) this.f15677f).f47270d.put(this.f15673b, this.f15674c);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        switch (this.f15672a) {
            case 0:
                int size = size();
                if (size != 0) {
                    this.f15674c.clear();
                    ((ua1) this.f15677f).f20714e -= size;
                    zzb();
                    break;
                }
                break;
            default:
                int size2 = size();
                if (size2 != 0) {
                    this.f15674c.clear();
                    ((oa.l) this.f15677f).f47271e -= size2;
                    m();
                    break;
                }
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f15672a) {
            case 0:
                n();
                break;
            default:
                h();
                break;
        }
        return this.f15674c.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        switch (this.f15672a) {
            case 0:
                n();
                break;
            default:
                h();
                break;
        }
        return this.f15674c.containsAll(collection);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        switch (this.f15672a) {
            case 0:
                if (obj == this) {
                    return true;
                }
                n();
                return this.f15674c.equals(obj);
            default:
                if (obj == this) {
                    return true;
                }
                h();
                return this.f15674c.equals(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i10) {
        switch (this.f15672a) {
            case 0:
                n();
                break;
            default:
                h();
                break;
        }
        return ((List) this.f15674c).get(i10);
    }

    public void h() {
        Collection collection;
        i91 i91Var = (i91) this.f15676e;
        if (i91Var != null) {
            i91Var.h();
            if (i91Var.f15674c != this.f15675d) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f15674c.isEmpty() || (collection = (Collection) ((oa.l) this.f15677f).f47270d.get(this.f15673b)) == null) {
                return;
            }
            this.f15674c = collection;
        }
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        switch (this.f15672a) {
            case 0:
                n();
                return this.f15674c.hashCode();
            default:
                h();
                return this.f15674c.hashCode();
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.f15672a) {
            case 0:
                n();
                break;
            default:
                h();
                break;
        }
        return ((List) this.f15674c).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        switch (this.f15672a) {
            case 0:
                n();
                return new y81(this);
            default:
                h();
                return new oa.d(this);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        switch (this.f15672a) {
            case 0:
                n();
                break;
            default:
                h();
                break;
        }
        return ((List) this.f15674c).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.f15672a) {
            case 0:
                n();
                return new h91(this);
            default:
                h();
                return new oa.k(this);
        }
    }

    public void m() {
        i91 i91Var = (i91) this.f15676e;
        if (i91Var != null) {
            i91Var.m();
        } else if (this.f15674c.isEmpty()) {
            ((oa.l) this.f15677f).f47270d.remove(this.f15673b);
        }
    }

    public void n() {
        i91 i91Var = (i91) this.f15676e;
        if (i91Var != null) {
            i91Var.n();
            if (i91Var.f15674c != this.f15675d) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.f15674c.isEmpty()) {
            ua1 ua1Var = (ua1) this.f15677f;
            Collection collection = (Collection) ua1Var.f20713d.get(this.f15673b);
            if (collection != null) {
                this.f15674c = collection;
            }
        }
    }

    public void p() {
        i91 i91Var = (i91) this.f15676e;
        if (i91Var != null) {
            i91Var.p();
            return;
        }
        ua1 ua1Var = (ua1) this.f15677f;
        ua1Var.f20713d.put(this.f15673b, this.f15674c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        switch (this.f15672a) {
            case 0:
                n();
                boolean zRemove = this.f15674c.remove(obj);
                if (zRemove) {
                    ((ua1) this.f15677f).f20714e--;
                    zzb();
                }
                return zRemove;
            default:
                h();
                boolean zRemove2 = this.f15674c.remove(obj);
                if (zRemove2) {
                    ((oa.l) this.f15677f).f47271e--;
                    m();
                }
                return zRemove2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        switch (this.f15672a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean zRemoveAll = this.f15674c.removeAll(collection);
                if (zRemoveAll) {
                    int size2 = this.f15674c.size();
                    ((ua1) this.f15677f).f20714e += size2 - size;
                    zzb();
                }
                return zRemoveAll;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                int size3 = size();
                boolean zRemoveAll2 = this.f15674c.removeAll(collection);
                if (zRemoveAll2) {
                    int size4 = this.f15674c.size();
                    ((oa.l) this.f15677f).f47271e += size4 - size3;
                    m();
                }
                return zRemoveAll2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        switch (this.f15672a) {
            case 0:
                collection.getClass();
                int size = size();
                boolean zRetainAll = this.f15674c.retainAll(collection);
                if (zRetainAll) {
                    int size2 = this.f15674c.size();
                    ((ua1) this.f15677f).f20714e += size2 - size;
                    zzb();
                }
                return zRetainAll;
            default:
                collection.getClass();
                int size3 = size();
                boolean zRetainAll2 = this.f15674c.retainAll(collection);
                if (zRetainAll2) {
                    int size4 = this.f15674c.size();
                    ((oa.l) this.f15677f).f47271e += size4 - size3;
                    m();
                }
                return zRetainAll2;
        }
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        switch (this.f15672a) {
            case 0:
                n();
                break;
            default:
                h();
                break;
        }
        return ((List) this.f15674c).set(i10, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        switch (this.f15672a) {
            case 0:
                n();
                break;
            default:
                h();
                break;
        }
        return this.f15674c.size();
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        switch (this.f15672a) {
            case 0:
                n();
                List listSubList = ((List) this.f15674c).subList(i10, i11);
                i91 i91Var = (i91) this.f15676e;
                if (i91Var == null) {
                    i91Var = this;
                }
                ua1 ua1Var = (ua1) this.f15678g;
                ua1Var.getClass();
                boolean z10 = listSubList instanceof RandomAccess;
                Object obj = this.f15673b;
                return z10 ? new e91(ua1Var, obj, listSubList, i91Var) : new i91(ua1Var, obj, listSubList, i91Var);
            default:
                h();
                oa.l lVar = (oa.l) this.f15678g;
                List listSubList2 = ((List) this.f15674c).subList(i10, i11);
                i91 i91Var2 = (i91) this.f15676e;
                if (i91Var2 == null) {
                    i91Var2 = this;
                }
                boolean z11 = listSubList2 instanceof RandomAccess;
                Object obj2 = this.f15673b;
                return z11 ? new oa.h(lVar, obj2, listSubList2, i91Var2) : new i91(lVar, obj2, listSubList2, i91Var2);
        }
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        switch (this.f15672a) {
            case 0:
                n();
                break;
            default:
                h();
                break;
        }
        return this.f15674c.toString();
    }

    public void zzb() {
        i91 i91Var = (i91) this.f15676e;
        if (i91Var != null) {
            i91Var.zzb();
        } else if (this.f15674c.isEmpty()) {
            ua1 ua1Var = (ua1) this.f15677f;
            ua1Var.f20713d.remove(this.f15673b);
        }
    }

    public i91(oa.l lVar, Object obj, List list, i91 i91Var) {
        this.f15678g = lVar;
        this.f15677f = lVar;
        this.f15673b = obj;
        this.f15674c = list;
        this.f15676e = i91Var;
        this.f15675d = i91Var == null ? null : i91Var.f15674c;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        switch (this.f15672a) {
            case 0:
                n();
                return new h91(this, i10);
            default:
                h();
                return new oa.k(this, i10);
        }
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        switch (this.f15672a) {
            case 0:
                n();
                Object objRemove = ((List) this.f15674c).remove(i10);
                ((ua1) this.f15678g).f20714e--;
                zzb();
                return objRemove;
            default:
                h();
                Object objRemove2 = ((List) this.f15674c).remove(i10);
                ((oa.l) this.f15678g).f47271e--;
                m();
                return objRemove2;
        }
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        switch (this.f15672a) {
            case 0:
                n();
                boolean zIsEmpty = this.f15674c.isEmpty();
                ((List) this.f15674c).add(i10, obj);
                ((ua1) this.f15678g).f20714e++;
                if (zIsEmpty) {
                    p();
                }
                break;
            default:
                h();
                boolean zIsEmpty2 = this.f15674c.isEmpty();
                ((List) this.f15674c).add(i10, obj);
                ((oa.l) this.f15678g).f47271e++;
                if (zIsEmpty2) {
                    b();
                }
                break;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        switch (this.f15672a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean zAddAll = ((List) this.f15674c).addAll(i10, collection);
                if (zAddAll) {
                    int size2 = this.f15674c.size();
                    ((ua1) this.f15678g).f20714e += size2 - size;
                    if (size == 0) {
                        p();
                        return true;
                    }
                }
                return zAddAll;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                int size3 = size();
                boolean zAddAll2 = ((List) this.f15674c).addAll(i10, collection);
                if (zAddAll2) {
                    int size4 = this.f15674c.size();
                    ((oa.l) this.f15678g).f47271e += size4 - size3;
                    if (size3 == 0) {
                        b();
                    }
                }
                return zAddAll2;
        }
    }
}
