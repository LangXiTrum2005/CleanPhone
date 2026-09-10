package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class SF extends KF {
    public String h;
    public boolean i;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.KF, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4623t
    public final AbstractC4122nF K() {
        return new FF((Map) this.g);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.KF, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4623t
    public final void L(String str, AbstractC4122nF abstractC4122nF) {
        AbstractC2995aW.q(str, "key");
        AbstractC2995aW.q(abstractC4122nF, "element");
        if (!this.i) {
            Map map = (Map) this.g;
            String str2 = this.h;
            if (str2 == null) {
                AbstractC2995aW.x0("tag");
                throw null;
            }
            map.put(str2, abstractC4122nF);
            this.i = true;
            return;
        }
        if (abstractC4122nF instanceof IF) {
            this.h = ((IF) abstractC4122nF).a();
            this.i = false;
        } else {
            if (abstractC4122nF instanceof FF) {
                throw AbstractC2871Wx.H(HF.b);
            }
            if (!(abstractC4122nF instanceof WE)) {
                throw new C3770jF(7, 0);
            }
            throw AbstractC2871Wx.H(YE.b);
        }
    }
}
