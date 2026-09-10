package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class O80 {
    public final Wm0 b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC4678te f3495a = C4942we.b;
    public final int c = Integer.MAX_VALUE;

    public O80(Wm0 wm0) {
        this.b = wm0;
    }

    public final List a(CharSequence charSequence) {
        charSequence.getClass();
        Wm0 wm0 = this.b;
        wm0.getClass();
        M80 m80 = new M80(wm0, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (m80.hasNext()) {
            arrayList.add((String) m80.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
