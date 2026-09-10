package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class PS extends C5115yc0 {
    private boolean alreadyLogged;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PS(B30 b30) {
        super(b30);
        AbstractC2995aW.q(b30, "metricType");
    }

    public final boolean alreadyMetered$vungle_ads_release() {
        return (getValueFirst() == null || getValueSecond() == null) ? false : true;
    }

    public final boolean isLogged() {
        return this.alreadyLogged;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5115yc0
    public void markEnd() {
        if (getValueSecond() == null) {
            super.markEnd();
        }
    }

    public final void markLogged() {
        this.alreadyLogged = true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5115yc0
    public void markStart() {
        if (getValueFirst() == null) {
            super.markStart();
        }
    }
}
