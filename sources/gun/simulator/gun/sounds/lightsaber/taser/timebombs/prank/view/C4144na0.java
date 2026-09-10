package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.na0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4144na0 extends AbstractC2883Xj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4749a;
    public final /* synthetic */ C4232oa0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4144na0(C4232oa0 c4232oa0, InterfaceC2857Wj interfaceC2857Wj) {
        super(interfaceC2857Wj);
        this.b = c4232oa0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        this.f4749a = obj;
        this.c |= Integer.MIN_VALUE;
        this.b.collect(null, this);
        return EnumC4602sk.f4993a;
    }
}
