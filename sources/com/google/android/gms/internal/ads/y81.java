package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class y81 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22194a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f22195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f22196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f22197d;

    public y81(z81 z81Var) {
        Objects.requireNonNull(z81Var);
        this.f22197d = z81Var;
        this.f22195b = z81Var.f22562b.entrySet().iterator();
    }

    public void a() {
        i91 i91Var = (i91) this.f22197d;
        i91Var.n();
        if (i91Var.f15674c != ((Collection) this.f22196c)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f22194a) {
            case 0:
                break;
            case 1:
                break;
            default:
                a();
                break;
        }
        return this.f22195b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f22194a) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f22195b.next();
                this.f22196c = (Collection) entry.getValue();
                return ((z81) this.f22197d).b(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f22195b.next();
                this.f22196c = entry2;
                return entry2.getKey();
            default:
                a();
                return this.f22195b.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f22194a) {
            case 0:
                ps1.d0("no calls to next() since the last call to remove()", ((Collection) this.f22196c) != null);
                this.f22195b.remove();
                ((ua1) ((z81) this.f22197d).f22565e).f20714e -= ((Collection) this.f22196c).size();
                ((Collection) this.f22196c).clear();
                this.f22196c = null;
                break;
            case 1:
                ps1.d0("no calls to next() since the last call to remove()", ((Map.Entry) this.f22196c) != null);
                Collection collection = (Collection) ((Map.Entry) this.f22196c).getValue();
                this.f22195b.remove();
                ((a91) this.f22197d).f11942c.f20714e -= collection.size();
                collection.clear();
                this.f22196c = null;
                break;
            default:
                this.f22195b.remove();
                i91 i91Var = (i91) this.f22197d;
                ((ua1) i91Var.f15677f).f20714e--;
                i91Var.zzb();
                break;
        }
    }

    public y81(a91 a91Var, Iterator it) {
        this.f22195b = it;
        this.f22197d = a91Var;
    }

    public y81(i91 i91Var) {
        Iterator it;
        this.f22197d = i91Var;
        Collection collection = i91Var.f15674c;
        this.f22196c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f22195b = it;
    }

    public y81(i91 i91Var, ListIterator listIterator) {
        this.f22197d = i91Var;
        this.f22196c = i91Var.f15674c;
        this.f22195b = listIterator;
    }
}
