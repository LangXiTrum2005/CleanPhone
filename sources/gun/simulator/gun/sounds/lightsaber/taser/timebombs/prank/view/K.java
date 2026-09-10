package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class K extends A implements ListIterator {
    public final /* synthetic */ L e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(L l) {
        super(l);
        this.e = l;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        L l = this.e;
        boolean zIsEmpty = l.isEmpty();
        b().add(obj);
        l.f.e++;
        if (zIsEmpty) {
            l.a();
        }
    }

    public final ListIterator b() {
        a();
        return (ListIterator) this.b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(L l, int i) {
        super(l, ((List) l.b).listIterator(i));
        this.e = l;
    }
}
