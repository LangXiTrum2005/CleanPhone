package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Bb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2304Bb extends AbstractC2883Xj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f2877a;
    public final /* synthetic */ C2330Cb b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2304Bb(C2330Cb c2330Cb, InterfaceC2857Wj interfaceC2857Wj) {
        super(interfaceC2857Wj);
        this.b = c2330Cb;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        this.f2877a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objE = this.b.E(null, 0, 0L, this);
        return objE == EnumC4602sk.f4993a ? objE : new C4063me(objE);
    }
}
