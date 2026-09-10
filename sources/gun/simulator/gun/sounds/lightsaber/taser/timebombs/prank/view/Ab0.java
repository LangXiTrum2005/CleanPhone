package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class Ab0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2821a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Gb0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ab0(Gb0 gb0, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = gb0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        Ab0 ab0 = new Ab0(this.c, interfaceC2857Wj);
        ab0.b = obj;
        return ab0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((Ab0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f2821a;
        Gb0 gb0 = this.c;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            super/*gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.My*/.q();
            if (gb0.Q) {
                gb0.Q = false;
                gb0.n();
                gb0.R = false;
                C5201zb0 c5201zb0 = new C5201zb0(gb0, null);
                this.f2821a = 1;
                if (WD.X(c5201zb0, AbstractC4437qp.b, this) == enumC4602sk) {
                    return enumC4602sk;
                }
            }
            return C5033xf0.f5238a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC3375el.b0(obj);
        gb0.T.cancel();
        gb0.m(new Integer(gb0.O));
        return C5033xf0.f5238a;
    }
}
