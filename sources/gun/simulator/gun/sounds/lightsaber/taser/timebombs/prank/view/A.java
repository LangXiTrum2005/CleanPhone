package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class A implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2794a = 0;
    public final Iterator b;
    public Object c;
    public final /* synthetic */ Object d;

    public A(J j) {
        this.d = j;
        Collection collection = j.b;
        this.c = collection;
        this.b = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public final void a() {
        Object obj = this.d;
        ((J) obj).b();
        if (((J) obj).b != ((Collection) this.c)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f2794a;
        Iterator it = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            default:
                a();
                break;
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f2794a;
        Iterator it = this.b;
        switch (i) {
            case 0:
                Map.Entry entry = (Map.Entry) it.next();
                this.c = (Collection) entry.getValue();
                return ((B) this.d).c(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) it.next();
                this.c = entry2;
                return entry2.getKey();
            default:
                a();
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f2794a;
        Object obj = this.d;
        Iterator it = this.b;
        switch (i) {
            case 0:
                if (((Collection) this.c) == null) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                it.remove();
                ((B) obj).d.e -= ((Collection) this.c).size();
                ((Collection) this.c).clear();
                this.c = null;
                return;
            case 1:
                Object obj2 = this.c;
                if (((Map.Entry) obj2) == null) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                Collection collection = (Collection) ((Map.Entry) obj2).getValue();
                it.remove();
                ((D) obj).c.e -= collection.size();
                collection.clear();
                this.c = null;
                return;
            default:
                it.remove();
                J j = (J) obj;
                j.e.e--;
                j.c();
                return;
        }
    }

    public A(J j, ListIterator listIterator) {
        this.d = j;
        this.c = j.b;
        this.b = listIterator;
    }

    public A(D d, Iterator it) {
        this.d = d;
        this.b = it;
    }

    public A(B b) {
        this.d = b;
        this.b = b.c.entrySet().iterator();
    }
}
