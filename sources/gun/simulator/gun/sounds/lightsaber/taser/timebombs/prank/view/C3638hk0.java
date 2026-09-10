package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.hk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3638hk0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC4340pk0 f4467a;
    public final /* synthetic */ Integer b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3638hk0(AbstractC4340pk0 abstractC4340pk0, Integer num, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f4467a = abstractC4340pk0;
        this.b = num;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C3638hk0(this.f4467a, this.b, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        C3638hk0 c3638hk0 = (C3638hk0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        c3638hk0.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        AbstractC3375el.b0(obj);
        AbstractC4340pk0 abstractC4340pk0 = this.f4467a;
        Integer num = abstractC4340pk0.p;
        if (num != null) {
            abstractC4340pk0.c().stop(num.intValue());
        }
        abstractC4340pk0.p = new Integer(abstractC4340pk0.c().play(this.b.intValue(), 1.0f, 1.0f, 1, -1, 1.0f));
        return C5033xf0.f5238a;
    }
}
