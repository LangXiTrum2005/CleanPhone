package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ov, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2661Ov extends AbstractC2883Xj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3527a;
    public final /* synthetic */ C2687Pv b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2661Ov(C2687Pv c2687Pv, InterfaceC2857Wj interfaceC2857Wj) {
        super(interfaceC2857Wj);
        this.b = c2687Pv;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        this.f3527a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.emit(null, this);
    }
}
