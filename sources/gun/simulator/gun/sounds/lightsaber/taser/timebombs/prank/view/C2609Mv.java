package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Mv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2609Mv extends AbstractC2883Xj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3429a;
    public int b;
    public final /* synthetic */ C2635Nv c;
    public InterfaceC4530rv d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2609Mv(C2635Nv c2635Nv, InterfaceC2857Wj interfaceC2857Wj) {
        super(interfaceC2857Wj);
        this.c = c2635Nv;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        this.f3429a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.collect(null, this);
    }
}
