package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class Fk0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3085a;
    public /* synthetic */ Object b;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        Fk0 fk0 = new Fk0(2, interfaceC2857Wj);
        fk0.b = obj;
        return fk0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((Fk0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f3085a;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            Ek0 ek0 = new Ek0(2, null);
            this.f3085a = 1;
            if (WD.X(ek0, AbstractC4437qp.b, this) == enumC4602sk) {
                return enumC4602sk;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        return C5033xf0.f5238a;
    }
}
