package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.cg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3188cg extends AbstractC2883Xj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4236a;
    public final /* synthetic */ C3277dg b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3188cg(C3277dg c3277dg, InterfaceC2857Wj interfaceC2857Wj) {
        super(interfaceC2857Wj);
        this.b = c3277dg;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        this.f4236a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.emit(null, this);
    }
}
