package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class Va0 extends WG implements InterfaceC2714Qw {
    public final /* synthetic */ int f;
    public final /* synthetic */ BQ g;
    public final /* synthetic */ InterfaceC2369Do h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Va0(BQ bq, InterfaceC2369Do interfaceC2369Do, Object obj, int i) {
        super(0);
        this.f = i;
        this.g = bq;
        this.h = interfaceC2369Do;
        this.i = obj;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
    public final Object invoke() {
        int i = this.f;
        BQ bq = this.g;
        InterfaceC2369Do interfaceC2369Do = this.h;
        switch (i) {
            case 0:
                if (!bq.C()) {
                    return null;
                }
                AbstractC2995aW.q(interfaceC2369Do, "deserializer");
                return AbstractC4496rb.m((r) bq, interfaceC2369Do);
            default:
                bq.getClass();
                AbstractC2995aW.q(interfaceC2369Do, "deserializer");
                return AbstractC4496rb.m((r) bq, interfaceC2369Do);
        }
    }
}
