package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class H40 implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3153a;
    public final /* synthetic */ D40 b;

    public /* synthetic */ H40(D40 d40, int i) {
        this.f3153a = i;
        this.b = d40;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.f3153a;
        D40 d40 = this.b;
        switch (i) {
            case 0:
                return new G40(d40, 0);
            default:
                return new G40(d40, 1);
        }
    }
}
