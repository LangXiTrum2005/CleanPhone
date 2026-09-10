package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.s90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4555s90 extends AbstractC2883Xj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4965a;
    public final /* synthetic */ C3566gw b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4555s90(C3566gw c3566gw, InterfaceC2857Wj interfaceC2857Wj) {
        super(interfaceC2857Wj);
        this.b = c3566gw;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        this.f4965a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(0, this);
    }
}
