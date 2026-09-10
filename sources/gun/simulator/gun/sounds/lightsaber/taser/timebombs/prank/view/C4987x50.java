package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.x50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4987x50 extends C4899w50 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f5167a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f5167a.iterator();
        it.getClass();
        InterfaceC4753uV interfaceC4753uV = this.b;
        interfaceC4753uV.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (interfaceC4753uV.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new C4987x50(((SortedSet) this.f5167a).headSet(obj), this.b);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f5167a;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.b.apply(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new C4987x50(((SortedSet) this.f5167a).subSet(obj, obj2), this.b);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new C4987x50(((SortedSet) this.f5167a).tailSet(obj), this.b);
    }
}
