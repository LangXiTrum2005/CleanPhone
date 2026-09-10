package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class RF extends PF {
    public final FF j;
    public final List k;
    public final int l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RF(VE ve, FF ff) {
        super(ve, ff, null, null);
        AbstractC2995aW.q(ve, "json");
        AbstractC2995aW.q(ff, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.j = ff;
        List listU0 = AbstractC2853Wf.u0(ff.f3060a.keySet());
        this.k = listU0;
        this.l = listU0.size() * 2;
        this.m = -1;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.PF, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BQ
    public final String N(D40 d40, int i) {
        AbstractC2995aW.q(d40, CampaignEx.JSON_KEY_DESC);
        return (String) this.k.get(i / 2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.PF, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.r
    public final AbstractC4122nF R(String str) {
        AbstractC2995aW.q(str, "tag");
        return this.m % 2 == 0 ? AbstractC4496rb.c(str) : (AbstractC4122nF) U5.q0(this.j, str);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.PF, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.r
    public final AbstractC4122nF U() {
        return this.j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.PF
    /* JADX INFO: renamed from: W */
    public final FF U() {
        return this.j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.PF, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.r, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4421qh
    public final void b(D40 d40) {
        AbstractC2995aW.q(d40, "descriptor");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.PF, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4421qh
    public final int k(D40 d40) {
        AbstractC2995aW.q(d40, "descriptor");
        int i = this.m;
        if (i >= this.l - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.m = i2;
        return i2;
    }
}
