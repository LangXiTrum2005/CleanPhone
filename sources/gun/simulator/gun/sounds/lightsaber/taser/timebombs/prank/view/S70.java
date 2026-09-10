package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class S70 extends Y70 {
    final /* synthetic */ Z70 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private S70(Z70 z70) {
        super(z70, null);
        this.this$0 = z70;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y70, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<Comparable<Object>, Object>> iterator() {
        return new R70(this.this$0, null);
    }

    public /* synthetic */ S70(Z70 z70, Q70 q70) {
        this(z70);
    }
}
