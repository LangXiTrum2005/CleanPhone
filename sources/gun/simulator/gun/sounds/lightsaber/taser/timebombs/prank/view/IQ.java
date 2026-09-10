package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class IQ extends WG implements InterfaceC3567gx {
    final /* synthetic */ PQ this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IQ(PQ pq) {
        super(2);
        this.this$0 = pq;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke(((Number) obj).intValue(), ((Number) obj2).intValue());
        return C5033xf0.f5238a;
    }

    public final void invoke(int i, int i2) {
        this.this$0.aspectRatio = i / i2;
    }
}
