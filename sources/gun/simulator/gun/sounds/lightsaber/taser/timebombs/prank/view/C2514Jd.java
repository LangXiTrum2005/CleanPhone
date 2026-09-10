package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Jd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2514Jd extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3273a;
    public final /* synthetic */ DialogC2540Kd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2514Jd(DialogC2540Kd dialogC2540Kd, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.b = dialogC2540Kd;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C2514Jd(this.b, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C2514Jd) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f3273a;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            int iIntValue = ((Number) ((C2856Wi) AbstractC3194cj.c.getValue()).a()).intValue();
            int iIntValue2 = ((Number) ((C2856Wi) AbstractC3194cj.d.getValue()).a()).intValue();
            int iIntValue3 = ((Number) ((C2856Wi) AbstractC3194cj.e.getValue()).a()).intValue();
            int iIntValue4 = ((Number) ((C2856Wi) AbstractC3194cj.g.getValue()).a()).intValue();
            int iIntValue5 = ((Number) ((C2856Wi) AbstractC3194cj.f.getValue()).a()).intValue();
            C2627Nn c2627Nn = AbstractC4437qp.f4904a;
            RL rl = TL.f3768a;
            C2488Id c2488Id = new C2488Id(this.b, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5, null);
            this.f3273a = 1;
            if (WD.X(c2488Id, rl, this) == enumC4602sk) {
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
