package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.v90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4819v90 extends AbstractC2883Xj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4907w90 f5123a;
    public InterfaceC4530rv b;
    public C5083y90 c;
    public InterfaceC5000xE d;
    public Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ C4907w90 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4819v90(C4907w90 c4907w90, InterfaceC2857Wj interfaceC2857Wj) {
        super(interfaceC2857Wj);
        this.g = c4907w90;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        this.g.collect(null, this);
        return EnumC4602sk.f4993a;
    }
}
