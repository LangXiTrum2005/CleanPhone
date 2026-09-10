package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2454Gv extends AbstractC2883Xj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C2480Hv f3143a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C2480Hv c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2454Gv(C2480Hv c2480Hv, InterfaceC2857Wj interfaceC2857Wj) {
        super(interfaceC2857Wj);
        this.c = c2480Hv;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
