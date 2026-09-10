package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.iQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3695iQ extends AbstractC4975x {
    public transient Ca0 f;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O
    public final Map c() {
        Map map = this.d;
        if (map instanceof NavigableMap) {
            return new E(this, (NavigableMap) this.d);
        }
        return map instanceof SortedMap ? new H(this, (SortedMap) this.d) : new B(this, this.d);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O
    public final Set d() {
        Map map = this.d;
        if (map instanceof NavigableMap) {
            return new F(this, (NavigableMap) this.d);
        }
        return map instanceof SortedMap ? new I(this, (SortedMap) this.d) : new D(this, this.d);
    }
}
