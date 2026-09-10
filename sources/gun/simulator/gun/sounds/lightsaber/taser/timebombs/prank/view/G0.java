package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class G0 implements VK {
    final /* synthetic */ InterfaceC3069bH $signalManager$delegate;
    final /* synthetic */ J0 this$0;

    public G0(J0 j0, InterfaceC3069bH interfaceC3069bH) {
        this.this$0 = j0;
        this.$signalManager$delegate = interfaceC3069bH;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.VK
    public void close() {
        C4154nf0 c4154nf0 = this.this$0.unclosedAd;
        if (c4154nf0 != null) {
            J0.m172onCreate$lambda0(this.$signalManager$delegate).removeUnclosedAd(c4154nf0);
        }
        this.this$0.finish();
    }
}
