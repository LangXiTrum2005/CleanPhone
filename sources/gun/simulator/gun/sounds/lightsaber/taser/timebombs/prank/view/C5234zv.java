package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.zv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5234zv extends AbstractC2883Xj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5351a;
    public int b;
    public final /* synthetic */ C2298Av c;
    public Object d;
    public InterfaceC4530rv e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5234zv(C2298Av c2298Av, InterfaceC2857Wj interfaceC2857Wj) {
        super(interfaceC2857Wj);
        this.c = c2298Av;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        this.f5351a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.collect(null, this);
    }
}
