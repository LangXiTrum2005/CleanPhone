package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.tc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4674tc extends AbstractC4795uw {
    public final /* synthetic */ C4850vc b;
    public final /* synthetic */ C4762uc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4674tc(C4850vc c4850vc, C4762uc c4762uc, InterfaceC4463r70 interfaceC4463r70) {
        super(interfaceC4463r70);
        this.b = c4850vc;
        this.c = c4762uc;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4795uw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4463r70, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        C4850vc c4850vc = this.b;
        C4762uc c4762uc = this.c;
        synchronized (c4850vc) {
            if (c4762uc.d) {
                return;
            }
            c4762uc.d = true;
            super.close();
            this.c.f5088a.e();
        }
    }
}
