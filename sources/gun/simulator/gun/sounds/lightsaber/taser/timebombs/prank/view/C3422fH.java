package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.protobuf.LazyField;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.fH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3422fH implements Iterator {
    private Iterator<Map.Entry<Object, Object>> iterator;

    public C3422fH(Iterator<Map.Entry<Object, Object>> it) {
        this.iterator = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.iterator.remove();
    }

    @Override // java.util.Iterator
    public Map.Entry<Object, Object> next() {
        Map.Entry<Object, Object> next = this.iterator.next();
        return next.getValue() instanceof LazyField ? new C3334eH(next) : next;
    }
}
