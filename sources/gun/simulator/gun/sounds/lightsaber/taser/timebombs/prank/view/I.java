package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes3.dex */
public class I extends D implements SortedSet {
    public final /* synthetic */ AbstractC4975x d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(AbstractC4975x abstractC4975x, SortedMap sortedMap) {
        super(abstractC4975x, sortedMap);
        this.d = abstractC4975x;
    }

    public SortedMap a() {
        return (SortedMap) this.b;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return a().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return a().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new I(this.d, a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new I(this.d, a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new I(this.d, a().tailMap(obj));
    }
}
