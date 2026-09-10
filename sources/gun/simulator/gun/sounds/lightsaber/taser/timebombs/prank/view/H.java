package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes3.dex */
public class H extends B implements SortedMap {
    public SortedSet e;
    public final /* synthetic */ AbstractC4975x f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(AbstractC4975x abstractC4975x, SortedMap sortedMap) {
        super(abstractC4975x, sortedMap);
        this.f = abstractC4975x;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return g().comparator();
    }

    public SortedSet d() {
        return new I(this.f, g());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.B, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.e;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetD = d();
        this.e = sortedSetD;
        return sortedSetD;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return g().firstKey();
    }

    public SortedMap g() {
        return (SortedMap) this.c;
    }

    public SortedMap headMap(Object obj) {
        return new H(this.f, g().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return g().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new H(this.f, g().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new H(this.f, g().tailMap(obj));
    }
}
