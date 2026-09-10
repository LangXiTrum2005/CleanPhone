package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.MainActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class LL extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3349a;
    public final /* synthetic */ MainActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LL(MainActivity mainActivity, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.b = mainActivity;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new LL(this.b, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((LL) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f3349a;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            if (((Boolean) ((C2856Wi) AbstractC3194cj.n.getValue()).a()).booleanValue()) {
                boolean zContains = AbstractC2853Wf.u0(AbstractC3089ba0.L0((String) ((C2856Wi) AbstractC3194cj.m.getValue()).a(), new String[]{"|"})).contains("0");
                MainActivity mainActivity = this.b;
                if (zContains) {
                    C2627Nn c2627Nn = AbstractC4437qp.f4904a;
                    RL rl = TL.f3768a;
                    JL jl = new JL(mainActivity, null);
                    this.f3349a = 1;
                    if (WD.X(jl, rl, this) == enumC4602sk) {
                        return enumC4602sk;
                    }
                } else {
                    C2627Nn c2627Nn2 = AbstractC4437qp.f4904a;
                    RL rl2 = TL.f3768a;
                    KL kl = new KL(mainActivity, null);
                    this.f3349a = 2;
                    if (WD.X(kl, rl2, this) == enumC4602sk) {
                        return enumC4602sk;
                    }
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        return C5033xf0.f5238a;
    }
}
