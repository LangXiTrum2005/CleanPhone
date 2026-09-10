package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class KQ extends WG implements InterfaceC2714Qw {
    final /* synthetic */ PQ this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KQ(PQ pq) {
        super(0);
        this.this$0 = pq;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
    public final C4470rC invoke() {
        C4470rC c4383qC = C4470rC.Companion.getInstance();
        c4383qC.init(((C4893w20) this.this$0.getExecutors()).getIoExecutor());
        return c4383qC;
    }
}
