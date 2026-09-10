package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.p40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4282p40 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4820a;
    public final /* synthetic */ C4370q40 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4282p40(C4370q40 c4370q40, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.b = c4370q40;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C4282p40(this.b, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C4282p40) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f4820a;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            if (((Boolean) ((C2856Wi) AbstractC3194cj.X.getValue()).a()).booleanValue()) {
                C4370q40 c4370q40 = this.b;
                if (c4370q40.d > 0) {
                    C2627Nn c2627Nn = AbstractC4437qp.f4904a;
                    RL rl = TL.f3768a;
                    C4194o40 c4194o40 = new C4194o40(c4370q40, null);
                    this.f4820a = 1;
                    if (WD.X(c4194o40, rl, this) == enumC4602sk) {
                        return enumC4602sk;
                    }
                }
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
