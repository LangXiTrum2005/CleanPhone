package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class KE implements InterfaceC3358ec0 {
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3358ec0
    public int makeAndroidThreadPriority(EE ee) {
        AbstractC2995aW.q(ee, "jobInfo");
        return Math.min(19, Math.abs(Math.min(0, ee.getPriority() - 2)) + 10);
    }
}
