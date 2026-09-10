package oa;

import com.google.android.gms.internal.ads.i91;
import com.google.android.gms.internal.ads.z81;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class d implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47235a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f47236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f47237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f47238d;

    public d(i91 i91Var) {
        this.f47238d = i91Var;
        Collection collection = i91Var.f15674c;
        this.f47237c = collection;
        this.f47236b = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public void a() {
        i91 i91Var = (i91) this.f47238d;
        i91Var.h();
        if (i91Var.f15674c != ((Collection) this.f47237c)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f47235a) {
            case 0:
                break;
            case 1:
                break;
            default:
                a();
                break;
        }
        return this.f47236b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f47235a) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f47236b.next();
                this.f47237c = (Collection) entry.getValue();
                return ((z81) this.f47238d).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f47236b.next();
                this.f47237c = entry2;
                return entry2.getKey();
            default:
                a();
                return this.f47236b.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f47235a) {
            case 0:
                go.k.s("no calls to next() since the last call to remove()", ((Collection) this.f47237c) != null);
                this.f47236b.remove();
                ((l) ((z81) this.f47238d).f22565e).f47271e -= ((Collection) this.f47237c).size();
                ((Collection) this.f47237c).clear();
                this.f47237c = null;
                break;
            case 1:
                go.k.s("no calls to next() since the last call to remove()", ((Map.Entry) this.f47237c) != null);
                Collection collection = (Collection) ((Map.Entry) this.f47237c).getValue();
                this.f47236b.remove();
                ((e) this.f47238d).f47244c.f47271e -= collection.size();
                collection.clear();
                this.f47237c = null;
                break;
            default:
                this.f47236b.remove();
                i91 i91Var = (i91) this.f47238d;
                ((l) i91Var.f15677f).f47271e--;
                i91Var.m();
                break;
        }
    }

    public d(i91 i91Var, ListIterator listIterator) {
        this.f47238d = i91Var;
        this.f47237c = i91Var.f15674c;
        this.f47236b = listIterator;
    }

    public d(e eVar, Iterator it) {
        this.f47236b = it;
        this.f47238d = eVar;
    }

    public d(z81 z81Var) {
        this.f47238d = z81Var;
        this.f47236b = z81Var.f22562b.entrySet().iterator();
    }
}
