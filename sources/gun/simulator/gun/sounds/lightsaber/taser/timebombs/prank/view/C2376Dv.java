package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Dv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2376Dv extends AbstractC2883Xj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f2997a;
    public int b;
    public final /* synthetic */ C2402Ev c;
    public C2402Ev d;
    public InterfaceC4530rv e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2376Dv(C2402Ev c2402Ev, InterfaceC2857Wj interfaceC2857Wj) {
        super(interfaceC2857Wj);
        this.c = c2402Ev;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        this.f2997a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.collect(null, this);
    }
}
