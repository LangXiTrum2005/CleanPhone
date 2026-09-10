package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Bv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2324Bv extends AbstractC2883Xj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f2898a;
    public int b;
    public final /* synthetic */ C2350Cv c;
    public C2350Cv d;
    public InterfaceC4530rv e;
    public G20 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2324Bv(C2350Cv c2350Cv, InterfaceC2857Wj interfaceC2857Wj) {
        super(interfaceC2857Wj);
        this.c = c2350Cv;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        this.f2898a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.collect(null, this);
    }
}
