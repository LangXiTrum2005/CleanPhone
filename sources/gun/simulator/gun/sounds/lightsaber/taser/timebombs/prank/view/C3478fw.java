package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.fw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3478fw extends AbstractC2883Xj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4392a;
    public int b;
    public final /* synthetic */ C3566gw c;
    public Object d;
    public InterfaceC4530rv e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3478fw(C3566gw c3566gw, InterfaceC2857Wj interfaceC2857Wj) {
        super(interfaceC2857Wj);
        this.c = c3566gw;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        this.f4392a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
