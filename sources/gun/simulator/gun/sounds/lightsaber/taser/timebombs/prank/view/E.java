package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes3.dex */
public final class E extends H implements NavigableMap {
    public final /* synthetic */ AbstractC4975x g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(AbstractC4975x abstractC4975x, NavigableMap navigableMap) {
        super(abstractC4975x, navigableMap);
        this.g = abstractC4975x;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry entryCeilingEntry = g().ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return c(entryCeilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return g().ceilingKey(obj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.H
    public final SortedSet d() {
        return new F(this.g, g());
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return ((E) descendingMap()).navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new E(this.g, g().descendingMap());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.H
    /* JADX INFO: renamed from: f */
    public final SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry entryFirstEntry = g().firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return c(entryFirstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry entryFloorEntry = g().floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return c(entryFloorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return g().floorKey(obj);
    }

    public final C4910wC h(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        List list = (List) ((C3695iQ) this.g).f.get();
        list.addAll((Collection) entry.getValue());
        it.remove();
        return new C4910wC(entry.getKey(), Collections.unmodifiableList(list));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.H, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry entryHigherEntry = g().higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return c(entryHigherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return g().higherKey(obj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.H
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final NavigableMap g() {
        return (NavigableMap) ((SortedMap) this.c);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.H, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.B, java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry entryLastEntry = g().lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return c(entryLastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry entryLowerEntry = g().lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return c(entryLowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return g().lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return h(((C5151z) entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return h(((C5151z) ((B) descendingMap()).entrySet()).iterator());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.H, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.H, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return new E(this.g, g().headMap(obj, z));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new E(this.g, g().subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return new E(this.g, g().tailMap(obj, z));
    }
}
