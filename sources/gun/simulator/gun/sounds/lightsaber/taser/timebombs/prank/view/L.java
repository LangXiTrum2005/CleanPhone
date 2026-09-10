package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public class L extends J implements List {
    public final /* synthetic */ AbstractC4975x f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(AbstractC4975x abstractC4975x, Object obj, List list, J j) {
        super(abstractC4975x, obj, list, j);
        this.f = abstractC4975x;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        b();
        boolean zIsEmpty = this.b.isEmpty();
        ((List) this.b).add(i, obj);
        this.f.e++;
        if (zIsEmpty) {
            a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.b).addAll(i, collection);
        if (zAddAll) {
            this.f.e += this.b.size() - size;
            if (size == 0) {
                a();
            }
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final Object get(int i) {
        b();
        return ((List) this.b).get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        return ((List) this.b).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        return ((List) this.b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        b();
        return new K(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        b();
        Object objRemove = ((List) this.b).remove(i);
        this.f.e--;
        c();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        b();
        return ((List) this.b).set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        b();
        List listSubList = ((List) this.b).subList(i, i2);
        J j = this.c;
        if (j == null) {
            j = this;
        }
        AbstractC4975x abstractC4975x = this.f;
        abstractC4975x.getClass();
        boolean z = listSubList instanceof RandomAccess;
        Object obj = this.f3249a;
        return z ? new G(abstractC4975x, obj, listSubList, j) : new L(abstractC4975x, obj, listSubList, j);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        b();
        return new K(this, i);
    }
}
