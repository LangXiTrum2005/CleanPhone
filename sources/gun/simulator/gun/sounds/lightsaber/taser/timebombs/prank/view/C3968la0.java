package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.la0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3968la0 extends AbstractC2883Xj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4056ma0 f4650a;
    public G20 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C4056ma0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3968la0(C4056ma0 c4056ma0, InterfaceC2857Wj interfaceC2857Wj) {
        super(interfaceC2857Wj);
        this.d = c4056ma0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(this);
    }
}
