package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.hQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3607hQ extends AbstractC2995aW {
    public final /* synthetic */ int f = 2;
    public final /* synthetic */ AbstractC2995aW g;

    public C3607hQ(AbstractC2995aW abstractC2995aW) {
        this.g = abstractC2995aW;
    }

    public final C3695iQ G0() {
        Map mapU = this.g.u();
        C3519gQ c3519gQ = new C3519gQ(this.f);
        C3695iQ c3695iQ = new C3695iQ();
        if (!mapU.isEmpty()) {
            throw new IllegalArgumentException();
        }
        c3695iQ.d = mapU;
        c3695iQ.f = c3519gQ;
        return c3695iQ;
    }
}
