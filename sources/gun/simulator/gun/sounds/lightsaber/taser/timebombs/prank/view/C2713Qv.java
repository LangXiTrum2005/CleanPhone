package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Qv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2713Qv extends AbstractC2883Xj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C2739Rv f3633a;
    public /* synthetic */ Object b;
    public int c;
    public final /* synthetic */ C2739Rv d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2713Qv(C2739Rv c2739Rv, InterfaceC2857Wj interfaceC2857Wj) {
        super(interfaceC2857Wj);
        this.d = c2739Rv;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }
}
