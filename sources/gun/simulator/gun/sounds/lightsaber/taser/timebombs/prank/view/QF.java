package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: loaded from: classes4.dex */
public final class QF extends r {
    public final WE e;
    public final int f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QF(VE ve, WE we) {
        super(ve);
        AbstractC2995aW.q(ve, "json");
        AbstractC2995aW.q(we, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.e = we;
        this.f = we.f3915a.size();
        this.g = -1;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BQ
    public final String N(D40 d40, int i) {
        AbstractC2995aW.q(d40, CampaignEx.JSON_KEY_DESC);
        return String.valueOf(i);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.r
    public final AbstractC4122nF R(String str) {
        AbstractC2995aW.q(str, "tag");
        return (AbstractC4122nF) this.e.f3915a.get(Integer.parseInt(str));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.r
    public final AbstractC4122nF U() {
        return this.e;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4421qh
    public final int k(D40 d40) {
        AbstractC2995aW.q(d40, "descriptor");
        int i = this.g;
        if (i >= this.f - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.g = i2;
        return i2;
    }
}
