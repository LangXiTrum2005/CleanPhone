package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class EY extends FY {
    public final String h;
    public final C3614hX i;
    public final Wm0 j;

    public EY(long j, C4619sw c4619sw, AC ac, C3051b40 c3051b40, ArrayList arrayList, List list, List list2) {
        super(c4619sw, ac, c3051b40, arrayList, list, list2);
        Uri.parse(((U9) ac.get(0)).f3813a);
        long j2 = c3051b40.e;
        C3614hX c3614hX = j2 <= 0 ? null : new C3614hX(null, c3051b40.d, j2);
        this.i = c3614hX;
        this.h = null;
        this.j = c3614hX == null ? new Wm0(new C3614hX(null, 0L, -1L), 25) : null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FY
    public final String a() {
        return this.h;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FY
    public final InterfaceC3021al b() {
        return this.j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FY
    public final C3614hX d() {
        return this.i;
    }
}
